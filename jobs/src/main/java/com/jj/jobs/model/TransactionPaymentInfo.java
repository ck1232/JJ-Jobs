package com.jj.jobs.model;

import java.math.BigDecimal;
import java.util.Date;

public class TransactionPaymentInfo {
    private String transactionid;

    private String ebaytransactionid;

    private String parenttransactionid;

    private String receiptid;

    private String transactiontype;

    private String paymenttype;

    private String refundsourcecodetype;

    private String expectedecheckcleardate;

    private String paymentdate;

    private BigDecimal grossamount;

    private BigDecimal feeamount;

    private BigDecimal financingfeeamount;

    private BigDecimal financingtotalcost;

    private BigDecimal financingmonthlypayment;

    private String isfinancing;

    private BigDecimal settleamount;

    private BigDecimal taxamount;

    private String exchangerate;

    private String paymentstatus;

    private String invoiceid;

    private String custom;

    private String memo;

    private String salestax;

    private Date createdon;

    public String getTransactionid() {
        return transactionid;
    }

    public void setTransactionid(String transactionid) {
        this.transactionid = transactionid;
    }

    public String getEbaytransactionid() {
        return ebaytransactionid;
    }

    public void setEbaytransactionid(String ebaytransactionid) {
        this.ebaytransactionid = ebaytransactionid;
    }

    public String getParenttransactionid() {
        return parenttransactionid;
    }

    public void setParenttransactionid(String parenttransactionid) {
        this.parenttransactionid = parenttransactionid;
    }

    public String getReceiptid() {
        return receiptid;
    }

    public void setReceiptid(String receiptid) {
        this.receiptid = receiptid;
    }

    public String getTransactiontype() {
        return transactiontype;
    }

    public void setTransactiontype(String transactiontype) {
        this.transactiontype = transactiontype;
    }

    public String getPaymenttype() {
        return paymenttype;
    }

    public void setPaymenttype(String paymenttype) {
        this.paymenttype = paymenttype;
    }

    public String getRefundsourcecodetype() {
        return refundsourcecodetype;
    }

    public void setRefundsourcecodetype(String refundsourcecodetype) {
        this.refundsourcecodetype = refundsourcecodetype;
    }

    public String getExpectedecheckcleardate() {
        return expectedecheckcleardate;
    }

    public void setExpectedecheckcleardate(String expectedecheckcleardate) {
        this.expectedecheckcleardate = expectedecheckcleardate;
    }

    public String getPaymentdate() {
        return paymentdate;
    }

    public void setPaymentdate(String paymentdate) {
        this.paymentdate = paymentdate;
    }

    public BigDecimal getGrossamount() {
        return grossamount;
    }

    public void setGrossamount(BigDecimal grossamount) {
        this.grossamount = grossamount;
    }

    public BigDecimal getFeeamount() {
        return feeamount;
    }

    public void setFeeamount(BigDecimal feeamount) {
        this.feeamount = feeamount;
    }

    public BigDecimal getFinancingfeeamount() {
        return financingfeeamount;
    }

    public void setFinancingfeeamount(BigDecimal financingfeeamount) {
        this.financingfeeamount = financingfeeamount;
    }

    public BigDecimal getFinancingtotalcost() {
        return financingtotalcost;
    }

    public void setFinancingtotalcost(BigDecimal financingtotalcost) {
        this.financingtotalcost = financingtotalcost;
    }

    public BigDecimal getFinancingmonthlypayment() {
        return financingmonthlypayment;
    }

    public void setFinancingmonthlypayment(BigDecimal financingmonthlypayment) {
        this.financingmonthlypayment = financingmonthlypayment;
    }

    public String getIsfinancing() {
        return isfinancing;
    }

    public void setIsfinancing(String isfinancing) {
        this.isfinancing = isfinancing;
    }

    public BigDecimal getSettleamount() {
        return settleamount;
    }

    public void setSettleamount(BigDecimal settleamount) {
        this.settleamount = settleamount;
    }

    public BigDecimal getTaxamount() {
        return taxamount;
    }

    public void setTaxamount(BigDecimal taxamount) {
        this.taxamount = taxamount;
    }

    public String getExchangerate() {
        return exchangerate;
    }

    public void setExchangerate(String exchangerate) {
        this.exchangerate = exchangerate;
    }

    public String getPaymentstatus() {
        return paymentstatus;
    }

    public void setPaymentstatus(String paymentstatus) {
        this.paymentstatus = paymentstatus;
    }

    public String getInvoiceid() {
        return invoiceid;
    }

    public void setInvoiceid(String invoiceid) {
        this.invoiceid = invoiceid;
    }

    public String getCustom() {
        return custom;
    }

    public void setCustom(String custom) {
        this.custom = custom;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getSalestax() {
        return salestax;
    }

    public void setSalestax(String salestax) {
        this.salestax = salestax;
    }

    public Date getCreatedon() {
        return createdon;
    }

    public void setCreatedon(Date createdon) {
        this.createdon = createdon;
    }
}