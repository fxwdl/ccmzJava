package com.yixun.ccmz.domain;

import java.util.ArrayList;
import java.util.List;

public class SystemFunctionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SystemFunctionExample() {
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

        public Criteria andPermissionIdIsNull() {
            addCriterion("PermissionId is null");
            return (Criteria) this;
        }

        public Criteria andPermissionIdIsNotNull() {
            addCriterion("PermissionId is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionIdEqualTo(String value) {
            addCriterion("PermissionId =", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdNotEqualTo(String value) {
            addCriterion("PermissionId <>", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdGreaterThan(String value) {
            addCriterion("PermissionId >", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdGreaterThanOrEqualTo(String value) {
            addCriterion("PermissionId >=", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdLessThan(String value) {
            addCriterion("PermissionId <", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdLessThanOrEqualTo(String value) {
            addCriterion("PermissionId <=", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdLike(String value) {
            addCriterion("PermissionId like", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdNotLike(String value) {
            addCriterion("PermissionId not like", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdIn(List<String> values) {
            addCriterion("PermissionId in", values, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdNotIn(List<String> values) {
            addCriterion("PermissionId not in", values, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdBetween(String value1, String value2) {
            addCriterion("PermissionId between", value1, value2, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdNotBetween(String value1, String value2) {
            addCriterion("PermissionId not between", value1, value2, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionNameIsNull() {
            addCriterion("PermissionName is null");
            return (Criteria) this;
        }

        public Criteria andPermissionNameIsNotNull() {
            addCriterion("PermissionName is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionNameEqualTo(String value) {
            addCriterion("PermissionName =", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameNotEqualTo(String value) {
            addCriterion("PermissionName <>", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameGreaterThan(String value) {
            addCriterion("PermissionName >", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameGreaterThanOrEqualTo(String value) {
            addCriterion("PermissionName >=", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameLessThan(String value) {
            addCriterion("PermissionName <", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameLessThanOrEqualTo(String value) {
            addCriterion("PermissionName <=", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameLike(String value) {
            addCriterion("PermissionName like", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameNotLike(String value) {
            addCriterion("PermissionName not like", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameIn(List<String> values) {
            addCriterion("PermissionName in", values, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameNotIn(List<String> values) {
            addCriterion("PermissionName not in", values, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameBetween(String value1, String value2) {
            addCriterion("PermissionName between", value1, value2, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameNotBetween(String value1, String value2) {
            addCriterion("PermissionName not between", value1, value2, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionDisplayNameIsNull() {
            addCriterion("PermissionDisplayName is null");
            return (Criteria) this;
        }

        public Criteria andPermissionDisplayNameIsNotNull() {
            addCriterion("PermissionDisplayName is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionDisplayNameEqualTo(String value) {
            addCriterion("PermissionDisplayName =", value, "permissionDisplayName");
            return (Criteria) this;
        }

        public Criteria andPermissionDisplayNameNotEqualTo(String value) {
            addCriterion("PermissionDisplayName <>", value, "permissionDisplayName");
            return (Criteria) this;
        }

        public Criteria andPermissionDisplayNameGreaterThan(String value) {
            addCriterion("PermissionDisplayName >", value, "permissionDisplayName");
            return (Criteria) this;
        }

        public Criteria andPermissionDisplayNameGreaterThanOrEqualTo(String value) {
            addCriterion("PermissionDisplayName >=", value, "permissionDisplayName");
            return (Criteria) this;
        }

        public Criteria andPermissionDisplayNameLessThan(String value) {
            addCriterion("PermissionDisplayName <", value, "permissionDisplayName");
            return (Criteria) this;
        }

        public Criteria andPermissionDisplayNameLessThanOrEqualTo(String value) {
            addCriterion("PermissionDisplayName <=", value, "permissionDisplayName");
            return (Criteria) this;
        }

        public Criteria andPermissionDisplayNameLike(String value) {
            addCriterion("PermissionDisplayName like", value, "permissionDisplayName");
            return (Criteria) this;
        }

        public Criteria andPermissionDisplayNameNotLike(String value) {
            addCriterion("PermissionDisplayName not like", value, "permissionDisplayName");
            return (Criteria) this;
        }

        public Criteria andPermissionDisplayNameIn(List<String> values) {
            addCriterion("PermissionDisplayName in", values, "permissionDisplayName");
            return (Criteria) this;
        }

        public Criteria andPermissionDisplayNameNotIn(List<String> values) {
            addCriterion("PermissionDisplayName not in", values, "permissionDisplayName");
            return (Criteria) this;
        }

        public Criteria andPermissionDisplayNameBetween(String value1, String value2) {
            addCriterion("PermissionDisplayName between", value1, value2, "permissionDisplayName");
            return (Criteria) this;
        }

        public Criteria andPermissionDisplayNameNotBetween(String value1, String value2) {
            addCriterion("PermissionDisplayName not between", value1, value2, "permissionDisplayName");
            return (Criteria) this;
        }

        public Criteria andFunTypeIsNull() {
            addCriterion("FunType is null");
            return (Criteria) this;
        }

        public Criteria andFunTypeIsNotNull() {
            addCriterion("FunType is not null");
            return (Criteria) this;
        }

        public Criteria andFunTypeEqualTo(Integer value) {
            addCriterion("FunType =", value, "funType");
            return (Criteria) this;
        }

        public Criteria andFunTypeNotEqualTo(Integer value) {
            addCriterion("FunType <>", value, "funType");
            return (Criteria) this;
        }

        public Criteria andFunTypeGreaterThan(Integer value) {
            addCriterion("FunType >", value, "funType");
            return (Criteria) this;
        }

        public Criteria andFunTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("FunType >=", value, "funType");
            return (Criteria) this;
        }

        public Criteria andFunTypeLessThan(Integer value) {
            addCriterion("FunType <", value, "funType");
            return (Criteria) this;
        }

        public Criteria andFunTypeLessThanOrEqualTo(Integer value) {
            addCriterion("FunType <=", value, "funType");
            return (Criteria) this;
        }

        public Criteria andFunTypeIn(List<Integer> values) {
            addCriterion("FunType in", values, "funType");
            return (Criteria) this;
        }

        public Criteria andFunTypeNotIn(List<Integer> values) {
            addCriterion("FunType not in", values, "funType");
            return (Criteria) this;
        }

        public Criteria andFunTypeBetween(Integer value1, Integer value2) {
            addCriterion("FunType between", value1, value2, "funType");
            return (Criteria) this;
        }

        public Criteria andFunTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("FunType not between", value1, value2, "funType");
            return (Criteria) this;
        }

        public Criteria andParentPermissionIdIsNull() {
            addCriterion("ParentPermissionId is null");
            return (Criteria) this;
        }

        public Criteria andParentPermissionIdIsNotNull() {
            addCriterion("ParentPermissionId is not null");
            return (Criteria) this;
        }

        public Criteria andParentPermissionIdEqualTo(String value) {
            addCriterion("ParentPermissionId =", value, "parentPermissionId");
            return (Criteria) this;
        }

        public Criteria andParentPermissionIdNotEqualTo(String value) {
            addCriterion("ParentPermissionId <>", value, "parentPermissionId");
            return (Criteria) this;
        }

        public Criteria andParentPermissionIdGreaterThan(String value) {
            addCriterion("ParentPermissionId >", value, "parentPermissionId");
            return (Criteria) this;
        }

        public Criteria andParentPermissionIdGreaterThanOrEqualTo(String value) {
            addCriterion("ParentPermissionId >=", value, "parentPermissionId");
            return (Criteria) this;
        }

        public Criteria andParentPermissionIdLessThan(String value) {
            addCriterion("ParentPermissionId <", value, "parentPermissionId");
            return (Criteria) this;
        }

        public Criteria andParentPermissionIdLessThanOrEqualTo(String value) {
            addCriterion("ParentPermissionId <=", value, "parentPermissionId");
            return (Criteria) this;
        }

        public Criteria andParentPermissionIdLike(String value) {
            addCriterion("ParentPermissionId like", value, "parentPermissionId");
            return (Criteria) this;
        }

        public Criteria andParentPermissionIdNotLike(String value) {
            addCriterion("ParentPermissionId not like", value, "parentPermissionId");
            return (Criteria) this;
        }

        public Criteria andParentPermissionIdIn(List<String> values) {
            addCriterion("ParentPermissionId in", values, "parentPermissionId");
            return (Criteria) this;
        }

        public Criteria andParentPermissionIdNotIn(List<String> values) {
            addCriterion("ParentPermissionId not in", values, "parentPermissionId");
            return (Criteria) this;
        }

        public Criteria andParentPermissionIdBetween(String value1, String value2) {
            addCriterion("ParentPermissionId between", value1, value2, "parentPermissionId");
            return (Criteria) this;
        }

        public Criteria andParentPermissionIdNotBetween(String value1, String value2) {
            addCriterion("ParentPermissionId not between", value1, value2, "parentPermissionId");
            return (Criteria) this;
        }

        public Criteria andSeqIsNull() {
            addCriterion("Seq is null");
            return (Criteria) this;
        }

        public Criteria andSeqIsNotNull() {
            addCriterion("Seq is not null");
            return (Criteria) this;
        }

        public Criteria andSeqEqualTo(String value) {
            addCriterion("Seq =", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotEqualTo(String value) {
            addCriterion("Seq <>", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqGreaterThan(String value) {
            addCriterion("Seq >", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqGreaterThanOrEqualTo(String value) {
            addCriterion("Seq >=", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqLessThan(String value) {
            addCriterion("Seq <", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqLessThanOrEqualTo(String value) {
            addCriterion("Seq <=", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqLike(String value) {
            addCriterion("Seq like", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotLike(String value) {
            addCriterion("Seq not like", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqIn(List<String> values) {
            addCriterion("Seq in", values, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotIn(List<String> values) {
            addCriterion("Seq not in", values, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqBetween(String value1, String value2) {
            addCriterion("Seq between", value1, value2, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotBetween(String value1, String value2) {
            addCriterion("Seq not between", value1, value2, "seq");
            return (Criteria) this;
        }

        public Criteria andPageIsNull() {
            addCriterion("Page is null");
            return (Criteria) this;
        }

        public Criteria andPageIsNotNull() {
            addCriterion("Page is not null");
            return (Criteria) this;
        }

        public Criteria andPageEqualTo(String value) {
            addCriterion("Page =", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageNotEqualTo(String value) {
            addCriterion("Page <>", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageGreaterThan(String value) {
            addCriterion("Page >", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageGreaterThanOrEqualTo(String value) {
            addCriterion("Page >=", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageLessThan(String value) {
            addCriterion("Page <", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageLessThanOrEqualTo(String value) {
            addCriterion("Page <=", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageLike(String value) {
            addCriterion("Page like", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageNotLike(String value) {
            addCriterion("Page not like", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageIn(List<String> values) {
            addCriterion("Page in", values, "page");
            return (Criteria) this;
        }

        public Criteria andPageNotIn(List<String> values) {
            addCriterion("Page not in", values, "page");
            return (Criteria) this;
        }

        public Criteria andPageBetween(String value1, String value2) {
            addCriterion("Page between", value1, value2, "page");
            return (Criteria) this;
        }

        public Criteria andPageNotBetween(String value1, String value2) {
            addCriterion("Page not between", value1, value2, "page");
            return (Criteria) this;
        }

        public Criteria andCssClassIsNull() {
            addCriterion("CssClass is null");
            return (Criteria) this;
        }

        public Criteria andCssClassIsNotNull() {
            addCriterion("CssClass is not null");
            return (Criteria) this;
        }

        public Criteria andCssClassEqualTo(String value) {
            addCriterion("CssClass =", value, "cssClass");
            return (Criteria) this;
        }

        public Criteria andCssClassNotEqualTo(String value) {
            addCriterion("CssClass <>", value, "cssClass");
            return (Criteria) this;
        }

        public Criteria andCssClassGreaterThan(String value) {
            addCriterion("CssClass >", value, "cssClass");
            return (Criteria) this;
        }

        public Criteria andCssClassGreaterThanOrEqualTo(String value) {
            addCriterion("CssClass >=", value, "cssClass");
            return (Criteria) this;
        }

        public Criteria andCssClassLessThan(String value) {
            addCriterion("CssClass <", value, "cssClass");
            return (Criteria) this;
        }

        public Criteria andCssClassLessThanOrEqualTo(String value) {
            addCriterion("CssClass <=", value, "cssClass");
            return (Criteria) this;
        }

        public Criteria andCssClassLike(String value) {
            addCriterion("CssClass like", value, "cssClass");
            return (Criteria) this;
        }

        public Criteria andCssClassNotLike(String value) {
            addCriterion("CssClass not like", value, "cssClass");
            return (Criteria) this;
        }

        public Criteria andCssClassIn(List<String> values) {
            addCriterion("CssClass in", values, "cssClass");
            return (Criteria) this;
        }

        public Criteria andCssClassNotIn(List<String> values) {
            addCriterion("CssClass not in", values, "cssClass");
            return (Criteria) this;
        }

        public Criteria andCssClassBetween(String value1, String value2) {
            addCriterion("CssClass between", value1, value2, "cssClass");
            return (Criteria) this;
        }

        public Criteria andCssClassNotBetween(String value1, String value2) {
            addCriterion("CssClass not between", value1, value2, "cssClass");
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