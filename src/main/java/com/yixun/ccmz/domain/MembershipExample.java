package com.yixun.ccmz.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MembershipExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MembershipExample() {
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

        public Criteria andPasswordIsNull() {
            addCriterion("`Password` is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("`Password` is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("`Password` =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("`Password` <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("`Password` >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("`Password` >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("`Password` <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("`Password` <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("`Password` like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("`Password` not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("`Password` in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("`Password` not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("`Password` between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("`Password` not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordFormatIsNull() {
            addCriterion("PasswordFormat is null");
            return (Criteria) this;
        }

        public Criteria andPasswordFormatIsNotNull() {
            addCriterion("PasswordFormat is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordFormatEqualTo(Integer value) {
            addCriterion("PasswordFormat =", value, "passwordFormat");
            return (Criteria) this;
        }

        public Criteria andPasswordFormatNotEqualTo(Integer value) {
            addCriterion("PasswordFormat <>", value, "passwordFormat");
            return (Criteria) this;
        }

        public Criteria andPasswordFormatGreaterThan(Integer value) {
            addCriterion("PasswordFormat >", value, "passwordFormat");
            return (Criteria) this;
        }

        public Criteria andPasswordFormatGreaterThanOrEqualTo(Integer value) {
            addCriterion("PasswordFormat >=", value, "passwordFormat");
            return (Criteria) this;
        }

        public Criteria andPasswordFormatLessThan(Integer value) {
            addCriterion("PasswordFormat <", value, "passwordFormat");
            return (Criteria) this;
        }

        public Criteria andPasswordFormatLessThanOrEqualTo(Integer value) {
            addCriterion("PasswordFormat <=", value, "passwordFormat");
            return (Criteria) this;
        }

        public Criteria andPasswordFormatIn(List<Integer> values) {
            addCriterion("PasswordFormat in", values, "passwordFormat");
            return (Criteria) this;
        }

        public Criteria andPasswordFormatNotIn(List<Integer> values) {
            addCriterion("PasswordFormat not in", values, "passwordFormat");
            return (Criteria) this;
        }

        public Criteria andPasswordFormatBetween(Integer value1, Integer value2) {
            addCriterion("PasswordFormat between", value1, value2, "passwordFormat");
            return (Criteria) this;
        }

        public Criteria andPasswordFormatNotBetween(Integer value1, Integer value2) {
            addCriterion("PasswordFormat not between", value1, value2, "passwordFormat");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltIsNull() {
            addCriterion("PasswordSalt is null");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltIsNotNull() {
            addCriterion("PasswordSalt is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltEqualTo(String value) {
            addCriterion("PasswordSalt =", value, "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltNotEqualTo(String value) {
            addCriterion("PasswordSalt <>", value, "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltGreaterThan(String value) {
            addCriterion("PasswordSalt >", value, "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltGreaterThanOrEqualTo(String value) {
            addCriterion("PasswordSalt >=", value, "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltLessThan(String value) {
            addCriterion("PasswordSalt <", value, "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltLessThanOrEqualTo(String value) {
            addCriterion("PasswordSalt <=", value, "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltLike(String value) {
            addCriterion("PasswordSalt like", value, "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltNotLike(String value) {
            addCriterion("PasswordSalt not like", value, "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltIn(List<String> values) {
            addCriterion("PasswordSalt in", values, "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltNotIn(List<String> values) {
            addCriterion("PasswordSalt not in", values, "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltBetween(String value1, String value2) {
            addCriterion("PasswordSalt between", value1, value2, "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltNotBetween(String value1, String value2) {
            addCriterion("PasswordSalt not between", value1, value2, "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andMobilePINIsNull() {
            addCriterion("MobilePIN is null");
            return (Criteria) this;
        }

        public Criteria andMobilePINIsNotNull() {
            addCriterion("MobilePIN is not null");
            return (Criteria) this;
        }

        public Criteria andMobilePINEqualTo(String value) {
            addCriterion("MobilePIN =", value, "mobilePIN");
            return (Criteria) this;
        }

        public Criteria andMobilePINNotEqualTo(String value) {
            addCriterion("MobilePIN <>", value, "mobilePIN");
            return (Criteria) this;
        }

        public Criteria andMobilePINGreaterThan(String value) {
            addCriterion("MobilePIN >", value, "mobilePIN");
            return (Criteria) this;
        }

        public Criteria andMobilePINGreaterThanOrEqualTo(String value) {
            addCriterion("MobilePIN >=", value, "mobilePIN");
            return (Criteria) this;
        }

        public Criteria andMobilePINLessThan(String value) {
            addCriterion("MobilePIN <", value, "mobilePIN");
            return (Criteria) this;
        }

        public Criteria andMobilePINLessThanOrEqualTo(String value) {
            addCriterion("MobilePIN <=", value, "mobilePIN");
            return (Criteria) this;
        }

        public Criteria andMobilePINLike(String value) {
            addCriterion("MobilePIN like", value, "mobilePIN");
            return (Criteria) this;
        }

        public Criteria andMobilePINNotLike(String value) {
            addCriterion("MobilePIN not like", value, "mobilePIN");
            return (Criteria) this;
        }

        public Criteria andMobilePINIn(List<String> values) {
            addCriterion("MobilePIN in", values, "mobilePIN");
            return (Criteria) this;
        }

        public Criteria andMobilePINNotIn(List<String> values) {
            addCriterion("MobilePIN not in", values, "mobilePIN");
            return (Criteria) this;
        }

        public Criteria andMobilePINBetween(String value1, String value2) {
            addCriterion("MobilePIN between", value1, value2, "mobilePIN");
            return (Criteria) this;
        }

        public Criteria andMobilePINNotBetween(String value1, String value2) {
            addCriterion("MobilePIN not between", value1, value2, "mobilePIN");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("Email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("Email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("Email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("Email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("Email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("Email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("Email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("Email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("Email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("Email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("Email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("Email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("Email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("Email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andLoweredEmailIsNull() {
            addCriterion("LoweredEmail is null");
            return (Criteria) this;
        }

        public Criteria andLoweredEmailIsNotNull() {
            addCriterion("LoweredEmail is not null");
            return (Criteria) this;
        }

        public Criteria andLoweredEmailEqualTo(String value) {
            addCriterion("LoweredEmail =", value, "loweredEmail");
            return (Criteria) this;
        }

        public Criteria andLoweredEmailNotEqualTo(String value) {
            addCriterion("LoweredEmail <>", value, "loweredEmail");
            return (Criteria) this;
        }

        public Criteria andLoweredEmailGreaterThan(String value) {
            addCriterion("LoweredEmail >", value, "loweredEmail");
            return (Criteria) this;
        }

        public Criteria andLoweredEmailGreaterThanOrEqualTo(String value) {
            addCriterion("LoweredEmail >=", value, "loweredEmail");
            return (Criteria) this;
        }

        public Criteria andLoweredEmailLessThan(String value) {
            addCriterion("LoweredEmail <", value, "loweredEmail");
            return (Criteria) this;
        }

        public Criteria andLoweredEmailLessThanOrEqualTo(String value) {
            addCriterion("LoweredEmail <=", value, "loweredEmail");
            return (Criteria) this;
        }

        public Criteria andLoweredEmailLike(String value) {
            addCriterion("LoweredEmail like", value, "loweredEmail");
            return (Criteria) this;
        }

        public Criteria andLoweredEmailNotLike(String value) {
            addCriterion("LoweredEmail not like", value, "loweredEmail");
            return (Criteria) this;
        }

        public Criteria andLoweredEmailIn(List<String> values) {
            addCriterion("LoweredEmail in", values, "loweredEmail");
            return (Criteria) this;
        }

        public Criteria andLoweredEmailNotIn(List<String> values) {
            addCriterion("LoweredEmail not in", values, "loweredEmail");
            return (Criteria) this;
        }

        public Criteria andLoweredEmailBetween(String value1, String value2) {
            addCriterion("LoweredEmail between", value1, value2, "loweredEmail");
            return (Criteria) this;
        }

        public Criteria andLoweredEmailNotBetween(String value1, String value2) {
            addCriterion("LoweredEmail not between", value1, value2, "loweredEmail");
            return (Criteria) this;
        }

        public Criteria andPasswordQuestionIsNull() {
            addCriterion("PasswordQuestion is null");
            return (Criteria) this;
        }

        public Criteria andPasswordQuestionIsNotNull() {
            addCriterion("PasswordQuestion is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordQuestionEqualTo(String value) {
            addCriterion("PasswordQuestion =", value, "passwordQuestion");
            return (Criteria) this;
        }

        public Criteria andPasswordQuestionNotEqualTo(String value) {
            addCriterion("PasswordQuestion <>", value, "passwordQuestion");
            return (Criteria) this;
        }

        public Criteria andPasswordQuestionGreaterThan(String value) {
            addCriterion("PasswordQuestion >", value, "passwordQuestion");
            return (Criteria) this;
        }

        public Criteria andPasswordQuestionGreaterThanOrEqualTo(String value) {
            addCriterion("PasswordQuestion >=", value, "passwordQuestion");
            return (Criteria) this;
        }

        public Criteria andPasswordQuestionLessThan(String value) {
            addCriterion("PasswordQuestion <", value, "passwordQuestion");
            return (Criteria) this;
        }

        public Criteria andPasswordQuestionLessThanOrEqualTo(String value) {
            addCriterion("PasswordQuestion <=", value, "passwordQuestion");
            return (Criteria) this;
        }

        public Criteria andPasswordQuestionLike(String value) {
            addCriterion("PasswordQuestion like", value, "passwordQuestion");
            return (Criteria) this;
        }

        public Criteria andPasswordQuestionNotLike(String value) {
            addCriterion("PasswordQuestion not like", value, "passwordQuestion");
            return (Criteria) this;
        }

        public Criteria andPasswordQuestionIn(List<String> values) {
            addCriterion("PasswordQuestion in", values, "passwordQuestion");
            return (Criteria) this;
        }

        public Criteria andPasswordQuestionNotIn(List<String> values) {
            addCriterion("PasswordQuestion not in", values, "passwordQuestion");
            return (Criteria) this;
        }

        public Criteria andPasswordQuestionBetween(String value1, String value2) {
            addCriterion("PasswordQuestion between", value1, value2, "passwordQuestion");
            return (Criteria) this;
        }

        public Criteria andPasswordQuestionNotBetween(String value1, String value2) {
            addCriterion("PasswordQuestion not between", value1, value2, "passwordQuestion");
            return (Criteria) this;
        }

        public Criteria andPasswordAnswerIsNull() {
            addCriterion("PasswordAnswer is null");
            return (Criteria) this;
        }

        public Criteria andPasswordAnswerIsNotNull() {
            addCriterion("PasswordAnswer is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordAnswerEqualTo(String value) {
            addCriterion("PasswordAnswer =", value, "passwordAnswer");
            return (Criteria) this;
        }

        public Criteria andPasswordAnswerNotEqualTo(String value) {
            addCriterion("PasswordAnswer <>", value, "passwordAnswer");
            return (Criteria) this;
        }

        public Criteria andPasswordAnswerGreaterThan(String value) {
            addCriterion("PasswordAnswer >", value, "passwordAnswer");
            return (Criteria) this;
        }

        public Criteria andPasswordAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("PasswordAnswer >=", value, "passwordAnswer");
            return (Criteria) this;
        }

        public Criteria andPasswordAnswerLessThan(String value) {
            addCriterion("PasswordAnswer <", value, "passwordAnswer");
            return (Criteria) this;
        }

        public Criteria andPasswordAnswerLessThanOrEqualTo(String value) {
            addCriterion("PasswordAnswer <=", value, "passwordAnswer");
            return (Criteria) this;
        }

        public Criteria andPasswordAnswerLike(String value) {
            addCriterion("PasswordAnswer like", value, "passwordAnswer");
            return (Criteria) this;
        }

        public Criteria andPasswordAnswerNotLike(String value) {
            addCriterion("PasswordAnswer not like", value, "passwordAnswer");
            return (Criteria) this;
        }

        public Criteria andPasswordAnswerIn(List<String> values) {
            addCriterion("PasswordAnswer in", values, "passwordAnswer");
            return (Criteria) this;
        }

        public Criteria andPasswordAnswerNotIn(List<String> values) {
            addCriterion("PasswordAnswer not in", values, "passwordAnswer");
            return (Criteria) this;
        }

        public Criteria andPasswordAnswerBetween(String value1, String value2) {
            addCriterion("PasswordAnswer between", value1, value2, "passwordAnswer");
            return (Criteria) this;
        }

        public Criteria andPasswordAnswerNotBetween(String value1, String value2) {
            addCriterion("PasswordAnswer not between", value1, value2, "passwordAnswer");
            return (Criteria) this;
        }

        public Criteria andIsApprovedIsNull() {
            addCriterion("IsApproved is null");
            return (Criteria) this;
        }

        public Criteria andIsApprovedIsNotNull() {
            addCriterion("IsApproved is not null");
            return (Criteria) this;
        }

        public Criteria andIsApprovedEqualTo(Boolean value) {
            addCriterion("IsApproved =", value, "isApproved");
            return (Criteria) this;
        }

        public Criteria andIsApprovedNotEqualTo(Boolean value) {
            addCriterion("IsApproved <>", value, "isApproved");
            return (Criteria) this;
        }

        public Criteria andIsApprovedGreaterThan(Boolean value) {
            addCriterion("IsApproved >", value, "isApproved");
            return (Criteria) this;
        }

        public Criteria andIsApprovedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsApproved >=", value, "isApproved");
            return (Criteria) this;
        }

        public Criteria andIsApprovedLessThan(Boolean value) {
            addCriterion("IsApproved <", value, "isApproved");
            return (Criteria) this;
        }

        public Criteria andIsApprovedLessThanOrEqualTo(Boolean value) {
            addCriterion("IsApproved <=", value, "isApproved");
            return (Criteria) this;
        }

        public Criteria andIsApprovedIn(List<Boolean> values) {
            addCriterion("IsApproved in", values, "isApproved");
            return (Criteria) this;
        }

        public Criteria andIsApprovedNotIn(List<Boolean> values) {
            addCriterion("IsApproved not in", values, "isApproved");
            return (Criteria) this;
        }

        public Criteria andIsApprovedBetween(Boolean value1, Boolean value2) {
            addCriterion("IsApproved between", value1, value2, "isApproved");
            return (Criteria) this;
        }

        public Criteria andIsApprovedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsApproved not between", value1, value2, "isApproved");
            return (Criteria) this;
        }

        public Criteria andIsLockedOutIsNull() {
            addCriterion("IsLockedOut is null");
            return (Criteria) this;
        }

        public Criteria andIsLockedOutIsNotNull() {
            addCriterion("IsLockedOut is not null");
            return (Criteria) this;
        }

        public Criteria andIsLockedOutEqualTo(Boolean value) {
            addCriterion("IsLockedOut =", value, "isLockedOut");
            return (Criteria) this;
        }

        public Criteria andIsLockedOutNotEqualTo(Boolean value) {
            addCriterion("IsLockedOut <>", value, "isLockedOut");
            return (Criteria) this;
        }

        public Criteria andIsLockedOutGreaterThan(Boolean value) {
            addCriterion("IsLockedOut >", value, "isLockedOut");
            return (Criteria) this;
        }

        public Criteria andIsLockedOutGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsLockedOut >=", value, "isLockedOut");
            return (Criteria) this;
        }

        public Criteria andIsLockedOutLessThan(Boolean value) {
            addCriterion("IsLockedOut <", value, "isLockedOut");
            return (Criteria) this;
        }

        public Criteria andIsLockedOutLessThanOrEqualTo(Boolean value) {
            addCriterion("IsLockedOut <=", value, "isLockedOut");
            return (Criteria) this;
        }

        public Criteria andIsLockedOutIn(List<Boolean> values) {
            addCriterion("IsLockedOut in", values, "isLockedOut");
            return (Criteria) this;
        }

        public Criteria andIsLockedOutNotIn(List<Boolean> values) {
            addCriterion("IsLockedOut not in", values, "isLockedOut");
            return (Criteria) this;
        }

        public Criteria andIsLockedOutBetween(Boolean value1, Boolean value2) {
            addCriterion("IsLockedOut between", value1, value2, "isLockedOut");
            return (Criteria) this;
        }

        public Criteria andIsLockedOutNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsLockedOut not between", value1, value2, "isLockedOut");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CreateDate is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CreateDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CreateDate =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CreateDate <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CreateDate >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateDate >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CreateDate <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CreateDate <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CreateDate in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CreateDate not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CreateDate between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CreateDate not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateIsNull() {
            addCriterion("LastLoginDate is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateIsNotNull() {
            addCriterion("LastLoginDate is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateEqualTo(Date value) {
            addCriterion("LastLoginDate =", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateNotEqualTo(Date value) {
            addCriterion("LastLoginDate <>", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateGreaterThan(Date value) {
            addCriterion("LastLoginDate >", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LastLoginDate >=", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateLessThan(Date value) {
            addCriterion("LastLoginDate <", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateLessThanOrEqualTo(Date value) {
            addCriterion("LastLoginDate <=", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateIn(List<Date> values) {
            addCriterion("LastLoginDate in", values, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateNotIn(List<Date> values) {
            addCriterion("LastLoginDate not in", values, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateBetween(Date value1, Date value2) {
            addCriterion("LastLoginDate between", value1, value2, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateNotBetween(Date value1, Date value2) {
            addCriterion("LastLoginDate not between", value1, value2, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastPasswordChangedDateIsNull() {
            addCriterion("LastPasswordChangedDate is null");
            return (Criteria) this;
        }

        public Criteria andLastPasswordChangedDateIsNotNull() {
            addCriterion("LastPasswordChangedDate is not null");
            return (Criteria) this;
        }

        public Criteria andLastPasswordChangedDateEqualTo(Date value) {
            addCriterion("LastPasswordChangedDate =", value, "lastPasswordChangedDate");
            return (Criteria) this;
        }

        public Criteria andLastPasswordChangedDateNotEqualTo(Date value) {
            addCriterion("LastPasswordChangedDate <>", value, "lastPasswordChangedDate");
            return (Criteria) this;
        }

        public Criteria andLastPasswordChangedDateGreaterThan(Date value) {
            addCriterion("LastPasswordChangedDate >", value, "lastPasswordChangedDate");
            return (Criteria) this;
        }

        public Criteria andLastPasswordChangedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LastPasswordChangedDate >=", value, "lastPasswordChangedDate");
            return (Criteria) this;
        }

        public Criteria andLastPasswordChangedDateLessThan(Date value) {
            addCriterion("LastPasswordChangedDate <", value, "lastPasswordChangedDate");
            return (Criteria) this;
        }

        public Criteria andLastPasswordChangedDateLessThanOrEqualTo(Date value) {
            addCriterion("LastPasswordChangedDate <=", value, "lastPasswordChangedDate");
            return (Criteria) this;
        }

        public Criteria andLastPasswordChangedDateIn(List<Date> values) {
            addCriterion("LastPasswordChangedDate in", values, "lastPasswordChangedDate");
            return (Criteria) this;
        }

        public Criteria andLastPasswordChangedDateNotIn(List<Date> values) {
            addCriterion("LastPasswordChangedDate not in", values, "lastPasswordChangedDate");
            return (Criteria) this;
        }

        public Criteria andLastPasswordChangedDateBetween(Date value1, Date value2) {
            addCriterion("LastPasswordChangedDate between", value1, value2, "lastPasswordChangedDate");
            return (Criteria) this;
        }

        public Criteria andLastPasswordChangedDateNotBetween(Date value1, Date value2) {
            addCriterion("LastPasswordChangedDate not between", value1, value2, "lastPasswordChangedDate");
            return (Criteria) this;
        }

        public Criteria andLastLockoutDateIsNull() {
            addCriterion("LastLockoutDate is null");
            return (Criteria) this;
        }

        public Criteria andLastLockoutDateIsNotNull() {
            addCriterion("LastLockoutDate is not null");
            return (Criteria) this;
        }

        public Criteria andLastLockoutDateEqualTo(Date value) {
            addCriterion("LastLockoutDate =", value, "lastLockoutDate");
            return (Criteria) this;
        }

        public Criteria andLastLockoutDateNotEqualTo(Date value) {
            addCriterion("LastLockoutDate <>", value, "lastLockoutDate");
            return (Criteria) this;
        }

        public Criteria andLastLockoutDateGreaterThan(Date value) {
            addCriterion("LastLockoutDate >", value, "lastLockoutDate");
            return (Criteria) this;
        }

        public Criteria andLastLockoutDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LastLockoutDate >=", value, "lastLockoutDate");
            return (Criteria) this;
        }

        public Criteria andLastLockoutDateLessThan(Date value) {
            addCriterion("LastLockoutDate <", value, "lastLockoutDate");
            return (Criteria) this;
        }

        public Criteria andLastLockoutDateLessThanOrEqualTo(Date value) {
            addCriterion("LastLockoutDate <=", value, "lastLockoutDate");
            return (Criteria) this;
        }

        public Criteria andLastLockoutDateIn(List<Date> values) {
            addCriterion("LastLockoutDate in", values, "lastLockoutDate");
            return (Criteria) this;
        }

        public Criteria andLastLockoutDateNotIn(List<Date> values) {
            addCriterion("LastLockoutDate not in", values, "lastLockoutDate");
            return (Criteria) this;
        }

        public Criteria andLastLockoutDateBetween(Date value1, Date value2) {
            addCriterion("LastLockoutDate between", value1, value2, "lastLockoutDate");
            return (Criteria) this;
        }

        public Criteria andLastLockoutDateNotBetween(Date value1, Date value2) {
            addCriterion("LastLockoutDate not between", value1, value2, "lastLockoutDate");
            return (Criteria) this;
        }

        public Criteria andFailedPasswordAttemptCountIsNull() {
            addCriterion("FailedPasswordAttemptCount is null");
            return (Criteria) this;
        }

        public Criteria andFailedPasswordAttemptCountIsNotNull() {
            addCriterion("FailedPasswordAttemptCount is not null");
            return (Criteria) this;
        }

        public Criteria andFailedPasswordAttemptCountEqualTo(Integer value) {
            addCriterion("FailedPasswordAttemptCount =", value, "failedPasswordAttemptCount");
            return (Criteria) this;
        }

        public Criteria andFailedPasswordAttemptCountNotEqualTo(Integer value) {
            addCriterion("FailedPasswordAttemptCount <>", value, "failedPasswordAttemptCount");
            return (Criteria) this;
        }

        public Criteria andFailedPasswordAttemptCountGreaterThan(Integer value) {
            addCriterion("FailedPasswordAttemptCount >", value, "failedPasswordAttemptCount");
            return (Criteria) this;
        }

        public Criteria andFailedPasswordAttemptCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("FailedPasswordAttemptCount >=", value, "failedPasswordAttemptCount");
            return (Criteria) this;
        }

        public Criteria andFailedPasswordAttemptCountLessThan(Integer value) {
            addCriterion("FailedPasswordAttemptCount <", value, "failedPasswordAttemptCount");
            return (Criteria) this;
        }

        public Criteria andFailedPasswordAttemptCountLessThanOrEqualTo(Integer value) {
            addCriterion("FailedPasswordAttemptCount <=", value, "failedPasswordAttemptCount");
            return (Criteria) this;
        }

        public Criteria andFailedPasswordAttemptCountIn(List<Integer> values) {
            addCriterion("FailedPasswordAttemptCount in", values, "failedPasswordAttemptCount");
            return (Criteria) this;
        }

        public Criteria andFailedPasswordAttemptCountNotIn(List<Integer> values) {
            addCriterion("FailedPasswordAttemptCount not in", values, "failedPasswordAttemptCount");
            return (Criteria) this;
        }

        public Criteria andFailedPasswordAttemptCountBetween(Integer value1, Integer value2) {
            addCriterion("FailedPasswordAttemptCount between", value1, value2, "failedPasswordAttemptCount");
            return (Criteria) this;
        }

        public Criteria andFailedPasswordAttemptCountNotBetween(Integer value1, Integer value2) {
            addCriterion("FailedPasswordAttemptCount not between", value1, value2, "failedPasswordAttemptCount");
            return (Criteria) this;
        }

        public Criteria andFailedPasswordAttemptWindowStartIsNull() {
            addCriterion("FailedPasswordAttemptWindowStart is null");
            return (Criteria) this;
        }

        public Criteria andFailedPasswordAttemptWindowStartIsNotNull() {
            addCriterion("FailedPasswordAttemptWindowStart is not null");
            return (Criteria) this;
        }

        public Criteria andFailedPasswordAttemptWindowStartEqualTo(Date value) {
            addCriterion("FailedPasswordAttemptWindowStart =", value, "failedPasswordAttemptWindowStart");
            return (Criteria) this;
        }

        public Criteria andFailedPasswordAttemptWindowStartNotEqualTo(Date value) {
            addCriterion("FailedPasswordAttemptWindowStart <>", value, "failedPasswordAttemptWindowStart");
            return (Criteria) this;
        }

        public Criteria andFailedPasswordAttemptWindowStartGreaterThan(Date value) {
            addCriterion("FailedPasswordAttemptWindowStart >", value, "failedPasswordAttemptWindowStart");
            return (Criteria) this;
        }

        public Criteria andFailedPasswordAttemptWindowStartGreaterThanOrEqualTo(Date value) {
            addCriterion("FailedPasswordAttemptWindowStart >=", value, "failedPasswordAttemptWindowStart");
            return (Criteria) this;
        }

        public Criteria andFailedPasswordAttemptWindowStartLessThan(Date value) {
            addCriterion("FailedPasswordAttemptWindowStart <", value, "failedPasswordAttemptWindowStart");
            return (Criteria) this;
        }

        public Criteria andFailedPasswordAttemptWindowStartLessThanOrEqualTo(Date value) {
            addCriterion("FailedPasswordAttemptWindowStart <=", value, "failedPasswordAttemptWindowStart");
            return (Criteria) this;
        }

        public Criteria andFailedPasswordAttemptWindowStartIn(List<Date> values) {
            addCriterion("FailedPasswordAttemptWindowStart in", values, "failedPasswordAttemptWindowStart");
            return (Criteria) this;
        }

        public Criteria andFailedPasswordAttemptWindowStartNotIn(List<Date> values) {
            addCriterion("FailedPasswordAttemptWindowStart not in", values, "failedPasswordAttemptWindowStart");
            return (Criteria) this;
        }

        public Criteria andFailedPasswordAttemptWindowStartBetween(Date value1, Date value2) {
            addCriterion("FailedPasswordAttemptWindowStart between", value1, value2, "failedPasswordAttemptWindowStart");
            return (Criteria) this;
        }

        public Criteria andFailedPasswordAttemptWindowStartNotBetween(Date value1, Date value2) {
            addCriterion("FailedPasswordAttemptWindowStart not between", value1, value2, "failedPasswordAttemptWindowStart");
            return (Criteria) this;
        }

        public Criteria andFailedPasswordAnswerAttemptCountIsNull() {
            addCriterion("FailedPasswordAnswerAttemptCount is null");
            return (Criteria) this;
        }

        public Criteria andFailedPasswordAnswerAttemptCountIsNotNull() {
            addCriterion("FailedPasswordAnswerAttemptCount is not null");
            return (Criteria) this;
        }

        public Criteria andFailedPasswordAnswerAttemptCountEqualTo(Integer value) {
            addCriterion("FailedPasswordAnswerAttemptCount =", value, "failedPasswordAnswerAttemptCount");
            return (Criteria) this;
        }

        public Criteria andFailedPasswordAnswerAttemptCountNotEqualTo(Integer value) {
            addCriterion("FailedPasswordAnswerAttemptCount <>", value, "failedPasswordAnswerAttemptCount");
            return (Criteria) this;
        }

        public Criteria andFailedPasswordAnswerAttemptCountGreaterThan(Integer value) {
            addCriterion("FailedPasswordAnswerAttemptCount >", value, "failedPasswordAnswerAttemptCount");
            return (Criteria) this;
        }

        public Criteria andFailedPasswordAnswerAttemptCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("FailedPasswordAnswerAttemptCount >=", value, "failedPasswordAnswerAttemptCount");
            return (Criteria) this;
        }

        public Criteria andFailedPasswordAnswerAttemptCountLessThan(Integer value) {
            addCriterion("FailedPasswordAnswerAttemptCount <", value, "failedPasswordAnswerAttemptCount");
            return (Criteria) this;
        }

        public Criteria andFailedPasswordAnswerAttemptCountLessThanOrEqualTo(Integer value) {
            addCriterion("FailedPasswordAnswerAttemptCount <=", value, "failedPasswordAnswerAttemptCount");
            return (Criteria) this;
        }

        public Criteria andFailedPasswordAnswerAttemptCountIn(List<Integer> values) {
            addCriterion("FailedPasswordAnswerAttemptCount in", values, "failedPasswordAnswerAttemptCount");
            return (Criteria) this;
        }

        public Criteria andFailedPasswordAnswerAttemptCountNotIn(List<Integer> values) {
            addCriterion("FailedPasswordAnswerAttemptCount not in", values, "failedPasswordAnswerAttemptCount");
            return (Criteria) this;
        }

        public Criteria andFailedPasswordAnswerAttemptCountBetween(Integer value1, Integer value2) {
            addCriterion("FailedPasswordAnswerAttemptCount between", value1, value2, "failedPasswordAnswerAttemptCount");
            return (Criteria) this;
        }

        public Criteria andFailedPasswordAnswerAttemptCountNotBetween(Integer value1, Integer value2) {
            addCriterion("FailedPasswordAnswerAttemptCount not between", value1, value2, "failedPasswordAnswerAttemptCount");
            return (Criteria) this;
        }

        public Criteria andFailedPasswordAnswerAttemptWindowStartIsNull() {
            addCriterion("FailedPasswordAnswerAttemptWindowStart is null");
            return (Criteria) this;
        }

        public Criteria andFailedPasswordAnswerAttemptWindowStartIsNotNull() {
            addCriterion("FailedPasswordAnswerAttemptWindowStart is not null");
            return (Criteria) this;
        }

        public Criteria andFailedPasswordAnswerAttemptWindowStartEqualTo(Date value) {
            addCriterion("FailedPasswordAnswerAttemptWindowStart =", value, "failedPasswordAnswerAttemptWindowStart");
            return (Criteria) this;
        }

        public Criteria andFailedPasswordAnswerAttemptWindowStartNotEqualTo(Date value) {
            addCriterion("FailedPasswordAnswerAttemptWindowStart <>", value, "failedPasswordAnswerAttemptWindowStart");
            return (Criteria) this;
        }

        public Criteria andFailedPasswordAnswerAttemptWindowStartGreaterThan(Date value) {
            addCriterion("FailedPasswordAnswerAttemptWindowStart >", value, "failedPasswordAnswerAttemptWindowStart");
            return (Criteria) this;
        }

        public Criteria andFailedPasswordAnswerAttemptWindowStartGreaterThanOrEqualTo(Date value) {
            addCriterion("FailedPasswordAnswerAttemptWindowStart >=", value, "failedPasswordAnswerAttemptWindowStart");
            return (Criteria) this;
        }

        public Criteria andFailedPasswordAnswerAttemptWindowStartLessThan(Date value) {
            addCriterion("FailedPasswordAnswerAttemptWindowStart <", value, "failedPasswordAnswerAttemptWindowStart");
            return (Criteria) this;
        }

        public Criteria andFailedPasswordAnswerAttemptWindowStartLessThanOrEqualTo(Date value) {
            addCriterion("FailedPasswordAnswerAttemptWindowStart <=", value, "failedPasswordAnswerAttemptWindowStart");
            return (Criteria) this;
        }

        public Criteria andFailedPasswordAnswerAttemptWindowStartIn(List<Date> values) {
            addCriterion("FailedPasswordAnswerAttemptWindowStart in", values, "failedPasswordAnswerAttemptWindowStart");
            return (Criteria) this;
        }

        public Criteria andFailedPasswordAnswerAttemptWindowStartNotIn(List<Date> values) {
            addCriterion("FailedPasswordAnswerAttemptWindowStart not in", values, "failedPasswordAnswerAttemptWindowStart");
            return (Criteria) this;
        }

        public Criteria andFailedPasswordAnswerAttemptWindowStartBetween(Date value1, Date value2) {
            addCriterion("FailedPasswordAnswerAttemptWindowStart between", value1, value2, "failedPasswordAnswerAttemptWindowStart");
            return (Criteria) this;
        }

        public Criteria andFailedPasswordAnswerAttemptWindowStartNotBetween(Date value1, Date value2) {
            addCriterion("FailedPasswordAnswerAttemptWindowStart not between", value1, value2, "failedPasswordAnswerAttemptWindowStart");
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