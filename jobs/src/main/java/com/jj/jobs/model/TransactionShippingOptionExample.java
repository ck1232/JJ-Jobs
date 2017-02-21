package com.jj.jobs.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TransactionShippingOptionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TransactionShippingOptionExample() {
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

        public Criteria andShippingcalculationmodeIsNull() {
            addCriterion("shippingcalculationmode is null");
            return (Criteria) this;
        }

        public Criteria andShippingcalculationmodeIsNotNull() {
            addCriterion("shippingcalculationmode is not null");
            return (Criteria) this;
        }

        public Criteria andShippingcalculationmodeEqualTo(String value) {
            addCriterion("shippingcalculationmode =", value, "shippingcalculationmode");
            return (Criteria) this;
        }

        public Criteria andShippingcalculationmodeNotEqualTo(String value) {
            addCriterion("shippingcalculationmode <>", value, "shippingcalculationmode");
            return (Criteria) this;
        }

        public Criteria andShippingcalculationmodeGreaterThan(String value) {
            addCriterion("shippingcalculationmode >", value, "shippingcalculationmode");
            return (Criteria) this;
        }

        public Criteria andShippingcalculationmodeGreaterThanOrEqualTo(String value) {
            addCriterion("shippingcalculationmode >=", value, "shippingcalculationmode");
            return (Criteria) this;
        }

        public Criteria andShippingcalculationmodeLessThan(String value) {
            addCriterion("shippingcalculationmode <", value, "shippingcalculationmode");
            return (Criteria) this;
        }

        public Criteria andShippingcalculationmodeLessThanOrEqualTo(String value) {
            addCriterion("shippingcalculationmode <=", value, "shippingcalculationmode");
            return (Criteria) this;
        }

        public Criteria andShippingcalculationmodeLike(String value) {
            addCriterion("shippingcalculationmode like", value, "shippingcalculationmode");
            return (Criteria) this;
        }

        public Criteria andShippingcalculationmodeNotLike(String value) {
            addCriterion("shippingcalculationmode not like", value, "shippingcalculationmode");
            return (Criteria) this;
        }

        public Criteria andShippingcalculationmodeIn(List<String> values) {
            addCriterion("shippingcalculationmode in", values, "shippingcalculationmode");
            return (Criteria) this;
        }

        public Criteria andShippingcalculationmodeNotIn(List<String> values) {
            addCriterion("shippingcalculationmode not in", values, "shippingcalculationmode");
            return (Criteria) this;
        }

        public Criteria andShippingcalculationmodeBetween(String value1, String value2) {
            addCriterion("shippingcalculationmode between", value1, value2, "shippingcalculationmode");
            return (Criteria) this;
        }

        public Criteria andShippingcalculationmodeNotBetween(String value1, String value2) {
            addCriterion("shippingcalculationmode not between", value1, value2, "shippingcalculationmode");
            return (Criteria) this;
        }

        public Criteria andInsuranceoptionselectedIsNull() {
            addCriterion("insuranceoptionselected is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceoptionselectedIsNotNull() {
            addCriterion("insuranceoptionselected is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceoptionselectedEqualTo(String value) {
            addCriterion("insuranceoptionselected =", value, "insuranceoptionselected");
            return (Criteria) this;
        }

        public Criteria andInsuranceoptionselectedNotEqualTo(String value) {
            addCriterion("insuranceoptionselected <>", value, "insuranceoptionselected");
            return (Criteria) this;
        }

        public Criteria andInsuranceoptionselectedGreaterThan(String value) {
            addCriterion("insuranceoptionselected >", value, "insuranceoptionselected");
            return (Criteria) this;
        }

        public Criteria andInsuranceoptionselectedGreaterThanOrEqualTo(String value) {
            addCriterion("insuranceoptionselected >=", value, "insuranceoptionselected");
            return (Criteria) this;
        }

        public Criteria andInsuranceoptionselectedLessThan(String value) {
            addCriterion("insuranceoptionselected <", value, "insuranceoptionselected");
            return (Criteria) this;
        }

        public Criteria andInsuranceoptionselectedLessThanOrEqualTo(String value) {
            addCriterion("insuranceoptionselected <=", value, "insuranceoptionselected");
            return (Criteria) this;
        }

        public Criteria andInsuranceoptionselectedLike(String value) {
            addCriterion("insuranceoptionselected like", value, "insuranceoptionselected");
            return (Criteria) this;
        }

        public Criteria andInsuranceoptionselectedNotLike(String value) {
            addCriterion("insuranceoptionselected not like", value, "insuranceoptionselected");
            return (Criteria) this;
        }

        public Criteria andInsuranceoptionselectedIn(List<String> values) {
            addCriterion("insuranceoptionselected in", values, "insuranceoptionselected");
            return (Criteria) this;
        }

        public Criteria andInsuranceoptionselectedNotIn(List<String> values) {
            addCriterion("insuranceoptionselected not in", values, "insuranceoptionselected");
            return (Criteria) this;
        }

        public Criteria andInsuranceoptionselectedBetween(String value1, String value2) {
            addCriterion("insuranceoptionselected between", value1, value2, "insuranceoptionselected");
            return (Criteria) this;
        }

        public Criteria andInsuranceoptionselectedNotBetween(String value1, String value2) {
            addCriterion("insuranceoptionselected not between", value1, value2, "insuranceoptionselected");
            return (Criteria) this;
        }

        public Criteria andShippingoptionisdefaultIsNull() {
            addCriterion("shippingoptionisdefault is null");
            return (Criteria) this;
        }

        public Criteria andShippingoptionisdefaultIsNotNull() {
            addCriterion("shippingoptionisdefault is not null");
            return (Criteria) this;
        }

        public Criteria andShippingoptionisdefaultEqualTo(String value) {
            addCriterion("shippingoptionisdefault =", value, "shippingoptionisdefault");
            return (Criteria) this;
        }

        public Criteria andShippingoptionisdefaultNotEqualTo(String value) {
            addCriterion("shippingoptionisdefault <>", value, "shippingoptionisdefault");
            return (Criteria) this;
        }

        public Criteria andShippingoptionisdefaultGreaterThan(String value) {
            addCriterion("shippingoptionisdefault >", value, "shippingoptionisdefault");
            return (Criteria) this;
        }

        public Criteria andShippingoptionisdefaultGreaterThanOrEqualTo(String value) {
            addCriterion("shippingoptionisdefault >=", value, "shippingoptionisdefault");
            return (Criteria) this;
        }

        public Criteria andShippingoptionisdefaultLessThan(String value) {
            addCriterion("shippingoptionisdefault <", value, "shippingoptionisdefault");
            return (Criteria) this;
        }

        public Criteria andShippingoptionisdefaultLessThanOrEqualTo(String value) {
            addCriterion("shippingoptionisdefault <=", value, "shippingoptionisdefault");
            return (Criteria) this;
        }

        public Criteria andShippingoptionisdefaultLike(String value) {
            addCriterion("shippingoptionisdefault like", value, "shippingoptionisdefault");
            return (Criteria) this;
        }

        public Criteria andShippingoptionisdefaultNotLike(String value) {
            addCriterion("shippingoptionisdefault not like", value, "shippingoptionisdefault");
            return (Criteria) this;
        }

        public Criteria andShippingoptionisdefaultIn(List<String> values) {
            addCriterion("shippingoptionisdefault in", values, "shippingoptionisdefault");
            return (Criteria) this;
        }

        public Criteria andShippingoptionisdefaultNotIn(List<String> values) {
            addCriterion("shippingoptionisdefault not in", values, "shippingoptionisdefault");
            return (Criteria) this;
        }

        public Criteria andShippingoptionisdefaultBetween(String value1, String value2) {
            addCriterion("shippingoptionisdefault between", value1, value2, "shippingoptionisdefault");
            return (Criteria) this;
        }

        public Criteria andShippingoptionisdefaultNotBetween(String value1, String value2) {
            addCriterion("shippingoptionisdefault not between", value1, value2, "shippingoptionisdefault");
            return (Criteria) this;
        }

        public Criteria andShippingoptionamountIsNull() {
            addCriterion("shippingoptionamount is null");
            return (Criteria) this;
        }

        public Criteria andShippingoptionamountIsNotNull() {
            addCriterion("shippingoptionamount is not null");
            return (Criteria) this;
        }

        public Criteria andShippingoptionamountEqualTo(BigDecimal value) {
            addCriterion("shippingoptionamount =", value, "shippingoptionamount");
            return (Criteria) this;
        }

        public Criteria andShippingoptionamountNotEqualTo(BigDecimal value) {
            addCriterion("shippingoptionamount <>", value, "shippingoptionamount");
            return (Criteria) this;
        }

        public Criteria andShippingoptionamountGreaterThan(BigDecimal value) {
            addCriterion("shippingoptionamount >", value, "shippingoptionamount");
            return (Criteria) this;
        }

        public Criteria andShippingoptionamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("shippingoptionamount >=", value, "shippingoptionamount");
            return (Criteria) this;
        }

        public Criteria andShippingoptionamountLessThan(BigDecimal value) {
            addCriterion("shippingoptionamount <", value, "shippingoptionamount");
            return (Criteria) this;
        }

        public Criteria andShippingoptionamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("shippingoptionamount <=", value, "shippingoptionamount");
            return (Criteria) this;
        }

        public Criteria andShippingoptionamountIn(List<BigDecimal> values) {
            addCriterion("shippingoptionamount in", values, "shippingoptionamount");
            return (Criteria) this;
        }

        public Criteria andShippingoptionamountNotIn(List<BigDecimal> values) {
            addCriterion("shippingoptionamount not in", values, "shippingoptionamount");
            return (Criteria) this;
        }

        public Criteria andShippingoptionamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shippingoptionamount between", value1, value2, "shippingoptionamount");
            return (Criteria) this;
        }

        public Criteria andShippingoptionamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shippingoptionamount not between", value1, value2, "shippingoptionamount");
            return (Criteria) this;
        }

        public Criteria andShippingoptionnameIsNull() {
            addCriterion("shippingoptionname is null");
            return (Criteria) this;
        }

        public Criteria andShippingoptionnameIsNotNull() {
            addCriterion("shippingoptionname is not null");
            return (Criteria) this;
        }

        public Criteria andShippingoptionnameEqualTo(String value) {
            addCriterion("shippingoptionname =", value, "shippingoptionname");
            return (Criteria) this;
        }

        public Criteria andShippingoptionnameNotEqualTo(String value) {
            addCriterion("shippingoptionname <>", value, "shippingoptionname");
            return (Criteria) this;
        }

        public Criteria andShippingoptionnameGreaterThan(String value) {
            addCriterion("shippingoptionname >", value, "shippingoptionname");
            return (Criteria) this;
        }

        public Criteria andShippingoptionnameGreaterThanOrEqualTo(String value) {
            addCriterion("shippingoptionname >=", value, "shippingoptionname");
            return (Criteria) this;
        }

        public Criteria andShippingoptionnameLessThan(String value) {
            addCriterion("shippingoptionname <", value, "shippingoptionname");
            return (Criteria) this;
        }

        public Criteria andShippingoptionnameLessThanOrEqualTo(String value) {
            addCriterion("shippingoptionname <=", value, "shippingoptionname");
            return (Criteria) this;
        }

        public Criteria andShippingoptionnameLike(String value) {
            addCriterion("shippingoptionname like", value, "shippingoptionname");
            return (Criteria) this;
        }

        public Criteria andShippingoptionnameNotLike(String value) {
            addCriterion("shippingoptionname not like", value, "shippingoptionname");
            return (Criteria) this;
        }

        public Criteria andShippingoptionnameIn(List<String> values) {
            addCriterion("shippingoptionname in", values, "shippingoptionname");
            return (Criteria) this;
        }

        public Criteria andShippingoptionnameNotIn(List<String> values) {
            addCriterion("shippingoptionname not in", values, "shippingoptionname");
            return (Criteria) this;
        }

        public Criteria andShippingoptionnameBetween(String value1, String value2) {
            addCriterion("shippingoptionname between", value1, value2, "shippingoptionname");
            return (Criteria) this;
        }

        public Criteria andShippingoptionnameNotBetween(String value1, String value2) {
            addCriterion("shippingoptionname not between", value1, value2, "shippingoptionname");
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