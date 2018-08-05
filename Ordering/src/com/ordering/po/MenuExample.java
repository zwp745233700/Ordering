package com.ordering.po;

import java.util.ArrayList;
import java.util.List;

public class MenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MenuExample() {
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

        public Criteria andMenuidIsNull() {
            addCriterion("menuId is null");
            return (Criteria) this;
        }

        public Criteria andMenuidIsNotNull() {
            addCriterion("menuId is not null");
            return (Criteria) this;
        }

        public Criteria andMenuidEqualTo(Integer value) {
            addCriterion("menuId =", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidNotEqualTo(Integer value) {
            addCriterion("menuId <>", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidGreaterThan(Integer value) {
            addCriterion("menuId >", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("menuId >=", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidLessThan(Integer value) {
            addCriterion("menuId <", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidLessThanOrEqualTo(Integer value) {
            addCriterion("menuId <=", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidIn(List<Integer> values) {
            addCriterion("menuId in", values, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidNotIn(List<Integer> values) {
            addCriterion("menuId not in", values, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidBetween(Integer value1, Integer value2) {
            addCriterion("menuId between", value1, value2, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidNotBetween(Integer value1, Integer value2) {
            addCriterion("menuId not between", value1, value2, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenunameIsNull() {
            addCriterion("menuName is null");
            return (Criteria) this;
        }

        public Criteria andMenunameIsNotNull() {
            addCriterion("menuName is not null");
            return (Criteria) this;
        }

        public Criteria andMenunameEqualTo(String value) {
            addCriterion("menuName =", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotEqualTo(String value) {
            addCriterion("menuName <>", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameGreaterThan(String value) {
            addCriterion("menuName >", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameGreaterThanOrEqualTo(String value) {
            addCriterion("menuName >=", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameLessThan(String value) {
            addCriterion("menuName <", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameLessThanOrEqualTo(String value) {
            addCriterion("menuName <=", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameLike(String value) {
            addCriterion("menuName like", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotLike(String value) {
            addCriterion("menuName not like", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameIn(List<String> values) {
            addCriterion("menuName in", values, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotIn(List<String> values) {
            addCriterion("menuName not in", values, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameBetween(String value1, String value2) {
            addCriterion("menuName between", value1, value2, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotBetween(String value1, String value2) {
            addCriterion("menuName not between", value1, value2, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenupicIsNull() {
            addCriterion("menuPic is null");
            return (Criteria) this;
        }

        public Criteria andMenupicIsNotNull() {
            addCriterion("menuPic is not null");
            return (Criteria) this;
        }

        public Criteria andMenupicEqualTo(String value) {
            addCriterion("menuPic =", value, "menupic");
            return (Criteria) this;
        }

        public Criteria andMenupicNotEqualTo(String value) {
            addCriterion("menuPic <>", value, "menupic");
            return (Criteria) this;
        }

        public Criteria andMenupicGreaterThan(String value) {
            addCriterion("menuPic >", value, "menupic");
            return (Criteria) this;
        }

        public Criteria andMenupicGreaterThanOrEqualTo(String value) {
            addCriterion("menuPic >=", value, "menupic");
            return (Criteria) this;
        }

        public Criteria andMenupicLessThan(String value) {
            addCriterion("menuPic <", value, "menupic");
            return (Criteria) this;
        }

        public Criteria andMenupicLessThanOrEqualTo(String value) {
            addCriterion("menuPic <=", value, "menupic");
            return (Criteria) this;
        }

        public Criteria andMenupicLike(String value) {
            addCriterion("menuPic like", value, "menupic");
            return (Criteria) this;
        }

        public Criteria andMenupicNotLike(String value) {
            addCriterion("menuPic not like", value, "menupic");
            return (Criteria) this;
        }

        public Criteria andMenupicIn(List<String> values) {
            addCriterion("menuPic in", values, "menupic");
            return (Criteria) this;
        }

        public Criteria andMenupicNotIn(List<String> values) {
            addCriterion("menuPic not in", values, "menupic");
            return (Criteria) this;
        }

        public Criteria andMenupicBetween(String value1, String value2) {
            addCriterion("menuPic between", value1, value2, "menupic");
            return (Criteria) this;
        }

        public Criteria andMenupicNotBetween(String value1, String value2) {
            addCriterion("menuPic not between", value1, value2, "menupic");
            return (Criteria) this;
        }

        public Criteria andMenupriceIsNull() {
            addCriterion("menuPrice is null");
            return (Criteria) this;
        }

        public Criteria andMenupriceIsNotNull() {
            addCriterion("menuPrice is not null");
            return (Criteria) this;
        }

        public Criteria andMenupriceEqualTo(Integer value) {
            addCriterion("menuPrice =", value, "menuprice");
            return (Criteria) this;
        }

        public Criteria andMenupriceNotEqualTo(Integer value) {
            addCriterion("menuPrice <>", value, "menuprice");
            return (Criteria) this;
        }

        public Criteria andMenupriceGreaterThan(Integer value) {
            addCriterion("menuPrice >", value, "menuprice");
            return (Criteria) this;
        }

        public Criteria andMenupriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("menuPrice >=", value, "menuprice");
            return (Criteria) this;
        }

        public Criteria andMenupriceLessThan(Integer value) {
            addCriterion("menuPrice <", value, "menuprice");
            return (Criteria) this;
        }

        public Criteria andMenupriceLessThanOrEqualTo(Integer value) {
            addCriterion("menuPrice <=", value, "menuprice");
            return (Criteria) this;
        }

        public Criteria andMenupriceIn(List<Integer> values) {
            addCriterion("menuPrice in", values, "menuprice");
            return (Criteria) this;
        }

        public Criteria andMenupriceNotIn(List<Integer> values) {
            addCriterion("menuPrice not in", values, "menuprice");
            return (Criteria) this;
        }

        public Criteria andMenupriceBetween(Integer value1, Integer value2) {
            addCriterion("menuPrice between", value1, value2, "menuprice");
            return (Criteria) this;
        }

        public Criteria andMenupriceNotBetween(Integer value1, Integer value2) {
            addCriterion("menuPrice not between", value1, value2, "menuprice");
            return (Criteria) this;
        }

        public Criteria andMenedetailIsNull() {
            addCriterion("meneDetail is null");
            return (Criteria) this;
        }

        public Criteria andMenedetailIsNotNull() {
            addCriterion("meneDetail is not null");
            return (Criteria) this;
        }

        public Criteria andMenedetailEqualTo(String value) {
            addCriterion("meneDetail =", value, "menedetail");
            return (Criteria) this;
        }

        public Criteria andMenedetailNotEqualTo(String value) {
            addCriterion("meneDetail <>", value, "menedetail");
            return (Criteria) this;
        }

        public Criteria andMenedetailGreaterThan(String value) {
            addCriterion("meneDetail >", value, "menedetail");
            return (Criteria) this;
        }

        public Criteria andMenedetailGreaterThanOrEqualTo(String value) {
            addCriterion("meneDetail >=", value, "menedetail");
            return (Criteria) this;
        }

        public Criteria andMenedetailLessThan(String value) {
            addCriterion("meneDetail <", value, "menedetail");
            return (Criteria) this;
        }

        public Criteria andMenedetailLessThanOrEqualTo(String value) {
            addCriterion("meneDetail <=", value, "menedetail");
            return (Criteria) this;
        }

        public Criteria andMenedetailLike(String value) {
            addCriterion("meneDetail like", value, "menedetail");
            return (Criteria) this;
        }

        public Criteria andMenedetailNotLike(String value) {
            addCriterion("meneDetail not like", value, "menedetail");
            return (Criteria) this;
        }

        public Criteria andMenedetailIn(List<String> values) {
            addCriterion("meneDetail in", values, "menedetail");
            return (Criteria) this;
        }

        public Criteria andMenedetailNotIn(List<String> values) {
            addCriterion("meneDetail not in", values, "menedetail");
            return (Criteria) this;
        }

        public Criteria andMenedetailBetween(String value1, String value2) {
            addCriterion("meneDetail between", value1, value2, "menedetail");
            return (Criteria) this;
        }

        public Criteria andMenedetailNotBetween(String value1, String value2) {
            addCriterion("meneDetail not between", value1, value2, "menedetail");
            return (Criteria) this;
        }

        public Criteria andShoreIdIsNull() {
            addCriterion("shore_id is null");
            return (Criteria) this;
        }

        public Criteria andShoreIdIsNotNull() {
            addCriterion("shore_id is not null");
            return (Criteria) this;
        }

        public Criteria andShoreIdEqualTo(Integer value) {
            addCriterion("shore_id =", value, "shoreId");
            return (Criteria) this;
        }

        public Criteria andShoreIdNotEqualTo(Integer value) {
            addCriterion("shore_id <>", value, "shoreId");
            return (Criteria) this;
        }

        public Criteria andShoreIdGreaterThan(Integer value) {
            addCriterion("shore_id >", value, "shoreId");
            return (Criteria) this;
        }

        public Criteria andShoreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shore_id >=", value, "shoreId");
            return (Criteria) this;
        }

        public Criteria andShoreIdLessThan(Integer value) {
            addCriterion("shore_id <", value, "shoreId");
            return (Criteria) this;
        }

        public Criteria andShoreIdLessThanOrEqualTo(Integer value) {
            addCriterion("shore_id <=", value, "shoreId");
            return (Criteria) this;
        }

        public Criteria andShoreIdIn(List<Integer> values) {
            addCriterion("shore_id in", values, "shoreId");
            return (Criteria) this;
        }

        public Criteria andShoreIdNotIn(List<Integer> values) {
            addCriterion("shore_id not in", values, "shoreId");
            return (Criteria) this;
        }

        public Criteria andShoreIdBetween(Integer value1, Integer value2) {
            addCriterion("shore_id between", value1, value2, "shoreId");
            return (Criteria) this;
        }

        public Criteria andShoreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shore_id not between", value1, value2, "shoreId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Integer value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Integer value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Integer value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Integer value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Integer> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Integer> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
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