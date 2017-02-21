package com.jj.jobs.model;

import java.util.Date;

public class TransactionDetail {
    private String transactionid;

    private String tplreferenceid;

    private String giftmessage;

    private String giftreceipt;

    private String giftwrapname;

    private String buyeremailoptin;

    private Date createdon;

    public String getTransactionid() {
        return transactionid;
    }

    public void setTransactionid(String transactionid) {
        this.transactionid = transactionid;
    }

    public String getTplreferenceid() {
        return tplreferenceid;
    }

    public void setTplreferenceid(String tplreferenceid) {
        this.tplreferenceid = tplreferenceid;
    }

    public String getGiftmessage() {
        return giftmessage;
    }

    public void setGiftmessage(String giftmessage) {
        this.giftmessage = giftmessage;
    }

    public String getGiftreceipt() {
        return giftreceipt;
    }

    public void setGiftreceipt(String giftreceipt) {
        this.giftreceipt = giftreceipt;
    }

    public String getGiftwrapname() {
        return giftwrapname;
    }

    public void setGiftwrapname(String giftwrapname) {
        this.giftwrapname = giftwrapname;
    }

    public String getBuyeremailoptin() {
        return buyeremailoptin;
    }

    public void setBuyeremailoptin(String buyeremailoptin) {
        this.buyeremailoptin = buyeremailoptin;
    }

    public Date getCreatedon() {
        return createdon;
    }

    public void setCreatedon(Date createdon) {
        this.createdon = createdon;
    }
}