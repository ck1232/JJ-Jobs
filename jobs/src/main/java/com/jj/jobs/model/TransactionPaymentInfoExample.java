package com.jj.jobs.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TransactionPaymentInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TransactionPaymentInfoExample() {
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

        public Criteria andEbaytransactionidIsNull() {
            addCriterion("ebaytransactionId is null");
            return (Criteria) this;
        }

        public Criteria andEbaytransactionidIsNotNull() {
            addCriterion("ebaytransactionId is not null");
            return (Criteria) this;
        }

        public Criteria andEbaytransactionidEqualTo(String value) {
            addCriterion("ebaytransactionId =", value, "ebaytransactionid");
            return (Criteria) this;
        }

        public Criteria andEbaytransactionidNotEqualTo(String value) {
            addCriterion("ebaytransactionId <>", value, "ebaytransactionid");
            return (Criteria) this;
        }

        public Criteria andEbaytransactionidGreaterThan(String value) {
            addCriterion("ebaytransactionId >", value, "ebaytransactionid");
            return (Criteria) this;
        }

        public Criteria andEbaytransactionidGreaterThanOrEqualTo(String value) {
            addCriterion("ebaytransactionId >=", value, "ebaytransactionid");
            return (Criteria) this;
        }

        public Criteria andEbaytransactionidLessThan(String value) {
            addCriterion("ebaytransactionId <", value, "ebaytransactionid");
            return (Criteria) this;
        }

        public Criteria andEbaytransactionidLessThanOrEqualTo(String value) {
            addCriterion("ebaytransactionId <=", value, "ebaytransactionid");
            return (Criteria) this;
        }

        public Criteria andEbaytransactionidLike(String value) {
            addCriterion("ebaytransactionId like", value, "ebaytransactionid");
            return (Criteria) this;
        }

        public Criteria andEbaytransactionidNotLike(String value) {
            addCriterion("ebaytransactionId not like", value, "ebaytransactionid");
            return (Criteria) this;
        }

        public Criteria andEbaytransactionidIn(List<String> values) {
            addCriterion("ebaytransactionId in", values, "ebaytransactionid");
            return (Criteria) this;
        }

        public Criteria andEbaytransactionidNotIn(List<String> values) {
            addCriterion("ebaytransactionId not in", values, "ebaytransactionid");
            return (Criteria) this;
        }

        public Criteria andEbaytransactionidBetween(String value1, String value2) {
            addCriterion("ebaytransactionId between", value1, value2, "ebaytransactionid");
            return (Criteria) this;
        }

        public Criteria andEbaytransactionidNotBetween(String value1, String value2) {
            addCriterion("ebaytransactionId not between", value1, value2, "ebaytransactionid");
            return (Criteria) this;
        }

        public Criteria andParenttransactionidIsNull() {
            addCriterion("parenttransactionId is null");
            return (Criteria) this;
        }

        public Criteria andParenttransactionidIsNotNull() {
            addCriterion("parenttransactionId is not null");
            return (Criteria) this;
        }

        public Criteria andParenttransactionidEqualTo(String value) {
            addCriterion("parenttransactionId =", value, "parenttransactionid");
            return (Criteria) this;
        }

        public Criteria andParenttransactionidNotEqualTo(String value) {
            addCriterion("parenttransactionId <>", value, "parenttransactionid");
            return (Criteria) this;
        }

        public Criteria andParenttransactionidGreaterThan(String value) {
            addCriterion("parenttransactionId >", value, "parenttransactionid");
            return (Criteria) this;
        }

        public Criteria andParenttransactionidGreaterThanOrEqualTo(String value) {
            addCriterion("parenttransactionId >=", value, "parenttransactionid");
            return (Criteria) this;
        }

        public Criteria andParenttransactionidLessThan(String value) {
            addCriterion("parenttransactionId <", value, "parenttransactionid");
            return (Criteria) this;
        }

        public Criteria andParenttransactionidLessThanOrEqualTo(String value) {
            addCriterion("parenttransactionId <=", value, "parenttransactionid");
            return (Criteria) this;
        }

        public Criteria andParenttransactionidLike(String value) {
            addCriterion("parenttransactionId like", value, "parenttransactionid");
            return (Criteria) this;
        }

        public Criteria andParenttransactionidNotLike(String value) {
            addCriterion("parenttransactionId not like", value, "parenttransactionid");
            return (Criteria) this;
        }

        public Criteria andParenttransactionidIn(List<String> values) {
            addCriterion("parenttransactionId in", values, "parenttransactionid");
            return (Criteria) this;
        }

        public Criteria andParenttransactionidNotIn(List<String> values) {
            addCriterion("parenttransactionId not in", values, "parenttransactionid");
            return (Criteria) this;
        }

        public Criteria andParenttransactionidBetween(String value1, String value2) {
            addCriterion("parenttransactionId between", value1, value2, "parenttransactionid");
            return (Criteria) this;
        }

        public Criteria andParenttransactionidNotBetween(String value1, String value2) {
            addCriterion("parenttransactionId not between", value1, value2, "parenttransactionid");
            return (Criteria) this;
        }

        public Criteria andReceiptidIsNull() {
            addCriterion("receiptId is null");
            return (Criteria) this;
        }

        public Criteria andReceiptidIsNotNull() {
            addCriterion("receiptId is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptidEqualTo(String value) {
            addCriterion("receiptId =", value, "receiptid");
            return (Criteria) this;
        }

        public Criteria andReceiptidNotEqualTo(String value) {
            addCriterion("receiptId <>", value, "receiptid");
            return (Criteria) this;
        }

        public Criteria andReceiptidGreaterThan(String value) {
            addCriterion("receiptId >", value, "receiptid");
            return (Criteria) this;
        }

        public Criteria andReceiptidGreaterThanOrEqualTo(String value) {
            addCriterion("receiptId >=", value, "receiptid");
            return (Criteria) this;
        }

        public Criteria andReceiptidLessThan(String value) {
            addCriterion("receiptId <", value, "receiptid");
            return (Criteria) this;
        }

        public Criteria andReceiptidLessThanOrEqualTo(String value) {
            addCriterion("receiptId <=", value, "receiptid");
            return (Criteria) this;
        }

        public Criteria andReceiptidLike(String value) {
            addCriterion("receiptId like", value, "receiptid");
            return (Criteria) this;
        }

        public Criteria andReceiptidNotLike(String value) {
            addCriterion("receiptId not like", value, "receiptid");
            return (Criteria) this;
        }

        public Criteria andReceiptidIn(List<String> values) {
            addCriterion("receiptId in", values, "receiptid");
            return (Criteria) this;
        }

        public Criteria andReceiptidNotIn(List<String> values) {
            addCriterion("receiptId not in", values, "receiptid");
            return (Criteria) this;
        }

        public Criteria andReceiptidBetween(String value1, String value2) {
            addCriterion("receiptId between", value1, value2, "receiptid");
            return (Criteria) this;
        }

        public Criteria andReceiptidNotBetween(String value1, String value2) {
            addCriterion("receiptId not between", value1, value2, "receiptid");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeIsNull() {
            addCriterion("transactiontype is null");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeIsNotNull() {
            addCriterion("transactiontype is not null");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeEqualTo(String value) {
            addCriterion("transactiontype =", value, "transactiontype");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeNotEqualTo(String value) {
            addCriterion("transactiontype <>", value, "transactiontype");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeGreaterThan(String value) {
            addCriterion("transactiontype >", value, "transactiontype");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeGreaterThanOrEqualTo(String value) {
            addCriterion("transactiontype >=", value, "transactiontype");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeLessThan(String value) {
            addCriterion("transactiontype <", value, "transactiontype");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeLessThanOrEqualTo(String value) {
            addCriterion("transactiontype <=", value, "transactiontype");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeLike(String value) {
            addCriterion("transactiontype like", value, "transactiontype");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeNotLike(String value) {
            addCriterion("transactiontype not like", value, "transactiontype");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeIn(List<String> values) {
            addCriterion("transactiontype in", values, "transactiontype");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeNotIn(List<String> values) {
            addCriterion("transactiontype not in", values, "transactiontype");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeBetween(String value1, String value2) {
            addCriterion("transactiontype between", value1, value2, "transactiontype");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeNotBetween(String value1, String value2) {
            addCriterion("transactiontype not between", value1, value2, "transactiontype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeIsNull() {
            addCriterion("paymenttype is null");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeIsNotNull() {
            addCriterion("paymenttype is not null");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeEqualTo(String value) {
            addCriterion("paymenttype =", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeNotEqualTo(String value) {
            addCriterion("paymenttype <>", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeGreaterThan(String value) {
            addCriterion("paymenttype >", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeGreaterThanOrEqualTo(String value) {
            addCriterion("paymenttype >=", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeLessThan(String value) {
            addCriterion("paymenttype <", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeLessThanOrEqualTo(String value) {
            addCriterion("paymenttype <=", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeLike(String value) {
            addCriterion("paymenttype like", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeNotLike(String value) {
            addCriterion("paymenttype not like", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeIn(List<String> values) {
            addCriterion("paymenttype in", values, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeNotIn(List<String> values) {
            addCriterion("paymenttype not in", values, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeBetween(String value1, String value2) {
            addCriterion("paymenttype between", value1, value2, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeNotBetween(String value1, String value2) {
            addCriterion("paymenttype not between", value1, value2, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andRefundsourcecodetypeIsNull() {
            addCriterion("refundsourcecodetype is null");
            return (Criteria) this;
        }

        public Criteria andRefundsourcecodetypeIsNotNull() {
            addCriterion("refundsourcecodetype is not null");
            return (Criteria) this;
        }

        public Criteria andRefundsourcecodetypeEqualTo(String value) {
            addCriterion("refundsourcecodetype =", value, "refundsourcecodetype");
            return (Criteria) this;
        }

        public Criteria andRefundsourcecodetypeNotEqualTo(String value) {
            addCriterion("refundsourcecodetype <>", value, "refundsourcecodetype");
            return (Criteria) this;
        }

        public Criteria andRefundsourcecodetypeGreaterThan(String value) {
            addCriterion("refundsourcecodetype >", value, "refundsourcecodetype");
            return (Criteria) this;
        }

        public Criteria andRefundsourcecodetypeGreaterThanOrEqualTo(String value) {
            addCriterion("refundsourcecodetype >=", value, "refundsourcecodetype");
            return (Criteria) this;
        }

        public Criteria andRefundsourcecodetypeLessThan(String value) {
            addCriterion("refundsourcecodetype <", value, "refundsourcecodetype");
            return (Criteria) this;
        }

        public Criteria andRefundsourcecodetypeLessThanOrEqualTo(String value) {
            addCriterion("refundsourcecodetype <=", value, "refundsourcecodetype");
            return (Criteria) this;
        }

        public Criteria andRefundsourcecodetypeLike(String value) {
            addCriterion("refundsourcecodetype like", value, "refundsourcecodetype");
            return (Criteria) this;
        }

        public Criteria andRefundsourcecodetypeNotLike(String value) {
            addCriterion("refundsourcecodetype not like", value, "refundsourcecodetype");
            return (Criteria) this;
        }

        public Criteria andRefundsourcecodetypeIn(List<String> values) {
            addCriterion("refundsourcecodetype in", values, "refundsourcecodetype");
            return (Criteria) this;
        }

        public Criteria andRefundsourcecodetypeNotIn(List<String> values) {
            addCriterion("refundsourcecodetype not in", values, "refundsourcecodetype");
            return (Criteria) this;
        }

        public Criteria andRefundsourcecodetypeBetween(String value1, String value2) {
            addCriterion("refundsourcecodetype between", value1, value2, "refundsourcecodetype");
            return (Criteria) this;
        }

        public Criteria andRefundsourcecodetypeNotBetween(String value1, String value2) {
            addCriterion("refundsourcecodetype not between", value1, value2, "refundsourcecodetype");
            return (Criteria) this;
        }

        public Criteria andExpectedecheckcleardateIsNull() {
            addCriterion("expectedecheckclearDate is null");
            return (Criteria) this;
        }

        public Criteria andExpectedecheckcleardateIsNotNull() {
            addCriterion("expectedecheckclearDate is not null");
            return (Criteria) this;
        }

        public Criteria andExpectedecheckcleardateEqualTo(String value) {
            addCriterion("expectedecheckclearDate =", value, "expectedecheckcleardate");
            return (Criteria) this;
        }

        public Criteria andExpectedecheckcleardateNotEqualTo(String value) {
            addCriterion("expectedecheckclearDate <>", value, "expectedecheckcleardate");
            return (Criteria) this;
        }

        public Criteria andExpectedecheckcleardateGreaterThan(String value) {
            addCriterion("expectedecheckclearDate >", value, "expectedecheckcleardate");
            return (Criteria) this;
        }

        public Criteria andExpectedecheckcleardateGreaterThanOrEqualTo(String value) {
            addCriterion("expectedecheckclearDate >=", value, "expectedecheckcleardate");
            return (Criteria) this;
        }

        public Criteria andExpectedecheckcleardateLessThan(String value) {
            addCriterion("expectedecheckclearDate <", value, "expectedecheckcleardate");
            return (Criteria) this;
        }

        public Criteria andExpectedecheckcleardateLessThanOrEqualTo(String value) {
            addCriterion("expectedecheckclearDate <=", value, "expectedecheckcleardate");
            return (Criteria) this;
        }

        public Criteria andExpectedecheckcleardateLike(String value) {
            addCriterion("expectedecheckclearDate like", value, "expectedecheckcleardate");
            return (Criteria) this;
        }

        public Criteria andExpectedecheckcleardateNotLike(String value) {
            addCriterion("expectedecheckclearDate not like", value, "expectedecheckcleardate");
            return (Criteria) this;
        }

        public Criteria andExpectedecheckcleardateIn(List<String> values) {
            addCriterion("expectedecheckclearDate in", values, "expectedecheckcleardate");
            return (Criteria) this;
        }

        public Criteria andExpectedecheckcleardateNotIn(List<String> values) {
            addCriterion("expectedecheckclearDate not in", values, "expectedecheckcleardate");
            return (Criteria) this;
        }

        public Criteria andExpectedecheckcleardateBetween(String value1, String value2) {
            addCriterion("expectedecheckclearDate between", value1, value2, "expectedecheckcleardate");
            return (Criteria) this;
        }

        public Criteria andExpectedecheckcleardateNotBetween(String value1, String value2) {
            addCriterion("expectedecheckclearDate not between", value1, value2, "expectedecheckcleardate");
            return (Criteria) this;
        }

        public Criteria andPaymentdateIsNull() {
            addCriterion("paymentDate is null");
            return (Criteria) this;
        }

        public Criteria andPaymentdateIsNotNull() {
            addCriterion("paymentDate is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentdateEqualTo(String value) {
            addCriterion("paymentDate =", value, "paymentdate");
            return (Criteria) this;
        }

        public Criteria andPaymentdateNotEqualTo(String value) {
            addCriterion("paymentDate <>", value, "paymentdate");
            return (Criteria) this;
        }

        public Criteria andPaymentdateGreaterThan(String value) {
            addCriterion("paymentDate >", value, "paymentdate");
            return (Criteria) this;
        }

        public Criteria andPaymentdateGreaterThanOrEqualTo(String value) {
            addCriterion("paymentDate >=", value, "paymentdate");
            return (Criteria) this;
        }

        public Criteria andPaymentdateLessThan(String value) {
            addCriterion("paymentDate <", value, "paymentdate");
            return (Criteria) this;
        }

        public Criteria andPaymentdateLessThanOrEqualTo(String value) {
            addCriterion("paymentDate <=", value, "paymentdate");
            return (Criteria) this;
        }

        public Criteria andPaymentdateLike(String value) {
            addCriterion("paymentDate like", value, "paymentdate");
            return (Criteria) this;
        }

        public Criteria andPaymentdateNotLike(String value) {
            addCriterion("paymentDate not like", value, "paymentdate");
            return (Criteria) this;
        }

        public Criteria andPaymentdateIn(List<String> values) {
            addCriterion("paymentDate in", values, "paymentdate");
            return (Criteria) this;
        }

        public Criteria andPaymentdateNotIn(List<String> values) {
            addCriterion("paymentDate not in", values, "paymentdate");
            return (Criteria) this;
        }

        public Criteria andPaymentdateBetween(String value1, String value2) {
            addCriterion("paymentDate between", value1, value2, "paymentdate");
            return (Criteria) this;
        }

        public Criteria andPaymentdateNotBetween(String value1, String value2) {
            addCriterion("paymentDate not between", value1, value2, "paymentdate");
            return (Criteria) this;
        }

        public Criteria andGrossamountIsNull() {
            addCriterion("grossAmount is null");
            return (Criteria) this;
        }

        public Criteria andGrossamountIsNotNull() {
            addCriterion("grossAmount is not null");
            return (Criteria) this;
        }

        public Criteria andGrossamountEqualTo(BigDecimal value) {
            addCriterion("grossAmount =", value, "grossamount");
            return (Criteria) this;
        }

        public Criteria andGrossamountNotEqualTo(BigDecimal value) {
            addCriterion("grossAmount <>", value, "grossamount");
            return (Criteria) this;
        }

        public Criteria andGrossamountGreaterThan(BigDecimal value) {
            addCriterion("grossAmount >", value, "grossamount");
            return (Criteria) this;
        }

        public Criteria andGrossamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("grossAmount >=", value, "grossamount");
            return (Criteria) this;
        }

        public Criteria andGrossamountLessThan(BigDecimal value) {
            addCriterion("grossAmount <", value, "grossamount");
            return (Criteria) this;
        }

        public Criteria andGrossamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("grossAmount <=", value, "grossamount");
            return (Criteria) this;
        }

        public Criteria andGrossamountIn(List<BigDecimal> values) {
            addCriterion("grossAmount in", values, "grossamount");
            return (Criteria) this;
        }

        public Criteria andGrossamountNotIn(List<BigDecimal> values) {
            addCriterion("grossAmount not in", values, "grossamount");
            return (Criteria) this;
        }

        public Criteria andGrossamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("grossAmount between", value1, value2, "grossamount");
            return (Criteria) this;
        }

        public Criteria andGrossamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("grossAmount not between", value1, value2, "grossamount");
            return (Criteria) this;
        }

        public Criteria andFeeamountIsNull() {
            addCriterion("feeAmount is null");
            return (Criteria) this;
        }

        public Criteria andFeeamountIsNotNull() {
            addCriterion("feeAmount is not null");
            return (Criteria) this;
        }

        public Criteria andFeeamountEqualTo(BigDecimal value) {
            addCriterion("feeAmount =", value, "feeamount");
            return (Criteria) this;
        }

        public Criteria andFeeamountNotEqualTo(BigDecimal value) {
            addCriterion("feeAmount <>", value, "feeamount");
            return (Criteria) this;
        }

        public Criteria andFeeamountGreaterThan(BigDecimal value) {
            addCriterion("feeAmount >", value, "feeamount");
            return (Criteria) this;
        }

        public Criteria andFeeamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("feeAmount >=", value, "feeamount");
            return (Criteria) this;
        }

        public Criteria andFeeamountLessThan(BigDecimal value) {
            addCriterion("feeAmount <", value, "feeamount");
            return (Criteria) this;
        }

        public Criteria andFeeamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("feeAmount <=", value, "feeamount");
            return (Criteria) this;
        }

        public Criteria andFeeamountIn(List<BigDecimal> values) {
            addCriterion("feeAmount in", values, "feeamount");
            return (Criteria) this;
        }

        public Criteria andFeeamountNotIn(List<BigDecimal> values) {
            addCriterion("feeAmount not in", values, "feeamount");
            return (Criteria) this;
        }

        public Criteria andFeeamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("feeAmount between", value1, value2, "feeamount");
            return (Criteria) this;
        }

        public Criteria andFeeamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("feeAmount not between", value1, value2, "feeamount");
            return (Criteria) this;
        }

        public Criteria andFinancingfeeamountIsNull() {
            addCriterion("financingFeeAmount is null");
            return (Criteria) this;
        }

        public Criteria andFinancingfeeamountIsNotNull() {
            addCriterion("financingFeeAmount is not null");
            return (Criteria) this;
        }

        public Criteria andFinancingfeeamountEqualTo(BigDecimal value) {
            addCriterion("financingFeeAmount =", value, "financingfeeamount");
            return (Criteria) this;
        }

        public Criteria andFinancingfeeamountNotEqualTo(BigDecimal value) {
            addCriterion("financingFeeAmount <>", value, "financingfeeamount");
            return (Criteria) this;
        }

        public Criteria andFinancingfeeamountGreaterThan(BigDecimal value) {
            addCriterion("financingFeeAmount >", value, "financingfeeamount");
            return (Criteria) this;
        }

        public Criteria andFinancingfeeamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("financingFeeAmount >=", value, "financingfeeamount");
            return (Criteria) this;
        }

        public Criteria andFinancingfeeamountLessThan(BigDecimal value) {
            addCriterion("financingFeeAmount <", value, "financingfeeamount");
            return (Criteria) this;
        }

        public Criteria andFinancingfeeamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("financingFeeAmount <=", value, "financingfeeamount");
            return (Criteria) this;
        }

        public Criteria andFinancingfeeamountIn(List<BigDecimal> values) {
            addCriterion("financingFeeAmount in", values, "financingfeeamount");
            return (Criteria) this;
        }

        public Criteria andFinancingfeeamountNotIn(List<BigDecimal> values) {
            addCriterion("financingFeeAmount not in", values, "financingfeeamount");
            return (Criteria) this;
        }

        public Criteria andFinancingfeeamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("financingFeeAmount between", value1, value2, "financingfeeamount");
            return (Criteria) this;
        }

        public Criteria andFinancingfeeamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("financingFeeAmount not between", value1, value2, "financingfeeamount");
            return (Criteria) this;
        }

        public Criteria andFinancingtotalcostIsNull() {
            addCriterion("financingTotalCost is null");
            return (Criteria) this;
        }

        public Criteria andFinancingtotalcostIsNotNull() {
            addCriterion("financingTotalCost is not null");
            return (Criteria) this;
        }

        public Criteria andFinancingtotalcostEqualTo(BigDecimal value) {
            addCriterion("financingTotalCost =", value, "financingtotalcost");
            return (Criteria) this;
        }

        public Criteria andFinancingtotalcostNotEqualTo(BigDecimal value) {
            addCriterion("financingTotalCost <>", value, "financingtotalcost");
            return (Criteria) this;
        }

        public Criteria andFinancingtotalcostGreaterThan(BigDecimal value) {
            addCriterion("financingTotalCost >", value, "financingtotalcost");
            return (Criteria) this;
        }

        public Criteria andFinancingtotalcostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("financingTotalCost >=", value, "financingtotalcost");
            return (Criteria) this;
        }

        public Criteria andFinancingtotalcostLessThan(BigDecimal value) {
            addCriterion("financingTotalCost <", value, "financingtotalcost");
            return (Criteria) this;
        }

        public Criteria andFinancingtotalcostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("financingTotalCost <=", value, "financingtotalcost");
            return (Criteria) this;
        }

        public Criteria andFinancingtotalcostIn(List<BigDecimal> values) {
            addCriterion("financingTotalCost in", values, "financingtotalcost");
            return (Criteria) this;
        }

        public Criteria andFinancingtotalcostNotIn(List<BigDecimal> values) {
            addCriterion("financingTotalCost not in", values, "financingtotalcost");
            return (Criteria) this;
        }

        public Criteria andFinancingtotalcostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("financingTotalCost between", value1, value2, "financingtotalcost");
            return (Criteria) this;
        }

        public Criteria andFinancingtotalcostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("financingTotalCost not between", value1, value2, "financingtotalcost");
            return (Criteria) this;
        }

        public Criteria andFinancingmonthlypaymentIsNull() {
            addCriterion("financingMonthlyPayment is null");
            return (Criteria) this;
        }

        public Criteria andFinancingmonthlypaymentIsNotNull() {
            addCriterion("financingMonthlyPayment is not null");
            return (Criteria) this;
        }

        public Criteria andFinancingmonthlypaymentEqualTo(BigDecimal value) {
            addCriterion("financingMonthlyPayment =", value, "financingmonthlypayment");
            return (Criteria) this;
        }

        public Criteria andFinancingmonthlypaymentNotEqualTo(BigDecimal value) {
            addCriterion("financingMonthlyPayment <>", value, "financingmonthlypayment");
            return (Criteria) this;
        }

        public Criteria andFinancingmonthlypaymentGreaterThan(BigDecimal value) {
            addCriterion("financingMonthlyPayment >", value, "financingmonthlypayment");
            return (Criteria) this;
        }

        public Criteria andFinancingmonthlypaymentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("financingMonthlyPayment >=", value, "financingmonthlypayment");
            return (Criteria) this;
        }

        public Criteria andFinancingmonthlypaymentLessThan(BigDecimal value) {
            addCriterion("financingMonthlyPayment <", value, "financingmonthlypayment");
            return (Criteria) this;
        }

        public Criteria andFinancingmonthlypaymentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("financingMonthlyPayment <=", value, "financingmonthlypayment");
            return (Criteria) this;
        }

        public Criteria andFinancingmonthlypaymentIn(List<BigDecimal> values) {
            addCriterion("financingMonthlyPayment in", values, "financingmonthlypayment");
            return (Criteria) this;
        }

        public Criteria andFinancingmonthlypaymentNotIn(List<BigDecimal> values) {
            addCriterion("financingMonthlyPayment not in", values, "financingmonthlypayment");
            return (Criteria) this;
        }

        public Criteria andFinancingmonthlypaymentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("financingMonthlyPayment between", value1, value2, "financingmonthlypayment");
            return (Criteria) this;
        }

        public Criteria andFinancingmonthlypaymentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("financingMonthlyPayment not between", value1, value2, "financingmonthlypayment");
            return (Criteria) this;
        }

        public Criteria andIsfinancingIsNull() {
            addCriterion("isfinancing is null");
            return (Criteria) this;
        }

        public Criteria andIsfinancingIsNotNull() {
            addCriterion("isfinancing is not null");
            return (Criteria) this;
        }

        public Criteria andIsfinancingEqualTo(String value) {
            addCriterion("isfinancing =", value, "isfinancing");
            return (Criteria) this;
        }

        public Criteria andIsfinancingNotEqualTo(String value) {
            addCriterion("isfinancing <>", value, "isfinancing");
            return (Criteria) this;
        }

        public Criteria andIsfinancingGreaterThan(String value) {
            addCriterion("isfinancing >", value, "isfinancing");
            return (Criteria) this;
        }

        public Criteria andIsfinancingGreaterThanOrEqualTo(String value) {
            addCriterion("isfinancing >=", value, "isfinancing");
            return (Criteria) this;
        }

        public Criteria andIsfinancingLessThan(String value) {
            addCriterion("isfinancing <", value, "isfinancing");
            return (Criteria) this;
        }

        public Criteria andIsfinancingLessThanOrEqualTo(String value) {
            addCriterion("isfinancing <=", value, "isfinancing");
            return (Criteria) this;
        }

        public Criteria andIsfinancingLike(String value) {
            addCriterion("isfinancing like", value, "isfinancing");
            return (Criteria) this;
        }

        public Criteria andIsfinancingNotLike(String value) {
            addCriterion("isfinancing not like", value, "isfinancing");
            return (Criteria) this;
        }

        public Criteria andIsfinancingIn(List<String> values) {
            addCriterion("isfinancing in", values, "isfinancing");
            return (Criteria) this;
        }

        public Criteria andIsfinancingNotIn(List<String> values) {
            addCriterion("isfinancing not in", values, "isfinancing");
            return (Criteria) this;
        }

        public Criteria andIsfinancingBetween(String value1, String value2) {
            addCriterion("isfinancing between", value1, value2, "isfinancing");
            return (Criteria) this;
        }

        public Criteria andIsfinancingNotBetween(String value1, String value2) {
            addCriterion("isfinancing not between", value1, value2, "isfinancing");
            return (Criteria) this;
        }

        public Criteria andSettleamountIsNull() {
            addCriterion("settleAmount is null");
            return (Criteria) this;
        }

        public Criteria andSettleamountIsNotNull() {
            addCriterion("settleAmount is not null");
            return (Criteria) this;
        }

        public Criteria andSettleamountEqualTo(BigDecimal value) {
            addCriterion("settleAmount =", value, "settleamount");
            return (Criteria) this;
        }

        public Criteria andSettleamountNotEqualTo(BigDecimal value) {
            addCriterion("settleAmount <>", value, "settleamount");
            return (Criteria) this;
        }

        public Criteria andSettleamountGreaterThan(BigDecimal value) {
            addCriterion("settleAmount >", value, "settleamount");
            return (Criteria) this;
        }

        public Criteria andSettleamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("settleAmount >=", value, "settleamount");
            return (Criteria) this;
        }

        public Criteria andSettleamountLessThan(BigDecimal value) {
            addCriterion("settleAmount <", value, "settleamount");
            return (Criteria) this;
        }

        public Criteria andSettleamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("settleAmount <=", value, "settleamount");
            return (Criteria) this;
        }

        public Criteria andSettleamountIn(List<BigDecimal> values) {
            addCriterion("settleAmount in", values, "settleamount");
            return (Criteria) this;
        }

        public Criteria andSettleamountNotIn(List<BigDecimal> values) {
            addCriterion("settleAmount not in", values, "settleamount");
            return (Criteria) this;
        }

        public Criteria andSettleamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("settleAmount between", value1, value2, "settleamount");
            return (Criteria) this;
        }

        public Criteria andSettleamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("settleAmount not between", value1, value2, "settleamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountIsNull() {
            addCriterion("taxAmount is null");
            return (Criteria) this;
        }

        public Criteria andTaxamountIsNotNull() {
            addCriterion("taxAmount is not null");
            return (Criteria) this;
        }

        public Criteria andTaxamountEqualTo(BigDecimal value) {
            addCriterion("taxAmount =", value, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountNotEqualTo(BigDecimal value) {
            addCriterion("taxAmount <>", value, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountGreaterThan(BigDecimal value) {
            addCriterion("taxAmount >", value, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("taxAmount >=", value, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountLessThan(BigDecimal value) {
            addCriterion("taxAmount <", value, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("taxAmount <=", value, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountIn(List<BigDecimal> values) {
            addCriterion("taxAmount in", values, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountNotIn(List<BigDecimal> values) {
            addCriterion("taxAmount not in", values, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("taxAmount between", value1, value2, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("taxAmount not between", value1, value2, "taxamount");
            return (Criteria) this;
        }

        public Criteria andExchangerateIsNull() {
            addCriterion("exchangeRate is null");
            return (Criteria) this;
        }

        public Criteria andExchangerateIsNotNull() {
            addCriterion("exchangeRate is not null");
            return (Criteria) this;
        }

        public Criteria andExchangerateEqualTo(String value) {
            addCriterion("exchangeRate =", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateNotEqualTo(String value) {
            addCriterion("exchangeRate <>", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateGreaterThan(String value) {
            addCriterion("exchangeRate >", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateGreaterThanOrEqualTo(String value) {
            addCriterion("exchangeRate >=", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateLessThan(String value) {
            addCriterion("exchangeRate <", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateLessThanOrEqualTo(String value) {
            addCriterion("exchangeRate <=", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateLike(String value) {
            addCriterion("exchangeRate like", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateNotLike(String value) {
            addCriterion("exchangeRate not like", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateIn(List<String> values) {
            addCriterion("exchangeRate in", values, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateNotIn(List<String> values) {
            addCriterion("exchangeRate not in", values, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateBetween(String value1, String value2) {
            addCriterion("exchangeRate between", value1, value2, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateNotBetween(String value1, String value2) {
            addCriterion("exchangeRate not between", value1, value2, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusIsNull() {
            addCriterion("paymentStatus is null");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusIsNotNull() {
            addCriterion("paymentStatus is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusEqualTo(String value) {
            addCriterion("paymentStatus =", value, "paymentstatus");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusNotEqualTo(String value) {
            addCriterion("paymentStatus <>", value, "paymentstatus");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusGreaterThan(String value) {
            addCriterion("paymentStatus >", value, "paymentstatus");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusGreaterThanOrEqualTo(String value) {
            addCriterion("paymentStatus >=", value, "paymentstatus");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusLessThan(String value) {
            addCriterion("paymentStatus <", value, "paymentstatus");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusLessThanOrEqualTo(String value) {
            addCriterion("paymentStatus <=", value, "paymentstatus");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusLike(String value) {
            addCriterion("paymentStatus like", value, "paymentstatus");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusNotLike(String value) {
            addCriterion("paymentStatus not like", value, "paymentstatus");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusIn(List<String> values) {
            addCriterion("paymentStatus in", values, "paymentstatus");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusNotIn(List<String> values) {
            addCriterion("paymentStatus not in", values, "paymentstatus");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusBetween(String value1, String value2) {
            addCriterion("paymentStatus between", value1, value2, "paymentstatus");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusNotBetween(String value1, String value2) {
            addCriterion("paymentStatus not between", value1, value2, "paymentstatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceidIsNull() {
            addCriterion("invoiceId is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceidIsNotNull() {
            addCriterion("invoiceId is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceidEqualTo(String value) {
            addCriterion("invoiceId =", value, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidNotEqualTo(String value) {
            addCriterion("invoiceId <>", value, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidGreaterThan(String value) {
            addCriterion("invoiceId >", value, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidGreaterThanOrEqualTo(String value) {
            addCriterion("invoiceId >=", value, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidLessThan(String value) {
            addCriterion("invoiceId <", value, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidLessThanOrEqualTo(String value) {
            addCriterion("invoiceId <=", value, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidLike(String value) {
            addCriterion("invoiceId like", value, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidNotLike(String value) {
            addCriterion("invoiceId not like", value, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidIn(List<String> values) {
            addCriterion("invoiceId in", values, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidNotIn(List<String> values) {
            addCriterion("invoiceId not in", values, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidBetween(String value1, String value2) {
            addCriterion("invoiceId between", value1, value2, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidNotBetween(String value1, String value2) {
            addCriterion("invoiceId not between", value1, value2, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andCustomIsNull() {
            addCriterion("custom is null");
            return (Criteria) this;
        }

        public Criteria andCustomIsNotNull() {
            addCriterion("custom is not null");
            return (Criteria) this;
        }

        public Criteria andCustomEqualTo(String value) {
            addCriterion("custom =", value, "custom");
            return (Criteria) this;
        }

        public Criteria andCustomNotEqualTo(String value) {
            addCriterion("custom <>", value, "custom");
            return (Criteria) this;
        }

        public Criteria andCustomGreaterThan(String value) {
            addCriterion("custom >", value, "custom");
            return (Criteria) this;
        }

        public Criteria andCustomGreaterThanOrEqualTo(String value) {
            addCriterion("custom >=", value, "custom");
            return (Criteria) this;
        }

        public Criteria andCustomLessThan(String value) {
            addCriterion("custom <", value, "custom");
            return (Criteria) this;
        }

        public Criteria andCustomLessThanOrEqualTo(String value) {
            addCriterion("custom <=", value, "custom");
            return (Criteria) this;
        }

        public Criteria andCustomLike(String value) {
            addCriterion("custom like", value, "custom");
            return (Criteria) this;
        }

        public Criteria andCustomNotLike(String value) {
            addCriterion("custom not like", value, "custom");
            return (Criteria) this;
        }

        public Criteria andCustomIn(List<String> values) {
            addCriterion("custom in", values, "custom");
            return (Criteria) this;
        }

        public Criteria andCustomNotIn(List<String> values) {
            addCriterion("custom not in", values, "custom");
            return (Criteria) this;
        }

        public Criteria andCustomBetween(String value1, String value2) {
            addCriterion("custom between", value1, value2, "custom");
            return (Criteria) this;
        }

        public Criteria andCustomNotBetween(String value1, String value2) {
            addCriterion("custom not between", value1, value2, "custom");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("memo not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andSalestaxIsNull() {
            addCriterion("salesTax is null");
            return (Criteria) this;
        }

        public Criteria andSalestaxIsNotNull() {
            addCriterion("salesTax is not null");
            return (Criteria) this;
        }

        public Criteria andSalestaxEqualTo(String value) {
            addCriterion("salesTax =", value, "salestax");
            return (Criteria) this;
        }

        public Criteria andSalestaxNotEqualTo(String value) {
            addCriterion("salesTax <>", value, "salestax");
            return (Criteria) this;
        }

        public Criteria andSalestaxGreaterThan(String value) {
            addCriterion("salesTax >", value, "salestax");
            return (Criteria) this;
        }

        public Criteria andSalestaxGreaterThanOrEqualTo(String value) {
            addCriterion("salesTax >=", value, "salestax");
            return (Criteria) this;
        }

        public Criteria andSalestaxLessThan(String value) {
            addCriterion("salesTax <", value, "salestax");
            return (Criteria) this;
        }

        public Criteria andSalestaxLessThanOrEqualTo(String value) {
            addCriterion("salesTax <=", value, "salestax");
            return (Criteria) this;
        }

        public Criteria andSalestaxLike(String value) {
            addCriterion("salesTax like", value, "salestax");
            return (Criteria) this;
        }

        public Criteria andSalestaxNotLike(String value) {
            addCriterion("salesTax not like", value, "salestax");
            return (Criteria) this;
        }

        public Criteria andSalestaxIn(List<String> values) {
            addCriterion("salesTax in", values, "salestax");
            return (Criteria) this;
        }

        public Criteria andSalestaxNotIn(List<String> values) {
            addCriterion("salesTax not in", values, "salestax");
            return (Criteria) this;
        }

        public Criteria andSalestaxBetween(String value1, String value2) {
            addCriterion("salesTax between", value1, value2, "salestax");
            return (Criteria) this;
        }

        public Criteria andSalestaxNotBetween(String value1, String value2) {
            addCriterion("salesTax not between", value1, value2, "salestax");
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