package com.jj.jobs.model;

import java.math.BigDecimal;
import java.util.Date;

public class TransactionCouponDetail {
    private String transactionid;

    private String type;

    private String id;

    private BigDecimal amount;

    private String amountcurrency;

    private Date createdon;

    public String getTransactionid() {
        return transactionid;
    }

    public void setTransactionid(String transactionid) {
        this.transactionid = transactionid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getAmountcurrency() {
        return amountcurrency;
    }

    public void setAmountcurrency(String amountcurrency) {
        this.amountcurrency = amountcurrency;
    }

    public Date getCreatedon() {
        return createdon;
    }

    public void setCreatedon(Date createdon) {
        this.createdon = createdon;
    }
}