package com.jj.jobs.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TransactionPaymentInfoOptionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TransactionPaymentInfoOptionExample() {
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

        public Criteria andOptionnameIsNull() {
            addCriterion("optionName is null");
            return (Criteria) this;
        }

        public Criteria andOptionnameIsNotNull() {
            addCriterion("optionName is not null");
            return (Criteria) this;
        }

        public Criteria andOptionnameEqualTo(String value) {
            addCriterion("optionName =", value, "optionname");
            return (Criteria) this;
        }

        public Criteria andOptionnameNotEqualTo(String value) {
            addCriterion("optionName <>", value, "optionname");
            return (Criteria) this;
        }

        public Criteria andOptionnameGreaterThan(String value) {
            addCriterion("optionName >", value, "optionname");
            return (Criteria) this;
        }

        public Criteria andOptionnameGreaterThanOrEqualTo(String value) {
            addCriterion("optionName >=", value, "optionname");
            return (Criteria) this;
        }

        public Criteria andOptionnameLessThan(String value) {
            addCriterion("optionName <", value, "optionname");
            return (Criteria) this;
        }

        public Criteria andOptionnameLessThanOrEqualTo(String value) {
            addCriterion("optionName <=", value, "optionname");
            return (Criteria) this;
        }

        public Criteria andOptionnameLike(String value) {
            addCriterion("optionName like", value, "optionname");
            return (Criteria) this;
        }

        public Criteria andOptionnameNotLike(String value) {
            addCriterion("optionName not like", value, "optionname");
            return (Criteria) this;
        }

        public Criteria andOptionnameIn(List<String> values) {
            addCriterion("optionName in", values, "optionname");
            return (Criteria) this;
        }

        public Criteria andOptionnameNotIn(List<String> values) {
            addCriterion("optionName not in", values, "optionname");
            return (Criteria) this;
        }

        public Criteria andOptionnameBetween(String value1, String value2) {
            addCriterion("optionName between", value1, value2, "optionname");
            return (Criteria) this;
        }

        public Criteria andOptionnameNotBetween(String value1, String value2) {
            addCriterion("optionName not between", value1, value2, "optionname");
            return (Criteria) this;
        }

        public Criteria andOptionvalueIsNull() {
            addCriterion("optionValue is null");
            return (Criteria) this;
        }

        public Criteria andOptionvalueIsNotNull() {
            addCriterion("optionValue is not null");
            return (Criteria) this;
        }

        public Criteria andOptionvalueEqualTo(String value) {
            addCriterion("optionValue =", value, "optionvalue");
            return (Criteria) this;
        }

        public Criteria andOptionvalueNotEqualTo(String value) {
            addCriterion("optionValue <>", value, "optionvalue");
            return (Criteria) this;
        }

        public Criteria andOptionvalueGreaterThan(String value) {
            addCriterion("optionValue >", value, "optionvalue");
            return (Criteria) this;
        }

        public Criteria andOptionvalueGreaterThanOrEqualTo(String value) {
            addCriterion("optionValue >=", value, "optionvalue");
            return (Criteria) this;
        }

        public Criteria andOptionvalueLessThan(String value) {
            addCriterion("optionValue <", value, "optionvalue");
            return (Criteria) this;
        }

        public Criteria andOptionvalueLessThanOrEqualTo(String value) {
            addCriterion("optionValue <=", value, "optionvalue");
            return (Criteria) this;
        }

        public Criteria andOptionvalueLike(String value) {
            addCriterion("optionValue like", value, "optionvalue");
            return (Criteria) this;
        }

        public Criteria andOptionvalueNotLike(String value) {
            addCriterion("optionValue not like", value, "optionvalue");
            return (Criteria) this;
        }

        public Criteria andOptionvalueIn(List<String> values) {
            addCriterion("optionValue in", values, "optionvalue");
            return (Criteria) this;
        }

        public Criteria andOptionvalueNotIn(List<String> values) {
            addCriterion("optionValue not in", values, "optionvalue");
            return (Criteria) this;
        }

        public Criteria andOptionvalueBetween(String value1, String value2) {
            addCriterion("optionValue between", value1, value2, "optionvalue");
            return (Criteria) this;
        }

        public Criteria andOptionvalueNotBetween(String value1, String value2) {
            addCriterion("optionValue not between", value1, value2, "optionvalue");
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