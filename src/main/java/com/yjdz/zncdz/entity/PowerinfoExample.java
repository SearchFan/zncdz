package com.yjdz.zncdz.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PowerinfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table powerinfo
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table powerinfo
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table powerinfo
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table powerinfo
     *
     * @mbg.generated
     */
    public PowerinfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table powerinfo
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table powerinfo
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table powerinfo
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table powerinfo
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table powerinfo
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table powerinfo
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table powerinfo
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table powerinfo
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table powerinfo
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table powerinfo
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table powerinfo
     *
     * @mbg.generated
     */
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNull() {
            addCriterion("orderid is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderid is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(Integer value) {
            addCriterion("orderid =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(Integer value) {
            addCriterion("orderid <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(Integer value) {
            addCriterion("orderid >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderid >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(Integer value) {
            addCriterion("orderid <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(Integer value) {
            addCriterion("orderid <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<Integer> values) {
            addCriterion("orderid in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<Integer> values) {
            addCriterion("orderid not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(Integer value1, Integer value2) {
            addCriterion("orderid between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(Integer value1, Integer value2) {
            addCriterion("orderid not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andMaxpowerIsNull() {
            addCriterion("maxpower is null");
            return (Criteria) this;
        }

        public Criteria andMaxpowerIsNotNull() {
            addCriterion("maxpower is not null");
            return (Criteria) this;
        }

        public Criteria andMaxpowerEqualTo(Integer value) {
            addCriterion("maxpower =", value, "maxpower");
            return (Criteria) this;
        }

        public Criteria andMaxpowerNotEqualTo(Integer value) {
            addCriterion("maxpower <>", value, "maxpower");
            return (Criteria) this;
        }

        public Criteria andMaxpowerGreaterThan(Integer value) {
            addCriterion("maxpower >", value, "maxpower");
            return (Criteria) this;
        }

        public Criteria andMaxpowerGreaterThanOrEqualTo(Integer value) {
            addCriterion("maxpower >=", value, "maxpower");
            return (Criteria) this;
        }

        public Criteria andMaxpowerLessThan(Integer value) {
            addCriterion("maxpower <", value, "maxpower");
            return (Criteria) this;
        }

        public Criteria andMaxpowerLessThanOrEqualTo(Integer value) {
            addCriterion("maxpower <=", value, "maxpower");
            return (Criteria) this;
        }

        public Criteria andMaxpowerIn(List<Integer> values) {
            addCriterion("maxpower in", values, "maxpower");
            return (Criteria) this;
        }

        public Criteria andMaxpowerNotIn(List<Integer> values) {
            addCriterion("maxpower not in", values, "maxpower");
            return (Criteria) this;
        }

        public Criteria andMaxpowerBetween(Integer value1, Integer value2) {
            addCriterion("maxpower between", value1, value2, "maxpower");
            return (Criteria) this;
        }

        public Criteria andMaxpowerNotBetween(Integer value1, Integer value2) {
            addCriterion("maxpower not between", value1, value2, "maxpower");
            return (Criteria) this;
        }

        public Criteria andSecondsIsNull() {
            addCriterion("seconds is null");
            return (Criteria) this;
        }

        public Criteria andSecondsIsNotNull() {
            addCriterion("seconds is not null");
            return (Criteria) this;
        }

        public Criteria andSecondsEqualTo(Integer value) {
            addCriterion("seconds =", value, "seconds");
            return (Criteria) this;
        }

        public Criteria andSecondsNotEqualTo(Integer value) {
            addCriterion("seconds <>", value, "seconds");
            return (Criteria) this;
        }

        public Criteria andSecondsGreaterThan(Integer value) {
            addCriterion("seconds >", value, "seconds");
            return (Criteria) this;
        }

        public Criteria andSecondsGreaterThanOrEqualTo(Integer value) {
            addCriterion("seconds >=", value, "seconds");
            return (Criteria) this;
        }

        public Criteria andSecondsLessThan(Integer value) {
            addCriterion("seconds <", value, "seconds");
            return (Criteria) this;
        }

        public Criteria andSecondsLessThanOrEqualTo(Integer value) {
            addCriterion("seconds <=", value, "seconds");
            return (Criteria) this;
        }

        public Criteria andSecondsIn(List<Integer> values) {
            addCriterion("seconds in", values, "seconds");
            return (Criteria) this;
        }

        public Criteria andSecondsNotIn(List<Integer> values) {
            addCriterion("seconds not in", values, "seconds");
            return (Criteria) this;
        }

        public Criteria andSecondsBetween(Integer value1, Integer value2) {
            addCriterion("seconds between", value1, value2, "seconds");
            return (Criteria) this;
        }

        public Criteria andSecondsNotBetween(Integer value1, Integer value2) {
            addCriterion("seconds not between", value1, value2, "seconds");
            return (Criteria) this;
        }

        public Criteria andReceivetimeIsNull() {
            addCriterion("receivetime is null");
            return (Criteria) this;
        }

        public Criteria andReceivetimeIsNotNull() {
            addCriterion("receivetime is not null");
            return (Criteria) this;
        }

        public Criteria andReceivetimeEqualTo(Date value) {
            addCriterion("receivetime =", value, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeNotEqualTo(Date value) {
            addCriterion("receivetime <>", value, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeGreaterThan(Date value) {
            addCriterion("receivetime >", value, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("receivetime >=", value, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeLessThan(Date value) {
            addCriterion("receivetime <", value, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeLessThanOrEqualTo(Date value) {
            addCriterion("receivetime <=", value, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeIn(List<Date> values) {
            addCriterion("receivetime in", values, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeNotIn(List<Date> values) {
            addCriterion("receivetime not in", values, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeBetween(Date value1, Date value2) {
            addCriterion("receivetime between", value1, value2, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeNotBetween(Date value1, Date value2) {
            addCriterion("receivetime not between", value1, value2, "receivetime");
            return (Criteria) this;
        }

        public Criteria andPortstatusIsNull() {
            addCriterion("portstatus is null");
            return (Criteria) this;
        }

        public Criteria andPortstatusIsNotNull() {
            addCriterion("portstatus is not null");
            return (Criteria) this;
        }

        public Criteria andPortstatusEqualTo(String value) {
            addCriterion("portstatus =", value, "portstatus");
            return (Criteria) this;
        }

        public Criteria andPortstatusNotEqualTo(String value) {
            addCriterion("portstatus <>", value, "portstatus");
            return (Criteria) this;
        }

        public Criteria andPortstatusGreaterThan(String value) {
            addCriterion("portstatus >", value, "portstatus");
            return (Criteria) this;
        }

        public Criteria andPortstatusGreaterThanOrEqualTo(String value) {
            addCriterion("portstatus >=", value, "portstatus");
            return (Criteria) this;
        }

        public Criteria andPortstatusLessThan(String value) {
            addCriterion("portstatus <", value, "portstatus");
            return (Criteria) this;
        }

        public Criteria andPortstatusLessThanOrEqualTo(String value) {
            addCriterion("portstatus <=", value, "portstatus");
            return (Criteria) this;
        }

        public Criteria andPortstatusLike(String value) {
            addCriterion("portstatus like", value, "portstatus");
            return (Criteria) this;
        }

        public Criteria andPortstatusNotLike(String value) {
            addCriterion("portstatus not like", value, "portstatus");
            return (Criteria) this;
        }

        public Criteria andPortstatusIn(List<String> values) {
            addCriterion("portstatus in", values, "portstatus");
            return (Criteria) this;
        }

        public Criteria andPortstatusNotIn(List<String> values) {
            addCriterion("portstatus not in", values, "portstatus");
            return (Criteria) this;
        }

        public Criteria andPortstatusBetween(String value1, String value2) {
            addCriterion("portstatus between", value1, value2, "portstatus");
            return (Criteria) this;
        }

        public Criteria andPortstatusNotBetween(String value1, String value2) {
            addCriterion("portstatus not between", value1, value2, "portstatus");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table powerinfo
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table powerinfo
     *
     * @mbg.generated
     */
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