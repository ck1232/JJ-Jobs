package com.jj.jobs.model;

import java.util.ArrayList;
import java.util.List;

public class TransactionPayerInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TransactionPayerInfoExample() {
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

        public Criteria andPayerIsNull() {
            addCriterion("payer is null");
            return (Criteria) this;
        }

        public Criteria andPayerIsNotNull() {
            addCriterion("payer is not null");
            return (Criteria) this;
        }

        public Criteria andPayerEqualTo(String value) {
            addCriterion("payer =", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotEqualTo(String value) {
            addCriterion("payer <>", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerGreaterThan(String value) {
            addCriterion("payer >", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerGreaterThanOrEqualTo(String value) {
            addCriterion("payer >=", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerLessThan(String value) {
            addCriterion("payer <", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerLessThanOrEqualTo(String value) {
            addCriterion("payer <=", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerLike(String value) {
            addCriterion("payer like", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotLike(String value) {
            addCriterion("payer not like", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerIn(List<String> values) {
            addCriterion("payer in", values, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotIn(List<String> values) {
            addCriterion("payer not in", values, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerBetween(String value1, String value2) {
            addCriterion("payer between", value1, value2, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotBetween(String value1, String value2) {
            addCriterion("payer not between", value1, value2, "payer");
            return (Criteria) this;
        }

        public Criteria andPayeridIsNull() {
            addCriterion("payerId is null");
            return (Criteria) this;
        }

        public Criteria andPayeridIsNotNull() {
            addCriterion("payerId is not null");
            return (Criteria) this;
        }

        public Criteria andPayeridEqualTo(String value) {
            addCriterion("payerId =", value, "payerid");
            return (Criteria) this;
        }

        public Criteria andPayeridNotEqualTo(String value) {
            addCriterion("payerId <>", value, "payerid");
            return (Criteria) this;
        }

        public Criteria andPayeridGreaterThan(String value) {
            addCriterion("payerId >", value, "payerid");
            return (Criteria) this;
        }

        public Criteria andPayeridGreaterThanOrEqualTo(String value) {
            addCriterion("payerId >=", value, "payerid");
            return (Criteria) this;
        }

        public Criteria andPayeridLessThan(String value) {
            addCriterion("payerId <", value, "payerid");
            return (Criteria) this;
        }

        public Criteria andPayeridLessThanOrEqualTo(String value) {
            addCriterion("payerId <=", value, "payerid");
            return (Criteria) this;
        }

        public Criteria andPayeridLike(String value) {
            addCriterion("payerId like", value, "payerid");
            return (Criteria) this;
        }

        public Criteria andPayeridNotLike(String value) {
            addCriterion("payerId not like", value, "payerid");
            return (Criteria) this;
        }

        public Criteria andPayeridIn(List<String> values) {
            addCriterion("payerId in", values, "payerid");
            return (Criteria) this;
        }

        public Criteria andPayeridNotIn(List<String> values) {
            addCriterion("payerId not in", values, "payerid");
            return (Criteria) this;
        }

        public Criteria andPayeridBetween(String value1, String value2) {
            addCriterion("payerId between", value1, value2, "payerid");
            return (Criteria) this;
        }

        public Criteria andPayeridNotBetween(String value1, String value2) {
            addCriterion("payerId not between", value1, value2, "payerid");
            return (Criteria) this;
        }

        public Criteria andPayerstatusIsNull() {
            addCriterion("payerStatus is null");
            return (Criteria) this;
        }

        public Criteria andPayerstatusIsNotNull() {
            addCriterion("payerStatus is not null");
            return (Criteria) this;
        }

        public Criteria andPayerstatusEqualTo(String value) {
            addCriterion("payerStatus =", value, "payerstatus");
            return (Criteria) this;
        }

        public Criteria andPayerstatusNotEqualTo(String value) {
            addCriterion("payerStatus <>", value, "payerstatus");
            return (Criteria) this;
        }

        public Criteria andPayerstatusGreaterThan(String value) {
            addCriterion("payerStatus >", value, "payerstatus");
            return (Criteria) this;
        }

        public Criteria andPayerstatusGreaterThanOrEqualTo(String value) {
            addCriterion("payerStatus >=", value, "payerstatus");
            return (Criteria) this;
        }

        public Criteria andPayerstatusLessThan(String value) {
            addCriterion("payerStatus <", value, "payerstatus");
            return (Criteria) this;
        }

        public Criteria andPayerstatusLessThanOrEqualTo(String value) {
            addCriterion("payerStatus <=", value, "payerstatus");
            return (Criteria) this;
        }

        public Criteria andPayerstatusLike(String value) {
            addCriterion("payerStatus like", value, "payerstatus");
            return (Criteria) this;
        }

        public Criteria andPayerstatusNotLike(String value) {
            addCriterion("payerStatus not like", value, "payerstatus");
            return (Criteria) this;
        }

        public Criteria andPayerstatusIn(List<String> values) {
            addCriterion("payerStatus in", values, "payerstatus");
            return (Criteria) this;
        }

        public Criteria andPayerstatusNotIn(List<String> values) {
            addCriterion("payerStatus not in", values, "payerstatus");
            return (Criteria) this;
        }

        public Criteria andPayerstatusBetween(String value1, String value2) {
            addCriterion("payerStatus between", value1, value2, "payerstatus");
            return (Criteria) this;
        }

        public Criteria andPayerstatusNotBetween(String value1, String value2) {
            addCriterion("payerStatus not between", value1, value2, "payerstatus");
            return (Criteria) this;
        }

        public Criteria andPayernameIsNull() {
            addCriterion("payerName is null");
            return (Criteria) this;
        }

        public Criteria andPayernameIsNotNull() {
            addCriterion("payerName is not null");
            return (Criteria) this;
        }

        public Criteria andPayernameEqualTo(String value) {
            addCriterion("payerName =", value, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameNotEqualTo(String value) {
            addCriterion("payerName <>", value, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameGreaterThan(String value) {
            addCriterion("payerName >", value, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameGreaterThanOrEqualTo(String value) {
            addCriterion("payerName >=", value, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameLessThan(String value) {
            addCriterion("payerName <", value, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameLessThanOrEqualTo(String value) {
            addCriterion("payerName <=", value, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameLike(String value) {
            addCriterion("payerName like", value, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameNotLike(String value) {
            addCriterion("payerName not like", value, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameIn(List<String> values) {
            addCriterion("payerName in", values, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameNotIn(List<String> values) {
            addCriterion("payerName not in", values, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameBetween(String value1, String value2) {
            addCriterion("payerName between", value1, value2, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameNotBetween(String value1, String value2) {
            addCriterion("payerName not between", value1, value2, "payername");
            return (Criteria) this;
        }

        public Criteria andPayercountryIsNull() {
            addCriterion("payerCountry is null");
            return (Criteria) this;
        }

        public Criteria andPayercountryIsNotNull() {
            addCriterion("payerCountry is not null");
            return (Criteria) this;
        }

        public Criteria andPayercountryEqualTo(String value) {
            addCriterion("payerCountry =", value, "payercountry");
            return (Criteria) this;
        }

        public Criteria andPayercountryNotEqualTo(String value) {
            addCriterion("payerCountry <>", value, "payercountry");
            return (Criteria) this;
        }

        public Criteria andPayercountryGreaterThan(String value) {
            addCriterion("payerCountry >", value, "payercountry");
            return (Criteria) this;
        }

        public Criteria andPayercountryGreaterThanOrEqualTo(String value) {
            addCriterion("payerCountry >=", value, "payercountry");
            return (Criteria) this;
        }

        public Criteria andPayercountryLessThan(String value) {
            addCriterion("payerCountry <", value, "payercountry");
            return (Criteria) this;
        }

        public Criteria andPayercountryLessThanOrEqualTo(String value) {
            addCriterion("payerCountry <=", value, "payercountry");
            return (Criteria) this;
        }

        public Criteria andPayercountryLike(String value) {
            addCriterion("payerCountry like", value, "payercountry");
            return (Criteria) this;
        }

        public Criteria andPayercountryNotLike(String value) {
            addCriterion("payerCountry not like", value, "payercountry");
            return (Criteria) this;
        }

        public Criteria andPayercountryIn(List<String> values) {
            addCriterion("payerCountry in", values, "payercountry");
            return (Criteria) this;
        }

        public Criteria andPayercountryNotIn(List<String> values) {
            addCriterion("payerCountry not in", values, "payercountry");
            return (Criteria) this;
        }

        public Criteria andPayercountryBetween(String value1, String value2) {
            addCriterion("payerCountry between", value1, value2, "payercountry");
            return (Criteria) this;
        }

        public Criteria andPayercountryNotBetween(String value1, String value2) {
            addCriterion("payerCountry not between", value1, value2, "payercountry");
            return (Criteria) this;
        }

        public Criteria andPayerbusinessIsNull() {
            addCriterion("payerBusiness is null");
            return (Criteria) this;
        }

        public Criteria andPayerbusinessIsNotNull() {
            addCriterion("payerBusiness is not null");
            return (Criteria) this;
        }

        public Criteria andPayerbusinessEqualTo(String value) {
            addCriterion("payerBusiness =", value, "payerbusiness");
            return (Criteria) this;
        }

        public Criteria andPayerbusinessNotEqualTo(String value) {
            addCriterion("payerBusiness <>", value, "payerbusiness");
            return (Criteria) this;
        }

        public Criteria andPayerbusinessGreaterThan(String value) {
            addCriterion("payerBusiness >", value, "payerbusiness");
            return (Criteria) this;
        }

        public Criteria andPayerbusinessGreaterThanOrEqualTo(String value) {
            addCriterion("payerBusiness >=", value, "payerbusiness");
            return (Criteria) this;
        }

        public Criteria andPayerbusinessLessThan(String value) {
            addCriterion("payerBusiness <", value, "payerbusiness");
            return (Criteria) this;
        }

        public Criteria andPayerbusinessLessThanOrEqualTo(String value) {
            addCriterion("payerBusiness <=", value, "payerbusiness");
            return (Criteria) this;
        }

        public Criteria andPayerbusinessLike(String value) {
            addCriterion("payerBusiness like", value, "payerbusiness");
            return (Criteria) this;
        }

        public Criteria andPayerbusinessNotLike(String value) {
            addCriterion("payerBusiness not like", value, "payerbusiness");
            return (Criteria) this;
        }

        public Criteria andPayerbusinessIn(List<String> values) {
            addCriterion("payerBusiness in", values, "payerbusiness");
            return (Criteria) this;
        }

        public Criteria andPayerbusinessNotIn(List<String> values) {
            addCriterion("payerBusiness not in", values, "payerbusiness");
            return (Criteria) this;
        }

        public Criteria andPayerbusinessBetween(String value1, String value2) {
            addCriterion("payerBusiness between", value1, value2, "payerbusiness");
            return (Criteria) this;
        }

        public Criteria andPayerbusinessNotBetween(String value1, String value2) {
            addCriterion("payerBusiness not between", value1, value2, "payerbusiness");
            return (Criteria) this;
        }

        public Criteria andContactphoneIsNull() {
            addCriterion("contactPhone is null");
            return (Criteria) this;
        }

        public Criteria andContactphoneIsNotNull() {
            addCriterion("contactPhone is not null");
            return (Criteria) this;
        }

        public Criteria andContactphoneEqualTo(String value) {
            addCriterion("contactPhone =", value, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneNotEqualTo(String value) {
            addCriterion("contactPhone <>", value, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneGreaterThan(String value) {
            addCriterion("contactPhone >", value, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneGreaterThanOrEqualTo(String value) {
            addCriterion("contactPhone >=", value, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneLessThan(String value) {
            addCriterion("contactPhone <", value, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneLessThanOrEqualTo(String value) {
            addCriterion("contactPhone <=", value, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneLike(String value) {
            addCriterion("contactPhone like", value, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneNotLike(String value) {
            addCriterion("contactPhone not like", value, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneIn(List<String> values) {
            addCriterion("contactPhone in", values, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneNotIn(List<String> values) {
            addCriterion("contactPhone not in", values, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneBetween(String value1, String value2) {
            addCriterion("contactPhone between", value1, value2, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneNotBetween(String value1, String value2) {
            addCriterion("contactPhone not between", value1, value2, "contactphone");
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