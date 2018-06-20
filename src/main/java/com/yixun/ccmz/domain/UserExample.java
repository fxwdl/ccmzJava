package com.yixun.ccmz.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("UserId is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("UserId is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("UserId =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("UserId <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("UserId >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("UserId >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("UserId <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("UserId <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("UserId like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("UserId not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("UserId in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("UserId not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("UserId between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("UserId not between", value1, value2, "userId");
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

        public Criteria andUserNameIsNull() {
            addCriterion("UserName is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("UserName is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("UserName =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("UserName <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("UserName >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("UserName >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("UserName <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("UserName <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("UserName like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("UserName not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("UserName in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("UserName not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("UserName between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("UserName not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andLoweredUserNameIsNull() {
            addCriterion("LoweredUserName is null");
            return (Criteria) this;
        }

        public Criteria andLoweredUserNameIsNotNull() {
            addCriterion("LoweredUserName is not null");
            return (Criteria) this;
        }

        public Criteria andLoweredUserNameEqualTo(String value) {
            addCriterion("LoweredUserName =", value, "loweredUserName");
            return (Criteria) this;
        }

        public Criteria andLoweredUserNameNotEqualTo(String value) {
            addCriterion("LoweredUserName <>", value, "loweredUserName");
            return (Criteria) this;
        }

        public Criteria andLoweredUserNameGreaterThan(String value) {
            addCriterion("LoweredUserName >", value, "loweredUserName");
            return (Criteria) this;
        }

        public Criteria andLoweredUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("LoweredUserName >=", value, "loweredUserName");
            return (Criteria) this;
        }

        public Criteria andLoweredUserNameLessThan(String value) {
            addCriterion("LoweredUserName <", value, "loweredUserName");
            return (Criteria) this;
        }

        public Criteria andLoweredUserNameLessThanOrEqualTo(String value) {
            addCriterion("LoweredUserName <=", value, "loweredUserName");
            return (Criteria) this;
        }

        public Criteria andLoweredUserNameLike(String value) {
            addCriterion("LoweredUserName like", value, "loweredUserName");
            return (Criteria) this;
        }

        public Criteria andLoweredUserNameNotLike(String value) {
            addCriterion("LoweredUserName not like", value, "loweredUserName");
            return (Criteria) this;
        }

        public Criteria andLoweredUserNameIn(List<String> values) {
            addCriterion("LoweredUserName in", values, "loweredUserName");
            return (Criteria) this;
        }

        public Criteria andLoweredUserNameNotIn(List<String> values) {
            addCriterion("LoweredUserName not in", values, "loweredUserName");
            return (Criteria) this;
        }

        public Criteria andLoweredUserNameBetween(String value1, String value2) {
            addCriterion("LoweredUserName between", value1, value2, "loweredUserName");
            return (Criteria) this;
        }

        public Criteria andLoweredUserNameNotBetween(String value1, String value2) {
            addCriterion("LoweredUserName not between", value1, value2, "loweredUserName");
            return (Criteria) this;
        }

        public Criteria andMobileAliasIsNull() {
            addCriterion("MobileAlias is null");
            return (Criteria) this;
        }

        public Criteria andMobileAliasIsNotNull() {
            addCriterion("MobileAlias is not null");
            return (Criteria) this;
        }

        public Criteria andMobileAliasEqualTo(String value) {
            addCriterion("MobileAlias =", value, "mobileAlias");
            return (Criteria) this;
        }

        public Criteria andMobileAliasNotEqualTo(String value) {
            addCriterion("MobileAlias <>", value, "mobileAlias");
            return (Criteria) this;
        }

        public Criteria andMobileAliasGreaterThan(String value) {
            addCriterion("MobileAlias >", value, "mobileAlias");
            return (Criteria) this;
        }

        public Criteria andMobileAliasGreaterThanOrEqualTo(String value) {
            addCriterion("MobileAlias >=", value, "mobileAlias");
            return (Criteria) this;
        }

        public Criteria andMobileAliasLessThan(String value) {
            addCriterion("MobileAlias <", value, "mobileAlias");
            return (Criteria) this;
        }

        public Criteria andMobileAliasLessThanOrEqualTo(String value) {
            addCriterion("MobileAlias <=", value, "mobileAlias");
            return (Criteria) this;
        }

        public Criteria andMobileAliasLike(String value) {
            addCriterion("MobileAlias like", value, "mobileAlias");
            return (Criteria) this;
        }

        public Criteria andMobileAliasNotLike(String value) {
            addCriterion("MobileAlias not like", value, "mobileAlias");
            return (Criteria) this;
        }

        public Criteria andMobileAliasIn(List<String> values) {
            addCriterion("MobileAlias in", values, "mobileAlias");
            return (Criteria) this;
        }

        public Criteria andMobileAliasNotIn(List<String> values) {
            addCriterion("MobileAlias not in", values, "mobileAlias");
            return (Criteria) this;
        }

        public Criteria andMobileAliasBetween(String value1, String value2) {
            addCriterion("MobileAlias between", value1, value2, "mobileAlias");
            return (Criteria) this;
        }

        public Criteria andMobileAliasNotBetween(String value1, String value2) {
            addCriterion("MobileAlias not between", value1, value2, "mobileAlias");
            return (Criteria) this;
        }

        public Criteria andIsAnonymousIsNull() {
            addCriterion("IsAnonymous is null");
            return (Criteria) this;
        }

        public Criteria andIsAnonymousIsNotNull() {
            addCriterion("IsAnonymous is not null");
            return (Criteria) this;
        }

        public Criteria andIsAnonymousEqualTo(Boolean value) {
            addCriterion("IsAnonymous =", value, "isAnonymous");
            return (Criteria) this;
        }

        public Criteria andIsAnonymousNotEqualTo(Boolean value) {
            addCriterion("IsAnonymous <>", value, "isAnonymous");
            return (Criteria) this;
        }

        public Criteria andIsAnonymousGreaterThan(Boolean value) {
            addCriterion("IsAnonymous >", value, "isAnonymous");
            return (Criteria) this;
        }

        public Criteria andIsAnonymousGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsAnonymous >=", value, "isAnonymous");
            return (Criteria) this;
        }

        public Criteria andIsAnonymousLessThan(Boolean value) {
            addCriterion("IsAnonymous <", value, "isAnonymous");
            return (Criteria) this;
        }

        public Criteria andIsAnonymousLessThanOrEqualTo(Boolean value) {
            addCriterion("IsAnonymous <=", value, "isAnonymous");
            return (Criteria) this;
        }

        public Criteria andIsAnonymousIn(List<Boolean> values) {
            addCriterion("IsAnonymous in", values, "isAnonymous");
            return (Criteria) this;
        }

        public Criteria andIsAnonymousNotIn(List<Boolean> values) {
            addCriterion("IsAnonymous not in", values, "isAnonymous");
            return (Criteria) this;
        }

        public Criteria andIsAnonymousBetween(Boolean value1, Boolean value2) {
            addCriterion("IsAnonymous between", value1, value2, "isAnonymous");
            return (Criteria) this;
        }

        public Criteria andIsAnonymousNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsAnonymous not between", value1, value2, "isAnonymous");
            return (Criteria) this;
        }

        public Criteria andLastActivityDateIsNull() {
            addCriterion("LastActivityDate is null");
            return (Criteria) this;
        }

        public Criteria andLastActivityDateIsNotNull() {
            addCriterion("LastActivityDate is not null");
            return (Criteria) this;
        }

        public Criteria andLastActivityDateEqualTo(Date value) {
            addCriterion("LastActivityDate =", value, "lastActivityDate");
            return (Criteria) this;
        }

        public Criteria andLastActivityDateNotEqualTo(Date value) {
            addCriterion("LastActivityDate <>", value, "lastActivityDate");
            return (Criteria) this;
        }

        public Criteria andLastActivityDateGreaterThan(Date value) {
            addCriterion("LastActivityDate >", value, "lastActivityDate");
            return (Criteria) this;
        }

        public Criteria andLastActivityDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LastActivityDate >=", value, "lastActivityDate");
            return (Criteria) this;
        }

        public Criteria andLastActivityDateLessThan(Date value) {
            addCriterion("LastActivityDate <", value, "lastActivityDate");
            return (Criteria) this;
        }

        public Criteria andLastActivityDateLessThanOrEqualTo(Date value) {
            addCriterion("LastActivityDate <=", value, "lastActivityDate");
            return (Criteria) this;
        }

        public Criteria andLastActivityDateIn(List<Date> values) {
            addCriterion("LastActivityDate in", values, "lastActivityDate");
            return (Criteria) this;
        }

        public Criteria andLastActivityDateNotIn(List<Date> values) {
            addCriterion("LastActivityDate not in", values, "lastActivityDate");
            return (Criteria) this;
        }

        public Criteria andLastActivityDateBetween(Date value1, Date value2) {
            addCriterion("LastActivityDate between", value1, value2, "lastActivityDate");
            return (Criteria) this;
        }

        public Criteria andLastActivityDateNotBetween(Date value1, Date value2) {
            addCriterion("LastActivityDate not between", value1, value2, "lastActivityDate");
            return (Criteria) this;
        }

        public Criteria andGovDeptFullCodeIsNull() {
            addCriterion("GovDeptFullCode is null");
            return (Criteria) this;
        }

        public Criteria andGovDeptFullCodeIsNotNull() {
            addCriterion("GovDeptFullCode is not null");
            return (Criteria) this;
        }

        public Criteria andGovDeptFullCodeEqualTo(String value) {
            addCriterion("GovDeptFullCode =", value, "govDeptFullCode");
            return (Criteria) this;
        }

        public Criteria andGovDeptFullCodeNotEqualTo(String value) {
            addCriterion("GovDeptFullCode <>", value, "govDeptFullCode");
            return (Criteria) this;
        }

        public Criteria andGovDeptFullCodeGreaterThan(String value) {
            addCriterion("GovDeptFullCode >", value, "govDeptFullCode");
            return (Criteria) this;
        }

        public Criteria andGovDeptFullCodeGreaterThanOrEqualTo(String value) {
            addCriterion("GovDeptFullCode >=", value, "govDeptFullCode");
            return (Criteria) this;
        }

        public Criteria andGovDeptFullCodeLessThan(String value) {
            addCriterion("GovDeptFullCode <", value, "govDeptFullCode");
            return (Criteria) this;
        }

        public Criteria andGovDeptFullCodeLessThanOrEqualTo(String value) {
            addCriterion("GovDeptFullCode <=", value, "govDeptFullCode");
            return (Criteria) this;
        }

        public Criteria andGovDeptFullCodeLike(String value) {
            addCriterion("GovDeptFullCode like", value, "govDeptFullCode");
            return (Criteria) this;
        }

        public Criteria andGovDeptFullCodeNotLike(String value) {
            addCriterion("GovDeptFullCode not like", value, "govDeptFullCode");
            return (Criteria) this;
        }

        public Criteria andGovDeptFullCodeIn(List<String> values) {
            addCriterion("GovDeptFullCode in", values, "govDeptFullCode");
            return (Criteria) this;
        }

        public Criteria andGovDeptFullCodeNotIn(List<String> values) {
            addCriterion("GovDeptFullCode not in", values, "govDeptFullCode");
            return (Criteria) this;
        }

        public Criteria andGovDeptFullCodeBetween(String value1, String value2) {
            addCriterion("GovDeptFullCode between", value1, value2, "govDeptFullCode");
            return (Criteria) this;
        }

        public Criteria andGovDeptFullCodeNotBetween(String value1, String value2) {
            addCriterion("GovDeptFullCode not between", value1, value2, "govDeptFullCode");
            return (Criteria) this;
        }

        public Criteria andHospitalIDIsNull() {
            addCriterion("HospitalID is null");
            return (Criteria) this;
        }

        public Criteria andHospitalIDIsNotNull() {
            addCriterion("HospitalID is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalIDEqualTo(String value) {
            addCriterion("HospitalID =", value, "hospitalID");
            return (Criteria) this;
        }

        public Criteria andHospitalIDNotEqualTo(String value) {
            addCriterion("HospitalID <>", value, "hospitalID");
            return (Criteria) this;
        }

        public Criteria andHospitalIDGreaterThan(String value) {
            addCriterion("HospitalID >", value, "hospitalID");
            return (Criteria) this;
        }

        public Criteria andHospitalIDGreaterThanOrEqualTo(String value) {
            addCriterion("HospitalID >=", value, "hospitalID");
            return (Criteria) this;
        }

        public Criteria andHospitalIDLessThan(String value) {
            addCriterion("HospitalID <", value, "hospitalID");
            return (Criteria) this;
        }

        public Criteria andHospitalIDLessThanOrEqualTo(String value) {
            addCriterion("HospitalID <=", value, "hospitalID");
            return (Criteria) this;
        }

        public Criteria andHospitalIDLike(String value) {
            addCriterion("HospitalID like", value, "hospitalID");
            return (Criteria) this;
        }

        public Criteria andHospitalIDNotLike(String value) {
            addCriterion("HospitalID not like", value, "hospitalID");
            return (Criteria) this;
        }

        public Criteria andHospitalIDIn(List<String> values) {
            addCriterion("HospitalID in", values, "hospitalID");
            return (Criteria) this;
        }

        public Criteria andHospitalIDNotIn(List<String> values) {
            addCriterion("HospitalID not in", values, "hospitalID");
            return (Criteria) this;
        }

        public Criteria andHospitalIDBetween(String value1, String value2) {
            addCriterion("HospitalID between", value1, value2, "hospitalID");
            return (Criteria) this;
        }

        public Criteria andHospitalIDNotBetween(String value1, String value2) {
            addCriterion("HospitalID not between", value1, value2, "hospitalID");
            return (Criteria) this;
        }

        public Criteria andCNNameIsNull() {
            addCriterion("CNName is null");
            return (Criteria) this;
        }

        public Criteria andCNNameIsNotNull() {
            addCriterion("CNName is not null");
            return (Criteria) this;
        }

        public Criteria andCNNameEqualTo(String value) {
            addCriterion("CNName =", value, "CNName");
            return (Criteria) this;
        }

        public Criteria andCNNameNotEqualTo(String value) {
            addCriterion("CNName <>", value, "CNName");
            return (Criteria) this;
        }

        public Criteria andCNNameGreaterThan(String value) {
            addCriterion("CNName >", value, "CNName");
            return (Criteria) this;
        }

        public Criteria andCNNameGreaterThanOrEqualTo(String value) {
            addCriterion("CNName >=", value, "CNName");
            return (Criteria) this;
        }

        public Criteria andCNNameLessThan(String value) {
            addCriterion("CNName <", value, "CNName");
            return (Criteria) this;
        }

        public Criteria andCNNameLessThanOrEqualTo(String value) {
            addCriterion("CNName <=", value, "CNName");
            return (Criteria) this;
        }

        public Criteria andCNNameLike(String value) {
            addCriterion("CNName like", value, "CNName");
            return (Criteria) this;
        }

        public Criteria andCNNameNotLike(String value) {
            addCriterion("CNName not like", value, "CNName");
            return (Criteria) this;
        }

        public Criteria andCNNameIn(List<String> values) {
            addCriterion("CNName in", values, "CNName");
            return (Criteria) this;
        }

        public Criteria andCNNameNotIn(List<String> values) {
            addCriterion("CNName not in", values, "CNName");
            return (Criteria) this;
        }

        public Criteria andCNNameBetween(String value1, String value2) {
            addCriterion("CNName between", value1, value2, "CNName");
            return (Criteria) this;
        }

        public Criteria andCNNameNotBetween(String value1, String value2) {
            addCriterion("CNName not between", value1, value2, "CNName");
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