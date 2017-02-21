package com.jj.jobs.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TransactionPayerAddressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TransactionPayerAddressExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTransactionidIsNull() {
            addCriterion("transactionId is null");
            return (Criteria) this;
        }

        public Criteria andTransactionidIsNotNull() {
            addCriterion("transactionId is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionidEqualTo(String value) {
            addCriterion("transactionId =", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidNotEqualTo(String value) {
            addCriterion("transactionId <>", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidGreaterThan(String value) {
            addCriterion("transactionId >", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidGreaterThanOrEqualTo(String value) {
            addCriterion("transactionId >=", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidLessThan(String value) {
            addCriterion("transactionId <", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidLessThanOrEqualTo(String value) {
            addCriterion("transactionId <=", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidLike(String value) {
            addCriterion("transactionId like", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidNotLike(String value) {
            addCriterion("transactionId not like", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidIn(List<String> values) {
            addCriterion("transactionId in", values, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidNotIn(List<String> values) {
            addCriterion("transactionId not in", values, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidBetween(String value1, String value2) {
            addCriterion("transactionId between", value1, value2, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidNotBetween(String value1, String value2) {
            addCriterion("transactionId not between", value1, value2, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andStreet1IsNull() {
            addCriterion("street1 is null");
            return (Criteria) this;
        }

        public Criteria andStreet1IsNotNull() {
            addCriterion("street1 is not null");
            return (Criteria) this;
        }

        public Criteria andStreet1EqualTo(String value) {
            addCriterion("street1 =", value, "street1");
            return (Criteria) this;
        }

        public Criteria andStreet1NotEqualTo(String value) {
            addCriterion("street1 <>", value, "street1");
            return (Criteria) this;
        }

        public Criteria andStreet1GreaterThan(String value) {
            addCriterion("street1 >", value, "street1");
            return (Criteria) this;
        }

        public Criteria andStreet1GreaterThanOrEqualTo(String value) {
            addCriterion("street1 >=", value, "street1");
            return (Criteria) this;
        }

        public Criteria andStreet1LessThan(String value) {
            addCriterion("street1 <", value, "street1");
            return (Criteria) this;
        }

        public Criteria andStreet1LessThanOrEqualTo(String value) {
            addCriterion("street1 <=", value, "street1");
            return (Criteria) this;
        }

        public Criteria andStreet1Like(String value) {
            addCriterion("street1 like", value, "street1");
            return (Criteria) this;
        }

        public Criteria andStreet1NotLike(String value) {
            addCriterion("street1 not like", value, "street1");
            return (Criteria) this;
        }

        public Criteria andStreet1In(List<String> values) {
            addCriterion("street1 in", values, "street1");
            return (Criteria) this;
        }

        public Criteria andStreet1NotIn(List<String> values) {
            addCriterion("street1 not in", values, "street1");
            return (Criteria) this;
        }

        public Criteria andStreet1Between(String value1, String value2) {
            addCriterion("street1 between", value1, value2, "street1");
            return (Criteria) this;
        }

        public Criteria andStreet1NotBetween(String value1, String value2) {
            addCriterion("street1 not between", value1, value2, "street1");
            return (Criteria) this;
        }

        public Criteria andStreet2IsNull() {
            addCriterion("street2 is null");
            return (Criteria) this;
        }

        public Criteria andStreet2IsNotNull() {
            addCriterion("street2 is not null");
            return (Criteria) this;
        }

        public Criteria andStreet2EqualTo(String value) {
            addCriterion("street2 =", value, "street2");
            return (Criteria) this;
        }

        public Criteria andStreet2NotEqualTo(String value) {
            addCriterion("street2 <>", value, "street2");
            return (Criteria) this;
        }

        public Criteria andStreet2GreaterThan(String value) {
            addCriterion("street2 >", value, "street2");
            return (Criteria) this;
        }

        public Criteria andStreet2GreaterThanOrEqualTo(String value) {
            addCriterion("street2 >=", value, "street2");
            return (Criteria) this;
        }

        public Criteria andStreet2LessThan(String value) {
            addCriterion("street2 <", value, "street2");
            return (Criteria) this;
        }

        public Criteria andStreet2LessThanOrEqualTo(String value) {
            addCriterion("street2 <=", value, "street2");
            return (Criteria) this;
        }

        public Criteria andStreet2Like(String value) {
            addCriterion("street2 like", value, "street2");
            return (Criteria) this;
        }

        public Criteria andStreet2NotLike(String value) {
            addCriterion("street2 not like", value, "street2");
            return (Criteria) this;
        }

        public Criteria andStreet2In(List<String> values) {
            addCriterion("street2 in", values, "street2");
            return (Criteria) this;
        }

        public Criteria andStreet2NotIn(List<String> values) {
            addCriterion("street2 not in", values, "street2");
            return (Criteria) this;
        }

        public Criteria andStreet2Between(String value1, String value2) {
            addCriterion("street2 between", value1, value2, "street2");
            return (Criteria) this;
        }

        public Criteria andStreet2NotBetween(String value1, String value2) {
            addCriterion("street2 not between", value1, value2, "street2");
            return (Criteria) this;
        }

        public Criteria andCitynameIsNull() {
            addCriterion("cityname is null");
            return (Criteria) this;
        }

        public Criteria andCitynameIsNotNull() {
            addCriterion("cityname is not null");
            return (Criteria) this;
        }

        public Criteria andCitynameEqualTo(String value) {
            addCriterion("cityname =", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotEqualTo(String value) {
            addCriterion("cityname <>", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameGreaterThan(String value) {
            addCriterion("cityname >", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameGreaterThanOrEqualTo(String value) {
            addCriterion("cityname >=", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameLessThan(String value) {
            addCriterion("cityname <", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameLessThanOrEqualTo(String value) {
            addCriterion("cityname <=", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameLike(String value) {
            addCriterion("cityname like", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotLike(String value) {
            addCriterion("cityname not like", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameIn(List<String> values) {
            addCriterion("cityname in", values, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotIn(List<String> values) {
            addCriterion("cityname not in", values, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameBetween(String value1, String value2) {
            addCriterion("cityname between", value1, value2, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotBetween(String value1, String value2) {
            addCriterion("cityname not between", value1, value2, "cityname");
            return (Criteria) this;
        }

        public Criteria andStateorprovinceIsNull() {
            addCriterion("stateorprovince is null");
            return (Criteria) this;
        }

        public Criteria andStateorprovinceIsNotNull() {
            addCriterion("stateorprovince is not null");
            return (Criteria) this;
        }

        public Criteria andStateorprovinceEqualTo(String value) {
            addCriterion("stateorprovince =", value, "stateorprovince");
            return (Criteria) this;
        }

        public Criteria andStateorprovinceNotEqualTo(String value) {
            addCriterion("stateorprovince <>", value, "stateorprovince");
            return (Criteria) this;
        }

        public Criteria andStateorprovinceGreaterThan(String value) {
            addCriterion("stateorprovince >", value, "stateorprovince");
            return (Criteria) this;
        }

        public Criteria andStateorprovinceGreaterThanOrEqualTo(String value) {
            addCriterion("stateorprovince >=", value, "stateorprovince");
            return (Criteria) this;
        }

        public Criteria andStateorprovinceLessThan(String value) {
            addCriterion("stateorprovince <", value, "stateorprovince");
            return (Criteria) this;
        }

        public Criteria andStateorprovinceLessThanOrEqualTo(String value) {
            addCriterion("stateorprovince <=", value, "stateorprovince");
            return (Criteria) this;
        }

        public Criteria andStateorprovinceLike(String value) {
            addCriterion("stateorprovince like", value, "stateorprovince");
            return (Criteria) this;
        }

        public Criteria andStateorprovinceNotLike(String value) {
            addCriterion("stateorprovince not like", value, "stateorprovince");
            return (Criteria) this;
        }

        public Criteria andStateorprovinceIn(List<String> values) {
            addCriterion("stateorprovince in", values, "stateorprovince");
            return (Criteria) this;
        }

        public Criteria andStateorprovinceNotIn(List<String> values) {
            addCriterion("stateorprovince not in", values, "stateorprovince");
            return (Criteria) this;
        }

        public Criteria andStateorprovinceBetween(String value1, String value2) {
            addCriterion("stateorprovince between", value1, value2, "stateorprovince");
            return (Criteria) this;
        }

        public Criteria andStateorprovinceNotBetween(String value1, String value2) {
            addCriterion("stateorprovince not between", value1, value2, "stateorprovince");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("country like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("country not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountrynameIsNull() {
            addCriterion("countryname is null");
            return (Criteria) this;
        }

        public Criteria andCountrynameIsNotNull() {
            addCriterion("countryname is not null");
            return (Criteria) this;
        }

        public Criteria andCountrynameEqualTo(String value) {
            addCriterion("countryname =", value, "countryname");
            return (Criteria) this;
        }

        public Criteria andCountrynameNotEqualTo(String value) {
            addCriterion("countryname <>", value, "countryname");
            return (Criteria) this;
        }

        public Criteria andCountrynameGreaterThan(String value) {
            addCriterion("countryname >", value, "countryname");
            return (Criteria) this;
        }

        public Criteria andCountrynameGreaterThanOrEqualTo(String value) {
            addCriterion("countryname >=", value, "countryname");
            return (Criteria) this;
        }

        public Criteria andCountrynameLessThan(String value) {
            addCriterion("countryname <", value, "countryname");
            return (Criteria) this;
        }

        public Criteria andCountrynameLessThanOrEqualTo(String value) {
            addCriterion("countryname <=", value, "countryname");
            return (Criteria) this;
        }

        public Criteria andCountrynameLike(String value) {
            addCriterion("countryname like", value, "countryname");
            return (Criteria) this;
        }

        public Criteria andCountrynameNotLike(String value) {
            addCriterion("countryname not like", value, "countryname");
            return (Criteria) this;
        }

        public Criteria andCountrynameIn(List<String> values) {
            addCriterion("countryname in", values, "countryname");
            return (Criteria) this;
        }

        public Criteria andCountrynameNotIn(List<String> values) {
            addCriterion("countryname not in", values, "countryname");
            return (Criteria) this;
        }

        public Criteria andCountrynameBetween(String value1, String value2) {
            addCriterion("countryname between", value1, value2, "countryname");
            return (Criteria) this;
        }

        public Criteria andCountrynameNotBetween(String value1, String value2) {
            addCriterion("countryname not between", value1, value2, "countryname");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPostalcodeIsNull() {
            addCriterion("postalcode is null");
            return (Criteria) this;
        }

        public Criteria andPostalcodeIsNotNull() {
            addCriterion("postalcode is not null");
            return (Criteria) this;
        }

        public Criteria andPostalcodeEqualTo(String value) {
            addCriterion("postalcode =", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotEqualTo(String value) {
            addCriterion("postalcode <>", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeGreaterThan(String value) {
            addCriterion("postalcode >", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeGreaterThanOrEqualTo(String value) {
            addCriterion("postalcode >=", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeLessThan(String value) {
            addCriterion("postalcode <", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeLessThanOrEqualTo(String value) {
            addCriterion("postalcode <=", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeLike(String value) {
            addCriterion("postalcode like", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotLike(String value) {
            addCriterion("postalcode not like", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeIn(List<String> values) {
            addCriterion("postalcode in", values, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotIn(List<String> values) {
            addCriterion("postalcode not in", values, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeBetween(String value1, String value2) {
            addCriterion("postalcode between", value1, value2, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotBetween(String value1, String value2) {
            addCriterion("postalcode not between", value1, value2, "postalcode");
            return (Criteria) this;
        }

        public Criteria andAddressidIsNull() {
            addCriterion("addressId is null");
            return (Criteria) this;
        }

        public Criteria andAddressidIsNotNull() {
            addCriterion("addressId is not null");
            return (Criteria) this;
        }

        public Criteria andAddressidEqualTo(String value) {
            addCriterion("addressId =", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidNotEqualTo(String value) {
            addCriterion("addressId <>", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidGreaterThan(String value) {
            addCriterion("addressId >", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidGreaterThanOrEqualTo(String value) {
            addCriterion("addressId >=", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidLessThan(String value) {
            addCriterion("addressId <", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidLessThanOrEqualTo(String value) {
            addCriterion("addressId <=", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidLike(String value) {
            addCriterion("addressId like", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidNotLike(String value) {
            addCriterion("addressId not like", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidIn(List<String> values) {
            addCriterion("addressId in", values, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidNotIn(List<String> values) {
            addCriterion("addressId not in", values, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidBetween(String value1, String value2) {
            addCriterion("addressId between", value1, value2, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidNotBetween(String value1, String value2) {
            addCriterion("addressId not between", value1, value2, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressownerIsNull() {
            addCriterion("addressowner is null");
            return (Criteria) this;
        }

        public Criteria andAddressownerIsNotNull() {
            addCriterion("addressowner is not null");
            return (Criteria) this;
        }

        public Criteria andAddressownerEqualTo(String value) {
            addCriterion("addressowner =", value, "addressowner");
            return (Criteria) this;
        }

        public Criteria andAddressownerNotEqualTo(String value) {
            addCriterion("addressowner <>", value, "addressowner");
            return (Criteria) this;
        }

        public Criteria andAddressownerGreaterThan(String value) {
            addCriterion("addressowner >", value, "addressowner");
            return (Criteria) this;
        }

        public Criteria andAddressownerGreaterThanOrEqualTo(String value) {
            addCriterion("addressowner >=", value, "addressowner");
            return (Criteria) this;
        }

        public Criteria andAddressownerLessThan(String value) {
            addCriterion("addressowner <", value, "addressowner");
            return (Criteria) this;
        }

        public Criteria andAddressownerLessThanOrEqualTo(String value) {
            addCriterion("addressowner <=", value, "addressowner");
            return (Criteria) this;
        }

        public Criteria andAddressownerLike(String value) {
            addCriterion("addressowner like", value, "addressowner");
            return (Criteria) this;
        }

        public Criteria andAddressownerNotLike(String value) {
            addCriterion("addressowner not like", value, "addressowner");
            return (Criteria) this;
        }

        public Criteria andAddressownerIn(List<String> values) {
            addCriterion("addressowner in", values, "addressowner");
            return (Criteria) this;
        }

        public Criteria andAddressownerNotIn(List<String> values) {
            addCriterion("addressowner not in", values, "addressowner");
            return (Criteria) this;
        }

        public Criteria andAddressownerBetween(String value1, String value2) {
            addCriterion("addressowner between", value1, value2, "addressowner");
            return (Criteria) this;
        }

        public Criteria andAddressownerNotBetween(String value1, String value2) {
            addCriterion("addressowner not between", value1, value2, "addressowner");
            return (Criteria) this;
        }

        public Criteria andExternaladdressidIsNull() {
            addCriterion("externalAddressId is null");
            return (Criteria) this;
        }

        public Criteria andExternaladdressidIsNotNull() {
            addCriterion("externalAddressId is not null");
            return (Criteria) this;
        }

        public Criteria andExternaladdressidEqualTo(String value) {
            addCriterion("externalAddressId =", value, "externaladdressid");
            return (Criteria) this;
        }

        public Criteria andExternaladdressidNotEqualTo(String value) {
            addCriterion("externalAddressId <>", value, "externaladdressid");
            return (Criteria) this;
        }

        public Criteria andExternaladdressidGreaterThan(String value) {
            addCriterion("externalAddressId >", value, "externaladdressid");
            return (Criteria) this;
        }

        public Criteria andExternaladdressidGreaterThanOrEqualTo(String value) {
            addCriterion("externalAddressId >=", value, "externaladdressid");
            return (Criteria) this;
        }

        public Criteria andExternaladdressidLessThan(String value) {
            addCriterion("externalAddressId <", value, "externaladdressid");
            return (Criteria) this;
        }

        public Criteria andExternaladdressidLessThanOrEqualTo(String value) {
            addCriterion("externalAddressId <=", value, "externaladdressid");
            return (Criteria) this;
        }

        public Criteria andExternaladdressidLike(String value) {
            addCriterion("externalAddressId like", value, "externaladdressid");
            return (Criteria) this;
        }

        public Criteria andExternaladdressidNotLike(String value) {
            addCriterion("externalAddressId not like", value, "externaladdressid");
            return (Criteria) this;
        }

        public Criteria andExternaladdressidIn(List<String> values) {
            addCriterion("externalAddressId in", values, "externaladdressid");
            return (Criteria) this;
        }

        public Criteria andExternaladdressidNotIn(List<String> values) {
            addCriterion("externalAddressId not in", values, "externaladdressid");
            return (Criteria) this;
        }

        public Criteria andExternaladdressidBetween(String value1, String value2) {
            addCriterion("externalAddressId between", value1, value2, "externaladdressid");
            return (Criteria) this;
        }

        public Criteria andExternaladdressidNotBetween(String value1, String value2) {
            addCriterion("externalAddressId not between", value1, value2, "externaladdressid");
            return (Criteria) this;
        }

        public Criteria andAddressstatusIsNull() {
            addCriterion("addressstatus is null");
            return (Criteria) this;
        }

        public Criteria andAddressstatusIsNotNull() {
            addCriterion("addressstatus is not null");
            return (Criteria) this;
        }

        public Criteria andAddressstatusEqualTo(String value) {
            addCriterion("addressstatus =", value, "addressstatus");
            return (Criteria) this;
        }

        public Criteria andAddressstatusNotEqualTo(String value) {
            addCriterion("addressstatus <>", value, "addressstatus");
            return (Criteria) this;
        }

        public Criteria andAddressstatusGreaterThan(String value) {
            addCriterion("addressstatus >", value, "addressstatus");
            return (Criteria) this;
        }

        public Criteria andAddressstatusGreaterThanOrEqualTo(String value) {
            addCriterion("addressstatus >=", value, "addressstatus");
            return (Criteria) this;
        }

        public Criteria andAddressstatusLessThan(String value) {
            addCriterion("addressstatus <", value, "addressstatus");
            return (Criteria) this;
        }

        public Criteria andAddressstatusLessThanOrEqualTo(String value) {
            addCriterion("addressstatus <=", value, "addressstatus");
            return (Criteria) this;
        }

        public Criteria andAddressstatusLike(String value) {
            addCriterion("addressstatus like", value, "addressstatus");
            return (Criteria) this;
        }

        public Criteria andAddressstatusNotLike(String value) {
            addCriterion("addressstatus not like", value, "addressstatus");
            return (Criteria) this;
        }

        public Criteria andAddressstatusIn(List<String> values) {
            addCriterion("addressstatus in", values, "addressstatus");
            return (Criteria) this;
        }

        public Criteria andAddressstatusNotIn(List<String> values) {
            addCriterion("addressstatus not in", values, "addressstatus");
            return (Criteria) this;
        }

        public Criteria andAddressstatusBetween(String value1, String value2) {
            addCriterion("addressstatus between", value1, value2, "addressstatus");
            return (Criteria) this;
        }

        public Criteria andAddressstatusNotBetween(String value1, String value2) {
            addCriterion("addressstatus not between", value1, value2, "addressstatus");
            return (Criteria) this;
        }

        public Criteria andAddressnormalizationstatusIsNull() {
            addCriterion("addressnormalizationstatus is null");
            return (Criteria) this;
        }

        public Criteria andAddressnormalizationstatusIsNotNull() {
            addCriterion("addressnormalizationstatus is not null");
            return (Criteria) this;
        }

        public Criteria andAddressnormalizationstatusEqualTo(String value) {
            addCriterion("addressnormalizationstatus =", value, "addressnormalizationstatus");
            return (Criteria) this;
        }

        public Criteria andAddressnormalizationstatusNotEqualTo(String value) {
            addCriterion("addressnormalizationstatus <>", value, "addressnormalizationstatus");
            return (Criteria) this;
        }

        public Criteria andAddressnormalizationstatusGreaterThan(String value) {
            addCriterion("addressnormalizationstatus >", value, "addressnormalizationstatus");
            return (Criteria) this;
        }

        public Criteria andAddressnormalizationstatusGreaterThanOrEqualTo(String value) {
            addCriterion("addressnormalizationstatus >=", value, "addressnormalizationstatus");
            return (Criteria) this;
        }

        public Criteria andAddressnormalizationstatusLessThan(String value) {
            addCriterion("addressnormalizationstatus <", value, "addressnormalizationstatus");
            return (Criteria) this;
        }

        public Criteria andAddressnormalizationstatusLessThanOrEqualTo(String value) {
            addCriterion("addressnormalizationstatus <=", value, "addressnormalizationstatus");
            return (Criteria) this;
        }

        public Criteria andAddressnormalizationstatusLike(String value) {
            addCriterion("addressnormalizationstatus like", value, "addressnormalizationstatus");
            return (Criteria) this;
        }

        public Criteria andAddressnormalizationstatusNotLike(String value) {
            addCriterion("addressnormalizationstatus not like", value, "addressnormalizationstatus");
            return (Criteria) this;
        }

        public Criteria andAddressnormalizationstatusIn(List<String> values) {
            addCriterion("addressnormalizationstatus in", values, "addressnormalizationstatus");
            return (Criteria) this;
        }

        public Criteria andAddressnormalizationstatusNotIn(List<String> values) {
            addCriterion("addressnormalizationstatus not in", values, "addressnormalizationstatus");
            return (Criteria) this;
        }

        public Criteria andAddressnormalizationstatusBetween(String value1, String value2) {
            addCriterion("addressnormalizationstatus between", value1, value2, "addressnormalizationstatus");
            return (Criteria) this;
        }

        public Criteria andAddressnormalizationstatusNotBetween(String value1, String value2) {
            addCriterion("addressnormalizationstatus not between", value1, value2, "addressnormalizationstatus");
            return (Criteria) this;
        }

        public Criteria andCreatedonIsNull() {
            addCriterion("createdon is null");
            return (Criteria) this;
        }

        public Criteria andCreatedonIsNotNull() {
            addCriterion("createdon is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedonEqualTo(Date value) {
            addCriterion("createdon =", value, "createdon");
            return (Criteria) this;
        }

        public Criteria andCreatedonNotEqualTo(Date value) {
            addCriterion("createdon <>", value, "createdon");
            return (Criteria) this;
        }

        public Criteria andCreatedonGreaterThan(Date value) {
            addCriterion("createdon >", value, "createdon");
            return (Criteria) this;
        }

        public Criteria andCreatedonGreaterThanOrEqualTo(Date value) {
            addCriterion("createdon >=", value, "createdon");
            return (Criteria) this;
        }

        public Criteria andCreatedonLessThan(Date value) {
            addCriterion("createdon <", value, "createdon");
            return (Criteria) this;
        }

        public Criteria andCreatedonLessThanOrEqualTo(Date value) {
            addCriterion("createdon <=", value, "createdon");
            return (Criteria) this;
        }

        public Criteria andCreatedonIn(List<Date> values) {
            addCriterion("createdon in", values, "createdon");
            return (Criteria) this;
        }

        public Criteria andCreatedonNotIn(List<Date> values) {
            addCriterion("createdon not in", values, "createdon");
            return (Criteria) this;
        }

        public Criteria andCreatedonBetween(Date value1, Date value2) {
            addCriterion("createdon between", value1, value2, "createdon");
            return (Criteria) this;
        }

        public Criteria andCreatedonNotBetween(Date value1, Date value2) {
            addCriterion("createdon not between", value1, value2, "createdon");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}