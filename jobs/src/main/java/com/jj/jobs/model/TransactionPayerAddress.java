package com.jj.jobs.model;

import java.util.Date;

public class TransactionPayerAddress extends TransactionPayerAddressKey {
    private String name;

    private String street1;

    private String street2;

    private String cityname;

    private String stateorprovince;

    private String country;

    private String countryname;

    private String phone;

    private String postalcode;

    private String addressid;

    private String addressowner;

    private String externaladdressid;

    private String addressstatus;

    private String addressnormalizationstatus;

    private Date createdon;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public String getStateorprovince() {
        return stateorprovince;
    }

    public void setStateorprovince(String stateorprovince) {
        this.stateorprovince = stateorprovince;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public String getAddressid() {
        return addressid;
    }

    public void setAddressid(String addressid) {
        this.addressid = addressid;
    }

    public String getAddressowner() {
        return addressowner;
    }

    public void setAddressowner(String addressowner) {
        this.addressowner = addressowner;
    }

    public String getExternaladdressid() {
        return externaladdressid;
    }

    public void setExternaladdressid(String externaladdressid) {
        this.externaladdressid = externaladdressid;
    }

    public String getAddressstatus() {
        return addressstatus;
    }

    public void setAddressstatus(String addressstatus) {
        this.addressstatus = addressstatus;
    }

    public String getAddressnormalizationstatus() {
        return addressnormalizationstatus;
    }

    public void setAddressnormalizationstatus(String addressnormalizationstatus) {
        this.addressnormalizationstatus = addressnormalizationstatus;
    }

    public Date getCreatedon() {
        return createdon;
    }

    public void setCreatedon(Date createdon) {
        this.createdon = createdon;
    }
}