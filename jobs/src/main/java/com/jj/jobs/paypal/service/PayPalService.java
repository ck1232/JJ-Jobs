package com.jj.jobs.paypal.service;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
import urn.ebay.apis.eBLBaseComponents.DetailLevelCodeType;
import urn.ebay.apis.eBLBaseComponents.PaymentTransactionSearchResultType;

import com.jj.jobs.dao.TransactionMapper;
import com.jj.jobs.dao.ViewLatestTransactionMapper;
import com.jj.jobs.model.Transaction;
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
	private ViewLatestTransactionMapper viewLatestTransactionMapper;
	private urn.ebay.api.PayPalAPI.PayPalAPIInterfaceServiceService payPalAPIInterfaceService;
	private static final String VERSION = "94.0";
	@Autowired
	public PayPalService(TransactionMapper transactionMapper, ViewLatestTransactionMapper viewLatestTransactionMapper) {
		this.transactionMapper = transactionMapper;
		this.viewLatestTransactionMapper = viewLatestTransactionMapper;
		this.payPalAPIInterfaceService = new PayPalAPIInterfaceServiceService(getDevCustomConfigurationMap());
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
				TransactionDetailsTO detailsTO = convertToTransactionDetailTO(transactionDetail);
				//delete and insert into db
				transactionDbObj.setCreatedon(new Date());
				transactionMapper.deleteByPrimaryKey(transaction.getTransactionID());
				transactionMapper.insert(transactionDbObj);
			}
			if(transactionLastestList.size() == 100){
				updateTransaction();
			}
		}
	}
	
	private TransactionDetailsTO convertToTransactionDetailTO(GetTransactionDetailsResponseType transactionDetail){
		TransactionDetailsTO to = new TransactionDetailsTO();
		
		return to;
	}
	
	private Transaction convertToTransaction(PaymentTransactionSearchResultType transaction) throws Exception{
		Transaction transactionDbObj = new Transaction();
		transactionDbObj.setFeeamt(new BigDecimal(transaction.getFeeAmount().getValue()));
		transactionDbObj.setGrossamt(new BigDecimal(transaction.getGrossAmount().getValue()));
		transactionDbObj.setNetamt(new BigDecimal(transaction.getNetAmount().getValue()));
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

	public List<PaymentTransactionSearchResultType> searchTransaction(Date startDate){
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
		}
		return null;
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
