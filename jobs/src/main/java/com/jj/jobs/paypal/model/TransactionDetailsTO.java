package com.jj.jobs.paypal.model;

import java.util.ArrayList;
import java.util.List;

import com.jj.jobs.model.TransactionCouponDetail;
import com.jj.jobs.model.TransactionDetail;
import com.jj.jobs.model.TransactionPayerAddress;
import com.jj.jobs.model.TransactionPayerInfo;
import com.jj.jobs.model.TransactionPaymentInfo;
import com.jj.jobs.model.TransactionPaymentInfoOption;
import com.jj.jobs.model.TransactionPaymentItem;
import com.jj.jobs.model.TransactionShippingOption;

public class TransactionDetailsTO {
	private TransactionDetail transactionDetail;
	private TransactionCouponDetail transactionCouponDetail;
	private List<TransactionPayerAddress> addressList;
	private TransactionPayerInfo transactionPayerInfo;
	private TransactionPaymentInfo transactionPaymentInfo;
	private List<TransactionPaymentInfoOption> transactionPaymentInfoOptionList;
	private List<TransactionPaymentItem> transactionPaymentItemList;
	private TransactionShippingOption transactionShippingOption;
	
	public TransactionDetailsTO(){
		this.addressList = new ArrayList<TransactionPayerAddress>();
		this.transactionPaymentInfoOptionList = new ArrayList<TransactionPaymentInfoOption>();
	}

	public TransactionDetail getTransactionDetail() {
		return transactionDetail;
	}

	public void setTransactionDetail(TransactionDetail transactionDetail) {
		this.transactionDetail = transactionDetail;
	}

	public TransactionCouponDetail getTransactionCouponDetail() {
		return transactionCouponDetail;
	}

	public void setTransactionCouponDetail(
			TransactionCouponDetail transactionCouponDetail) {
		this.transactionCouponDetail = transactionCouponDetail;
	}

	public List<TransactionPayerAddress> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<TransactionPayerAddress> addressList) {
		this.addressList = addressList;
	}

	public TransactionPayerInfo getTransactionPayerInfo() {
		return transactionPayerInfo;
	}

	public void setTransactionPayerInfo(TransactionPayerInfo transactionPayerInfo) {
		this.transactionPayerInfo = transactionPayerInfo;
	}

	public TransactionPaymentInfo getTransactionPaymentInfo() {
		return transactionPaymentInfo;
	}

	public void setTransactionPaymentInfo(
			TransactionPaymentInfo transactionPaymentInfo) {
		this.transactionPaymentInfo = transactionPaymentInfo;
	}

	public List<TransactionPaymentInfoOption> getTransactionPaymentInfoOptionList() {
		return transactionPaymentInfoOptionList;
	}

	public void setTransactionPaymentInfoOptionList(
			List<TransactionPaymentInfoOption> transactionPaymentInfoOptionList) {
		this.transactionPaymentInfoOptionList = transactionPaymentInfoOptionList;
	}

	
	public TransactionShippingOption getTransactionShippingOption() {
		return transactionShippingOption;
	}

	public void setTransactionShippingOption(
			TransactionShippingOption transactionShippingOption) {
		this.transactionShippingOption = transactionShippingOption;
	}

	public List<TransactionPaymentItem> getTransactionPaymentItemList() {
		return transactionPaymentItemList;
	}

	public void setTransactionPaymentItemList(
			List<TransactionPaymentItem> transactionPaymentItemList) {
		this.transactionPaymentItemList = transactionPaymentItemList;
	}
	
	
}
