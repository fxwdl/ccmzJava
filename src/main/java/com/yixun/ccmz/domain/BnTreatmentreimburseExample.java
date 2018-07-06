package com.yixun.ccmz.domain;

import com.rosegun.plugin.Page;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BnTreatmentreimburseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public BnTreatmentreimburseExample() {
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

        public Criteria andIDIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIDIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIDEqualTo(String value) {
            addCriterion("ID =", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotEqualTo(String value) {
            addCriterion("ID <>", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDGreaterThan(String value) {
            addCriterion("ID >", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDLessThan(String value) {
            addCriterion("ID <", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDLike(String value) {
            addCriterion("ID like", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotLike(String value) {
            addCriterion("ID not like", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDIn(List<String> values) {
            addCriterion("ID in", values, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotIn(List<String> values) {
            addCriterion("ID not in", values, "ID");
            return (Criteria) this;
        }

        public Criteria andIDBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "ID");
            return (Criteria) this;
        }

        public Criteria andPay_TypeIsNull() {
            addCriterion("Pay_Type is null");
            return (Criteria) this;
        }

        public Criteria andPay_TypeIsNotNull() {
            addCriterion("Pay_Type is not null");
            return (Criteria) this;
        }

        public Criteria andPay_TypeEqualTo(Integer value) {
            addCriterion("Pay_Type =", value, "pay_Type");
            return (Criteria) this;
        }

        public Criteria andPay_TypeNotEqualTo(Integer value) {
            addCriterion("Pay_Type <>", value, "pay_Type");
            return (Criteria) this;
        }

        public Criteria andPay_TypeGreaterThan(Integer value) {
            addCriterion("Pay_Type >", value, "pay_Type");
            return (Criteria) this;
        }

        public Criteria andPay_TypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("Pay_Type >=", value, "pay_Type");
            return (Criteria) this;
        }

        public Criteria andPay_TypeLessThan(Integer value) {
            addCriterion("Pay_Type <", value, "pay_Type");
            return (Criteria) this;
        }

        public Criteria andPay_TypeLessThanOrEqualTo(Integer value) {
            addCriterion("Pay_Type <=", value, "pay_Type");
            return (Criteria) this;
        }

        public Criteria andPay_TypeIn(List<Integer> values) {
            addCriterion("Pay_Type in", values, "pay_Type");
            return (Criteria) this;
        }

        public Criteria andPay_TypeNotIn(List<Integer> values) {
            addCriterion("Pay_Type not in", values, "pay_Type");
            return (Criteria) this;
        }

        public Criteria andPay_TypeBetween(Integer value1, Integer value2) {
            addCriterion("Pay_Type between", value1, value2, "pay_Type");
            return (Criteria) this;
        }

        public Criteria andPay_TypeNotBetween(Integer value1, Integer value2) {
            addCriterion("Pay_Type not between", value1, value2, "pay_Type");
            return (Criteria) this;
        }

        public Criteria andApply_Hospital_IDIsNull() {
            addCriterion("Apply_Hospital_ID is null");
            return (Criteria) this;
        }

        public Criteria andApply_Hospital_IDIsNotNull() {
            addCriterion("Apply_Hospital_ID is not null");
            return (Criteria) this;
        }

        public Criteria andApply_Hospital_IDEqualTo(String value) {
            addCriterion("Apply_Hospital_ID =", value, "apply_Hospital_ID");
            return (Criteria) this;
        }

        public Criteria andApply_Hospital_IDNotEqualTo(String value) {
            addCriterion("Apply_Hospital_ID <>", value, "apply_Hospital_ID");
            return (Criteria) this;
        }

        public Criteria andApply_Hospital_IDGreaterThan(String value) {
            addCriterion("Apply_Hospital_ID >", value, "apply_Hospital_ID");
            return (Criteria) this;
        }

        public Criteria andApply_Hospital_IDGreaterThanOrEqualTo(String value) {
            addCriterion("Apply_Hospital_ID >=", value, "apply_Hospital_ID");
            return (Criteria) this;
        }

        public Criteria andApply_Hospital_IDLessThan(String value) {
            addCriterion("Apply_Hospital_ID <", value, "apply_Hospital_ID");
            return (Criteria) this;
        }

        public Criteria andApply_Hospital_IDLessThanOrEqualTo(String value) {
            addCriterion("Apply_Hospital_ID <=", value, "apply_Hospital_ID");
            return (Criteria) this;
        }

        public Criteria andApply_Hospital_IDLike(String value) {
            addCriterion("Apply_Hospital_ID like", value, "apply_Hospital_ID");
            return (Criteria) this;
        }

        public Criteria andApply_Hospital_IDNotLike(String value) {
            addCriterion("Apply_Hospital_ID not like", value, "apply_Hospital_ID");
            return (Criteria) this;
        }

        public Criteria andApply_Hospital_IDIn(List<String> values) {
            addCriterion("Apply_Hospital_ID in", values, "apply_Hospital_ID");
            return (Criteria) this;
        }

        public Criteria andApply_Hospital_IDNotIn(List<String> values) {
            addCriterion("Apply_Hospital_ID not in", values, "apply_Hospital_ID");
            return (Criteria) this;
        }

        public Criteria andApply_Hospital_IDBetween(String value1, String value2) {
            addCriterion("Apply_Hospital_ID between", value1, value2, "apply_Hospital_ID");
            return (Criteria) this;
        }

        public Criteria andApply_Hospital_IDNotBetween(String value1, String value2) {
            addCriterion("Apply_Hospital_ID not between", value1, value2, "apply_Hospital_ID");
            return (Criteria) this;
        }

        public Criteria andReim_NOIsNull() {
            addCriterion("Reim_NO is null");
            return (Criteria) this;
        }

        public Criteria andReim_NOIsNotNull() {
            addCriterion("Reim_NO is not null");
            return (Criteria) this;
        }

        public Criteria andReim_NOEqualTo(String value) {
            addCriterion("Reim_NO =", value, "reim_NO");
            return (Criteria) this;
        }

        public Criteria andReim_NONotEqualTo(String value) {
            addCriterion("Reim_NO <>", value, "reim_NO");
            return (Criteria) this;
        }

        public Criteria andReim_NOGreaterThan(String value) {
            addCriterion("Reim_NO >", value, "reim_NO");
            return (Criteria) this;
        }

        public Criteria andReim_NOGreaterThanOrEqualTo(String value) {
            addCriterion("Reim_NO >=", value, "reim_NO");
            return (Criteria) this;
        }

        public Criteria andReim_NOLessThan(String value) {
            addCriterion("Reim_NO <", value, "reim_NO");
            return (Criteria) this;
        }

        public Criteria andReim_NOLessThanOrEqualTo(String value) {
            addCriterion("Reim_NO <=", value, "reim_NO");
            return (Criteria) this;
        }

        public Criteria andReim_NOLike(String value) {
            addCriterion("Reim_NO like", value, "reim_NO");
            return (Criteria) this;
        }

        public Criteria andReim_NONotLike(String value) {
            addCriterion("Reim_NO not like", value, "reim_NO");
            return (Criteria) this;
        }

        public Criteria andReim_NOIn(List<String> values) {
            addCriterion("Reim_NO in", values, "reim_NO");
            return (Criteria) this;
        }

        public Criteria andReim_NONotIn(List<String> values) {
            addCriterion("Reim_NO not in", values, "reim_NO");
            return (Criteria) this;
        }

        public Criteria andReim_NOBetween(String value1, String value2) {
            addCriterion("Reim_NO between", value1, value2, "reim_NO");
            return (Criteria) this;
        }

        public Criteria andReim_NONotBetween(String value1, String value2) {
            addCriterion("Reim_NO not between", value1, value2, "reim_NO");
            return (Criteria) this;
        }

        public Criteria andSfzhIsNull() {
            addCriterion("Sfzh is null");
            return (Criteria) this;
        }

        public Criteria andSfzhIsNotNull() {
            addCriterion("Sfzh is not null");
            return (Criteria) this;
        }

        public Criteria andSfzhEqualTo(String value) {
            addCriterion("Sfzh =", value, "sfzh");
            return (Criteria) this;
        }

        public Criteria andSfzhNotEqualTo(String value) {
            addCriterion("Sfzh <>", value, "sfzh");
            return (Criteria) this;
        }

        public Criteria andSfzhGreaterThan(String value) {
            addCriterion("Sfzh >", value, "sfzh");
            return (Criteria) this;
        }

        public Criteria andSfzhGreaterThanOrEqualTo(String value) {
            addCriterion("Sfzh >=", value, "sfzh");
            return (Criteria) this;
        }

        public Criteria andSfzhLessThan(String value) {
            addCriterion("Sfzh <", value, "sfzh");
            return (Criteria) this;
        }

        public Criteria andSfzhLessThanOrEqualTo(String value) {
            addCriterion("Sfzh <=", value, "sfzh");
            return (Criteria) this;
        }

        public Criteria andSfzhLike(String value) {
            addCriterion("Sfzh like", value, "sfzh");
            return (Criteria) this;
        }

        public Criteria andSfzhNotLike(String value) {
            addCriterion("Sfzh not like", value, "sfzh");
            return (Criteria) this;
        }

        public Criteria andSfzhIn(List<String> values) {
            addCriterion("Sfzh in", values, "sfzh");
            return (Criteria) this;
        }

        public Criteria andSfzhNotIn(List<String> values) {
            addCriterion("Sfzh not in", values, "sfzh");
            return (Criteria) this;
        }

        public Criteria andSfzhBetween(String value1, String value2) {
            addCriterion("Sfzh between", value1, value2, "sfzh");
            return (Criteria) this;
        }

        public Criteria andSfzhNotBetween(String value1, String value2) {
            addCriterion("Sfzh not between", value1, value2, "sfzh");
            return (Criteria) this;
        }

        public Criteria andMedicare_StateIsNull() {
            addCriterion("Medicare_State is null");
            return (Criteria) this;
        }

        public Criteria andMedicare_StateIsNotNull() {
            addCriterion("Medicare_State is not null");
            return (Criteria) this;
        }

        public Criteria andMedicare_StateEqualTo(Integer value) {
            addCriterion("Medicare_State =", value, "medicare_State");
            return (Criteria) this;
        }

        public Criteria andMedicare_StateNotEqualTo(Integer value) {
            addCriterion("Medicare_State <>", value, "medicare_State");
            return (Criteria) this;
        }

        public Criteria andMedicare_StateGreaterThan(Integer value) {
            addCriterion("Medicare_State >", value, "medicare_State");
            return (Criteria) this;
        }

        public Criteria andMedicare_StateGreaterThanOrEqualTo(Integer value) {
            addCriterion("Medicare_State >=", value, "medicare_State");
            return (Criteria) this;
        }

        public Criteria andMedicare_StateLessThan(Integer value) {
            addCriterion("Medicare_State <", value, "medicare_State");
            return (Criteria) this;
        }

        public Criteria andMedicare_StateLessThanOrEqualTo(Integer value) {
            addCriterion("Medicare_State <=", value, "medicare_State");
            return (Criteria) this;
        }

        public Criteria andMedicare_StateIn(List<Integer> values) {
            addCriterion("Medicare_State in", values, "medicare_State");
            return (Criteria) this;
        }

        public Criteria andMedicare_StateNotIn(List<Integer> values) {
            addCriterion("Medicare_State not in", values, "medicare_State");
            return (Criteria) this;
        }

        public Criteria andMedicare_StateBetween(Integer value1, Integer value2) {
            addCriterion("Medicare_State between", value1, value2, "medicare_State");
            return (Criteria) this;
        }

        public Criteria andMedicare_StateNotBetween(Integer value1, Integer value2) {
            addCriterion("Medicare_State not between", value1, value2, "medicare_State");
            return (Criteria) this;
        }

        public Criteria andPerson_CodeIsNull() {
            addCriterion("Person_Code is null");
            return (Criteria) this;
        }

        public Criteria andPerson_CodeIsNotNull() {
            addCriterion("Person_Code is not null");
            return (Criteria) this;
        }

        public Criteria andPerson_CodeEqualTo(String value) {
            addCriterion("Person_Code =", value, "person_Code");
            return (Criteria) this;
        }

        public Criteria andPerson_CodeNotEqualTo(String value) {
            addCriterion("Person_Code <>", value, "person_Code");
            return (Criteria) this;
        }

        public Criteria andPerson_CodeGreaterThan(String value) {
            addCriterion("Person_Code >", value, "person_Code");
            return (Criteria) this;
        }

        public Criteria andPerson_CodeGreaterThanOrEqualTo(String value) {
            addCriterion("Person_Code >=", value, "person_Code");
            return (Criteria) this;
        }

        public Criteria andPerson_CodeLessThan(String value) {
            addCriterion("Person_Code <", value, "person_Code");
            return (Criteria) this;
        }

        public Criteria andPerson_CodeLessThanOrEqualTo(String value) {
            addCriterion("Person_Code <=", value, "person_Code");
            return (Criteria) this;
        }

        public Criteria andPerson_CodeLike(String value) {
            addCriterion("Person_Code like", value, "person_Code");
            return (Criteria) this;
        }

        public Criteria andPerson_CodeNotLike(String value) {
            addCriterion("Person_Code not like", value, "person_Code");
            return (Criteria) this;
        }

        public Criteria andPerson_CodeIn(List<String> values) {
            addCriterion("Person_Code in", values, "person_Code");
            return (Criteria) this;
        }

        public Criteria andPerson_CodeNotIn(List<String> values) {
            addCriterion("Person_Code not in", values, "person_Code");
            return (Criteria) this;
        }

        public Criteria andPerson_CodeBetween(String value1, String value2) {
            addCriterion("Person_Code between", value1, value2, "person_Code");
            return (Criteria) this;
        }

        public Criteria andPerson_CodeNotBetween(String value1, String value2) {
            addCriterion("Person_Code not between", value1, value2, "person_Code");
            return (Criteria) this;
        }

        public Criteria andReim_SourceIsNull() {
            addCriterion("Reim_Source is null");
            return (Criteria) this;
        }

        public Criteria andReim_SourceIsNotNull() {
            addCriterion("Reim_Source is not null");
            return (Criteria) this;
        }

        public Criteria andReim_SourceEqualTo(Integer value) {
            addCriterion("Reim_Source =", value, "reim_Source");
            return (Criteria) this;
        }

        public Criteria andReim_SourceNotEqualTo(Integer value) {
            addCriterion("Reim_Source <>", value, "reim_Source");
            return (Criteria) this;
        }

        public Criteria andReim_SourceGreaterThan(Integer value) {
            addCriterion("Reim_Source >", value, "reim_Source");
            return (Criteria) this;
        }

        public Criteria andReim_SourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("Reim_Source >=", value, "reim_Source");
            return (Criteria) this;
        }

        public Criteria andReim_SourceLessThan(Integer value) {
            addCriterion("Reim_Source <", value, "reim_Source");
            return (Criteria) this;
        }

        public Criteria andReim_SourceLessThanOrEqualTo(Integer value) {
            addCriterion("Reim_Source <=", value, "reim_Source");
            return (Criteria) this;
        }

        public Criteria andReim_SourceIn(List<Integer> values) {
            addCriterion("Reim_Source in", values, "reim_Source");
            return (Criteria) this;
        }

        public Criteria andReim_SourceNotIn(List<Integer> values) {
            addCriterion("Reim_Source not in", values, "reim_Source");
            return (Criteria) this;
        }

        public Criteria andReim_SourceBetween(Integer value1, Integer value2) {
            addCriterion("Reim_Source between", value1, value2, "reim_Source");
            return (Criteria) this;
        }

        public Criteria andReim_SourceNotBetween(Integer value1, Integer value2) {
            addCriterion("Reim_Source not between", value1, value2, "reim_Source");
            return (Criteria) this;
        }

        public Criteria andBillNOIsNull() {
            addCriterion("BillNO is null");
            return (Criteria) this;
        }

        public Criteria andBillNOIsNotNull() {
            addCriterion("BillNO is not null");
            return (Criteria) this;
        }

        public Criteria andBillNOEqualTo(String value) {
            addCriterion("BillNO =", value, "billNO");
            return (Criteria) this;
        }

        public Criteria andBillNONotEqualTo(String value) {
            addCriterion("BillNO <>", value, "billNO");
            return (Criteria) this;
        }

        public Criteria andBillNOGreaterThan(String value) {
            addCriterion("BillNO >", value, "billNO");
            return (Criteria) this;
        }

        public Criteria andBillNOGreaterThanOrEqualTo(String value) {
            addCriterion("BillNO >=", value, "billNO");
            return (Criteria) this;
        }

        public Criteria andBillNOLessThan(String value) {
            addCriterion("BillNO <", value, "billNO");
            return (Criteria) this;
        }

        public Criteria andBillNOLessThanOrEqualTo(String value) {
            addCriterion("BillNO <=", value, "billNO");
            return (Criteria) this;
        }

        public Criteria andBillNOLike(String value) {
            addCriterion("BillNO like", value, "billNO");
            return (Criteria) this;
        }

        public Criteria andBillNONotLike(String value) {
            addCriterion("BillNO not like", value, "billNO");
            return (Criteria) this;
        }

        public Criteria andBillNOIn(List<String> values) {
            addCriterion("BillNO in", values, "billNO");
            return (Criteria) this;
        }

        public Criteria andBillNONotIn(List<String> values) {
            addCriterion("BillNO not in", values, "billNO");
            return (Criteria) this;
        }

        public Criteria andBillNOBetween(String value1, String value2) {
            addCriterion("BillNO between", value1, value2, "billNO");
            return (Criteria) this;
        }

        public Criteria andBillNONotBetween(String value1, String value2) {
            addCriterion("BillNO not between", value1, value2, "billNO");
            return (Criteria) this;
        }

        public Criteria andTreatmentHosptial_CodeIsNull() {
            addCriterion("TreatmentHosptial_Code is null");
            return (Criteria) this;
        }

        public Criteria andTreatmentHosptial_CodeIsNotNull() {
            addCriterion("TreatmentHosptial_Code is not null");
            return (Criteria) this;
        }

        public Criteria andTreatmentHosptial_CodeEqualTo(String value) {
            addCriterion("TreatmentHosptial_Code =", value, "treatmentHosptial_Code");
            return (Criteria) this;
        }

        public Criteria andTreatmentHosptial_CodeNotEqualTo(String value) {
            addCriterion("TreatmentHosptial_Code <>", value, "treatmentHosptial_Code");
            return (Criteria) this;
        }

        public Criteria andTreatmentHosptial_CodeGreaterThan(String value) {
            addCriterion("TreatmentHosptial_Code >", value, "treatmentHosptial_Code");
            return (Criteria) this;
        }

        public Criteria andTreatmentHosptial_CodeGreaterThanOrEqualTo(String value) {
            addCriterion("TreatmentHosptial_Code >=", value, "treatmentHosptial_Code");
            return (Criteria) this;
        }

        public Criteria andTreatmentHosptial_CodeLessThan(String value) {
            addCriterion("TreatmentHosptial_Code <", value, "treatmentHosptial_Code");
            return (Criteria) this;
        }

        public Criteria andTreatmentHosptial_CodeLessThanOrEqualTo(String value) {
            addCriterion("TreatmentHosptial_Code <=", value, "treatmentHosptial_Code");
            return (Criteria) this;
        }

        public Criteria andTreatmentHosptial_CodeLike(String value) {
            addCriterion("TreatmentHosptial_Code like", value, "treatmentHosptial_Code");
            return (Criteria) this;
        }

        public Criteria andTreatmentHosptial_CodeNotLike(String value) {
            addCriterion("TreatmentHosptial_Code not like", value, "treatmentHosptial_Code");
            return (Criteria) this;
        }

        public Criteria andTreatmentHosptial_CodeIn(List<String> values) {
            addCriterion("TreatmentHosptial_Code in", values, "treatmentHosptial_Code");
            return (Criteria) this;
        }

        public Criteria andTreatmentHosptial_CodeNotIn(List<String> values) {
            addCriterion("TreatmentHosptial_Code not in", values, "treatmentHosptial_Code");
            return (Criteria) this;
        }

        public Criteria andTreatmentHosptial_CodeBetween(String value1, String value2) {
            addCriterion("TreatmentHosptial_Code between", value1, value2, "treatmentHosptial_Code");
            return (Criteria) this;
        }

        public Criteria andTreatmentHosptial_CodeNotBetween(String value1, String value2) {
            addCriterion("TreatmentHosptial_Code not between", value1, value2, "treatmentHosptial_Code");
            return (Criteria) this;
        }

        public Criteria andTreatmentHosptialIsNull() {
            addCriterion("TreatmentHosptial is null");
            return (Criteria) this;
        }

        public Criteria andTreatmentHosptialIsNotNull() {
            addCriterion("TreatmentHosptial is not null");
            return (Criteria) this;
        }

        public Criteria andTreatmentHosptialEqualTo(String value) {
            addCriterion("TreatmentHosptial =", value, "treatmentHosptial");
            return (Criteria) this;
        }

        public Criteria andTreatmentHosptialNotEqualTo(String value) {
            addCriterion("TreatmentHosptial <>", value, "treatmentHosptial");
            return (Criteria) this;
        }

        public Criteria andTreatmentHosptialGreaterThan(String value) {
            addCriterion("TreatmentHosptial >", value, "treatmentHosptial");
            return (Criteria) this;
        }

        public Criteria andTreatmentHosptialGreaterThanOrEqualTo(String value) {
            addCriterion("TreatmentHosptial >=", value, "treatmentHosptial");
            return (Criteria) this;
        }

        public Criteria andTreatmentHosptialLessThan(String value) {
            addCriterion("TreatmentHosptial <", value, "treatmentHosptial");
            return (Criteria) this;
        }

        public Criteria andTreatmentHosptialLessThanOrEqualTo(String value) {
            addCriterion("TreatmentHosptial <=", value, "treatmentHosptial");
            return (Criteria) this;
        }

        public Criteria andTreatmentHosptialLike(String value) {
            addCriterion("TreatmentHosptial like", value, "treatmentHosptial");
            return (Criteria) this;
        }

        public Criteria andTreatmentHosptialNotLike(String value) {
            addCriterion("TreatmentHosptial not like", value, "treatmentHosptial");
            return (Criteria) this;
        }

        public Criteria andTreatmentHosptialIn(List<String> values) {
            addCriterion("TreatmentHosptial in", values, "treatmentHosptial");
            return (Criteria) this;
        }

        public Criteria andTreatmentHosptialNotIn(List<String> values) {
            addCriterion("TreatmentHosptial not in", values, "treatmentHosptial");
            return (Criteria) this;
        }

        public Criteria andTreatmentHosptialBetween(String value1, String value2) {
            addCriterion("TreatmentHosptial between", value1, value2, "treatmentHosptial");
            return (Criteria) this;
        }

        public Criteria andTreatmentHosptialNotBetween(String value1, String value2) {
            addCriterion("TreatmentHosptial not between", value1, value2, "treatmentHosptial");
            return (Criteria) this;
        }

        public Criteria andTreatment_NOIsNull() {
            addCriterion("Treatment_NO is null");
            return (Criteria) this;
        }

        public Criteria andTreatment_NOIsNotNull() {
            addCriterion("Treatment_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTreatment_NOEqualTo(String value) {
            addCriterion("Treatment_NO =", value, "treatment_NO");
            return (Criteria) this;
        }

        public Criteria andTreatment_NONotEqualTo(String value) {
            addCriterion("Treatment_NO <>", value, "treatment_NO");
            return (Criteria) this;
        }

        public Criteria andTreatment_NOGreaterThan(String value) {
            addCriterion("Treatment_NO >", value, "treatment_NO");
            return (Criteria) this;
        }

        public Criteria andTreatment_NOGreaterThanOrEqualTo(String value) {
            addCriterion("Treatment_NO >=", value, "treatment_NO");
            return (Criteria) this;
        }

        public Criteria andTreatment_NOLessThan(String value) {
            addCriterion("Treatment_NO <", value, "treatment_NO");
            return (Criteria) this;
        }

        public Criteria andTreatment_NOLessThanOrEqualTo(String value) {
            addCriterion("Treatment_NO <=", value, "treatment_NO");
            return (Criteria) this;
        }

        public Criteria andTreatment_NOLike(String value) {
            addCriterion("Treatment_NO like", value, "treatment_NO");
            return (Criteria) this;
        }

        public Criteria andTreatment_NONotLike(String value) {
            addCriterion("Treatment_NO not like", value, "treatment_NO");
            return (Criteria) this;
        }

        public Criteria andTreatment_NOIn(List<String> values) {
            addCriterion("Treatment_NO in", values, "treatment_NO");
            return (Criteria) this;
        }

        public Criteria andTreatment_NONotIn(List<String> values) {
            addCriterion("Treatment_NO not in", values, "treatment_NO");
            return (Criteria) this;
        }

        public Criteria andTreatment_NOBetween(String value1, String value2) {
            addCriterion("Treatment_NO between", value1, value2, "treatment_NO");
            return (Criteria) this;
        }

        public Criteria andTreatment_NONotBetween(String value1, String value2) {
            addCriterion("Treatment_NO not between", value1, value2, "treatment_NO");
            return (Criteria) this;
        }

        public Criteria andReim_Type_IDIsNull() {
            addCriterion("Reim_Type_ID is null");
            return (Criteria) this;
        }

        public Criteria andReim_Type_IDIsNotNull() {
            addCriterion("Reim_Type_ID is not null");
            return (Criteria) this;
        }

        public Criteria andReim_Type_IDEqualTo(Integer value) {
            addCriterion("Reim_Type_ID =", value, "reim_Type_ID");
            return (Criteria) this;
        }

        public Criteria andReim_Type_IDNotEqualTo(Integer value) {
            addCriterion("Reim_Type_ID <>", value, "reim_Type_ID");
            return (Criteria) this;
        }

        public Criteria andReim_Type_IDGreaterThan(Integer value) {
            addCriterion("Reim_Type_ID >", value, "reim_Type_ID");
            return (Criteria) this;
        }

        public Criteria andReim_Type_IDGreaterThanOrEqualTo(Integer value) {
            addCriterion("Reim_Type_ID >=", value, "reim_Type_ID");
            return (Criteria) this;
        }

        public Criteria andReim_Type_IDLessThan(Integer value) {
            addCriterion("Reim_Type_ID <", value, "reim_Type_ID");
            return (Criteria) this;
        }

        public Criteria andReim_Type_IDLessThanOrEqualTo(Integer value) {
            addCriterion("Reim_Type_ID <=", value, "reim_Type_ID");
            return (Criteria) this;
        }

        public Criteria andReim_Type_IDIn(List<Integer> values) {
            addCriterion("Reim_Type_ID in", values, "reim_Type_ID");
            return (Criteria) this;
        }

        public Criteria andReim_Type_IDNotIn(List<Integer> values) {
            addCriterion("Reim_Type_ID not in", values, "reim_Type_ID");
            return (Criteria) this;
        }

        public Criteria andReim_Type_IDBetween(Integer value1, Integer value2) {
            addCriterion("Reim_Type_ID between", value1, value2, "reim_Type_ID");
            return (Criteria) this;
        }

        public Criteria andReim_Type_IDNotBetween(Integer value1, Integer value2) {
            addCriterion("Reim_Type_ID not between", value1, value2, "reim_Type_ID");
            return (Criteria) this;
        }

        public Criteria andIn_DateIsNull() {
            addCriterion("In_Date is null");
            return (Criteria) this;
        }

        public Criteria andIn_DateIsNotNull() {
            addCriterion("In_Date is not null");
            return (Criteria) this;
        }

        public Criteria andIn_DateEqualTo(Date value) {
            addCriterion("In_Date =", value, "in_Date");
            return (Criteria) this;
        }

        public Criteria andIn_DateNotEqualTo(Date value) {
            addCriterion("In_Date <>", value, "in_Date");
            return (Criteria) this;
        }

        public Criteria andIn_DateGreaterThan(Date value) {
            addCriterion("In_Date >", value, "in_Date");
            return (Criteria) this;
        }

        public Criteria andIn_DateGreaterThanOrEqualTo(Date value) {
            addCriterion("In_Date >=", value, "in_Date");
            return (Criteria) this;
        }

        public Criteria andIn_DateLessThan(Date value) {
            addCriterion("In_Date <", value, "in_Date");
            return (Criteria) this;
        }

        public Criteria andIn_DateLessThanOrEqualTo(Date value) {
            addCriterion("In_Date <=", value, "in_Date");
            return (Criteria) this;
        }

        public Criteria andIn_DateIn(List<Date> values) {
            addCriterion("In_Date in", values, "in_Date");
            return (Criteria) this;
        }

        public Criteria andIn_DateNotIn(List<Date> values) {
            addCriterion("In_Date not in", values, "in_Date");
            return (Criteria) this;
        }

        public Criteria andIn_DateBetween(Date value1, Date value2) {
            addCriterion("In_Date between", value1, value2, "in_Date");
            return (Criteria) this;
        }

        public Criteria andIn_DateNotBetween(Date value1, Date value2) {
            addCriterion("In_Date not between", value1, value2, "in_Date");
            return (Criteria) this;
        }

        public Criteria andOut_DateIsNull() {
            addCriterion("Out_Date is null");
            return (Criteria) this;
        }

        public Criteria andOut_DateIsNotNull() {
            addCriterion("Out_Date is not null");
            return (Criteria) this;
        }

        public Criteria andOut_DateEqualTo(Date value) {
            addCriterion("Out_Date =", value, "out_Date");
            return (Criteria) this;
        }

        public Criteria andOut_DateNotEqualTo(Date value) {
            addCriterion("Out_Date <>", value, "out_Date");
            return (Criteria) this;
        }

        public Criteria andOut_DateGreaterThan(Date value) {
            addCriterion("Out_Date >", value, "out_Date");
            return (Criteria) this;
        }

        public Criteria andOut_DateGreaterThanOrEqualTo(Date value) {
            addCriterion("Out_Date >=", value, "out_Date");
            return (Criteria) this;
        }

        public Criteria andOut_DateLessThan(Date value) {
            addCriterion("Out_Date <", value, "out_Date");
            return (Criteria) this;
        }

        public Criteria andOut_DateLessThanOrEqualTo(Date value) {
            addCriterion("Out_Date <=", value, "out_Date");
            return (Criteria) this;
        }

        public Criteria andOut_DateIn(List<Date> values) {
            addCriterion("Out_Date in", values, "out_Date");
            return (Criteria) this;
        }

        public Criteria andOut_DateNotIn(List<Date> values) {
            addCriterion("Out_Date not in", values, "out_Date");
            return (Criteria) this;
        }

        public Criteria andOut_DateBetween(Date value1, Date value2) {
            addCriterion("Out_Date between", value1, value2, "out_Date");
            return (Criteria) this;
        }

        public Criteria andOut_DateNotBetween(Date value1, Date value2) {
            addCriterion("Out_Date not between", value1, value2, "out_Date");
            return (Criteria) this;
        }

        public Criteria andMedicare_DateIsNull() {
            addCriterion("Medicare_Date is null");
            return (Criteria) this;
        }

        public Criteria andMedicare_DateIsNotNull() {
            addCriterion("Medicare_Date is not null");
            return (Criteria) this;
        }

        public Criteria andMedicare_DateEqualTo(Date value) {
            addCriterion("Medicare_Date =", value, "medicare_Date");
            return (Criteria) this;
        }

        public Criteria andMedicare_DateNotEqualTo(Date value) {
            addCriterion("Medicare_Date <>", value, "medicare_Date");
            return (Criteria) this;
        }

        public Criteria andMedicare_DateGreaterThan(Date value) {
            addCriterion("Medicare_Date >", value, "medicare_Date");
            return (Criteria) this;
        }

        public Criteria andMedicare_DateGreaterThanOrEqualTo(Date value) {
            addCriterion("Medicare_Date >=", value, "medicare_Date");
            return (Criteria) this;
        }

        public Criteria andMedicare_DateLessThan(Date value) {
            addCriterion("Medicare_Date <", value, "medicare_Date");
            return (Criteria) this;
        }

        public Criteria andMedicare_DateLessThanOrEqualTo(Date value) {
            addCriterion("Medicare_Date <=", value, "medicare_Date");
            return (Criteria) this;
        }

        public Criteria andMedicare_DateIn(List<Date> values) {
            addCriterion("Medicare_Date in", values, "medicare_Date");
            return (Criteria) this;
        }

        public Criteria andMedicare_DateNotIn(List<Date> values) {
            addCriterion("Medicare_Date not in", values, "medicare_Date");
            return (Criteria) this;
        }

        public Criteria andMedicare_DateBetween(Date value1, Date value2) {
            addCriterion("Medicare_Date between", value1, value2, "medicare_Date");
            return (Criteria) this;
        }

        public Criteria andMedicare_DateNotBetween(Date value1, Date value2) {
            addCriterion("Medicare_Date not between", value1, value2, "medicare_Date");
            return (Criteria) this;
        }

        public Criteria andTypeIn_DateIsNull() {
            addCriterion("TypeIn_Date is null");
            return (Criteria) this;
        }

        public Criteria andTypeIn_DateIsNotNull() {
            addCriterion("TypeIn_Date is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIn_DateEqualTo(Date value) {
            addCriterion("TypeIn_Date =", value, "typeIn_Date");
            return (Criteria) this;
        }

        public Criteria andTypeIn_DateNotEqualTo(Date value) {
            addCriterion("TypeIn_Date <>", value, "typeIn_Date");
            return (Criteria) this;
        }

        public Criteria andTypeIn_DateGreaterThan(Date value) {
            addCriterion("TypeIn_Date >", value, "typeIn_Date");
            return (Criteria) this;
        }

        public Criteria andTypeIn_DateGreaterThanOrEqualTo(Date value) {
            addCriterion("TypeIn_Date >=", value, "typeIn_Date");
            return (Criteria) this;
        }

        public Criteria andTypeIn_DateLessThan(Date value) {
            addCriterion("TypeIn_Date <", value, "typeIn_Date");
            return (Criteria) this;
        }

        public Criteria andTypeIn_DateLessThanOrEqualTo(Date value) {
            addCriterion("TypeIn_Date <=", value, "typeIn_Date");
            return (Criteria) this;
        }

        public Criteria andTypeIn_DateIn(List<Date> values) {
            addCriterion("TypeIn_Date in", values, "typeIn_Date");
            return (Criteria) this;
        }

        public Criteria andTypeIn_DateNotIn(List<Date> values) {
            addCriterion("TypeIn_Date not in", values, "typeIn_Date");
            return (Criteria) this;
        }

        public Criteria andTypeIn_DateBetween(Date value1, Date value2) {
            addCriterion("TypeIn_Date between", value1, value2, "typeIn_Date");
            return (Criteria) this;
        }

        public Criteria andTypeIn_DateNotBetween(Date value1, Date value2) {
            addCriterion("TypeIn_Date not between", value1, value2, "typeIn_Date");
            return (Criteria) this;
        }

        public Criteria andMedicare_LineIsNull() {
            addCriterion("Medicare_Line is null");
            return (Criteria) this;
        }

        public Criteria andMedicare_LineIsNotNull() {
            addCriterion("Medicare_Line is not null");
            return (Criteria) this;
        }

        public Criteria andMedicare_LineEqualTo(BigDecimal value) {
            addCriterion("Medicare_Line =", value, "medicare_Line");
            return (Criteria) this;
        }

        public Criteria andMedicare_LineNotEqualTo(BigDecimal value) {
            addCriterion("Medicare_Line <>", value, "medicare_Line");
            return (Criteria) this;
        }

        public Criteria andMedicare_LineGreaterThan(BigDecimal value) {
            addCriterion("Medicare_Line >", value, "medicare_Line");
            return (Criteria) this;
        }

        public Criteria andMedicare_LineGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Medicare_Line >=", value, "medicare_Line");
            return (Criteria) this;
        }

        public Criteria andMedicare_LineLessThan(BigDecimal value) {
            addCriterion("Medicare_Line <", value, "medicare_Line");
            return (Criteria) this;
        }

        public Criteria andMedicare_LineLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Medicare_Line <=", value, "medicare_Line");
            return (Criteria) this;
        }

        public Criteria andMedicare_LineIn(List<BigDecimal> values) {
            addCriterion("Medicare_Line in", values, "medicare_Line");
            return (Criteria) this;
        }

        public Criteria andMedicare_LineNotIn(List<BigDecimal> values) {
            addCriterion("Medicare_Line not in", values, "medicare_Line");
            return (Criteria) this;
        }

        public Criteria andMedicare_LineBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Medicare_Line between", value1, value2, "medicare_Line");
            return (Criteria) this;
        }

        public Criteria andMedicare_LineNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Medicare_Line not between", value1, value2, "medicare_Line");
            return (Criteria) this;
        }

        public Criteria andStdDisease_CodeIsNull() {
            addCriterion("StdDisease_Code is null");
            return (Criteria) this;
        }

        public Criteria andStdDisease_CodeIsNotNull() {
            addCriterion("StdDisease_Code is not null");
            return (Criteria) this;
        }

        public Criteria andStdDisease_CodeEqualTo(String value) {
            addCriterion("StdDisease_Code =", value, "stdDisease_Code");
            return (Criteria) this;
        }

        public Criteria andStdDisease_CodeNotEqualTo(String value) {
            addCriterion("StdDisease_Code <>", value, "stdDisease_Code");
            return (Criteria) this;
        }

        public Criteria andStdDisease_CodeGreaterThan(String value) {
            addCriterion("StdDisease_Code >", value, "stdDisease_Code");
            return (Criteria) this;
        }

        public Criteria andStdDisease_CodeGreaterThanOrEqualTo(String value) {
            addCriterion("StdDisease_Code >=", value, "stdDisease_Code");
            return (Criteria) this;
        }

        public Criteria andStdDisease_CodeLessThan(String value) {
            addCriterion("StdDisease_Code <", value, "stdDisease_Code");
            return (Criteria) this;
        }

        public Criteria andStdDisease_CodeLessThanOrEqualTo(String value) {
            addCriterion("StdDisease_Code <=", value, "stdDisease_Code");
            return (Criteria) this;
        }

        public Criteria andStdDisease_CodeLike(String value) {
            addCriterion("StdDisease_Code like", value, "stdDisease_Code");
            return (Criteria) this;
        }

        public Criteria andStdDisease_CodeNotLike(String value) {
            addCriterion("StdDisease_Code not like", value, "stdDisease_Code");
            return (Criteria) this;
        }

        public Criteria andStdDisease_CodeIn(List<String> values) {
            addCriterion("StdDisease_Code in", values, "stdDisease_Code");
            return (Criteria) this;
        }

        public Criteria andStdDisease_CodeNotIn(List<String> values) {
            addCriterion("StdDisease_Code not in", values, "stdDisease_Code");
            return (Criteria) this;
        }

        public Criteria andStdDisease_CodeBetween(String value1, String value2) {
            addCriterion("StdDisease_Code between", value1, value2, "stdDisease_Code");
            return (Criteria) this;
        }

        public Criteria andStdDisease_CodeNotBetween(String value1, String value2) {
            addCriterion("StdDisease_Code not between", value1, value2, "stdDisease_Code");
            return (Criteria) this;
        }

        public Criteria andStdDisease_NameIsNull() {
            addCriterion("StdDisease_Name is null");
            return (Criteria) this;
        }

        public Criteria andStdDisease_NameIsNotNull() {
            addCriterion("StdDisease_Name is not null");
            return (Criteria) this;
        }

        public Criteria andStdDisease_NameEqualTo(String value) {
            addCriterion("StdDisease_Name =", value, "stdDisease_Name");
            return (Criteria) this;
        }

        public Criteria andStdDisease_NameNotEqualTo(String value) {
            addCriterion("StdDisease_Name <>", value, "stdDisease_Name");
            return (Criteria) this;
        }

        public Criteria andStdDisease_NameGreaterThan(String value) {
            addCriterion("StdDisease_Name >", value, "stdDisease_Name");
            return (Criteria) this;
        }

        public Criteria andStdDisease_NameGreaterThanOrEqualTo(String value) {
            addCriterion("StdDisease_Name >=", value, "stdDisease_Name");
            return (Criteria) this;
        }

        public Criteria andStdDisease_NameLessThan(String value) {
            addCriterion("StdDisease_Name <", value, "stdDisease_Name");
            return (Criteria) this;
        }

        public Criteria andStdDisease_NameLessThanOrEqualTo(String value) {
            addCriterion("StdDisease_Name <=", value, "stdDisease_Name");
            return (Criteria) this;
        }

        public Criteria andStdDisease_NameLike(String value) {
            addCriterion("StdDisease_Name like", value, "stdDisease_Name");
            return (Criteria) this;
        }

        public Criteria andStdDisease_NameNotLike(String value) {
            addCriterion("StdDisease_Name not like", value, "stdDisease_Name");
            return (Criteria) this;
        }

        public Criteria andStdDisease_NameIn(List<String> values) {
            addCriterion("StdDisease_Name in", values, "stdDisease_Name");
            return (Criteria) this;
        }

        public Criteria andStdDisease_NameNotIn(List<String> values) {
            addCriterion("StdDisease_Name not in", values, "stdDisease_Name");
            return (Criteria) this;
        }

        public Criteria andStdDisease_NameBetween(String value1, String value2) {
            addCriterion("StdDisease_Name between", value1, value2, "stdDisease_Name");
            return (Criteria) this;
        }

        public Criteria andStdDisease_NameNotBetween(String value1, String value2) {
            addCriterion("StdDisease_Name not between", value1, value2, "stdDisease_Name");
            return (Criteria) this;
        }

        public Criteria andAMoneyIsNull() {
            addCriterion("AMoney is null");
            return (Criteria) this;
        }

        public Criteria andAMoneyIsNotNull() {
            addCriterion("AMoney is not null");
            return (Criteria) this;
        }

        public Criteria andAMoneyEqualTo(BigDecimal value) {
            addCriterion("AMoney =", value, "AMoney");
            return (Criteria) this;
        }

        public Criteria andAMoneyNotEqualTo(BigDecimal value) {
            addCriterion("AMoney <>", value, "AMoney");
            return (Criteria) this;
        }

        public Criteria andAMoneyGreaterThan(BigDecimal value) {
            addCriterion("AMoney >", value, "AMoney");
            return (Criteria) this;
        }

        public Criteria andAMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMoney >=", value, "AMoney");
            return (Criteria) this;
        }

        public Criteria andAMoneyLessThan(BigDecimal value) {
            addCriterion("AMoney <", value, "AMoney");
            return (Criteria) this;
        }

        public Criteria andAMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMoney <=", value, "AMoney");
            return (Criteria) this;
        }

        public Criteria andAMoneyIn(List<BigDecimal> values) {
            addCriterion("AMoney in", values, "AMoney");
            return (Criteria) this;
        }

        public Criteria andAMoneyNotIn(List<BigDecimal> values) {
            addCriterion("AMoney not in", values, "AMoney");
            return (Criteria) this;
        }

        public Criteria andAMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMoney between", value1, value2, "AMoney");
            return (Criteria) this;
        }

        public Criteria andAMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMoney not between", value1, value2, "AMoney");
            return (Criteria) this;
        }

        public Criteria andBMoneyIsNull() {
            addCriterion("BMoney is null");
            return (Criteria) this;
        }

        public Criteria andBMoneyIsNotNull() {
            addCriterion("BMoney is not null");
            return (Criteria) this;
        }

        public Criteria andBMoneyEqualTo(BigDecimal value) {
            addCriterion("BMoney =", value, "BMoney");
            return (Criteria) this;
        }

        public Criteria andBMoneyNotEqualTo(BigDecimal value) {
            addCriterion("BMoney <>", value, "BMoney");
            return (Criteria) this;
        }

        public Criteria andBMoneyGreaterThan(BigDecimal value) {
            addCriterion("BMoney >", value, "BMoney");
            return (Criteria) this;
        }

        public Criteria andBMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BMoney >=", value, "BMoney");
            return (Criteria) this;
        }

        public Criteria andBMoneyLessThan(BigDecimal value) {
            addCriterion("BMoney <", value, "BMoney");
            return (Criteria) this;
        }

        public Criteria andBMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BMoney <=", value, "BMoney");
            return (Criteria) this;
        }

        public Criteria andBMoneyIn(List<BigDecimal> values) {
            addCriterion("BMoney in", values, "BMoney");
            return (Criteria) this;
        }

        public Criteria andBMoneyNotIn(List<BigDecimal> values) {
            addCriterion("BMoney not in", values, "BMoney");
            return (Criteria) this;
        }

        public Criteria andBMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BMoney between", value1, value2, "BMoney");
            return (Criteria) this;
        }

        public Criteria andBMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BMoney not between", value1, value2, "BMoney");
            return (Criteria) this;
        }

        public Criteria andCMoneyIsNull() {
            addCriterion("CMoney is null");
            return (Criteria) this;
        }

        public Criteria andCMoneyIsNotNull() {
            addCriterion("CMoney is not null");
            return (Criteria) this;
        }

        public Criteria andCMoneyEqualTo(BigDecimal value) {
            addCriterion("CMoney =", value, "CMoney");
            return (Criteria) this;
        }

        public Criteria andCMoneyNotEqualTo(BigDecimal value) {
            addCriterion("CMoney <>", value, "CMoney");
            return (Criteria) this;
        }

        public Criteria andCMoneyGreaterThan(BigDecimal value) {
            addCriterion("CMoney >", value, "CMoney");
            return (Criteria) this;
        }

        public Criteria andCMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CMoney >=", value, "CMoney");
            return (Criteria) this;
        }

        public Criteria andCMoneyLessThan(BigDecimal value) {
            addCriterion("CMoney <", value, "CMoney");
            return (Criteria) this;
        }

        public Criteria andCMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CMoney <=", value, "CMoney");
            return (Criteria) this;
        }

        public Criteria andCMoneyIn(List<BigDecimal> values) {
            addCriterion("CMoney in", values, "CMoney");
            return (Criteria) this;
        }

        public Criteria andCMoneyNotIn(List<BigDecimal> values) {
            addCriterion("CMoney not in", values, "CMoney");
            return (Criteria) this;
        }

        public Criteria andCMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CMoney between", value1, value2, "CMoney");
            return (Criteria) this;
        }

        public Criteria andCMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CMoney not between", value1, value2, "CMoney");
            return (Criteria) this;
        }

        public Criteria andZL_MoneyIsNull() {
            addCriterion("ZL_Money is null");
            return (Criteria) this;
        }

        public Criteria andZL_MoneyIsNotNull() {
            addCriterion("ZL_Money is not null");
            return (Criteria) this;
        }

        public Criteria andZL_MoneyEqualTo(BigDecimal value) {
            addCriterion("ZL_Money =", value, "ZL_Money");
            return (Criteria) this;
        }

        public Criteria andZL_MoneyNotEqualTo(BigDecimal value) {
            addCriterion("ZL_Money <>", value, "ZL_Money");
            return (Criteria) this;
        }

        public Criteria andZL_MoneyGreaterThan(BigDecimal value) {
            addCriterion("ZL_Money >", value, "ZL_Money");
            return (Criteria) this;
        }

        public Criteria andZL_MoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZL_Money >=", value, "ZL_Money");
            return (Criteria) this;
        }

        public Criteria andZL_MoneyLessThan(BigDecimal value) {
            addCriterion("ZL_Money <", value, "ZL_Money");
            return (Criteria) this;
        }

        public Criteria andZL_MoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZL_Money <=", value, "ZL_Money");
            return (Criteria) this;
        }

        public Criteria andZL_MoneyIn(List<BigDecimal> values) {
            addCriterion("ZL_Money in", values, "ZL_Money");
            return (Criteria) this;
        }

        public Criteria andZL_MoneyNotIn(List<BigDecimal> values) {
            addCriterion("ZL_Money not in", values, "ZL_Money");
            return (Criteria) this;
        }

        public Criteria andZL_MoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZL_Money between", value1, value2, "ZL_Money");
            return (Criteria) this;
        }

        public Criteria andZL_MoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZL_Money not between", value1, value2, "ZL_Money");
            return (Criteria) this;
        }

        public Criteria andZF_MoneyIsNull() {
            addCriterion("ZF_Money is null");
            return (Criteria) this;
        }

        public Criteria andZF_MoneyIsNotNull() {
            addCriterion("ZF_Money is not null");
            return (Criteria) this;
        }

        public Criteria andZF_MoneyEqualTo(BigDecimal value) {
            addCriterion("ZF_Money =", value, "ZF_Money");
            return (Criteria) this;
        }

        public Criteria andZF_MoneyNotEqualTo(BigDecimal value) {
            addCriterion("ZF_Money <>", value, "ZF_Money");
            return (Criteria) this;
        }

        public Criteria andZF_MoneyGreaterThan(BigDecimal value) {
            addCriterion("ZF_Money >", value, "ZF_Money");
            return (Criteria) this;
        }

        public Criteria andZF_MoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZF_Money >=", value, "ZF_Money");
            return (Criteria) this;
        }

        public Criteria andZF_MoneyLessThan(BigDecimal value) {
            addCriterion("ZF_Money <", value, "ZF_Money");
            return (Criteria) this;
        }

        public Criteria andZF_MoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZF_Money <=", value, "ZF_Money");
            return (Criteria) this;
        }

        public Criteria andZF_MoneyIn(List<BigDecimal> values) {
            addCriterion("ZF_Money in", values, "ZF_Money");
            return (Criteria) this;
        }

        public Criteria andZF_MoneyNotIn(List<BigDecimal> values) {
            addCriterion("ZF_Money not in", values, "ZF_Money");
            return (Criteria) this;
        }

        public Criteria andZF_MoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZF_Money between", value1, value2, "ZF_Money");
            return (Criteria) this;
        }

        public Criteria andZF_MoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZF_Money not between", value1, value2, "ZF_Money");
            return (Criteria) this;
        }

        public Criteria andYLZ_MoneyIsNull() {
            addCriterion("YLZ_Money is null");
            return (Criteria) this;
        }

        public Criteria andYLZ_MoneyIsNotNull() {
            addCriterion("YLZ_Money is not null");
            return (Criteria) this;
        }

        public Criteria andYLZ_MoneyEqualTo(BigDecimal value) {
            addCriterion("YLZ_Money =", value, "YLZ_Money");
            return (Criteria) this;
        }

        public Criteria andYLZ_MoneyNotEqualTo(BigDecimal value) {
            addCriterion("YLZ_Money <>", value, "YLZ_Money");
            return (Criteria) this;
        }

        public Criteria andYLZ_MoneyGreaterThan(BigDecimal value) {
            addCriterion("YLZ_Money >", value, "YLZ_Money");
            return (Criteria) this;
        }

        public Criteria andYLZ_MoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YLZ_Money >=", value, "YLZ_Money");
            return (Criteria) this;
        }

        public Criteria andYLZ_MoneyLessThan(BigDecimal value) {
            addCriterion("YLZ_Money <", value, "YLZ_Money");
            return (Criteria) this;
        }

        public Criteria andYLZ_MoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("YLZ_Money <=", value, "YLZ_Money");
            return (Criteria) this;
        }

        public Criteria andYLZ_MoneyIn(List<BigDecimal> values) {
            addCriterion("YLZ_Money in", values, "YLZ_Money");
            return (Criteria) this;
        }

        public Criteria andYLZ_MoneyNotIn(List<BigDecimal> values) {
            addCriterion("YLZ_Money not in", values, "YLZ_Money");
            return (Criteria) this;
        }

        public Criteria andYLZ_MoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YLZ_Money between", value1, value2, "YLZ_Money");
            return (Criteria) this;
        }

        public Criteria andYLZ_MoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YLZ_Money not between", value1, value2, "YLZ_Money");
            return (Criteria) this;
        }

        public Criteria andGR_MoneyIsNull() {
            addCriterion("GR_Money is null");
            return (Criteria) this;
        }

        public Criteria andGR_MoneyIsNotNull() {
            addCriterion("GR_Money is not null");
            return (Criteria) this;
        }

        public Criteria andGR_MoneyEqualTo(BigDecimal value) {
            addCriterion("GR_Money =", value, "GR_Money");
            return (Criteria) this;
        }

        public Criteria andGR_MoneyNotEqualTo(BigDecimal value) {
            addCriterion("GR_Money <>", value, "GR_Money");
            return (Criteria) this;
        }

        public Criteria andGR_MoneyGreaterThan(BigDecimal value) {
            addCriterion("GR_Money >", value, "GR_Money");
            return (Criteria) this;
        }

        public Criteria andGR_MoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GR_Money >=", value, "GR_Money");
            return (Criteria) this;
        }

        public Criteria andGR_MoneyLessThan(BigDecimal value) {
            addCriterion("GR_Money <", value, "GR_Money");
            return (Criteria) this;
        }

        public Criteria andGR_MoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GR_Money <=", value, "GR_Money");
            return (Criteria) this;
        }

        public Criteria andGR_MoneyIn(List<BigDecimal> values) {
            addCriterion("GR_Money in", values, "GR_Money");
            return (Criteria) this;
        }

        public Criteria andGR_MoneyNotIn(List<BigDecimal> values) {
            addCriterion("GR_Money not in", values, "GR_Money");
            return (Criteria) this;
        }

        public Criteria andGR_MoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GR_Money between", value1, value2, "GR_Money");
            return (Criteria) this;
        }

        public Criteria andGR_MoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GR_Money not between", value1, value2, "GR_Money");
            return (Criteria) this;
        }

        public Criteria andYBBX_MoneyIsNull() {
            addCriterion("YBBX_Money is null");
            return (Criteria) this;
        }

        public Criteria andYBBX_MoneyIsNotNull() {
            addCriterion("YBBX_Money is not null");
            return (Criteria) this;
        }

        public Criteria andYBBX_MoneyEqualTo(BigDecimal value) {
            addCriterion("YBBX_Money =", value, "YBBX_Money");
            return (Criteria) this;
        }

        public Criteria andYBBX_MoneyNotEqualTo(BigDecimal value) {
            addCriterion("YBBX_Money <>", value, "YBBX_Money");
            return (Criteria) this;
        }

        public Criteria andYBBX_MoneyGreaterThan(BigDecimal value) {
            addCriterion("YBBX_Money >", value, "YBBX_Money");
            return (Criteria) this;
        }

        public Criteria andYBBX_MoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YBBX_Money >=", value, "YBBX_Money");
            return (Criteria) this;
        }

        public Criteria andYBBX_MoneyLessThan(BigDecimal value) {
            addCriterion("YBBX_Money <", value, "YBBX_Money");
            return (Criteria) this;
        }

        public Criteria andYBBX_MoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("YBBX_Money <=", value, "YBBX_Money");
            return (Criteria) this;
        }

        public Criteria andYBBX_MoneyIn(List<BigDecimal> values) {
            addCriterion("YBBX_Money in", values, "YBBX_Money");
            return (Criteria) this;
        }

        public Criteria andYBBX_MoneyNotIn(List<BigDecimal> values) {
            addCriterion("YBBX_Money not in", values, "YBBX_Money");
            return (Criteria) this;
        }

        public Criteria andYBBX_MoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YBBX_Money between", value1, value2, "YBBX_Money");
            return (Criteria) this;
        }

        public Criteria andYBBX_MoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YBBX_Money not between", value1, value2, "YBBX_Money");
            return (Criteria) this;
        }

        public Criteria andXNH_MoneyIsNull() {
            addCriterion("XNH_Money is null");
            return (Criteria) this;
        }

        public Criteria andXNH_MoneyIsNotNull() {
            addCriterion("XNH_Money is not null");
            return (Criteria) this;
        }

        public Criteria andXNH_MoneyEqualTo(BigDecimal value) {
            addCriterion("XNH_Money =", value, "XNH_Money");
            return (Criteria) this;
        }

        public Criteria andXNH_MoneyNotEqualTo(BigDecimal value) {
            addCriterion("XNH_Money <>", value, "XNH_Money");
            return (Criteria) this;
        }

        public Criteria andXNH_MoneyGreaterThan(BigDecimal value) {
            addCriterion("XNH_Money >", value, "XNH_Money");
            return (Criteria) this;
        }

        public Criteria andXNH_MoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XNH_Money >=", value, "XNH_Money");
            return (Criteria) this;
        }

        public Criteria andXNH_MoneyLessThan(BigDecimal value) {
            addCriterion("XNH_Money <", value, "XNH_Money");
            return (Criteria) this;
        }

        public Criteria andXNH_MoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("XNH_Money <=", value, "XNH_Money");
            return (Criteria) this;
        }

        public Criteria andXNH_MoneyIn(List<BigDecimal> values) {
            addCriterion("XNH_Money in", values, "XNH_Money");
            return (Criteria) this;
        }

        public Criteria andXNH_MoneyNotIn(List<BigDecimal> values) {
            addCriterion("XNH_Money not in", values, "XNH_Money");
            return (Criteria) this;
        }

        public Criteria andXNH_MoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XNH_Money between", value1, value2, "XNH_Money");
            return (Criteria) this;
        }

        public Criteria andXNH_MoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XNH_Money not between", value1, value2, "XNH_Money");
            return (Criteria) this;
        }

        public Criteria andFamily_CodeIsNull() {
            addCriterion("Family_Code is null");
            return (Criteria) this;
        }

        public Criteria andFamily_CodeIsNotNull() {
            addCriterion("Family_Code is not null");
            return (Criteria) this;
        }

        public Criteria andFamily_CodeEqualTo(String value) {
            addCriterion("Family_Code =", value, "family_Code");
            return (Criteria) this;
        }

        public Criteria andFamily_CodeNotEqualTo(String value) {
            addCriterion("Family_Code <>", value, "family_Code");
            return (Criteria) this;
        }

        public Criteria andFamily_CodeGreaterThan(String value) {
            addCriterion("Family_Code >", value, "family_Code");
            return (Criteria) this;
        }

        public Criteria andFamily_CodeGreaterThanOrEqualTo(String value) {
            addCriterion("Family_Code >=", value, "family_Code");
            return (Criteria) this;
        }

        public Criteria andFamily_CodeLessThan(String value) {
            addCriterion("Family_Code <", value, "family_Code");
            return (Criteria) this;
        }

        public Criteria andFamily_CodeLessThanOrEqualTo(String value) {
            addCriterion("Family_Code <=", value, "family_Code");
            return (Criteria) this;
        }

        public Criteria andFamily_CodeLike(String value) {
            addCriterion("Family_Code like", value, "family_Code");
            return (Criteria) this;
        }

        public Criteria andFamily_CodeNotLike(String value) {
            addCriterion("Family_Code not like", value, "family_Code");
            return (Criteria) this;
        }

        public Criteria andFamily_CodeIn(List<String> values) {
            addCriterion("Family_Code in", values, "family_Code");
            return (Criteria) this;
        }

        public Criteria andFamily_CodeNotIn(List<String> values) {
            addCriterion("Family_Code not in", values, "family_Code");
            return (Criteria) this;
        }

        public Criteria andFamily_CodeBetween(String value1, String value2) {
            addCriterion("Family_Code between", value1, value2, "family_Code");
            return (Criteria) this;
        }

        public Criteria andFamily_CodeNotBetween(String value1, String value2) {
            addCriterion("Family_Code not between", value1, value2, "family_Code");
            return (Criteria) this;
        }

        public Criteria andApply_DateIsNull() {
            addCriterion("Apply_Date is null");
            return (Criteria) this;
        }

        public Criteria andApply_DateIsNotNull() {
            addCriterion("Apply_Date is not null");
            return (Criteria) this;
        }

        public Criteria andApply_DateEqualTo(Date value) {
            addCriterion("Apply_Date =", value, "apply_Date");
            return (Criteria) this;
        }

        public Criteria andApply_DateNotEqualTo(Date value) {
            addCriterion("Apply_Date <>", value, "apply_Date");
            return (Criteria) this;
        }

        public Criteria andApply_DateGreaterThan(Date value) {
            addCriterion("Apply_Date >", value, "apply_Date");
            return (Criteria) this;
        }

        public Criteria andApply_DateGreaterThanOrEqualTo(Date value) {
            addCriterion("Apply_Date >=", value, "apply_Date");
            return (Criteria) this;
        }

        public Criteria andApply_DateLessThan(Date value) {
            addCriterion("Apply_Date <", value, "apply_Date");
            return (Criteria) this;
        }

        public Criteria andApply_DateLessThanOrEqualTo(Date value) {
            addCriterion("Apply_Date <=", value, "apply_Date");
            return (Criteria) this;
        }

        public Criteria andApply_DateIn(List<Date> values) {
            addCriterion("Apply_Date in", values, "apply_Date");
            return (Criteria) this;
        }

        public Criteria andApply_DateNotIn(List<Date> values) {
            addCriterion("Apply_Date not in", values, "apply_Date");
            return (Criteria) this;
        }

        public Criteria andApply_DateBetween(Date value1, Date value2) {
            addCriterion("Apply_Date between", value1, value2, "apply_Date");
            return (Criteria) this;
        }

        public Criteria andApply_DateNotBetween(Date value1, Date value2) {
            addCriterion("Apply_Date not between", value1, value2, "apply_Date");
            return (Criteria) this;
        }

        public Criteria andDBBX_MoneyIsNull() {
            addCriterion("DBBX_Money is null");
            return (Criteria) this;
        }

        public Criteria andDBBX_MoneyIsNotNull() {
            addCriterion("DBBX_Money is not null");
            return (Criteria) this;
        }

        public Criteria andDBBX_MoneyEqualTo(BigDecimal value) {
            addCriterion("DBBX_Money =", value, "DBBX_Money");
            return (Criteria) this;
        }

        public Criteria andDBBX_MoneyNotEqualTo(BigDecimal value) {
            addCriterion("DBBX_Money <>", value, "DBBX_Money");
            return (Criteria) this;
        }

        public Criteria andDBBX_MoneyGreaterThan(BigDecimal value) {
            addCriterion("DBBX_Money >", value, "DBBX_Money");
            return (Criteria) this;
        }

        public Criteria andDBBX_MoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DBBX_Money >=", value, "DBBX_Money");
            return (Criteria) this;
        }

        public Criteria andDBBX_MoneyLessThan(BigDecimal value) {
            addCriterion("DBBX_Money <", value, "DBBX_Money");
            return (Criteria) this;
        }

        public Criteria andDBBX_MoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DBBX_Money <=", value, "DBBX_Money");
            return (Criteria) this;
        }

        public Criteria andDBBX_MoneyIn(List<BigDecimal> values) {
            addCriterion("DBBX_Money in", values, "DBBX_Money");
            return (Criteria) this;
        }

        public Criteria andDBBX_MoneyNotIn(List<BigDecimal> values) {
            addCriterion("DBBX_Money not in", values, "DBBX_Money");
            return (Criteria) this;
        }

        public Criteria andDBBX_MoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DBBX_Money between", value1, value2, "DBBX_Money");
            return (Criteria) this;
        }

        public Criteria andDBBX_MoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DBBX_Money not between", value1, value2, "DBBX_Money");
            return (Criteria) this;
        }

        public Criteria andCard_NOIsNull() {
            addCriterion("Card_NO is null");
            return (Criteria) this;
        }

        public Criteria andCard_NOIsNotNull() {
            addCriterion("Card_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCard_NOEqualTo(String value) {
            addCriterion("Card_NO =", value, "card_NO");
            return (Criteria) this;
        }

        public Criteria andCard_NONotEqualTo(String value) {
            addCriterion("Card_NO <>", value, "card_NO");
            return (Criteria) this;
        }

        public Criteria andCard_NOGreaterThan(String value) {
            addCriterion("Card_NO >", value, "card_NO");
            return (Criteria) this;
        }

        public Criteria andCard_NOGreaterThanOrEqualTo(String value) {
            addCriterion("Card_NO >=", value, "card_NO");
            return (Criteria) this;
        }

        public Criteria andCard_NOLessThan(String value) {
            addCriterion("Card_NO <", value, "card_NO");
            return (Criteria) this;
        }

        public Criteria andCard_NOLessThanOrEqualTo(String value) {
            addCriterion("Card_NO <=", value, "card_NO");
            return (Criteria) this;
        }

        public Criteria andCard_NOLike(String value) {
            addCriterion("Card_NO like", value, "card_NO");
            return (Criteria) this;
        }

        public Criteria andCard_NONotLike(String value) {
            addCriterion("Card_NO not like", value, "card_NO");
            return (Criteria) this;
        }

        public Criteria andCard_NOIn(List<String> values) {
            addCriterion("Card_NO in", values, "card_NO");
            return (Criteria) this;
        }

        public Criteria andCard_NONotIn(List<String> values) {
            addCriterion("Card_NO not in", values, "card_NO");
            return (Criteria) this;
        }

        public Criteria andCard_NOBetween(String value1, String value2) {
            addCriterion("Card_NO between", value1, value2, "card_NO");
            return (Criteria) this;
        }

        public Criteria andCard_NONotBetween(String value1, String value2) {
            addCriterion("Card_NO not between", value1, value2, "card_NO");
            return (Criteria) this;
        }

        public Criteria andFinish_FlagIsNull() {
            addCriterion("Finish_Flag is null");
            return (Criteria) this;
        }

        public Criteria andFinish_FlagIsNotNull() {
            addCriterion("Finish_Flag is not null");
            return (Criteria) this;
        }

        public Criteria andFinish_FlagEqualTo(Integer value) {
            addCriterion("Finish_Flag =", value, "finish_Flag");
            return (Criteria) this;
        }

        public Criteria andFinish_FlagNotEqualTo(Integer value) {
            addCriterion("Finish_Flag <>", value, "finish_Flag");
            return (Criteria) this;
        }

        public Criteria andFinish_FlagGreaterThan(Integer value) {
            addCriterion("Finish_Flag >", value, "finish_Flag");
            return (Criteria) this;
        }

        public Criteria andFinish_FlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("Finish_Flag >=", value, "finish_Flag");
            return (Criteria) this;
        }

        public Criteria andFinish_FlagLessThan(Integer value) {
            addCriterion("Finish_Flag <", value, "finish_Flag");
            return (Criteria) this;
        }

        public Criteria andFinish_FlagLessThanOrEqualTo(Integer value) {
            addCriterion("Finish_Flag <=", value, "finish_Flag");
            return (Criteria) this;
        }

        public Criteria andFinish_FlagIn(List<Integer> values) {
            addCriterion("Finish_Flag in", values, "finish_Flag");
            return (Criteria) this;
        }

        public Criteria andFinish_FlagNotIn(List<Integer> values) {
            addCriterion("Finish_Flag not in", values, "finish_Flag");
            return (Criteria) this;
        }

        public Criteria andFinish_FlagBetween(Integer value1, Integer value2) {
            addCriterion("Finish_Flag between", value1, value2, "finish_Flag");
            return (Criteria) this;
        }

        public Criteria andFinish_FlagNotBetween(Integer value1, Integer value2) {
            addCriterion("Finish_Flag not between", value1, value2, "finish_Flag");
            return (Criteria) this;
        }

        public Criteria andSfLbIsNull() {
            addCriterion("SfLb is null");
            return (Criteria) this;
        }

        public Criteria andSfLbIsNotNull() {
            addCriterion("SfLb is not null");
            return (Criteria) this;
        }

        public Criteria andSfLbEqualTo(String value) {
            addCriterion("SfLb =", value, "sfLb");
            return (Criteria) this;
        }

        public Criteria andSfLbNotEqualTo(String value) {
            addCriterion("SfLb <>", value, "sfLb");
            return (Criteria) this;
        }

        public Criteria andSfLbGreaterThan(String value) {
            addCriterion("SfLb >", value, "sfLb");
            return (Criteria) this;
        }

        public Criteria andSfLbGreaterThanOrEqualTo(String value) {
            addCriterion("SfLb >=", value, "sfLb");
            return (Criteria) this;
        }

        public Criteria andSfLbLessThan(String value) {
            addCriterion("SfLb <", value, "sfLb");
            return (Criteria) this;
        }

        public Criteria andSfLbLessThanOrEqualTo(String value) {
            addCriterion("SfLb <=", value, "sfLb");
            return (Criteria) this;
        }

        public Criteria andSfLbLike(String value) {
            addCriterion("SfLb like", value, "sfLb");
            return (Criteria) this;
        }

        public Criteria andSfLbNotLike(String value) {
            addCriterion("SfLb not like", value, "sfLb");
            return (Criteria) this;
        }

        public Criteria andSfLbIn(List<String> values) {
            addCriterion("SfLb in", values, "sfLb");
            return (Criteria) this;
        }

        public Criteria andSfLbNotIn(List<String> values) {
            addCriterion("SfLb not in", values, "sfLb");
            return (Criteria) this;
        }

        public Criteria andSfLbBetween(String value1, String value2) {
            addCriterion("SfLb between", value1, value2, "sfLb");
            return (Criteria) this;
        }

        public Criteria andSfLbNotBetween(String value1, String value2) {
            addCriterion("SfLb not between", value1, value2, "sfLb");
            return (Criteria) this;
        }

        public Criteria andJGBMIsNull() {
            addCriterion("JGBM is null");
            return (Criteria) this;
        }

        public Criteria andJGBMIsNotNull() {
            addCriterion("JGBM is not null");
            return (Criteria) this;
        }

        public Criteria andJGBMEqualTo(String value) {
            addCriterion("JGBM =", value, "JGBM");
            return (Criteria) this;
        }

        public Criteria andJGBMNotEqualTo(String value) {
            addCriterion("JGBM <>", value, "JGBM");
            return (Criteria) this;
        }

        public Criteria andJGBMGreaterThan(String value) {
            addCriterion("JGBM >", value, "JGBM");
            return (Criteria) this;
        }

        public Criteria andJGBMGreaterThanOrEqualTo(String value) {
            addCriterion("JGBM >=", value, "JGBM");
            return (Criteria) this;
        }

        public Criteria andJGBMLessThan(String value) {
            addCriterion("JGBM <", value, "JGBM");
            return (Criteria) this;
        }

        public Criteria andJGBMLessThanOrEqualTo(String value) {
            addCriterion("JGBM <=", value, "JGBM");
            return (Criteria) this;
        }

        public Criteria andJGBMLike(String value) {
            addCriterion("JGBM like", value, "JGBM");
            return (Criteria) this;
        }

        public Criteria andJGBMNotLike(String value) {
            addCriterion("JGBM not like", value, "JGBM");
            return (Criteria) this;
        }

        public Criteria andJGBMIn(List<String> values) {
            addCriterion("JGBM in", values, "JGBM");
            return (Criteria) this;
        }

        public Criteria andJGBMNotIn(List<String> values) {
            addCriterion("JGBM not in", values, "JGBM");
            return (Criteria) this;
        }

        public Criteria andJGBMBetween(String value1, String value2) {
            addCriterion("JGBM between", value1, value2, "JGBM");
            return (Criteria) this;
        }

        public Criteria andJGBMNotBetween(String value1, String value2) {
            addCriterion("JGBM not between", value1, value2, "JGBM");
            return (Criteria) this;
        }

        public Criteria andPrintCountIsNull() {
            addCriterion("PrintCount is null");
            return (Criteria) this;
        }

        public Criteria andPrintCountIsNotNull() {
            addCriterion("PrintCount is not null");
            return (Criteria) this;
        }

        public Criteria andPrintCountEqualTo(Integer value) {
            addCriterion("PrintCount =", value, "printCount");
            return (Criteria) this;
        }

        public Criteria andPrintCountNotEqualTo(Integer value) {
            addCriterion("PrintCount <>", value, "printCount");
            return (Criteria) this;
        }

        public Criteria andPrintCountGreaterThan(Integer value) {
            addCriterion("PrintCount >", value, "printCount");
            return (Criteria) this;
        }

        public Criteria andPrintCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("PrintCount >=", value, "printCount");
            return (Criteria) this;
        }

        public Criteria andPrintCountLessThan(Integer value) {
            addCriterion("PrintCount <", value, "printCount");
            return (Criteria) this;
        }

        public Criteria andPrintCountLessThanOrEqualTo(Integer value) {
            addCriterion("PrintCount <=", value, "printCount");
            return (Criteria) this;
        }

        public Criteria andPrintCountIn(List<Integer> values) {
            addCriterion("PrintCount in", values, "printCount");
            return (Criteria) this;
        }

        public Criteria andPrintCountNotIn(List<Integer> values) {
            addCriterion("PrintCount not in", values, "printCount");
            return (Criteria) this;
        }

        public Criteria andPrintCountBetween(Integer value1, Integer value2) {
            addCriterion("PrintCount between", value1, value2, "printCount");
            return (Criteria) this;
        }

        public Criteria andPrintCountNotBetween(Integer value1, Integer value2) {
            addCriterion("PrintCount not between", value1, value2, "printCount");
            return (Criteria) this;
        }

        public Criteria andOperator_IDIsNull() {
            addCriterion("Operator_ID is null");
            return (Criteria) this;
        }

        public Criteria andOperator_IDIsNotNull() {
            addCriterion("Operator_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOperator_IDEqualTo(String value) {
            addCriterion("Operator_ID =", value, "operator_ID");
            return (Criteria) this;
        }

        public Criteria andOperator_IDNotEqualTo(String value) {
            addCriterion("Operator_ID <>", value, "operator_ID");
            return (Criteria) this;
        }

        public Criteria andOperator_IDGreaterThan(String value) {
            addCriterion("Operator_ID >", value, "operator_ID");
            return (Criteria) this;
        }

        public Criteria andOperator_IDGreaterThanOrEqualTo(String value) {
            addCriterion("Operator_ID >=", value, "operator_ID");
            return (Criteria) this;
        }

        public Criteria andOperator_IDLessThan(String value) {
            addCriterion("Operator_ID <", value, "operator_ID");
            return (Criteria) this;
        }

        public Criteria andOperator_IDLessThanOrEqualTo(String value) {
            addCriterion("Operator_ID <=", value, "operator_ID");
            return (Criteria) this;
        }

        public Criteria andOperator_IDLike(String value) {
            addCriterion("Operator_ID like", value, "operator_ID");
            return (Criteria) this;
        }

        public Criteria andOperator_IDNotLike(String value) {
            addCriterion("Operator_ID not like", value, "operator_ID");
            return (Criteria) this;
        }

        public Criteria andOperator_IDIn(List<String> values) {
            addCriterion("Operator_ID in", values, "operator_ID");
            return (Criteria) this;
        }

        public Criteria andOperator_IDNotIn(List<String> values) {
            addCriterion("Operator_ID not in", values, "operator_ID");
            return (Criteria) this;
        }

        public Criteria andOperator_IDBetween(String value1, String value2) {
            addCriterion("Operator_ID between", value1, value2, "operator_ID");
            return (Criteria) this;
        }

        public Criteria andOperator_IDNotBetween(String value1, String value2) {
            addCriterion("Operator_ID not between", value1, value2, "operator_ID");
            return (Criteria) this;
        }

        public Criteria andCreate_TimeIsNull() {
            addCriterion("Create_Time is null");
            return (Criteria) this;
        }

        public Criteria andCreate_TimeIsNotNull() {
            addCriterion("Create_Time is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_TimeEqualTo(Date value) {
            addCriterion("Create_Time =", value, "create_Time");
            return (Criteria) this;
        }

        public Criteria andCreate_TimeNotEqualTo(Date value) {
            addCriterion("Create_Time <>", value, "create_Time");
            return (Criteria) this;
        }

        public Criteria andCreate_TimeGreaterThan(Date value) {
            addCriterion("Create_Time >", value, "create_Time");
            return (Criteria) this;
        }

        public Criteria andCreate_TimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Create_Time >=", value, "create_Time");
            return (Criteria) this;
        }

        public Criteria andCreate_TimeLessThan(Date value) {
            addCriterion("Create_Time <", value, "create_Time");
            return (Criteria) this;
        }

        public Criteria andCreate_TimeLessThanOrEqualTo(Date value) {
            addCriterion("Create_Time <=", value, "create_Time");
            return (Criteria) this;
        }

        public Criteria andCreate_TimeIn(List<Date> values) {
            addCriterion("Create_Time in", values, "create_Time");
            return (Criteria) this;
        }

        public Criteria andCreate_TimeNotIn(List<Date> values) {
            addCriterion("Create_Time not in", values, "create_Time");
            return (Criteria) this;
        }

        public Criteria andCreate_TimeBetween(Date value1, Date value2) {
            addCriterion("Create_Time between", value1, value2, "create_Time");
            return (Criteria) this;
        }

        public Criteria andCreate_TimeNotBetween(Date value1, Date value2) {
            addCriterion("Create_Time not between", value1, value2, "create_Time");
            return (Criteria) this;
        }

        public Criteria andPay_Operator_IDIsNull() {
            addCriterion("Pay_Operator_ID is null");
            return (Criteria) this;
        }

        public Criteria andPay_Operator_IDIsNotNull() {
            addCriterion("Pay_Operator_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPay_Operator_IDEqualTo(String value) {
            addCriterion("Pay_Operator_ID =", value, "pay_Operator_ID");
            return (Criteria) this;
        }

        public Criteria andPay_Operator_IDNotEqualTo(String value) {
            addCriterion("Pay_Operator_ID <>", value, "pay_Operator_ID");
            return (Criteria) this;
        }

        public Criteria andPay_Operator_IDGreaterThan(String value) {
            addCriterion("Pay_Operator_ID >", value, "pay_Operator_ID");
            return (Criteria) this;
        }

        public Criteria andPay_Operator_IDGreaterThanOrEqualTo(String value) {
            addCriterion("Pay_Operator_ID >=", value, "pay_Operator_ID");
            return (Criteria) this;
        }

        public Criteria andPay_Operator_IDLessThan(String value) {
            addCriterion("Pay_Operator_ID <", value, "pay_Operator_ID");
            return (Criteria) this;
        }

        public Criteria andPay_Operator_IDLessThanOrEqualTo(String value) {
            addCriterion("Pay_Operator_ID <=", value, "pay_Operator_ID");
            return (Criteria) this;
        }

        public Criteria andPay_Operator_IDLike(String value) {
            addCriterion("Pay_Operator_ID like", value, "pay_Operator_ID");
            return (Criteria) this;
        }

        public Criteria andPay_Operator_IDNotLike(String value) {
            addCriterion("Pay_Operator_ID not like", value, "pay_Operator_ID");
            return (Criteria) this;
        }

        public Criteria andPay_Operator_IDIn(List<String> values) {
            addCriterion("Pay_Operator_ID in", values, "pay_Operator_ID");
            return (Criteria) this;
        }

        public Criteria andPay_Operator_IDNotIn(List<String> values) {
            addCriterion("Pay_Operator_ID not in", values, "pay_Operator_ID");
            return (Criteria) this;
        }

        public Criteria andPay_Operator_IDBetween(String value1, String value2) {
            addCriterion("Pay_Operator_ID between", value1, value2, "pay_Operator_ID");
            return (Criteria) this;
        }

        public Criteria andPay_Operator_IDNotBetween(String value1, String value2) {
            addCriterion("Pay_Operator_ID not between", value1, value2, "pay_Operator_ID");
            return (Criteria) this;
        }

        public Criteria andFinish_DateIsNull() {
            addCriterion("Finish_Date is null");
            return (Criteria) this;
        }

        public Criteria andFinish_DateIsNotNull() {
            addCriterion("Finish_Date is not null");
            return (Criteria) this;
        }

        public Criteria andFinish_DateEqualTo(Date value) {
            addCriterion("Finish_Date =", value, "finish_Date");
            return (Criteria) this;
        }

        public Criteria andFinish_DateNotEqualTo(Date value) {
            addCriterion("Finish_Date <>", value, "finish_Date");
            return (Criteria) this;
        }

        public Criteria andFinish_DateGreaterThan(Date value) {
            addCriterion("Finish_Date >", value, "finish_Date");
            return (Criteria) this;
        }

        public Criteria andFinish_DateGreaterThanOrEqualTo(Date value) {
            addCriterion("Finish_Date >=", value, "finish_Date");
            return (Criteria) this;
        }

        public Criteria andFinish_DateLessThan(Date value) {
            addCriterion("Finish_Date <", value, "finish_Date");
            return (Criteria) this;
        }

        public Criteria andFinish_DateLessThanOrEqualTo(Date value) {
            addCriterion("Finish_Date <=", value, "finish_Date");
            return (Criteria) this;
        }

        public Criteria andFinish_DateIn(List<Date> values) {
            addCriterion("Finish_Date in", values, "finish_Date");
            return (Criteria) this;
        }

        public Criteria andFinish_DateNotIn(List<Date> values) {
            addCriterion("Finish_Date not in", values, "finish_Date");
            return (Criteria) this;
        }

        public Criteria andFinish_DateBetween(Date value1, Date value2) {
            addCriterion("Finish_Date between", value1, value2, "finish_Date");
            return (Criteria) this;
        }

        public Criteria andFinish_DateNotBetween(Date value1, Date value2) {
            addCriterion("Finish_Date not between", value1, value2, "finish_Date");
            return (Criteria) this;
        }

        public Criteria andSelfBaseMoneyIsNull() {
            addCriterion("SelfBaseMoney is null");
            return (Criteria) this;
        }

        public Criteria andSelfBaseMoneyIsNotNull() {
            addCriterion("SelfBaseMoney is not null");
            return (Criteria) this;
        }

        public Criteria andSelfBaseMoneyEqualTo(BigDecimal value) {
            addCriterion("SelfBaseMoney =", value, "selfBaseMoney");
            return (Criteria) this;
        }

        public Criteria andSelfBaseMoneyNotEqualTo(BigDecimal value) {
            addCriterion("SelfBaseMoney <>", value, "selfBaseMoney");
            return (Criteria) this;
        }

        public Criteria andSelfBaseMoneyGreaterThan(BigDecimal value) {
            addCriterion("SelfBaseMoney >", value, "selfBaseMoney");
            return (Criteria) this;
        }

        public Criteria andSelfBaseMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SelfBaseMoney >=", value, "selfBaseMoney");
            return (Criteria) this;
        }

        public Criteria andSelfBaseMoneyLessThan(BigDecimal value) {
            addCriterion("SelfBaseMoney <", value, "selfBaseMoney");
            return (Criteria) this;
        }

        public Criteria andSelfBaseMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SelfBaseMoney <=", value, "selfBaseMoney");
            return (Criteria) this;
        }

        public Criteria andSelfBaseMoneyIn(List<BigDecimal> values) {
            addCriterion("SelfBaseMoney in", values, "selfBaseMoney");
            return (Criteria) this;
        }

        public Criteria andSelfBaseMoneyNotIn(List<BigDecimal> values) {
            addCriterion("SelfBaseMoney not in", values, "selfBaseMoney");
            return (Criteria) this;
        }

        public Criteria andSelfBaseMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SelfBaseMoney between", value1, value2, "selfBaseMoney");
            return (Criteria) this;
        }

        public Criteria andSelfBaseMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SelfBaseMoney not between", value1, value2, "selfBaseMoney");
            return (Criteria) this;
        }

        public Criteria andYLJZ_MoneyIsNull() {
            addCriterion("YLJZ_Money is null");
            return (Criteria) this;
        }

        public Criteria andYLJZ_MoneyIsNotNull() {
            addCriterion("YLJZ_Money is not null");
            return (Criteria) this;
        }

        public Criteria andYLJZ_MoneyEqualTo(BigDecimal value) {
            addCriterion("YLJZ_Money =", value, "YLJZ_Money");
            return (Criteria) this;
        }

        public Criteria andYLJZ_MoneyNotEqualTo(BigDecimal value) {
            addCriterion("YLJZ_Money <>", value, "YLJZ_Money");
            return (Criteria) this;
        }

        public Criteria andYLJZ_MoneyGreaterThan(BigDecimal value) {
            addCriterion("YLJZ_Money >", value, "YLJZ_Money");
            return (Criteria) this;
        }

        public Criteria andYLJZ_MoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YLJZ_Money >=", value, "YLJZ_Money");
            return (Criteria) this;
        }

        public Criteria andYLJZ_MoneyLessThan(BigDecimal value) {
            addCriterion("YLJZ_Money <", value, "YLJZ_Money");
            return (Criteria) this;
        }

        public Criteria andYLJZ_MoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("YLJZ_Money <=", value, "YLJZ_Money");
            return (Criteria) this;
        }

        public Criteria andYLJZ_MoneyIn(List<BigDecimal> values) {
            addCriterion("YLJZ_Money in", values, "YLJZ_Money");
            return (Criteria) this;
        }

        public Criteria andYLJZ_MoneyNotIn(List<BigDecimal> values) {
            addCriterion("YLJZ_Money not in", values, "YLJZ_Money");
            return (Criteria) this;
        }

        public Criteria andYLJZ_MoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YLJZ_Money between", value1, value2, "YLJZ_Money");
            return (Criteria) this;
        }

        public Criteria andYLJZ_MoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YLJZ_Money not between", value1, value2, "YLJZ_Money");
            return (Criteria) this;
        }

        public Criteria andCancel_DateIsNull() {
            addCriterion("Cancel_Date is null");
            return (Criteria) this;
        }

        public Criteria andCancel_DateIsNotNull() {
            addCriterion("Cancel_Date is not null");
            return (Criteria) this;
        }

        public Criteria andCancel_DateEqualTo(Date value) {
            addCriterion("Cancel_Date =", value, "cancel_Date");
            return (Criteria) this;
        }

        public Criteria andCancel_DateNotEqualTo(Date value) {
            addCriterion("Cancel_Date <>", value, "cancel_Date");
            return (Criteria) this;
        }

        public Criteria andCancel_DateGreaterThan(Date value) {
            addCriterion("Cancel_Date >", value, "cancel_Date");
            return (Criteria) this;
        }

        public Criteria andCancel_DateGreaterThanOrEqualTo(Date value) {
            addCriterion("Cancel_Date >=", value, "cancel_Date");
            return (Criteria) this;
        }

        public Criteria andCancel_DateLessThan(Date value) {
            addCriterion("Cancel_Date <", value, "cancel_Date");
            return (Criteria) this;
        }

        public Criteria andCancel_DateLessThanOrEqualTo(Date value) {
            addCriterion("Cancel_Date <=", value, "cancel_Date");
            return (Criteria) this;
        }

        public Criteria andCancel_DateIn(List<Date> values) {
            addCriterion("Cancel_Date in", values, "cancel_Date");
            return (Criteria) this;
        }

        public Criteria andCancel_DateNotIn(List<Date> values) {
            addCriterion("Cancel_Date not in", values, "cancel_Date");
            return (Criteria) this;
        }

        public Criteria andCancel_DateBetween(Date value1, Date value2) {
            addCriterion("Cancel_Date between", value1, value2, "cancel_Date");
            return (Criteria) this;
        }

        public Criteria andCancel_DateNotBetween(Date value1, Date value2) {
            addCriterion("Cancel_Date not between", value1, value2, "cancel_Date");
            return (Criteria) this;
        }

        public Criteria andCancel_Operator_IDIsNull() {
            addCriterion("Cancel_Operator_ID is null");
            return (Criteria) this;
        }

        public Criteria andCancel_Operator_IDIsNotNull() {
            addCriterion("Cancel_Operator_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCancel_Operator_IDEqualTo(String value) {
            addCriterion("Cancel_Operator_ID =", value, "cancel_Operator_ID");
            return (Criteria) this;
        }

        public Criteria andCancel_Operator_IDNotEqualTo(String value) {
            addCriterion("Cancel_Operator_ID <>", value, "cancel_Operator_ID");
            return (Criteria) this;
        }

        public Criteria andCancel_Operator_IDGreaterThan(String value) {
            addCriterion("Cancel_Operator_ID >", value, "cancel_Operator_ID");
            return (Criteria) this;
        }

        public Criteria andCancel_Operator_IDGreaterThanOrEqualTo(String value) {
            addCriterion("Cancel_Operator_ID >=", value, "cancel_Operator_ID");
            return (Criteria) this;
        }

        public Criteria andCancel_Operator_IDLessThan(String value) {
            addCriterion("Cancel_Operator_ID <", value, "cancel_Operator_ID");
            return (Criteria) this;
        }

        public Criteria andCancel_Operator_IDLessThanOrEqualTo(String value) {
            addCriterion("Cancel_Operator_ID <=", value, "cancel_Operator_ID");
            return (Criteria) this;
        }

        public Criteria andCancel_Operator_IDLike(String value) {
            addCriterion("Cancel_Operator_ID like", value, "cancel_Operator_ID");
            return (Criteria) this;
        }

        public Criteria andCancel_Operator_IDNotLike(String value) {
            addCriterion("Cancel_Operator_ID not like", value, "cancel_Operator_ID");
            return (Criteria) this;
        }

        public Criteria andCancel_Operator_IDIn(List<String> values) {
            addCriterion("Cancel_Operator_ID in", values, "cancel_Operator_ID");
            return (Criteria) this;
        }

        public Criteria andCancel_Operator_IDNotIn(List<String> values) {
            addCriterion("Cancel_Operator_ID not in", values, "cancel_Operator_ID");
            return (Criteria) this;
        }

        public Criteria andCancel_Operator_IDBetween(String value1, String value2) {
            addCriterion("Cancel_Operator_ID between", value1, value2, "cancel_Operator_ID");
            return (Criteria) this;
        }

        public Criteria andCancel_Operator_IDNotBetween(String value1, String value2) {
            addCriterion("Cancel_Operator_ID not between", value1, value2, "cancel_Operator_ID");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("Memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("Memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("Memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("Memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("Memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("Memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("Memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("Memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("Memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("Memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("Memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("Memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("Memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("Memo not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andYB_InfoIsNull() {
            addCriterion("YB_Info is null");
            return (Criteria) this;
        }

        public Criteria andYB_InfoIsNotNull() {
            addCriterion("YB_Info is not null");
            return (Criteria) this;
        }

        public Criteria andYB_InfoEqualTo(String value) {
            addCriterion("YB_Info =", value, "YB_Info");
            return (Criteria) this;
        }

        public Criteria andYB_InfoNotEqualTo(String value) {
            addCriterion("YB_Info <>", value, "YB_Info");
            return (Criteria) this;
        }

        public Criteria andYB_InfoGreaterThan(String value) {
            addCriterion("YB_Info >", value, "YB_Info");
            return (Criteria) this;
        }

        public Criteria andYB_InfoGreaterThanOrEqualTo(String value) {
            addCriterion("YB_Info >=", value, "YB_Info");
            return (Criteria) this;
        }

        public Criteria andYB_InfoLessThan(String value) {
            addCriterion("YB_Info <", value, "YB_Info");
            return (Criteria) this;
        }

        public Criteria andYB_InfoLessThanOrEqualTo(String value) {
            addCriterion("YB_Info <=", value, "YB_Info");
            return (Criteria) this;
        }

        public Criteria andYB_InfoLike(String value) {
            addCriterion("YB_Info like", value, "YB_Info");
            return (Criteria) this;
        }

        public Criteria andYB_InfoNotLike(String value) {
            addCriterion("YB_Info not like", value, "YB_Info");
            return (Criteria) this;
        }

        public Criteria andYB_InfoIn(List<String> values) {
            addCriterion("YB_Info in", values, "YB_Info");
            return (Criteria) this;
        }

        public Criteria andYB_InfoNotIn(List<String> values) {
            addCriterion("YB_Info not in", values, "YB_Info");
            return (Criteria) this;
        }

        public Criteria andYB_InfoBetween(String value1, String value2) {
            addCriterion("YB_Info between", value1, value2, "YB_Info");
            return (Criteria) this;
        }

        public Criteria andYB_InfoNotBetween(String value1, String value2) {
            addCriterion("YB_Info not between", value1, value2, "YB_Info");
            return (Criteria) this;
        }

        public Criteria andYBHG_MoneyIsNull() {
            addCriterion("YBHG_Money is null");
            return (Criteria) this;
        }

        public Criteria andYBHG_MoneyIsNotNull() {
            addCriterion("YBHG_Money is not null");
            return (Criteria) this;
        }

        public Criteria andYBHG_MoneyEqualTo(BigDecimal value) {
            addCriterion("YBHG_Money =", value, "YBHG_Money");
            return (Criteria) this;
        }

        public Criteria andYBHG_MoneyNotEqualTo(BigDecimal value) {
            addCriterion("YBHG_Money <>", value, "YBHG_Money");
            return (Criteria) this;
        }

        public Criteria andYBHG_MoneyGreaterThan(BigDecimal value) {
            addCriterion("YBHG_Money >", value, "YBHG_Money");
            return (Criteria) this;
        }

        public Criteria andYBHG_MoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YBHG_Money >=", value, "YBHG_Money");
            return (Criteria) this;
        }

        public Criteria andYBHG_MoneyLessThan(BigDecimal value) {
            addCriterion("YBHG_Money <", value, "YBHG_Money");
            return (Criteria) this;
        }

        public Criteria andYBHG_MoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("YBHG_Money <=", value, "YBHG_Money");
            return (Criteria) this;
        }

        public Criteria andYBHG_MoneyIn(List<BigDecimal> values) {
            addCriterion("YBHG_Money in", values, "YBHG_Money");
            return (Criteria) this;
        }

        public Criteria andYBHG_MoneyNotIn(List<BigDecimal> values) {
            addCriterion("YBHG_Money not in", values, "YBHG_Money");
            return (Criteria) this;
        }

        public Criteria andYBHG_MoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YBHG_Money between", value1, value2, "YBHG_Money");
            return (Criteria) this;
        }

        public Criteria andYBHG_MoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YBHG_Money not between", value1, value2, "YBHG_Money");
            return (Criteria) this;
        }

        public Criteria andSelfBaseMoney_TotalIsNull() {
            addCriterion("SelfBaseMoney_Total is null");
            return (Criteria) this;
        }

        public Criteria andSelfBaseMoney_TotalIsNotNull() {
            addCriterion("SelfBaseMoney_Total is not null");
            return (Criteria) this;
        }

        public Criteria andSelfBaseMoney_TotalEqualTo(BigDecimal value) {
            addCriterion("SelfBaseMoney_Total =", value, "selfBaseMoney_Total");
            return (Criteria) this;
        }

        public Criteria andSelfBaseMoney_TotalNotEqualTo(BigDecimal value) {
            addCriterion("SelfBaseMoney_Total <>", value, "selfBaseMoney_Total");
            return (Criteria) this;
        }

        public Criteria andSelfBaseMoney_TotalGreaterThan(BigDecimal value) {
            addCriterion("SelfBaseMoney_Total >", value, "selfBaseMoney_Total");
            return (Criteria) this;
        }

        public Criteria andSelfBaseMoney_TotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SelfBaseMoney_Total >=", value, "selfBaseMoney_Total");
            return (Criteria) this;
        }

        public Criteria andSelfBaseMoney_TotalLessThan(BigDecimal value) {
            addCriterion("SelfBaseMoney_Total <", value, "selfBaseMoney_Total");
            return (Criteria) this;
        }

        public Criteria andSelfBaseMoney_TotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SelfBaseMoney_Total <=", value, "selfBaseMoney_Total");
            return (Criteria) this;
        }

        public Criteria andSelfBaseMoney_TotalIn(List<BigDecimal> values) {
            addCriterion("SelfBaseMoney_Total in", values, "selfBaseMoney_Total");
            return (Criteria) this;
        }

        public Criteria andSelfBaseMoney_TotalNotIn(List<BigDecimal> values) {
            addCriterion("SelfBaseMoney_Total not in", values, "selfBaseMoney_Total");
            return (Criteria) this;
        }

        public Criteria andSelfBaseMoney_TotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SelfBaseMoney_Total between", value1, value2, "selfBaseMoney_Total");
            return (Criteria) this;
        }

        public Criteria andSelfBaseMoney_TotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SelfBaseMoney_Total not between", value1, value2, "selfBaseMoney_Total");
            return (Criteria) this;
        }

        public Criteria andYLJZ_Money_TotalIsNull() {
            addCriterion("YLJZ_Money_Total is null");
            return (Criteria) this;
        }

        public Criteria andYLJZ_Money_TotalIsNotNull() {
            addCriterion("YLJZ_Money_Total is not null");
            return (Criteria) this;
        }

        public Criteria andYLJZ_Money_TotalEqualTo(BigDecimal value) {
            addCriterion("YLJZ_Money_Total =", value, "YLJZ_Money_Total");
            return (Criteria) this;
        }

        public Criteria andYLJZ_Money_TotalNotEqualTo(BigDecimal value) {
            addCriterion("YLJZ_Money_Total <>", value, "YLJZ_Money_Total");
            return (Criteria) this;
        }

        public Criteria andYLJZ_Money_TotalGreaterThan(BigDecimal value) {
            addCriterion("YLJZ_Money_Total >", value, "YLJZ_Money_Total");
            return (Criteria) this;
        }

        public Criteria andYLJZ_Money_TotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YLJZ_Money_Total >=", value, "YLJZ_Money_Total");
            return (Criteria) this;
        }

        public Criteria andYLJZ_Money_TotalLessThan(BigDecimal value) {
            addCriterion("YLJZ_Money_Total <", value, "YLJZ_Money_Total");
            return (Criteria) this;
        }

        public Criteria andYLJZ_Money_TotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("YLJZ_Money_Total <=", value, "YLJZ_Money_Total");
            return (Criteria) this;
        }

        public Criteria andYLJZ_Money_TotalIn(List<BigDecimal> values) {
            addCriterion("YLJZ_Money_Total in", values, "YLJZ_Money_Total");
            return (Criteria) this;
        }

        public Criteria andYLJZ_Money_TotalNotIn(List<BigDecimal> values) {
            addCriterion("YLJZ_Money_Total not in", values, "YLJZ_Money_Total");
            return (Criteria) this;
        }

        public Criteria andYLJZ_Money_TotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YLJZ_Money_Total between", value1, value2, "YLJZ_Money_Total");
            return (Criteria) this;
        }

        public Criteria andYLJZ_Money_TotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YLJZ_Money_Total not between", value1, value2, "YLJZ_Money_Total");
            return (Criteria) this;
        }

        public Criteria andSpec_BNIsNull() {
            addCriterion("Spec_BN is null");
            return (Criteria) this;
        }

        public Criteria andSpec_BNIsNotNull() {
            addCriterion("Spec_BN is not null");
            return (Criteria) this;
        }

        public Criteria andSpec_BNEqualTo(Integer value) {
            addCriterion("Spec_BN =", value, "spec_BN");
            return (Criteria) this;
        }

        public Criteria andSpec_BNNotEqualTo(Integer value) {
            addCriterion("Spec_BN <>", value, "spec_BN");
            return (Criteria) this;
        }

        public Criteria andSpec_BNGreaterThan(Integer value) {
            addCriterion("Spec_BN >", value, "spec_BN");
            return (Criteria) this;
        }

        public Criteria andSpec_BNGreaterThanOrEqualTo(Integer value) {
            addCriterion("Spec_BN >=", value, "spec_BN");
            return (Criteria) this;
        }

        public Criteria andSpec_BNLessThan(Integer value) {
            addCriterion("Spec_BN <", value, "spec_BN");
            return (Criteria) this;
        }

        public Criteria andSpec_BNLessThanOrEqualTo(Integer value) {
            addCriterion("Spec_BN <=", value, "spec_BN");
            return (Criteria) this;
        }

        public Criteria andSpec_BNIn(List<Integer> values) {
            addCriterion("Spec_BN in", values, "spec_BN");
            return (Criteria) this;
        }

        public Criteria andSpec_BNNotIn(List<Integer> values) {
            addCriterion("Spec_BN not in", values, "spec_BN");
            return (Criteria) this;
        }

        public Criteria andSpec_BNBetween(Integer value1, Integer value2) {
            addCriterion("Spec_BN between", value1, value2, "spec_BN");
            return (Criteria) this;
        }

        public Criteria andSpec_BNNotBetween(Integer value1, Integer value2) {
            addCriterion("Spec_BN not between", value1, value2, "spec_BN");
            return (Criteria) this;
        }

        public Criteria andCYDBBC_MoneyIsNull() {
            addCriterion("CYDBBC_Money is null");
            return (Criteria) this;
        }

        public Criteria andCYDBBC_MoneyIsNotNull() {
            addCriterion("CYDBBC_Money is not null");
            return (Criteria) this;
        }

        public Criteria andCYDBBC_MoneyEqualTo(BigDecimal value) {
            addCriterion("CYDBBC_Money =", value, "CYDBBC_Money");
            return (Criteria) this;
        }

        public Criteria andCYDBBC_MoneyNotEqualTo(BigDecimal value) {
            addCriterion("CYDBBC_Money <>", value, "CYDBBC_Money");
            return (Criteria) this;
        }

        public Criteria andCYDBBC_MoneyGreaterThan(BigDecimal value) {
            addCriterion("CYDBBC_Money >", value, "CYDBBC_Money");
            return (Criteria) this;
        }

        public Criteria andCYDBBC_MoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CYDBBC_Money >=", value, "CYDBBC_Money");
            return (Criteria) this;
        }

        public Criteria andCYDBBC_MoneyLessThan(BigDecimal value) {
            addCriterion("CYDBBC_Money <", value, "CYDBBC_Money");
            return (Criteria) this;
        }

        public Criteria andCYDBBC_MoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CYDBBC_Money <=", value, "CYDBBC_Money");
            return (Criteria) this;
        }

        public Criteria andCYDBBC_MoneyIn(List<BigDecimal> values) {
            addCriterion("CYDBBC_Money in", values, "CYDBBC_Money");
            return (Criteria) this;
        }

        public Criteria andCYDBBC_MoneyNotIn(List<BigDecimal> values) {
            addCriterion("CYDBBC_Money not in", values, "CYDBBC_Money");
            return (Criteria) this;
        }

        public Criteria andCYDBBC_MoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CYDBBC_Money between", value1, value2, "CYDBBC_Money");
            return (Criteria) this;
        }

        public Criteria andCYDBBC_MoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CYDBBC_Money not between", value1, value2, "CYDBBC_Money");
            return (Criteria) this;
        }

        public Criteria andIdentityType_IDIsNull() {
            addCriterion("IdentityType_ID is null");
            return (Criteria) this;
        }

        public Criteria andIdentityType_IDIsNotNull() {
            addCriterion("IdentityType_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityType_IDEqualTo(Integer value) {
            addCriterion("IdentityType_ID =", value, "identityType_ID");
            return (Criteria) this;
        }

        public Criteria andIdentityType_IDNotEqualTo(Integer value) {
            addCriterion("IdentityType_ID <>", value, "identityType_ID");
            return (Criteria) this;
        }

        public Criteria andIdentityType_IDGreaterThan(Integer value) {
            addCriterion("IdentityType_ID >", value, "identityType_ID");
            return (Criteria) this;
        }

        public Criteria andIdentityType_IDGreaterThanOrEqualTo(Integer value) {
            addCriterion("IdentityType_ID >=", value, "identityType_ID");
            return (Criteria) this;
        }

        public Criteria andIdentityType_IDLessThan(Integer value) {
            addCriterion("IdentityType_ID <", value, "identityType_ID");
            return (Criteria) this;
        }

        public Criteria andIdentityType_IDLessThanOrEqualTo(Integer value) {
            addCriterion("IdentityType_ID <=", value, "identityType_ID");
            return (Criteria) this;
        }

        public Criteria andIdentityType_IDIn(List<Integer> values) {
            addCriterion("IdentityType_ID in", values, "identityType_ID");
            return (Criteria) this;
        }

        public Criteria andIdentityType_IDNotIn(List<Integer> values) {
            addCriterion("IdentityType_ID not in", values, "identityType_ID");
            return (Criteria) this;
        }

        public Criteria andIdentityType_IDBetween(Integer value1, Integer value2) {
            addCriterion("IdentityType_ID between", value1, value2, "identityType_ID");
            return (Criteria) this;
        }

        public Criteria andIdentityType_IDNotBetween(Integer value1, Integer value2) {
            addCriterion("IdentityType_ID not between", value1, value2, "identityType_ID");
            return (Criteria) this;
        }

        public Criteria andSelBaseMoney_ZY_TotalIsNull() {
            addCriterion("SelBaseMoney_ZY_Total is null");
            return (Criteria) this;
        }

        public Criteria andSelBaseMoney_ZY_TotalIsNotNull() {
            addCriterion("SelBaseMoney_ZY_Total is not null");
            return (Criteria) this;
        }

        public Criteria andSelBaseMoney_ZY_TotalEqualTo(BigDecimal value) {
            addCriterion("SelBaseMoney_ZY_Total =", value, "selBaseMoney_ZY_Total");
            return (Criteria) this;
        }

        public Criteria andSelBaseMoney_ZY_TotalNotEqualTo(BigDecimal value) {
            addCriterion("SelBaseMoney_ZY_Total <>", value, "selBaseMoney_ZY_Total");
            return (Criteria) this;
        }

        public Criteria andSelBaseMoney_ZY_TotalGreaterThan(BigDecimal value) {
            addCriterion("SelBaseMoney_ZY_Total >", value, "selBaseMoney_ZY_Total");
            return (Criteria) this;
        }

        public Criteria andSelBaseMoney_ZY_TotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SelBaseMoney_ZY_Total >=", value, "selBaseMoney_ZY_Total");
            return (Criteria) this;
        }

        public Criteria andSelBaseMoney_ZY_TotalLessThan(BigDecimal value) {
            addCriterion("SelBaseMoney_ZY_Total <", value, "selBaseMoney_ZY_Total");
            return (Criteria) this;
        }

        public Criteria andSelBaseMoney_ZY_TotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SelBaseMoney_ZY_Total <=", value, "selBaseMoney_ZY_Total");
            return (Criteria) this;
        }

        public Criteria andSelBaseMoney_ZY_TotalIn(List<BigDecimal> values) {
            addCriterion("SelBaseMoney_ZY_Total in", values, "selBaseMoney_ZY_Total");
            return (Criteria) this;
        }

        public Criteria andSelBaseMoney_ZY_TotalNotIn(List<BigDecimal> values) {
            addCriterion("SelBaseMoney_ZY_Total not in", values, "selBaseMoney_ZY_Total");
            return (Criteria) this;
        }

        public Criteria andSelBaseMoney_ZY_TotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SelBaseMoney_ZY_Total between", value1, value2, "selBaseMoney_ZY_Total");
            return (Criteria) this;
        }

        public Criteria andSelBaseMoney_ZY_TotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SelBaseMoney_ZY_Total not between", value1, value2, "selBaseMoney_ZY_Total");
            return (Criteria) this;
        }

        public Criteria andGR_Accout_PayIsNull() {
            addCriterion("GR_Accout_Pay is null");
            return (Criteria) this;
        }

        public Criteria andGR_Accout_PayIsNotNull() {
            addCriterion("GR_Accout_Pay is not null");
            return (Criteria) this;
        }

        public Criteria andGR_Accout_PayEqualTo(BigDecimal value) {
            addCriterion("GR_Accout_Pay =", value, "GR_Accout_Pay");
            return (Criteria) this;
        }

        public Criteria andGR_Accout_PayNotEqualTo(BigDecimal value) {
            addCriterion("GR_Accout_Pay <>", value, "GR_Accout_Pay");
            return (Criteria) this;
        }

        public Criteria andGR_Accout_PayGreaterThan(BigDecimal value) {
            addCriterion("GR_Accout_Pay >", value, "GR_Accout_Pay");
            return (Criteria) this;
        }

        public Criteria andGR_Accout_PayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GR_Accout_Pay >=", value, "GR_Accout_Pay");
            return (Criteria) this;
        }

        public Criteria andGR_Accout_PayLessThan(BigDecimal value) {
            addCriterion("GR_Accout_Pay <", value, "GR_Accout_Pay");
            return (Criteria) this;
        }

        public Criteria andGR_Accout_PayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GR_Accout_Pay <=", value, "GR_Accout_Pay");
            return (Criteria) this;
        }

        public Criteria andGR_Accout_PayIn(List<BigDecimal> values) {
            addCriterion("GR_Accout_Pay in", values, "GR_Accout_Pay");
            return (Criteria) this;
        }

        public Criteria andGR_Accout_PayNotIn(List<BigDecimal> values) {
            addCriterion("GR_Accout_Pay not in", values, "GR_Accout_Pay");
            return (Criteria) this;
        }

        public Criteria andGR_Accout_PayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GR_Accout_Pay between", value1, value2, "GR_Accout_Pay");
            return (Criteria) this;
        }

        public Criteria andGR_Accout_PayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GR_Accout_Pay not between", value1, value2, "GR_Accout_Pay");
            return (Criteria) this;
        }

        public Criteria andYB_Other_PayIsNull() {
            addCriterion("YB_Other_Pay is null");
            return (Criteria) this;
        }

        public Criteria andYB_Other_PayIsNotNull() {
            addCriterion("YB_Other_Pay is not null");
            return (Criteria) this;
        }

        public Criteria andYB_Other_PayEqualTo(BigDecimal value) {
            addCriterion("YB_Other_Pay =", value, "YB_Other_Pay");
            return (Criteria) this;
        }

        public Criteria andYB_Other_PayNotEqualTo(BigDecimal value) {
            addCriterion("YB_Other_Pay <>", value, "YB_Other_Pay");
            return (Criteria) this;
        }

        public Criteria andYB_Other_PayGreaterThan(BigDecimal value) {
            addCriterion("YB_Other_Pay >", value, "YB_Other_Pay");
            return (Criteria) this;
        }

        public Criteria andYB_Other_PayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YB_Other_Pay >=", value, "YB_Other_Pay");
            return (Criteria) this;
        }

        public Criteria andYB_Other_PayLessThan(BigDecimal value) {
            addCriterion("YB_Other_Pay <", value, "YB_Other_Pay");
            return (Criteria) this;
        }

        public Criteria andYB_Other_PayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("YB_Other_Pay <=", value, "YB_Other_Pay");
            return (Criteria) this;
        }

        public Criteria andYB_Other_PayIn(List<BigDecimal> values) {
            addCriterion("YB_Other_Pay in", values, "YB_Other_Pay");
            return (Criteria) this;
        }

        public Criteria andYB_Other_PayNotIn(List<BigDecimal> values) {
            addCriterion("YB_Other_Pay not in", values, "YB_Other_Pay");
            return (Criteria) this;
        }

        public Criteria andYB_Other_PayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YB_Other_Pay between", value1, value2, "YB_Other_Pay");
            return (Criteria) this;
        }

        public Criteria andYB_Other_PayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YB_Other_Pay not between", value1, value2, "YB_Other_Pay");
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