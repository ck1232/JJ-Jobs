package com.jj.jobs.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TransactionPaymentItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TransactionPaymentItemExample() {
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

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(String value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(String value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(String value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(String value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(String value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(String value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLike(String value) {
            addCriterion("number like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotLike(String value) {
            addCriterion("number not like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<String> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<String> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(String value1, String value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(String value1, String value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andEbayitemtxnidIsNull() {
            addCriterion("ebayItemTxnId is null");
            return (Criteria) this;
        }

        public Criteria andEbayitemtxnidIsNotNull() {
            addCriterion("ebayItemTxnId is not null");
            return (Criteria) this;
        }

        public Criteria andEbayitemtxnidEqualTo(String value) {
            addCriterion("ebayItemTxnId =", value, "ebayitemtxnid");
            return (Criteria) this;
        }

        public Criteria andEbayitemtxnidNotEqualTo(String value) {
            addCriterion("ebayItemTxnId <>", value, "ebayitemtxnid");
            return (Criteria) this;
        }

        public Criteria andEbayitemtxnidGreaterThan(String value) {
            addCriterion("ebayItemTxnId >", value, "ebayitemtxnid");
            return (Criteria) this;
        }

        public Criteria andEbayitemtxnidGreaterThanOrEqualTo(String value) {
            addCriterion("ebayItemTxnId >=", value, "ebayitemtxnid");
            return (Criteria) this;
        }

        public Criteria andEbayitemtxnidLessThan(String value) {
            addCriterion("ebayItemTxnId <", value, "ebayitemtxnid");
            return (Criteria) this;
        }

        public Criteria andEbayitemtxnidLessThanOrEqualTo(String value) {
            addCriterion("ebayItemTxnId <=", value, "ebayitemtxnid");
            return (Criteria) this;
        }

        public Criteria andEbayitemtxnidLike(String value) {
            addCriterion("ebayItemTxnId like", value, "ebayitemtxnid");
            return (Criteria) this;
        }

        public Criteria andEbayitemtxnidNotLike(String value) {
            addCriterion("ebayItemTxnId not like", value, "ebayitemtxnid");
            return (Criteria) this;
        }

        public Criteria andEbayitemtxnidIn(List<String> values) {
            addCriterion("ebayItemTxnId in", values, "ebayitemtxnid");
            return (Criteria) this;
        }

        public Criteria andEbayitemtxnidNotIn(List<String> values) {
            addCriterion("ebayItemTxnId not in", values, "ebayitemtxnid");
            return (Criteria) this;
        }

        public Criteria andEbayitemtxnidBetween(String value1, String value2) {
            addCriterion("ebayItemTxnId between", value1, value2, "ebayitemtxnid");
            return (Criteria) this;
        }

        public Criteria andEbayitemtxnidNotBetween(String value1, String value2) {
            addCriterion("ebayItemTxnId not between", value1, value2, "ebayitemtxnid");
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

        public Criteria andQuantityIsNull() {
            addCriterion("quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(String value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(String value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(String value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(String value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(String value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(String value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLike(String value) {
            addCriterion("quantity like", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotLike(String value) {
            addCriterion("quantity not like", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<String> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<String> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(String value1, String value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(String value1, String value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andShippingamountIsNull() {
            addCriterion("shippingAmount is null");
            return (Criteria) this;
        }

        public Criteria andShippingamountIsNotNull() {
            addCriterion("shippingAmount is not null");
            return (Criteria) this;
        }

        public Criteria andShippingamountEqualTo(BigDecimal value) {
            addCriterion("shippingAmount =", value, "shippingamount");
            return (Criteria) this;
        }

        public Criteria andShippingamountNotEqualTo(BigDecimal value) {
            addCriterion("shippingAmount <>", value, "shippingamount");
            return (Criteria) this;
        }

        public Criteria andShippingamountGreaterThan(BigDecimal value) {
            addCriterion("shippingAmount >", value, "shippingamount");
            return (Criteria) this;
        }

        public Criteria andShippingamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("shippingAmount >=", value, "shippingamount");
            return (Criteria) this;
        }

        public Criteria andShippingamountLessThan(BigDecimal value) {
            addCriterion("shippingAmount <", value, "shippingamount");
            return (Criteria) this;
        }

        public Criteria andShippingamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("shippingAmount <=", value, "shippingamount");
            return (Criteria) this;
        }

        public Criteria andShippingamountIn(List<BigDecimal> values) {
            addCriterion("shippingAmount in", values, "shippingamount");
            return (Criteria) this;
        }

        public Criteria andShippingamountNotIn(List<BigDecimal> values) {
            addCriterion("shippingAmount not in", values, "shippingamount");
            return (Criteria) this;
        }

        public Criteria andShippingamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shippingAmount between", value1, value2, "shippingamount");
            return (Criteria) this;
        }

        public Criteria andShippingamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shippingAmount not between", value1, value2, "shippingamount");
            return (Criteria) this;
        }

        public Criteria andHandlingamountIsNull() {
            addCriterion("handlingAmount is null");
            return (Criteria) this;
        }

        public Criteria andHandlingamountIsNotNull() {
            addCriterion("handlingAmount is not null");
            return (Criteria) this;
        }

        public Criteria andHandlingamountEqualTo(BigDecimal value) {
            addCriterion("handlingAmount =", value, "handlingamount");
            return (Criteria) this;
        }

        public Criteria andHandlingamountNotEqualTo(BigDecimal value) {
            addCriterion("handlingAmount <>", value, "handlingamount");
            return (Criteria) this;
        }

        public Criteria andHandlingamountGreaterThan(BigDecimal value) {
            addCriterion("handlingAmount >", value, "handlingamount");
            return (Criteria) this;
        }

        public Criteria andHandlingamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("handlingAmount >=", value, "handlingamount");
            return (Criteria) this;
        }

        public Criteria andHandlingamountLessThan(BigDecimal value) {
            addCriterion("handlingAmount <", value, "handlingamount");
            return (Criteria) this;
        }

        public Criteria andHandlingamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("handlingAmount <=", value, "handlingamount");
            return (Criteria) this;
        }

        public Criteria andHandlingamountIn(List<BigDecimal> values) {
            addCriterion("handlingAmount in", values, "handlingamount");
            return (Criteria) this;
        }

        public Criteria andHandlingamountNotIn(List<BigDecimal> values) {
            addCriterion("handlingAmount not in", values, "handlingamount");
            return (Criteria) this;
        }

        public Criteria andHandlingamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("handlingAmount between", value1, value2, "handlingamount");
            return (Criteria) this;
        }

        public Criteria andHandlingamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("handlingAmount not between", value1, value2, "handlingamount");
            return (Criteria) this;
        }

        public Criteria andCouponidIsNull() {
            addCriterion("couponID is null");
            return (Criteria) this;
        }

        public Criteria andCouponidIsNotNull() {
            addCriterion("couponID is not null");
            return (Criteria) this;
        }

        public Criteria andCouponidEqualTo(String value) {
            addCriterion("couponID =", value, "couponid");
            return (Criteria) this;
        }

        public Criteria andCouponidNotEqualTo(String value) {
            addCriterion("couponID <>", value, "couponid");
            return (Criteria) this;
        }

        public Criteria andCouponidGreaterThan(String value) {
            addCriterion("couponID >", value, "couponid");
            return (Criteria) this;
        }

        public Criteria andCouponidGreaterThanOrEqualTo(String value) {
            addCriterion("couponID >=", value, "couponid");
            return (Criteria) this;
        }

        public Criteria andCouponidLessThan(String value) {
            addCriterion("couponID <", value, "couponid");
            return (Criteria) this;
        }

        public Criteria andCouponidLessThanOrEqualTo(String value) {
            addCriterion("couponID <=", value, "couponid");
            return (Criteria) this;
        }

        public Criteria andCouponidLike(String value) {
            addCriterion("couponID like", value, "couponid");
            return (Criteria) this;
        }

        public Criteria andCouponidNotLike(String value) {
            addCriterion("couponID not like", value, "couponid");
            return (Criteria) this;
        }

        public Criteria andCouponidIn(List<String> values) {
            addCriterion("couponID in", values, "couponid");
            return (Criteria) this;
        }

        public Criteria andCouponidNotIn(List<String> values) {
            addCriterion("couponID not in", values, "couponid");
            return (Criteria) this;
        }

        public Criteria andCouponidBetween(String value1, String value2) {
            addCriterion("couponID between", value1, value2, "couponid");
            return (Criteria) this;
        }

        public Criteria andCouponidNotBetween(String value1, String value2) {
            addCriterion("couponID not between", value1, value2, "couponid");
            return (Criteria) this;
        }

        public Criteria andCouponamountIsNull() {
            addCriterion("couponAmount is null");
            return (Criteria) this;
        }

        public Criteria andCouponamountIsNotNull() {
            addCriterion("couponAmount is not null");
            return (Criteria) this;
        }

        public Criteria andCouponamountEqualTo(String value) {
            addCriterion("couponAmount =", value, "couponamount");
            return (Criteria) this;
        }

        public Criteria andCouponamountNotEqualTo(String value) {
            addCriterion("couponAmount <>", value, "couponamount");
            return (Criteria) this;
        }

        public Criteria andCouponamountGreaterThan(String value) {
            addCriterion("couponAmount >", value, "couponamount");
            return (Criteria) this;
        }

        public Criteria andCouponamountGreaterThanOrEqualTo(String value) {
            addCriterion("couponAmount >=", value, "couponamount");
            return (Criteria) this;
        }

        public Criteria andCouponamountLessThan(String value) {
            addCriterion("couponAmount <", value, "couponamount");
            return (Criteria) this;
        }

        public Criteria andCouponamountLessThanOrEqualTo(String value) {
            addCriterion("couponAmount <=", value, "couponamount");
            return (Criteria) this;
        }

        public Criteria andCouponamountLike(String value) {
            addCriterion("couponAmount like", value, "couponamount");
            return (Criteria) this;
        }

        public Criteria andCouponamountNotLike(String value) {
            addCriterion("couponAmount not like", value, "couponamount");
            return (Criteria) this;
        }

        public Criteria andCouponamountIn(List<String> values) {
            addCriterion("couponAmount in", values, "couponamount");
            return (Criteria) this;
        }

        public Criteria andCouponamountNotIn(List<String> values) {
            addCriterion("couponAmount not in", values, "couponamount");
            return (Criteria) this;
        }

        public Criteria andCouponamountBetween(String value1, String value2) {
            addCriterion("couponAmount between", value1, value2, "couponamount");
            return (Criteria) this;
        }

        public Criteria andCouponamountNotBetween(String value1, String value2) {
            addCriterion("couponAmount not between", value1, value2, "couponamount");
            return (Criteria) this;
        }

        public Criteria andCouponamountcurrencyIsNull() {
            addCriterion("couponAmountCurrency is null");
            return (Criteria) this;
        }

        public Criteria andCouponamountcurrencyIsNotNull() {
            addCriterion("couponAmountCurrency is not null");
            return (Criteria) this;
        }

        public Criteria andCouponamountcurrencyEqualTo(String value) {
            addCriterion("couponAmountCurrency =", value, "couponamountcurrency");
            return (Criteria) this;
        }

        public Criteria andCouponamountcurrencyNotEqualTo(String value) {
            addCriterion("couponAmountCurrency <>", value, "couponamountcurrency");
            return (Criteria) this;
        }

        public Criteria andCouponamountcurrencyGreaterThan(String value) {
            addCriterion("couponAmountCurrency >", value, "couponamountcurrency");
            return (Criteria) this;
        }

        public Criteria andCouponamountcurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("couponAmountCurrency >=", value, "couponamountcurrency");
            return (Criteria) this;
        }

        public Criteria andCouponamountcurrencyLessThan(String value) {
            addCriterion("couponAmountCurrency <", value, "couponamountcurrency");
            return (Criteria) this;
        }

        public Criteria andCouponamountcurrencyLessThanOrEqualTo(String value) {
            addCriterion("couponAmountCurrency <=", value, "couponamountcurrency");
            return (Criteria) this;
        }

        public Criteria andCouponamountcurrencyLike(String value) {
            addCriterion("couponAmountCurrency like", value, "couponamountcurrency");
            return (Criteria) this;
        }

        public Criteria andCouponamountcurrencyNotLike(String value) {
            addCriterion("couponAmountCurrency not like", value, "couponamountcurrency");
            return (Criteria) this;
        }

        public Criteria andCouponamountcurrencyIn(List<String> values) {
            addCriterion("couponAmountCurrency in", values, "couponamountcurrency");
            return (Criteria) this;
        }

        public Criteria andCouponamountcurrencyNotIn(List<String> values) {
            addCriterion("couponAmountCurrency not in", values, "couponamountcurrency");
            return (Criteria) this;
        }

        public Criteria andCouponamountcurrencyBetween(String value1, String value2) {
            addCriterion("couponAmountCurrency between", value1, value2, "couponamountcurrency");
            return (Criteria) this;
        }

        public Criteria andCouponamountcurrencyNotBetween(String value1, String value2) {
            addCriterion("couponAmountCurrency not between", value1, value2, "couponamountcurrency");
            return (Criteria) this;
        }

        public Criteria andLoyaltycarddiscountamountIsNull() {
            addCriterion("loyaltyCardDiscountAmount is null");
            return (Criteria) this;
        }

        public Criteria andLoyaltycarddiscountamountIsNotNull() {
            addCriterion("loyaltyCardDiscountAmount is not null");
            return (Criteria) this;
        }

        public Criteria andLoyaltycarddiscountamountEqualTo(String value) {
            addCriterion("loyaltyCardDiscountAmount =", value, "loyaltycarddiscountamount");
            return (Criteria) this;
        }

        public Criteria andLoyaltycarddiscountamountNotEqualTo(String value) {
            addCriterion("loyaltyCardDiscountAmount <>", value, "loyaltycarddiscountamount");
            return (Criteria) this;
        }

        public Criteria andLoyaltycarddiscountamountGreaterThan(String value) {
            addCriterion("loyaltyCardDiscountAmount >", value, "loyaltycarddiscountamount");
            return (Criteria) this;
        }

        public Criteria andLoyaltycarddiscountamountGreaterThanOrEqualTo(String value) {
            addCriterion("loyaltyCardDiscountAmount >=", value, "loyaltycarddiscountamount");
            return (Criteria) this;
        }

        public Criteria andLoyaltycarddiscountamountLessThan(String value) {
            addCriterion("loyaltyCardDiscountAmount <", value, "loyaltycarddiscountamount");
            return (Criteria) this;
        }

        public Criteria andLoyaltycarddiscountamountLessThanOrEqualTo(String value) {
            addCriterion("loyaltyCardDiscountAmount <=", value, "loyaltycarddiscountamount");
            return (Criteria) this;
        }

        public Criteria andLoyaltycarddiscountamountLike(String value) {
            addCriterion("loyaltyCardDiscountAmount like", value, "loyaltycarddiscountamount");
            return (Criteria) this;
        }

        public Criteria andLoyaltycarddiscountamountNotLike(String value) {
            addCriterion("loyaltyCardDiscountAmount not like", value, "loyaltycarddiscountamount");
            return (Criteria) this;
        }

        public Criteria andLoyaltycarddiscountamountIn(List<String> values) {
            addCriterion("loyaltyCardDiscountAmount in", values, "loyaltycarddiscountamount");
            return (Criteria) this;
        }

        public Criteria andLoyaltycarddiscountamountNotIn(List<String> values) {
            addCriterion("loyaltyCardDiscountAmount not in", values, "loyaltycarddiscountamount");
            return (Criteria) this;
        }

        public Criteria andLoyaltycarddiscountamountBetween(String value1, String value2) {
            addCriterion("loyaltyCardDiscountAmount between", value1, value2, "loyaltycarddiscountamount");
            return (Criteria) this;
        }

        public Criteria andLoyaltycarddiscountamountNotBetween(String value1, String value2) {
            addCriterion("loyaltyCardDiscountAmount not between", value1, value2, "loyaltycarddiscountamount");
            return (Criteria) this;
        }

        public Criteria andLoyaltycarddiscountcurrencyIsNull() {
            addCriterion("loyaltyCardDiscountCurrency is null");
            return (Criteria) this;
        }

        public Criteria andLoyaltycarddiscountcurrencyIsNotNull() {
            addCriterion("loyaltyCardDiscountCurrency is not null");
            return (Criteria) this;
        }

        public Criteria andLoyaltycarddiscountcurrencyEqualTo(String value) {
            addCriterion("loyaltyCardDiscountCurrency =", value, "loyaltycarddiscountcurrency");
            return (Criteria) this;
        }

        public Criteria andLoyaltycarddiscountcurrencyNotEqualTo(String value) {
            addCriterion("loyaltyCardDiscountCurrency <>", value, "loyaltycarddiscountcurrency");
            return (Criteria) this;
        }

        public Criteria andLoyaltycarddiscountcurrencyGreaterThan(String value) {
            addCriterion("loyaltyCardDiscountCurrency >", value, "loyaltycarddiscountcurrency");
            return (Criteria) this;
        }

        public Criteria andLoyaltycarddiscountcurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("loyaltyCardDiscountCurrency >=", value, "loyaltycarddiscountcurrency");
            return (Criteria) this;
        }

        public Criteria andLoyaltycarddiscountcurrencyLessThan(String value) {
            addCriterion("loyaltyCardDiscountCurrency <", value, "loyaltycarddiscountcurrency");
            return (Criteria) this;
        }

        public Criteria andLoyaltycarddiscountcurrencyLessThanOrEqualTo(String value) {
            addCriterion("loyaltyCardDiscountCurrency <=", value, "loyaltycarddiscountcurrency");
            return (Criteria) this;
        }

        public Criteria andLoyaltycarddiscountcurrencyLike(String value) {
            addCriterion("loyaltyCardDiscountCurrency like", value, "loyaltycarddiscountcurrency");
            return (Criteria) this;
        }

        public Criteria andLoyaltycarddiscountcurrencyNotLike(String value) {
            addCriterion("loyaltyCardDiscountCurrency not like", value, "loyaltycarddiscountcurrency");
            return (Criteria) this;
        }

        public Criteria andLoyaltycarddiscountcurrencyIn(List<String> values) {
            addCriterion("loyaltyCardDiscountCurrency in", values, "loyaltycarddiscountcurrency");
            return (Criteria) this;
        }

        public Criteria andLoyaltycarddiscountcurrencyNotIn(List<String> values) {
            addCriterion("loyaltyCardDiscountCurrency not in", values, "loyaltycarddiscountcurrency");
            return (Criteria) this;
        }

        public Criteria andLoyaltycarddiscountcurrencyBetween(String value1, String value2) {
            addCriterion("loyaltyCardDiscountCurrency between", value1, value2, "loyaltycarddiscountcurrency");
            return (Criteria) this;
        }

        public Criteria andLoyaltycarddiscountcurrencyNotBetween(String value1, String value2) {
            addCriterion("loyaltyCardDiscountCurrency not between", value1, value2, "loyaltycarddiscountcurrency");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount not between", value1, value2, "amount");
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