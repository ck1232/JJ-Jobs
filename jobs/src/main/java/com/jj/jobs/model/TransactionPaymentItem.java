package com.jj.jobs.model;

import java.math.BigDecimal;
import java.util.Date;

public class TransactionPaymentItem extends TransactionPaymentItemKey {
    private String ebayitemtxnid;

    private String name;

    private String quantity;

    private BigDecimal shippingamount;

    private BigDecimal handlingamount;

    private String couponid;

    private String couponamount;

    private String couponamountcurrency;

    private String loyaltycarddiscountamount;

    private String loyaltycarddiscountcurrency;

    private BigDecimal amount;

    private Date createdon;

    public String getEbayitemtxnid() {
        return ebayitemtxnid;
    }

    public void setEbayitemtxnid(String ebayitemtxnid) {
        this.ebayitemtxnid = ebayitemtxnid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getShippingamount() {
        return shippingamount;
    }

    public void setShippingamount(BigDecimal shippingamount) {
        this.shippingamount = shippingamount;
    }

    public BigDecimal getHandlingamount() {
        return handlingamount;
    }

    public void setHandlingamount(BigDecimal handlingamount) {
        this.handlingamount = handlingamount;
    }

    public String getCouponid() {
        return couponid;
    }

    public void setCouponid(String couponid) {
        this.couponid = couponid;
    }

    public String getCouponamount() {
        return couponamount;
    }

    public void setCouponamount(String couponamount) {
        this.couponamount = couponamount;
    }

    public String getCouponamountcurrency() {
        return couponamountcurrency;
    }

    public void setCouponamountcurrency(String couponamountcurrency) {
        this.couponamountcurrency = couponamountcurrency;
    }

    public String getLoyaltycarddiscountamount() {
        return loyaltycarddiscountamount;
    }

    public void setLoyaltycarddiscountamount(String loyaltycarddiscountamount) {
        this.loyaltycarddiscountamount = loyaltycarddiscountamount;
    }

    public String getLoyaltycarddiscountcurrency() {
        return loyaltycarddiscountcurrency;
    }

    public void setLoyaltycarddiscountcurrency(String loyaltycarddiscountcurrency) {
        this.loyaltycarddiscountcurrency = loyaltycarddiscountcurrency;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getCreatedon() {
        return createdon;
    }

    public void setCreatedon(Date createdon) {
        this.createdon = createdon;
    }
}