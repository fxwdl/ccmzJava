package com.yixun.ccmz.domain;

import com.rosegun.plugin.Page;
import java.util.ArrayList;
import java.util.List;

public class RoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public RoleExample() {
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

    public void setPage(Page page) {
        this.page=page;
    }

    public Page getPage() {
        return page;
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

        public Criteria andRoleIdIsNull() {
            addCriterion("RoleId is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("RoleId is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(String value) {
            addCriterion("RoleId =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(String value) {
            addCriterion("RoleId <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(String value) {
            addCriterion("RoleId >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(String value) {
            addCriterion("RoleId >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(String value) {
            addCriterion("RoleId <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(String value) {
            addCriterion("RoleId <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLike(String value) {
            addCriterion("RoleId like", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotLike(String value) {
            addCriterion("RoleId not like", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<String> values) {
            addCriterion("RoleId in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<String> values) {
            addCriterion("RoleId not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(String value1, String value2) {
            addCriterion("RoleId between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(String value1, String value2) {
            addCriterion("RoleId not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdIsNull() {
            addCriterion("ApplicationId is null");
            return (Criteria) this;
        }

        public Criteria andApplicationIdIsNotNull() {
            addCriterion("ApplicationId is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationIdEqualTo(String value) {
            addCriterion("ApplicationId =", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdNotEqualTo(String value) {
            addCriterion("ApplicationId <>", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdGreaterThan(String value) {
            addCriterion("ApplicationId >", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdGreaterThanOrEqualTo(String value) {
            addCriterion("ApplicationId >=", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdLessThan(String value) {
            addCriterion("ApplicationId <", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdLessThanOrEqualTo(String value) {
            addCriterion("ApplicationId <=", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdLike(String value) {
            addCriterion("ApplicationId like", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdNotLike(String value) {
            addCriterion("ApplicationId not like", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdIn(List<String> values) {
            addCriterion("ApplicationId in", values, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdNotIn(List<String> values) {
            addCriterion("ApplicationId not in", values, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdBetween(String value1, String value2) {
            addCriterion("ApplicationId between", value1, value2, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdNotBetween(String value1, String value2) {
            addCriterion("ApplicationId not between", value1, value2, "applicationId");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNull() {
            addCriterion("RoleName is null");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNotNull() {
            addCriterion("RoleName is not null");
            return (Criteria) this;
        }

        public Criteria andRoleNameEqualTo(String value) {
            addCriterion("RoleName =", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotEqualTo(String value) {
            addCriterion("RoleName <>", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThan(String value) {
            addCriterion("RoleName >", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThanOrEqualTo(String value) {
            addCriterion("RoleName >=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThan(String value) {
            addCriterion("RoleName <", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThanOrEqualTo(String value) {
            addCriterion("RoleName <=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLike(String value) {
            addCriterion("RoleName like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotLike(String value) {
            addCriterion("RoleName not like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameIn(List<String> values) {
            addCriterion("RoleName in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotIn(List<String> values) {
            addCriterion("RoleName not in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameBetween(String value1, String value2) {
            addCriterion("RoleName between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotBetween(String value1, String value2) {
            addCriterion("RoleName not between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andLoweredRoleNameIsNull() {
            addCriterion("LoweredRoleName is null");
            return (Criteria) this;
        }

        public Criteria andLoweredRoleNameIsNotNull() {
            addCriterion("LoweredRoleName is not null");
            return (Criteria) this;
        }

        public Criteria andLoweredRoleNameEqualTo(String value) {
            addCriterion("LoweredRoleName =", value, "loweredRoleName");
            return (Criteria) this;
        }

        public Criteria andLoweredRoleNameNotEqualTo(String value) {
            addCriterion("LoweredRoleName <>", value, "loweredRoleName");
            return (Criteria) this;
        }

        public Criteria andLoweredRoleNameGreaterThan(String value) {
            addCriterion("LoweredRoleName >", value, "loweredRoleName");
            return (Criteria) this;
        }

        public Criteria andLoweredRoleNameGreaterThanOrEqualTo(String value) {
            addCriterion("LoweredRoleName >=", value, "loweredRoleName");
            return (Criteria) this;
        }

        public Criteria andLoweredRoleNameLessThan(String value) {
            addCriterion("LoweredRoleName <", value, "loweredRoleName");
            return (Criteria) this;
        }

        public Criteria andLoweredRoleNameLessThanOrEqualTo(String value) {
            addCriterion("LoweredRoleName <=", value, "loweredRoleName");
            return (Criteria) this;
        }

        public Criteria andLoweredRoleNameLike(String value) {
            addCriterion("LoweredRoleName like", value, "loweredRoleName");
            return (Criteria) this;
        }

        public Criteria andLoweredRoleNameNotLike(String value) {
            addCriterion("LoweredRoleName not like", value, "loweredRoleName");
            return (Criteria) this;
        }

        public Criteria andLoweredRoleNameIn(List<String> values) {
            addCriterion("LoweredRoleName in", values, "loweredRoleName");
            return (Criteria) this;
        }

        public Criteria andLoweredRoleNameNotIn(List<String> values) {
            addCriterion("LoweredRoleName not in", values, "loweredRoleName");
            return (Criteria) this;
        }

        public Criteria andLoweredRoleNameBetween(String value1, String value2) {
            addCriterion("LoweredRoleName between", value1, value2, "loweredRoleName");
            return (Criteria) this;
        }

        public Criteria andLoweredRoleNameNotBetween(String value1, String value2) {
            addCriterion("LoweredRoleName not between", value1, value2, "loweredRoleName");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("Description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("Description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("Description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("Description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("Description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("Description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("Description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("Description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("Description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("Description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("Description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("Description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("Description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("Description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andLevel1IsNull() {
            addCriterion("Level1 is null");
            return (Criteria) this;
        }

        public Criteria andLevel1IsNotNull() {
            addCriterion("Level1 is not null");
            return (Criteria) this;
        }

        public Criteria andLevel1EqualTo(Boolean value) {
            addCriterion("Level1 =", value, "level1");
            return (Criteria) this;
        }

        public Criteria andLevel1NotEqualTo(Boolean value) {
            addCriterion("Level1 <>", value, "level1");
            return (Criteria) this;
        }

        public Criteria andLevel1GreaterThan(Boolean value) {
            addCriterion("Level1 >", value, "level1");
            return (Criteria) this;
        }

        public Criteria andLevel1GreaterThanOrEqualTo(Boolean value) {
            addCriterion("Level1 >=", value, "level1");
            return (Criteria) this;
        }

        public Criteria andLevel1LessThan(Boolean value) {
            addCriterion("Level1 <", value, "level1");
            return (Criteria) this;
        }

        public Criteria andLevel1LessThanOrEqualTo(Boolean value) {
            addCriterion("Level1 <=", value, "level1");
            return (Criteria) this;
        }

        public Criteria andLevel1In(List<Boolean> values) {
            addCriterion("Level1 in", values, "level1");
            return (Criteria) this;
        }

        public Criteria andLevel1NotIn(List<Boolean> values) {
            addCriterion("Level1 not in", values, "level1");
            return (Criteria) this;
        }

        public Criteria andLevel1Between(Boolean value1, Boolean value2) {
            addCriterion("Level1 between", value1, value2, "level1");
            return (Criteria) this;
        }

        public Criteria andLevel1NotBetween(Boolean value1, Boolean value2) {
            addCriterion("Level1 not between", value1, value2, "level1");
            return (Criteria) this;
        }

        public Criteria andLevel2IsNull() {
            addCriterion("Level2 is null");
            return (Criteria) this;
        }

        public Criteria andLevel2IsNotNull() {
            addCriterion("Level2 is not null");
            return (Criteria) this;
        }

        public Criteria andLevel2EqualTo(Boolean value) {
            addCriterion("Level2 =", value, "level2");
            return (Criteria) this;
        }

        public Criteria andLevel2NotEqualTo(Boolean value) {
            addCriterion("Level2 <>", value, "level2");
            return (Criteria) this;
        }

        public Criteria andLevel2GreaterThan(Boolean value) {
            addCriterion("Level2 >", value, "level2");
            return (Criteria) this;
        }

        public Criteria andLevel2GreaterThanOrEqualTo(Boolean value) {
            addCriterion("Level2 >=", value, "level2");
            return (Criteria) this;
        }

        public Criteria andLevel2LessThan(Boolean value) {
            addCriterion("Level2 <", value, "level2");
            return (Criteria) this;
        }

        public Criteria andLevel2LessThanOrEqualTo(Boolean value) {
            addCriterion("Level2 <=", value, "level2");
            return (Criteria) this;
        }

        public Criteria andLevel2In(List<Boolean> values) {
            addCriterion("Level2 in", values, "level2");
            return (Criteria) this;
        }

        public Criteria andLevel2NotIn(List<Boolean> values) {
            addCriterion("Level2 not in", values, "level2");
            return (Criteria) this;
        }

        public Criteria andLevel2Between(Boolean value1, Boolean value2) {
            addCriterion("Level2 between", value1, value2, "level2");
            return (Criteria) this;
        }

        public Criteria andLevel2NotBetween(Boolean value1, Boolean value2) {
            addCriterion("Level2 not between", value1, value2, "level2");
            return (Criteria) this;
        }

        public Criteria andLevel3IsNull() {
            addCriterion("Level3 is null");
            return (Criteria) this;
        }

        public Criteria andLevel3IsNotNull() {
            addCriterion("Level3 is not null");
            return (Criteria) this;
        }

        public Criteria andLevel3EqualTo(Boolean value) {
            addCriterion("Level3 =", value, "level3");
            return (Criteria) this;
        }

        public Criteria andLevel3NotEqualTo(Boolean value) {
            addCriterion("Level3 <>", value, "level3");
            return (Criteria) this;
        }

        public Criteria andLevel3GreaterThan(Boolean value) {
            addCriterion("Level3 >", value, "level3");
            return (Criteria) this;
        }

        public Criteria andLevel3GreaterThanOrEqualTo(Boolean value) {
            addCriterion("Level3 >=", value, "level3");
            return (Criteria) this;
        }

        public Criteria andLevel3LessThan(Boolean value) {
            addCriterion("Level3 <", value, "level3");
            return (Criteria) this;
        }

        public Criteria andLevel3LessThanOrEqualTo(Boolean value) {
            addCriterion("Level3 <=", value, "level3");
            return (Criteria) this;
        }

        public Criteria andLevel3In(List<Boolean> values) {
            addCriterion("Level3 in", values, "level3");
            return (Criteria) this;
        }

        public Criteria andLevel3NotIn(List<Boolean> values) {
            addCriterion("Level3 not in", values, "level3");
            return (Criteria) this;
        }

        public Criteria andLevel3Between(Boolean value1, Boolean value2) {
            addCriterion("Level3 between", value1, value2, "level3");
            return (Criteria) this;
        }

        public Criteria andLevel3NotBetween(Boolean value1, Boolean value2) {
            addCriterion("Level3 not between", value1, value2, "level3");
            return (Criteria) this;
        }

        public Criteria andLevel4IsNull() {
            addCriterion("Level4 is null");
            return (Criteria) this;
        }

        public Criteria andLevel4IsNotNull() {
            addCriterion("Level4 is not null");
            return (Criteria) this;
        }

        public Criteria andLevel4EqualTo(Boolean value) {
            addCriterion("Level4 =", value, "level4");
            return (Criteria) this;
        }

        public Criteria andLevel4NotEqualTo(Boolean value) {
            addCriterion("Level4 <>", value, "level4");
            return (Criteria) this;
        }

        public Criteria andLevel4GreaterThan(Boolean value) {
            addCriterion("Level4 >", value, "level4");
            return (Criteria) this;
        }

        public Criteria andLevel4GreaterThanOrEqualTo(Boolean value) {
            addCriterion("Level4 >=", value, "level4");
            return (Criteria) this;
        }

        public Criteria andLevel4LessThan(Boolean value) {
            addCriterion("Level4 <", value, "level4");
            return (Criteria) this;
        }

        public Criteria andLevel4LessThanOrEqualTo(Boolean value) {
            addCriterion("Level4 <=", value, "level4");
            return (Criteria) this;
        }

        public Criteria andLevel4In(List<Boolean> values) {
            addCriterion("Level4 in", values, "level4");
            return (Criteria) this;
        }

        public Criteria andLevel4NotIn(List<Boolean> values) {
            addCriterion("Level4 not in", values, "level4");
            return (Criteria) this;
        }

        public Criteria andLevel4Between(Boolean value1, Boolean value2) {
            addCriterion("Level4 between", value1, value2, "level4");
            return (Criteria) this;
        }

        public Criteria andLevel4NotBetween(Boolean value1, Boolean value2) {
            addCriterion("Level4 not between", value1, value2, "level4");
            return (Criteria) this;
        }

        public Criteria andHosiptal_FlagIsNull() {
            addCriterion("Hosiptal_Flag is null");
            return (Criteria) this;
        }

        public Criteria andHosiptal_FlagIsNotNull() {
            addCriterion("Hosiptal_Flag is not null");
            return (Criteria) this;
        }

        public Criteria andHosiptal_FlagEqualTo(Boolean value) {
            addCriterion("Hosiptal_Flag =", value, "hosiptal_Flag");
            return (Criteria) this;
        }

        public Criteria andHosiptal_FlagNotEqualTo(Boolean value) {
            addCriterion("Hosiptal_Flag <>", value, "hosiptal_Flag");
            return (Criteria) this;
        }

        public Criteria andHosiptal_FlagGreaterThan(Boolean value) {
            addCriterion("Hosiptal_Flag >", value, "hosiptal_Flag");
            return (Criteria) this;
        }

        public Criteria andHosiptal_FlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("Hosiptal_Flag >=", value, "hosiptal_Flag");
            return (Criteria) this;
        }

        public Criteria andHosiptal_FlagLessThan(Boolean value) {
            addCriterion("Hosiptal_Flag <", value, "hosiptal_Flag");
            return (Criteria) this;
        }

        public Criteria andHosiptal_FlagLessThanOrEqualTo(Boolean value) {
            addCriterion("Hosiptal_Flag <=", value, "hosiptal_Flag");
            return (Criteria) this;
        }

        public Criteria andHosiptal_FlagIn(List<Boolean> values) {
            addCriterion("Hosiptal_Flag in", values, "hosiptal_Flag");
            return (Criteria) this;
        }

        public Criteria andHosiptal_FlagNotIn(List<Boolean> values) {
            addCriterion("Hosiptal_Flag not in", values, "hosiptal_Flag");
            return (Criteria) this;
        }

        public Criteria andHosiptal_FlagBetween(Boolean value1, Boolean value2) {
            addCriterion("Hosiptal_Flag between", value1, value2, "hosiptal_Flag");
            return (Criteria) this;
        }

        public Criteria andHosiptal_FlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("Hosiptal_Flag not between", value1, value2, "hosiptal_Flag");
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

        public Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        public Criterion(String condition, Object value, String typeHandler) {
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

        public Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        public Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        public Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}