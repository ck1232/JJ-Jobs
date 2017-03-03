package com.jj.jobs.paypal.service;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import urn.ebay.api.PayPalAPI.GetTransactionDetailsReq;
import urn.ebay.api.PayPalAPI.GetTransactionDetailsRequestType;
import urn.ebay.api.PayPalAPI.GetTransactionDetailsResponseType;
import urn.ebay.api.PayPalAPI.PayPalAPIInterfaceServiceService;
import urn.ebay.api.PayPalAPI.TransactionSearchReq;
import urn.ebay.api.PayPalAPI.TransactionSearchRequestType;
import urn.ebay.api.PayPalAPI.TransactionSearchResponseType;
import urn.ebay.apis.eBLBaseComponents.AckCodeType;
import urn.ebay.apis.eBLBaseComponents.AddressType;
import urn.ebay.apis.eBLBaseComponents.DetailLevelCodeType;
import urn.ebay.apis.eBLBaseComponents.OfferCouponInfoType;
import urn.ebay.apis.eBLBaseComponents.OptionType;
import urn.ebay.apis.eBLBaseComponents.PayerInfoType;
import urn.ebay.apis.eBLBaseComponents.PaymentInfoType;
import urn.ebay.apis.eBLBaseComponents.PaymentItemInfoType;
import urn.ebay.apis.eBLBaseComponents.PaymentItemType;
import urn.ebay.apis.eBLBaseComponents.PaymentTransactionSearchResultType;
import urn.ebay.apis.eBLBaseComponents.PaymentTransactionType;
import urn.ebay.apis.eBLBaseComponents.UserSelectedOptionType;

import com.jj.jobs.dao.TransactionCouponDetailMapper;
import com.jj.jobs.dao.TransactionDetailMapper;
import com.jj.jobs.dao.TransactionMapper;
import com.jj.jobs.dao.TransactionPayerAddressMapper;
import com.jj.jobs.dao.TransactionPayerInfoMapper;
import com.jj.jobs.dao.TransactionPaymentInfoMapper;
import com.jj.jobs.dao.TransactionPaymentInfoOptionMapper;
import com.jj.jobs.dao.TransactionPaymentItemMapper;
import com.jj.jobs.dao.TransactionShippingOptionMapper;
import com.jj.jobs.dao.ViewLatestTransactionMapper;
import com.jj.jobs.model.Transaction;
import com.jj.jobs.model.TransactionCouponDetail;
import com.jj.jobs.model.TransactionDetail;
import com.jj.jobs.model.TransactionExample;
import com.jj.jobs.model.TransactionPayerAddress;
import com.jj.jobs.model.TransactionPayerInfo;
import com.jj.jobs.model.TransactionPaymentInfo;
import com.jj.jobs.model.TransactionPaymentInfoOption;
import com.jj.jobs.model.TransactionPaymentItem;
import com.jj.jobs.model.TransactionShippingOption;
import com.jj.jobs.model.ViewLatestTransaction;
import com.jj.jobs.model.ViewLatestTransactionExample;
import com.jj.jobs.paypal.model.TransactionDetailsTO;
import com.paypal.core.credential.ICredential;
import com.paypal.core.credential.SignatureCredential;

@Service
@Component("PayPalService")
@Transactional(rollbackFor=Exception.class, propagation = Propagation.REQUIRED)
public class PayPalService {
	private static final Logger logger = Logger.getLogger(PayPalService.class);
	private TransactionMapper transactionMapper;
	private TransactionDetailMapper  transactionDetailMapper;
	private TransactionCouponDetailMapper transactionCouponDetailMapper;
	private TransactionPayerAddressMapper transactionPayerAddressMapper;
	private TransactionPayerInfoMapper transactionPayerInfoMapper;
	private TransactionPaymentInfoMapper transactionPaymentInfoMapper;
	private TransactionPaymentInfoOptionMapper transactionPaymentInfoOptionMapper;
	private TransactionPaymentItemMapper transactionPaymentItemMapper;
	private TransactionShippingOptionMapper transactionShippingOptionMapper;
	private ViewLatestTransactionMapper viewLatestTransactionMapper;
	private urn.ebay.api.PayPalAPI.PayPalAPIInterfaceServiceService payPalAPIInterfaceService;
	private static final String VERSION = "94.0";
	@Autowired
	public PayPalService(TransactionMapper transactionMapper, ViewLatestTransactionMapper viewLatestTransactionMapper,
			TransactionCouponDetailMapper transactionCouponDetailMapper,
			TransactionPayerAddressMapper transactionPayerAddressMapper,
			TransactionPayerInfoMapper transactionPayerInfoMapper,
			TransactionPaymentInfoMapper transactionPaymentInfoMapper,
			TransactionPaymentInfoOptionMapper transactionPaymentInfoOptionMapper,
			TransactionPaymentItemMapper transactionPaymentItemMapper,
			TransactionDetailMapper  transactionDetailMapper,
			TransactionShippingOptionMapper transactionShippingOptionMapper) {
		this.transactionMapper = transactionMapper;
		this.viewLatestTransactionMapper = viewLatestTransactionMapper;
		this.transactionDetailMapper = transactionDetailMapper;
		this.transactionCouponDetailMapper = transactionCouponDetailMapper;
		this.transactionPayerAddressMapper = transactionPayerAddressMapper;
		this.transactionPayerInfoMapper = transactionPayerInfoMapper;
		this.transactionPaymentInfoMapper = transactionPaymentInfoMapper;
		this.transactionPaymentInfoOptionMapper = transactionPaymentInfoOptionMapper;
		this.transactionPaymentItemMapper = transactionPaymentItemMapper;
		this.transactionShippingOptionMapper = transactionShippingOptionMapper;
		this.payPalAPIInterfaceService = new PayPalAPIInterfaceServiceService(getDevCustomConfigurationMap());
	}
	public void refreshTransaction(Date date) throws Exception{
		if(date == null){
			return;
		}
		//pull record first, if success , delete old record, else keep old record
		//search transaction with latest record time
		List<PaymentTransactionSearchResultType> transactionLastestList = searchTransaction(date);
		if(transactionLastestList == null){
			//no record found , dont delete db
		}else{
			List<TransactionDetailsTO> transactionDetailList = new ArrayList<TransactionDetailsTO>();
			
			for(PaymentTransactionSearchResultType transaction : transactionLastestList){
				//get transaction details
				GetTransactionDetailsResponseType transactionDetail = getTransactionDetails(transaction.getTransactionID());
				TransactionDetailsTO detailsTO = convertToTransactionDetailTO(transaction.getTransactionID(),transactionDetail);
				transactionDetailList.add(detailsTO);
			}
			//delete record since date
			TransactionExample example = new TransactionExample();
			example.createCriteria().andTimestampGreaterThanOrEqualTo(date);
			transactionMapper.deleteByExample(example);
			
			for(PaymentTransactionSearchResultType transaction : transactionLastestList){
				//delete db record to prevent conflict
				transactionMapper.deleteByPrimaryKey(transaction.getTransactionID());
			}
			
			for(PaymentTransactionSearchResultType transaction : transactionLastestList){
				//insert db record
				Transaction transactionDbObj = convertToTransaction(transaction);
				transactionDbObj.setCreatedon(new Date());
				transactionMapper.deleteByPrimaryKey(transaction.getTransactionID());
				transactionMapper.insert(transactionDbObj);
			}
			
			for(TransactionDetailsTO detailsTO:transactionDetailList){
				transactionCouponDetailMapper.insert(detailsTO.getTransactionCouponDetail());
				if(detailsTO.getAddressList() != null && detailsTO.getAddressList().size() > 0){
					for(TransactionPayerAddress address : detailsTO.getAddressList()){
						transactionPayerAddressMapper.insert(address);
					}
				}
				transactionPayerInfoMapper.insert(detailsTO.getTransactionPayerInfo());
				transactionPaymentInfoMapper.insert(detailsTO.getTransactionPaymentInfo());
				if(detailsTO.getTransactionPaymentInfoOptionList() != null && detailsTO.getTransactionPaymentInfoOptionList().size() > 0){
					for(TransactionPaymentInfoOption option : detailsTO.getTransactionPaymentInfoOptionList()){
						transactionPaymentInfoOptionMapper.insert(option);
					}
				}
				
				if(detailsTO.getTransactionPaymentItemList() != null && detailsTO.getTransactionPaymentItemList().size() > 0){
					for(TransactionPaymentItem item : detailsTO.getTransactionPaymentItemList()){
						transactionPaymentItemMapper.insert(item);
					}
				}
				if(detailsTO.getTransactionShippingOption() != null){
					transactionShippingOptionMapper.insert(detailsTO.getTransactionShippingOption());
				}
				transactionDetailMapper.insert(detailsTO.getTransactionDetail());
			}
		}
	}
	
	public void updateTransaction() throws Exception{
		//get latest record from db
		DateFormat dt = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'.000Z'");
		Date latestDate = new Date();
		String latestTransId = "";
		ViewLatestTransactionExample selectExample = new ViewLatestTransactionExample();
		selectExample.setOrderByClause("timestamp desc");
		List<ViewLatestTransaction> lastestTransactionDbList = viewLatestTransactionMapper.selectByExample(selectExample);
		if(lastestTransactionDbList != null && lastestTransactionDbList.size() > 0){
			latestDate = lastestTransactionDbList.get(0).getTimestamp();
			latestTransId = lastestTransactionDbList.get(0).getTransactionid();
		}else{
			latestDate = dt.parse("2017-01-01T00:00:00.000Z");
		}
		//search transaction with latest record time
		List<PaymentTransactionSearchResultType> transactionLastestList = searchTransaction(latestDate);
		//write back to db
		if(transactionLastestList != null && transactionLastestList.size() > 0){
			for(PaymentTransactionSearchResultType transaction : transactionLastestList){
				if(transaction.equals(latestTransId)){
					continue;
				}
				//get transaction details
				GetTransactionDetailsResponseType transactionDetail = getTransactionDetails(transaction.getTransactionID());
				//convert to db obj
				Transaction transactionDbObj = convertToTransaction(transaction);
				TransactionDetailsTO detailsTO = convertToTransactionDetailTO(transaction.getTransactionID(),transactionDetail);
				//delete and insert into db
				transactionDbObj.setCreatedon(new Date());
				transactionMapper.deleteByPrimaryKey(transaction.getTransactionID());
				transactionMapper.insert(transactionDbObj);
				transactionCouponDetailMapper.insert(detailsTO.getTransactionCouponDetail());
				if(detailsTO.getAddressList() != null && detailsTO.getAddressList().size() > 0){
					for(TransactionPayerAddress address : detailsTO.getAddressList()){
						transactionPayerAddressMapper.insert(address);
					}
				}
				transactionPayerInfoMapper.insert(detailsTO.getTransactionPayerInfo());
				transactionPaymentInfoMapper.insert(detailsTO.getTransactionPaymentInfo());
				if(detailsTO.getTransactionPaymentInfoOptionList() != null && detailsTO.getTransactionPaymentInfoOptionList().size() > 0){
					for(TransactionPaymentInfoOption option : detailsTO.getTransactionPaymentInfoOptionList()){
						transactionPaymentInfoOptionMapper.insert(option);
					}
				}
				
				if(detailsTO.getTransactionPaymentItemList() != null && detailsTO.getTransactionPaymentItemList().size() > 0){
					for(TransactionPaymentItem item : detailsTO.getTransactionPaymentItemList()){
						transactionPaymentItemMapper.insert(item);
					}
				}
				if(detailsTO.getTransactionShippingOption() != null){
					transactionShippingOptionMapper.insert(detailsTO.getTransactionShippingOption());
				}
				transactionDetailMapper.insert(detailsTO.getTransactionDetail());
				
			}
			if(transactionLastestList.size() == 100){
				updateTransaction();
			}
		}
	}
	
	private TransactionDetailsTO convertToTransactionDetailTO(String transactionId, GetTransactionDetailsResponseType transactionDetail){
		TransactionDetailsTO to = new TransactionDetailsTO();
		PaymentTransactionType paymentTransactionDetails = transactionDetail.getPaymentTransactionDetails();
		to.setTransactionDetail(convertToTransactionDetail(transactionId, paymentTransactionDetails));
		to.setTransactionCouponDetail(convertToTransactionCouponDetail(transactionId, paymentTransactionDetails.getOfferCouponInfo()));
		to.setTransactionPayerInfo(convertToTransactionPayerInfo(transactionId, paymentTransactionDetails.getPayerInfo()));
		to.setTransactionPaymentInfo(convertToTransactionPaymentInfo(transactionId, paymentTransactionDetails.getPaymentInfo(), paymentTransactionDetails.getPaymentItemInfo()));
		to.setTransactionPaymentInfoOptionList(convertToTransactionPaymentInfoOptionList(transactionId, paymentTransactionDetails.getPaymentItemInfo()));
		to.setTransactionPaymentItemList(convertToTransactionPaymentItem(transactionId, paymentTransactionDetails.getPaymentItemInfo().getPaymentItem()));
		to.setTransactionShippingOption(convertToTransactionShippingOption(transactionId, paymentTransactionDetails.getUserSelectedOptions()));
		to.setAddressList(convertToAddressList(transactionId,paymentTransactionDetails.getSecondaryAddress(), paymentTransactionDetails.getPayerInfo().getAddress()));
		return to;
	}

	private List<TransactionPayerAddress> convertToAddressList(String transactionId, AddressType secondaryAddress, AddressType address) {
		List<TransactionPayerAddress> addressList = new ArrayList<TransactionPayerAddress>();
		TransactionPayerAddress address1 = convertToAdress(transactionId, address, "PRIMARY");
		TransactionPayerAddress address2 = convertToAdress(transactionId, secondaryAddress, "SECONDARY");
		if(address1 != null){
			addressList.add(address1);
		}
		if(address2 != null){
			addressList.add(address2);
		}
		return addressList;
	}
	
	private TransactionPayerAddress convertToAdress(String transactionId, AddressType addressDetail, String type){
		TransactionPayerAddress address = new TransactionPayerAddress();
		if(addressDetail == null){
			return null;
		}
		address.setAddressid(addressDetail.getAddressID());
		address.setAddressnormalizationstatus(addressDetail.getAddressNormalizationStatus() == null ? null : addressDetail.getAddressNormalizationStatus().getValue());
		address.setAddressowner(addressDetail.getAddressOwner() == null ? null : addressDetail.getAddressOwner().getValue());
		address.setAddressstatus(addressDetail.getAddressStatus() == null ? null : addressDetail.getAddressStatus().getValue());
		address.setCityname(addressDetail.getCityName());
		address.setCountry(addressDetail.getCountry() == null ? null : addressDetail.getCountry().getValue());
		address.setCountryname(addressDetail.getCountryName());
		address.setCreatedon(new Date());
		address.setExternaladdressid(addressDetail.getExternalAddressID());
		address.setName(addressDetail.getName());
		address.setPhone(addressDetail.getPhone());
		address.setPostalcode(addressDetail.getPostalCode());
		address.setStateorprovince(addressDetail.getStateOrProvince());
		address.setStreet1(addressDetail.getStreet1());
		address.setStreet2(addressDetail.getStreet2());
		address.setTransactionid(transactionId);
		address.setType(type);
		return address;
	}

	private TransactionShippingOption convertToTransactionShippingOption(String transactionId, UserSelectedOptionType userSelectedOptionType) {
		if(userSelectedOptionType == null){
			return null;
		}
		TransactionShippingOption option = new TransactionShippingOption();
		option.setCreatedon(new Date());
		option.setInsuranceoptionselected(userSelectedOptionType.getInsuranceOptionSelected());
		option.setShippingcalculationmode(userSelectedOptionType.getShippingCalculationMode());
		option.setShippingoptionamount(userSelectedOptionType.getShippingOptionAmount() == null ? null : new BigDecimal(userSelectedOptionType.getShippingOptionAmount().getValue()));
		option.setShippingoptionisdefault(userSelectedOptionType.getShippingOptionIsDefault());
		option.setShippingoptionname(userSelectedOptionType.getShippingOptionName());
		option.setTransactionid(transactionId);
		return option;
	}

	private List<TransactionPaymentItem> convertToTransactionPaymentItem(String transactionId, List<PaymentItemType> paymentItem) {
		List<TransactionPaymentItem> list = new ArrayList<TransactionPaymentItem>();
		if(paymentItem != null && paymentItem.size() > 0){
			for(PaymentItemType type : paymentItem){
				TransactionPaymentItem item = new TransactionPaymentItem();
				item.setAmount(type.getAmount() == null ? null : new BigDecimal(type.getAmount().getValue()));
				item.setCouponamount(type.getCouponAmount());
				item.setCouponamountcurrency(type.getCouponAmountCurrency());
				item.setCouponid(type.getCouponID());
				item.setCreatedon(new Date());
				item.setEbayitemtxnid(type.getEbayItemTxnId());
				item.setHandlingamount(type.getHandlingAmount() == null ? null : new BigDecimal(type.getHandlingAmount()));
				item.setLoyaltycarddiscountamount(type.getLoyaltyCardDiscountAmount());
				item.setLoyaltycarddiscountcurrency(type.getLoyaltyCardDiscountCurrency());
				item.setName(type.getName());
				item.setNumber(type.getNumber());
				item.setQuantity(type.getQuantity());
				item.setShippingamount(type.getShippingAmount() == null ? null : new BigDecimal(type.getShippingAmount()));
				item.setTransactionid(transactionId);
				list.add(item);
			}
		}
		return list;
	}

	private List<TransactionPaymentInfoOption> convertToTransactionPaymentInfoOptionList(String transactionId, PaymentItemInfoType paymentItemInfo) {
		List<TransactionPaymentInfoOption> list = new ArrayList<TransactionPaymentInfoOption>();
		List<PaymentItemType> itemList = paymentItemInfo.getPaymentItem();
		if(itemList != null && itemList.size() > 0){
			for(PaymentItemType itemType : itemList){
				for(OptionType optionType : itemType.getOptions()){
					TransactionPaymentInfoOption option = new TransactionPaymentInfoOption();
					option.setCreatedon(new Date());
					option.setName(itemType.getName());
					option.setOptionname(optionType.getName());
					option.setOptionvalue(optionType.getValue());
					option.setTransactionid(transactionId);
					list.add(option);
				}
				
			}
		}
		return list;
	}

	private TransactionPaymentInfo convertToTransactionPaymentInfo(String transactionId, PaymentInfoType paymentInfo, PaymentItemInfoType paymentItemInfoType) {
		TransactionPaymentInfo info = new TransactionPaymentInfo();
		info.setCreatedon(new Date());
		info.setCustom(paymentItemInfoType.getCustom());
		info.setEbaytransactionid(paymentInfo.getEbayTransactionID());
		info.setExpectedecheckcleardate(paymentInfo.getExpectedeCheckClearDate());
		info.setFeeamount(paymentInfo.getFeeAmount() == null ? null : new BigDecimal(paymentInfo.getFeeAmount().getValue()));
		info.setFinancingfeeamount(paymentInfo.getFinancingFeeAmount() == null ? null : new BigDecimal(paymentInfo.getFinancingFeeAmount().getValue()));
		info.setFinancingmonthlypayment(paymentInfo.getFinancingMonthlyPayment() == null ? null : new BigDecimal(paymentInfo.getFinancingMonthlyPayment().getValue()));
		info.setFinancingtotalcost(paymentInfo.getFinancingTotalCost() == null ? null : new BigDecimal(paymentInfo.getFinancingTotalCost().getValue()));
		info.setGrossamount(paymentInfo.getGrossAmount() == null ? null : new BigDecimal(paymentInfo.getGrossAmount().getValue()));
		info.setInvoiceid(paymentItemInfoType.getInvoiceID());
		info.setIsfinancing(paymentInfo.getIsFinancing());
		info.setMemo(paymentItemInfoType.getMemo());
		info.setParenttransactionid(paymentInfo.getParentTransactionID());
		info.setPaymentdate(paymentInfo.getPaymentDate());
		info.setPaymentstatus(paymentInfo.getPaymentStatus() == null ? null : paymentInfo.getPaymentStatus().getValue());
		info.setPaymenttype(paymentInfo.getPaymentType() == null ? null : paymentInfo.getPaymentType().getValue());
		info.setReceiptid(paymentInfo.getReceiptID());
		info.setRefundsourcecodetype(paymentInfo.getRefundSourceCodeType() == null ? null : paymentInfo.getRefundSourceCodeType().getValue());
		info.setSalestax(paymentItemInfoType.getSalesTax());
		info.setTaxamount(paymentInfo.getTaxAmount() == null ? null : new BigDecimal(paymentInfo.getTaxAmount().getValue()));
		info.setTransactionid(paymentInfo.getTransactionID());
		info.setTransactiontype(paymentInfo.getTransactionType() == null ? null : paymentInfo.getTransactionType().getValue());
		return info;
	}

	private TransactionPayerInfo convertToTransactionPayerInfo(String transactionId, PayerInfoType payerInfo) {
		TransactionPayerInfo info = new TransactionPayerInfo();
		info.setContactphone(payerInfo.getContactPhone());
		info.setPayer(payerInfo.getPayer());
		info.setPayerbusiness(payerInfo.getPayerBusiness());
		info.setPayercountry(payerInfo.getPayerCountry().getValue());
		info.setPayerid(payerInfo.getPayerID());
		info.setPayername(payerInfo.getPayerName().getSalutation() + " " +payerInfo.getPayerName().getLastName() + " " +payerInfo.getPayerName().getFirstName());
		info.setPayerstatus(payerInfo.getPayerStatus() == null ? null : payerInfo.getPayerStatus().getValue());
		info.setTransactionid(transactionId);
		return info;
	}

	private TransactionCouponDetail convertToTransactionCouponDetail(String transactionId, OfferCouponInfoType offerCouponInfo) {
		TransactionCouponDetail coupon = new TransactionCouponDetail();
		coupon.setTransactionid(transactionId);
		coupon.setAmount(offerCouponInfo.getAmount() == null ? null : new BigDecimal(offerCouponInfo.getAmount()));
		coupon.setAmountcurrency(offerCouponInfo.getAmountCurrency());
		coupon.setCreatedon(new Date());
		coupon.setId(offerCouponInfo.getID());
		coupon.setType(offerCouponInfo.getType());
		return coupon;
	}

	private TransactionDetail convertToTransactionDetail(String transactionId, PaymentTransactionType paymentTransactionDetails){
		TransactionDetail transactionDetail = new TransactionDetail();
		transactionDetail.setBuyeremailoptin(paymentTransactionDetails.getBuyerEmailOptIn());
		transactionDetail.setCreatedon(new Date());
		transactionDetail.setGiftmessage(paymentTransactionDetails.getGiftMessage());
		transactionDetail.setGiftreceipt(paymentTransactionDetails.getGiftReceipt());
		transactionDetail.setGiftwrapname(paymentTransactionDetails.getGiftWrapName());
		transactionDetail.setTplreferenceid(paymentTransactionDetails.getTPLReferenceID());
		transactionDetail.setTransactionid(transactionId);
		return transactionDetail;
	}
	private Transaction convertToTransaction(PaymentTransactionSearchResultType transaction) throws Exception{
		Transaction transactionDbObj = new Transaction();
		transactionDbObj.setFeeamt(transaction.getFeeAmount() == null ? null : new BigDecimal(transaction.getFeeAmount().getValue()));
		transactionDbObj.setGrossamt(transaction.getGrossAmount() == null ? null : new BigDecimal(transaction.getGrossAmount().getValue()));
		transactionDbObj.setNetamt(new BigDecimal(transaction.getNetAmount() == null ? null : transaction.getNetAmount().getValue()));
		transactionDbObj.setPayer(transaction.getPayer());
		transactionDbObj.setPayername(transaction.getPayerDisplayName());
		transactionDbObj.setStatus(transaction.getStatus());
		transactionDbObj.setTransactionid(transaction.getTransactionID());
		transactionDbObj.setType(transaction.getType());
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
		df.setTimeZone(TimeZone.getTimeZone(transaction.getTimezone()));
		Date timeStamp = df.parse(transaction.getTimestamp());
		transactionDbObj.setTimestamp(timeStamp);
		return transactionDbObj;
	}
	
	private GetTransactionDetailsResponseType getTransactionDetails(String transactionID) throws Exception{
		GetTransactionDetailsReq getTransactionDetailsReq = new GetTransactionDetailsReq();
		GetTransactionDetailsRequestType requestType = new GetTransactionDetailsRequestType();
		requestType.setTransactionID(transactionID);
		requestType.setErrorLanguage("en_US");
		requestType.setDetailLevel(Arrays.asList(DetailLevelCodeType.RETURNALL));
		requestType.setVersion(VERSION);
		getTransactionDetailsReq.setGetTransactionDetailsRequest(requestType);
		GetTransactionDetailsResponseType transactionDetail = payPalAPIInterfaceService.getTransactionDetails(getTransactionDetailsReq, getCredential());
		return transactionDetail;
	}

	public List<PaymentTransactionSearchResultType> searchTransaction(Date startDate) throws Exception{
		DateFormat dt = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		TransactionSearchReq txnreq = new TransactionSearchReq();
		TransactionSearchRequestType requestType = new TransactionSearchRequestType();
		
//		requestType.setStartDate("2015-10-04T00:00:00.000Z");
		requestType.setStartDate(dt.format(startDate));
		requestType.setVersion("94.0");
		
		txnreq.setTransactionSearchRequest(requestType);
		
		try {
			TransactionSearchResponseType txnres = payPalAPIInterfaceService.transactionSearch(txnreq, getCredential());
			List<PaymentTransactionSearchResultType> transactionList = txnres.getPaymentTransactions();
			if(txnres.getAck().equals(AckCodeType.SUCCESS) && transactionList != null && transactionList.size() > 0){
				for(PaymentTransactionSearchResultType transaction : transactionList){
					logger.debug(transaction.getTimestamp() + ","+ transaction.getTimezone());
				}
			}
			return transactionList;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}
	
	private ICredential getCredential(){
		String userName = getDevCustomConfigurationMap().get("acct1.UserName");
		String pwd = getDevCustomConfigurationMap().get("acct1.Password");
		String signature = getDevCustomConfigurationMap().get("acct1.Signature");
		ICredential credential = new SignatureCredential(userName, pwd, signature);
		return credential;
	}
	
	private static final Map<String, String> getDevCustomConfigurationMap(){
		Map<String, String> customConfigurationMap = new HashMap<String, String>();
		customConfigurationMap.put("mode", "sandbox");
		customConfigurationMap.put("acct1.UserName", "behchoonkeat-facilitator_api1.hotmail.com");
		customConfigurationMap.put("acct1.Password", "NXTYCSDD4S77AKWD");
		customConfigurationMap.put("acct1.AppId","APP-80W284485P519543T");
		customConfigurationMap.put("acct1.Signature", "AFcWxV21C7fd0v3bYYYRCpSSRl31A1689rysgedRS0OlTfMq0NJf-Poi");
		
		customConfigurationMap.put("http.ConnectionTimeOut", "5000");
		customConfigurationMap.put("http.Retry", "2");
		customConfigurationMap.put("http.ReadTimeOut", "3000");
		customConfigurationMap.put("http.MaxConnection", "100");
		customConfigurationMap.put("http.IPAddress", "127.0.0.1");
		
		customConfigurationMap.put("http.UseProxy", "false");
		customConfigurationMap.put("http.ProxyPort", "8080");
		customConfigurationMap.put("http.ProxyHost", "127.0.0.1");
		customConfigurationMap.put("http.ProxyUserName", "null");
		customConfigurationMap.put("http.ProxyPassword", "null");
		
		customConfigurationMap.put("http.GoogleAppEngine", "false");
		customConfigurationMap.put("sandbox.EmailAddress", "behchoonkeat@hotmail.com");
		return customConfigurationMap;
	}
}
