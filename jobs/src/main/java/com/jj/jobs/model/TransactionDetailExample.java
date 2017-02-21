package com.jj.jobs.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TransactionDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TransactionDetailExample() {
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

        public Criteria andTplreferenceidIsNull() {
            addCriterion("tplreferenceId is null");
            return (Criteria) this;
        }

        public Criteria andTplreferenceidIsNotNull() {
            addCriterion("tplreferenceId is not null");
            return (Criteria) this;
        }

        public Criteria andTplreferenceidEqualTo(String value) {
            addCriterion("tplreferenceId =", value, "tplreferenceid");
            return (Criteria) this;
        }

        public Criteria andTplreferenceidNotEqualTo(String value) {
            addCriterion("tplreferenceId <>", value, "tplreferenceid");
            return (Criteria) this;
        }

        public Criteria andTplreferenceidGreaterThan(String value) {
            addCriterion("tplreferenceId >", value, "tplreferenceid");
            return (Criteria) this;
        }

        public Criteria andTplreferenceidGreaterThanOrEqualTo(String value) {
            addCriterion("tplreferenceId >=", value, "tplreferenceid");
            return (Criteria) this;
        }

        public Criteria andTplreferenceidLessThan(String value) {
            addCriterion("tplreferenceId <", value, "tplreferenceid");
            return (Criteria) this;
        }

        public Criteria andTplreferenceidLessThanOrEqualTo(String value) {
            addCriterion("tplreferenceId <=", value, "tplreferenceid");
            return (Criteria) this;
        }

        public Criteria andTplreferenceidLike(String value) {
            addCriterion("tplreferenceId like", value, "tplreferenceid");
            return (Criteria) this;
        }

        public Criteria andTplreferenceidNotLike(String value) {
            addCriterion("tplreferenceId not like", value, "tplreferenceid");
            return (Criteria) this;
        }

        public Criteria andTplreferenceidIn(List<String> values) {
            addCriterion("tplreferenceId in", values, "tplreferenceid");
            return (Criteria) this;
        }

        public Criteria andTplreferenceidNotIn(List<String> values) {
            addCriterion("tplreferenceId not in", values, "tplreferenceid");
            return (Criteria) this;
        }

        public Criteria andTplreferenceidBetween(String value1, String value2) {
            addCriterion("tplreferenceId between", value1, value2, "tplreferenceid");
            return (Criteria) this;
        }

        public Criteria andTplreferenceidNotBetween(String value1, String value2) {
            addCriterion("tplreferenceId not between", value1, value2, "tplreferenceid");
            return (Criteria) this;
        }

        public Criteria andGiftmessageIsNull() {
            addCriterion("giftmessage is null");
            return (Criteria) this;
        }

        public Criteria andGiftmessageIsNotNull() {
            addCriterion("giftmessage is not null");
            return (Criteria) this;
        }

        public Criteria andGiftmessageEqualTo(String value) {
            addCriterion("giftmessage =", value, "giftmessage");
            return (Criteria) this;
        }

        public Criteria andGiftmessageNotEqualTo(String value) {
            addCriterion("giftmessage <>", value, "giftmessage");
            return (Criteria) this;
        }

        public Criteria andGiftmessageGreaterThan(String value) {
            addCriterion("giftmessage >", value, "giftmessage");
            return (Criteria) this;
        }

        public Criteria andGiftmessageGreaterThanOrEqualTo(String value) {
            addCriterion("giftmessage >=", value, "giftmessage");
            return (Criteria) this;
        }

        public Criteria andGiftmessageLessThan(String value) {
            addCriterion("giftmessage <", value, "giftmessage");
            return (Criteria) this;
        }

        public Criteria andGiftmessageLessThanOrEqualTo(String value) {
            addCriterion("giftmessage <=", value, "giftmessage");
            return (Criteria) this;
        }

        public Criteria andGiftmessageLike(String value) {
            addCriterion("giftmessage like", value, "giftmessage");
            return (Criteria) this;
        }

        public Criteria andGiftmessageNotLike(String value) {
            addCriterion("giftmessage not like", value, "giftmessage");
            return (Criteria) this;
        }

        public Criteria andGiftmessageIn(List<String> values) {
            addCriterion("giftmessage in", values, "giftmessage");
            return (Criteria) this;
        }

        public Criteria andGiftmessageNotIn(List<String> values) {
            addCriterion("giftmessage not in", values, "giftmessage");
            return (Criteria) this;
        }

        public Criteria andGiftmessageBetween(String value1, String value2) {
            addCriterion("giftmessage between", value1, value2, "giftmessage");
            return (Criteria) this;
        }

        public Criteria andGiftmessageNotBetween(String value1, String value2) {
            addCriterion("giftmessage not between", value1, value2, "giftmessage");
            return (Criteria) this;
        }

        public Criteria andGiftreceiptIsNull() {
            addCriterion("giftreceipt is null");
            return (Criteria) this;
        }

        public Criteria andGiftreceiptIsNotNull() {
            addCriterion("giftreceipt is not null");
            return (Criteria) this;
        }

        public Criteria andGiftreceiptEqualTo(String value) {
            addCriterion("giftreceipt =", value, "giftreceipt");
            return (Criteria) this;
        }

        public Criteria andGiftreceiptNotEqualTo(String value) {
            addCriterion("giftreceipt <>", value, "giftreceipt");
            return (Criteria) this;
        }

        public Criteria andGiftreceiptGreaterThan(String value) {
            addCriterion("giftreceipt >", value, "giftreceipt");
            return (Criteria) this;
        }

        public Criteria andGiftreceiptGreaterThanOrEqualTo(String value) {
            addCriterion("giftreceipt >=", value, "giftreceipt");
            return (Criteria) this;
        }

        public Criteria andGiftreceiptLessThan(String value) {
            addCriterion("giftreceipt <", value, "giftreceipt");
            return (Criteria) this;
        }

        public Criteria andGiftreceiptLessThanOrEqualTo(String value) {
            addCriterion("giftreceipt <=", value, "giftreceipt");
            return (Criteria) this;
        }

        public Criteria andGiftreceiptLike(String value) {
            addCriterion("giftreceipt like", value, "giftreceipt");
            return (Criteria) this;
        }

        public Criteria andGiftreceiptNotLike(String value) {
            addCriterion("giftreceipt not like", value, "giftreceipt");
            return (Criteria) this;
        }

        public Criteria andGiftreceiptIn(List<String> values) {
            addCriterion("giftreceipt in", values, "giftreceipt");
            return (Criteria) this;
        }

        public Criteria andGiftreceiptNotIn(List<String> values) {
            addCriterion("giftreceipt not in", values, "giftreceipt");
            return (Criteria) this;
        }

        public Criteria andGiftreceiptBetween(String value1, String value2) {
            addCriterion("giftreceipt between", value1, value2, "giftreceipt");
            return (Criteria) this;
        }

        public Criteria andGiftreceiptNotBetween(String value1, String value2) {
            addCriterion("giftreceipt not between", value1, value2, "giftreceipt");
            return (Criteria) this;
        }

        public Criteria andGiftwrapnameIsNull() {
            addCriterion("giftwrapname is null");
            return (Criteria) this;
        }

        public Criteria andGiftwrapnameIsNotNull() {
            addCriterion("giftwrapname is not null");
            return (Criteria) this;
        }

        public Criteria andGiftwrapnameEqualTo(String value) {
            addCriterion("giftwrapname =", value, "giftwrapname");
            return (Criteria) this;
        }

        public Criteria andGiftwrapnameNotEqualTo(String value) {
            addCriterion("giftwrapname <>", value, "giftwrapname");
            return (Criteria) this;
        }

        public Criteria andGiftwrapnameGreaterThan(String value) {
            addCriterion("giftwrapname >", value, "giftwrapname");
            return (Criteria) this;
        }

        public Criteria andGiftwrapnameGreaterThanOrEqualTo(String value) {
            addCriterion("giftwrapname >=", value, "giftwrapname");
            return (Criteria) this;
        }

        public Criteria andGiftwrapnameLessThan(String value) {
            addCriterion("giftwrapname <", value, "giftwrapname");
            return (Criteria) this;
        }

        public Criteria andGiftwrapnameLessThanOrEqualTo(String value) {
            addCriterion("giftwrapname <=", value, "giftwrapname");
            return (Criteria) this;
        }

        public Criteria andGiftwrapnameLike(String value) {
            addCriterion("giftwrapname like", value, "giftwrapname");
            return (Criteria) this;
        }

        public Criteria andGiftwrapnameNotLike(String value) {
            addCriterion("giftwrapname not like", value, "giftwrapname");
            return (Criteria) this;
        }

        public Criteria andGiftwrapnameIn(List<String> values) {
            addCriterion("giftwrapname in", values, "giftwrapname");
            return (Criteria) this;
        }

        public Criteria andGiftwrapnameNotIn(List<String> values) {
            addCriterion("giftwrapname not in", values, "giftwrapname");
            return (Criteria) this;
        }

        public Criteria andGiftwrapnameBetween(String value1, String value2) {
            addCriterion("giftwrapname between", value1, value2, "giftwrapname");
            return (Criteria) this;
        }

        public Criteria andGiftwrapnameNotBetween(String value1, String value2) {
            addCriterion("giftwrapname not between", value1, value2, "giftwrapname");
            return (Criteria) this;
        }

        public Criteria andBuyeremailoptinIsNull() {
            addCriterion("buyeremailoptin is null");
            return (Criteria) this;
        }

        public Criteria andBuyeremailoptinIsNotNull() {
            addCriterion("buyeremailoptin is not null");
            return (Criteria) this;
        }

        public Criteria andBuyeremailoptinEqualTo(String value) {
            addCriterion("buyeremailoptin =", value, "buyeremailoptin");
            return (Criteria) this;
        }

        public Criteria andBuyeremailoptinNotEqualTo(String value) {
            addCriterion("buyeremailoptin <>", value, "buyeremailoptin");
            return (Criteria) this;
        }

        public Criteria andBuyeremailoptinGreaterThan(String value) {
            addCriterion("buyeremailoptin >", value, "buyeremailoptin");
            return (Criteria) this;
        }

        public Criteria andBuyeremailoptinGreaterThanOrEqualTo(String value) {
            addCriterion("buyeremailoptin >=", value, "buyeremailoptin");
            return (Criteria) this;
        }

        public Criteria andBuyeremailoptinLessThan(String value) {
            addCriterion("buyeremailoptin <", value, "buyeremailoptin");
            return (Criteria) this;
        }

        public Criteria andBuyeremailoptinLessThanOrEqualTo(String value) {
            addCriterion("buyeremailoptin <=", value, "buyeremailoptin");
            return (Criteria) this;
        }

        public Criteria andBuyeremailoptinLike(String value) {
            addCriterion("buyeremailoptin like", value, "buyeremailoptin");
            return (Criteria) this;
        }

        public Criteria andBuyeremailoptinNotLike(String value) {
            addCriterion("buyeremailoptin not like", value, "buyeremailoptin");
            return (Criteria) this;
        }

        public Criteria andBuyeremailoptinIn(List<String> values) {
            addCriterion("buyeremailoptin in", values, "buyeremailoptin");
            return (Criteria) this;
        }

        public Criteria andBuyeremailoptinNotIn(List<String> values) {
            addCriterion("buyeremailoptin not in", values, "buyeremailoptin");
            return (Criteria) this;
        }

        public Criteria andBuyeremailoptinBetween(String value1, String value2) {
            addCriterion("buyeremailoptin between", value1, value2, "buyeremailoptin");
            return (Criteria) this;
        }

        public Criteria andBuyeremailoptinNotBetween(String value1, String value2) {
            addCriterion("buyeremailoptin not between", value1, value2, "buyeremailoptin");
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