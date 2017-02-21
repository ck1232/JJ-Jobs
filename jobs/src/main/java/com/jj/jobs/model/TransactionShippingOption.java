package com.jj.jobs.model;

import java.math.BigDecimal;
import java.util.Date;

public class TransactionShippingOption {
    private String transactionid;

    private String shippingcalculationmode;

    private String insuranceoptionselected;

    private String shippingoptionisdefault;

    private BigDecimal shippingoptionamount;

    private String shippingoptionname;

    private Date createdon;

    public String getTransactionid() {
        return transactionid;
    }

    public void setTransactionid(String transactionid) {
        this.transactionid = transactionid;
    }

    public String getShippingcalculationmode() {
        return shippingcalculationmode;
    }

    public void setShippingcalculationmode(String shippingcalculationmode) {
        this.shippingcalculationmode = shippingcalculationmode;
    }

    public String getInsuranceoptionselected() {
        return insuranceoptionselected;
    }

    public void setInsuranceoptionselected(String insuranceoptionselected) {
        this.insuranceoptionselected = insuranceoptionselected;
    }

    public String getShippingoptionisdefault() {
        return shippingoptionisdefault;
    }

    public void setShippingoptionisdefault(String shippingoptionisdefault) {
        this.shippingoptionisdefault = shippingoptionisdefault;
    }

    public BigDecimal getShippingoptionamount() {
        return shippingoptionamount;
    }

    public void setShippingoptionamount(BigDecimal shippingoptionamount) {
        this.shippingoptionamount = shippingoptionamount;
    }

    public String getShippingoptionname() {
        return shippingoptionname;
    }

    public void setShippingoptionname(String shippingoptionname) {
        this.shippingoptionname = shippingoptionname;
    }

    public Date getCreatedon() {
        return createdon;
    }

    public void setCreatedon(Date createdon) {
        this.createdon = createdon;
    }
}