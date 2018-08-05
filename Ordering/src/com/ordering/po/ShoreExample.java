package com.ordering.po;

import java.util.ArrayList;
import java.util.List;

public class ShoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShoreExample() {
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

        public Criteria andShoreidIsNull() {
            addCriterion("shoreId is null");
            return (Criteria) this;
        }

        public Criteria andShoreidIsNotNull() {
            addCriterion("shoreId is not null");
            return (Criteria) this;
        }

        public Criteria andShoreidEqualTo(Integer value) {
            addCriterion("shoreId =", value, "shoreid");
            return (Criteria) this;
        }

        public Criteria andShoreidNotEqualTo(Integer value) {
            addCriterion("shoreId <>", value, "shoreid");
            return (Criteria) this;
        }

        public Criteria andShoreidGreaterThan(Integer value) {
            addCriterion("shoreId >", value, "shoreid");
            return (Criteria) this;
        }

        public Criteria andShoreidGreaterThanOrEqualTo(Integer value) {
            addCriterion("shoreId >=", value, "shoreid");
            return (Criteria) this;
        }

        public Criteria andShoreidLessThan(Integer value) {
            addCriterion("shoreId <", value, "shoreid");
            return (Criteria) this;
        }

        public Criteria andShoreidLessThanOrEqualTo(Integer value) {
            addCriterion("shoreId <=", value, "shoreid");
            return (Criteria) this;
        }

        public Criteria andShoreidIn(List<Integer> values) {
            addCriterion("shoreId in", values, "shoreid");
            return (Criteria) this;
        }

        public Criteria andShoreidNotIn(List<Integer> values) {
            addCriterion("shoreId not in", values, "shoreid");
            return (Criteria) this;
        }

        public Criteria andShoreidBetween(Integer value1, Integer value2) {
            addCriterion("shoreId between", value1, value2, "shoreid");
            return (Criteria) this;
        }

        public Criteria andShoreidNotBetween(Integer value1, Integer value2) {
            addCriterion("shoreId not between", value1, value2, "shoreid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andShorenameIsNull() {
            addCriterion("shorename is null");
            return (Criteria) this;
        }

        public Criteria andShorenameIsNotNull() {
            addCriterion("shorename is not null");
            return (Criteria) this;
        }

        public Criteria andShorenameEqualTo(String value) {
            addCriterion("shorename =", value, "shorename");
            return (Criteria) this;
        }

        public Criteria andShorenameNotEqualTo(String value) {
            addCriterion("shorename <>", value, "shorename");
            return (Criteria) this;
        }

        public Criteria andShorenameGreaterThan(String value) {
            addCriterion("shorename >", value, "shorename");
            return (Criteria) this;
        }

        public Criteria andShorenameGreaterThanOrEqualTo(String value) {
            addCriterion("shorename >=", value, "shorename");
            return (Criteria) this;
        }

        public Criteria andShorenameLessThan(String value) {
            addCriterion("shorename <", value, "shorename");
            return (Criteria) this;
        }

        public Criteria andShorenameLessThanOrEqualTo(String value) {
            addCriterion("shorename <=", value, "shorename");
            return (Criteria) this;
        }

        public Criteria andShorenameLike(String value) {
            addCriterion("shorename like", value, "shorename");
            return (Criteria) this;
        }

        public Criteria andShorenameNotLike(String value) {
            addCriterion("shorename not like", value, "shorename");
            return (Criteria) this;
        }

        public Criteria andShorenameIn(List<String> values) {
            addCriterion("shorename in", values, "shorename");
            return (Criteria) this;
        }

        public Criteria andShorenameNotIn(List<String> values) {
            addCriterion("shorename not in", values, "shorename");
            return (Criteria) this;
        }

        public Criteria andShorenameBetween(String value1, String value2) {
            addCriterion("shorename between", value1, value2, "shorename");
            return (Criteria) this;
        }

        public Criteria andShorenameNotBetween(String value1, String value2) {
            addCriterion("shorename not between", value1, value2, "shorename");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andShoretypeIdIsNull() {
            addCriterion("shoretype_id is null");
            return (Criteria) this;
        }

        public Criteria andShoretypeIdIsNotNull() {
            addCriterion("shoretype_id is not null");
            return (Criteria) this;
        }

        public Criteria andShoretypeIdEqualTo(Integer value) {
            addCriterion("shoretype_id =", value, "shoretypeId");
            return (Criteria) this;
        }

        public Criteria andShoretypeIdNotEqualTo(Integer value) {
            addCriterion("shoretype_id <>", value, "shoretypeId");
            return (Criteria) this;
        }

        public Criteria andShoretypeIdGreaterThan(Integer value) {
            addCriterion("shoretype_id >", value, "shoretypeId");
            return (Criteria) this;
        }

        public Criteria andShoretypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shoretype_id >=", value, "shoretypeId");
            return (Criteria) this;
        }

        public Criteria andShoretypeIdLessThan(Integer value) {
            addCriterion("shoretype_id <", value, "shoretypeId");
            return (Criteria) this;
        }

        public Criteria andShoretypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("shoretype_id <=", value, "shoretypeId");
            return (Criteria) this;
        }

        public Criteria andShoretypeIdIn(List<Integer> values) {
            addCriterion("shoretype_id in", values, "shoretypeId");
            return (Criteria) this;
        }

        public Criteria andShoretypeIdNotIn(List<Integer> values) {
            addCriterion("shoretype_id not in", values, "shoretypeId");
            return (Criteria) this;
        }

        public Criteria andShoretypeIdBetween(Integer value1, Integer value2) {
            addCriterion("shoretype_id between", value1, value2, "shoretypeId");
            return (Criteria) this;
        }

        public Criteria andShoretypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shoretype_id not between", value1, value2, "shoretypeId");
            return (Criteria) this;
        }

        public Criteria andShorepicIsNull() {
            addCriterion("shorePic is null");
            return (Criteria) this;
        }

        public Criteria andShorepicIsNotNull() {
            addCriterion("shorePic is not null");
            return (Criteria) this;
        }

        public Criteria andShorepicEqualTo(String value) {
            addCriterion("shorePic =", value, "shorepic");
            return (Criteria) this;
        }

        public Criteria andShorepicNotEqualTo(String value) {
            addCriterion("shorePic <>", value, "shorepic");
            return (Criteria) this;
        }

        public Criteria andShorepicGreaterThan(String value) {
            addCriterion("shorePic >", value, "shorepic");
            return (Criteria) this;
        }

        public Criteria andShorepicGreaterThanOrEqualTo(String value) {
            addCriterion("shorePic >=", value, "shorepic");
            return (Criteria) this;
        }

        public Criteria andShorepicLessThan(String value) {
            addCriterion("shorePic <", value, "shorepic");
            return (Criteria) this;
        }

        public Criteria andShorepicLessThanOrEqualTo(String value) {
            addCriterion("shorePic <=", value, "shorepic");
            return (Criteria) this;
        }

        public Criteria andShorepicLike(String value) {
            addCriterion("shorePic like", value, "shorepic");
            return (Criteria) this;
        }

        public Criteria andShorepicNotLike(String value) {
            addCriterion("shorePic not like", value, "shorepic");
            return (Criteria) this;
        }

        public Criteria andShorepicIn(List<String> values) {
            addCriterion("shorePic in", values, "shorepic");
            return (Criteria) this;
        }

        public Criteria andShorepicNotIn(List<String> values) {
            addCriterion("shorePic not in", values, "shorepic");
            return (Criteria) this;
        }

        public Criteria andShorepicBetween(String value1, String value2) {
            addCriterion("shorePic between", value1, value2, "shorepic");
            return (Criteria) this;
        }

        public Criteria andShorepicNotBetween(String value1, String value2) {
            addCriterion("shorePic not between", value1, value2, "shorepic");
            return (Criteria) this;
        }

        public Criteria andShoremoblieIsNull() {
            addCriterion("shoreMoblie is null");
            return (Criteria) this;
        }

        public Criteria andShoremoblieIsNotNull() {
            addCriterion("shoreMoblie is not null");
            return (Criteria) this;
        }

        public Criteria andShoremoblieEqualTo(String value) {
            addCriterion("shoreMoblie =", value, "shoremoblie");
            return (Criteria) this;
        }

        public Criteria andShoremoblieNotEqualTo(String value) {
            addCriterion("shoreMoblie <>", value, "shoremoblie");
            return (Criteria) this;
        }

        public Criteria andShoremoblieGreaterThan(String value) {
            addCriterion("shoreMoblie >", value, "shoremoblie");
            return (Criteria) this;
        }

        public Criteria andShoremoblieGreaterThanOrEqualTo(String value) {
            addCriterion("shoreMoblie >=", value, "shoremoblie");
            return (Criteria) this;
        }

        public Criteria andShoremoblieLessThan(String value) {
            addCriterion("shoreMoblie <", value, "shoremoblie");
            return (Criteria) this;
        }

        public Criteria andShoremoblieLessThanOrEqualTo(String value) {
            addCriterion("shoreMoblie <=", value, "shoremoblie");
            return (Criteria) this;
        }

        public Criteria andShoremoblieLike(String value) {
            addCriterion("shoreMoblie like", value, "shoremoblie");
            return (Criteria) this;
        }

        public Criteria andShoremoblieNotLike(String value) {
            addCriterion("shoreMoblie not like", value, "shoremoblie");
            return (Criteria) this;
        }

        public Criteria andShoremoblieIn(List<String> values) {
            addCriterion("shoreMoblie in", values, "shoremoblie");
            return (Criteria) this;
        }

        public Criteria andShoremoblieNotIn(List<String> values) {
            addCriterion("shoreMoblie not in", values, "shoremoblie");
            return (Criteria) this;
        }

        public Criteria andShoremoblieBetween(String value1, String value2) {
            addCriterion("shoreMoblie between", value1, value2, "shoremoblie");
            return (Criteria) this;
        }

        public Criteria andShoremoblieNotBetween(String value1, String value2) {
            addCriterion("shoreMoblie not between", value1, value2, "shoremoblie");
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