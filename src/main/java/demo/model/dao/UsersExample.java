package demo.model.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsersExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table DBUSER.DEMO_USERS
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table DBUSER.DEMO_USERS
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table DBUSER.DEMO_USERS
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DBUSER.DEMO_USERS
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    public UsersExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DBUSER.DEMO_USERS
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DBUSER.DEMO_USERS
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DBUSER.DEMO_USERS
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DBUSER.DEMO_USERS
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DBUSER.DEMO_USERS
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DBUSER.DEMO_USERS
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DBUSER.DEMO_USERS
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DBUSER.DEMO_USERS
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
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
     * This method corresponds to the database table DBUSER.DEMO_USERS
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DBUSER.DEMO_USERS
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table DBUSER.DEMO_USERS
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
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

        public Criteria andUSER_IDIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUSER_IDIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUSER_IDEqualTo(Short value) {
            addCriterion("USER_ID =", value, "USER_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_IDNotEqualTo(Short value) {
            addCriterion("USER_ID <>", value, "USER_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_IDGreaterThan(Short value) {
            addCriterion("USER_ID >", value, "USER_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_IDGreaterThanOrEqualTo(Short value) {
            addCriterion("USER_ID >=", value, "USER_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_IDLessThan(Short value) {
            addCriterion("USER_ID <", value, "USER_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_IDLessThanOrEqualTo(Short value) {
            addCriterion("USER_ID <=", value, "USER_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_IDIn(List<Short> values) {
            addCriterion("USER_ID in", values, "USER_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_IDNotIn(List<Short> values) {
            addCriterion("USER_ID not in", values, "USER_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_IDBetween(Short value1, Short value2) {
            addCriterion("USER_ID between", value1, value2, "USER_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_IDNotBetween(Short value1, Short value2) {
            addCriterion("USER_ID not between", value1, value2, "USER_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_NAMEIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUSER_NAMEIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUSER_NAMEEqualTo(String value) {
            addCriterion("USER_NAME =", value, "USER_NAME");
            return (Criteria) this;
        }

        public Criteria andUSER_NAMENotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "USER_NAME");
            return (Criteria) this;
        }

        public Criteria andUSER_NAMEGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "USER_NAME");
            return (Criteria) this;
        }

        public Criteria andUSER_NAMEGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "USER_NAME");
            return (Criteria) this;
        }

        public Criteria andUSER_NAMELessThan(String value) {
            addCriterion("USER_NAME <", value, "USER_NAME");
            return (Criteria) this;
        }

        public Criteria andUSER_NAMELessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "USER_NAME");
            return (Criteria) this;
        }

        public Criteria andUSER_NAMELike(String value) {
            addCriterion("USER_NAME like", value, "USER_NAME");
            return (Criteria) this;
        }

        public Criteria andUSER_NAMENotLike(String value) {
            addCriterion("USER_NAME not like", value, "USER_NAME");
            return (Criteria) this;
        }

        public Criteria andUSER_NAMEIn(List<String> values) {
            addCriterion("USER_NAME in", values, "USER_NAME");
            return (Criteria) this;
        }

        public Criteria andUSER_NAMENotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "USER_NAME");
            return (Criteria) this;
        }

        public Criteria andUSER_NAMEBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "USER_NAME");
            return (Criteria) this;
        }

        public Criteria andUSER_NAMENotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "USER_NAME");
            return (Criteria) this;
        }

        public Criteria andPASSWORDIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPASSWORDIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPASSWORDEqualTo(String value) {
            addCriterion("PASSWORD =", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDLessThan(String value) {
            addCriterion("PASSWORD <", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDLike(String value) {
            addCriterion("PASSWORD like", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDNotLike(String value) {
            addCriterion("PASSWORD not like", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDIn(List<String> values) {
            addCriterion("PASSWORD in", values, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andCREATED_ONIsNull() {
            addCriterion("CREATED_ON is null");
            return (Criteria) this;
        }

        public Criteria andCREATED_ONIsNotNull() {
            addCriterion("CREATED_ON is not null");
            return (Criteria) this;
        }

        public Criteria andCREATED_ONEqualTo(Date value) {
            addCriterion("CREATED_ON =", value, "CREATED_ON");
            return (Criteria) this;
        }

        public Criteria andCREATED_ONNotEqualTo(Date value) {
            addCriterion("CREATED_ON <>", value, "CREATED_ON");
            return (Criteria) this;
        }

        public Criteria andCREATED_ONGreaterThan(Date value) {
            addCriterion("CREATED_ON >", value, "CREATED_ON");
            return (Criteria) this;
        }

        public Criteria andCREATED_ONGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATED_ON >=", value, "CREATED_ON");
            return (Criteria) this;
        }

        public Criteria andCREATED_ONLessThan(Date value) {
            addCriterion("CREATED_ON <", value, "CREATED_ON");
            return (Criteria) this;
        }

        public Criteria andCREATED_ONLessThanOrEqualTo(Date value) {
            addCriterion("CREATED_ON <=", value, "CREATED_ON");
            return (Criteria) this;
        }

        public Criteria andCREATED_ONIn(List<Date> values) {
            addCriterion("CREATED_ON in", values, "CREATED_ON");
            return (Criteria) this;
        }

        public Criteria andCREATED_ONNotIn(List<Date> values) {
            addCriterion("CREATED_ON not in", values, "CREATED_ON");
            return (Criteria) this;
        }

        public Criteria andCREATED_ONBetween(Date value1, Date value2) {
            addCriterion("CREATED_ON between", value1, value2, "CREATED_ON");
            return (Criteria) this;
        }

        public Criteria andCREATED_ONNotBetween(Date value1, Date value2) {
            addCriterion("CREATED_ON not between", value1, value2, "CREATED_ON");
            return (Criteria) this;
        }

        public Criteria andQUOTAIsNull() {
            addCriterion("QUOTA is null");
            return (Criteria) this;
        }

        public Criteria andQUOTAIsNotNull() {
            addCriterion("QUOTA is not null");
            return (Criteria) this;
        }

        public Criteria andQUOTAEqualTo(Short value) {
            addCriterion("QUOTA =", value, "QUOTA");
            return (Criteria) this;
        }

        public Criteria andQUOTANotEqualTo(Short value) {
            addCriterion("QUOTA <>", value, "QUOTA");
            return (Criteria) this;
        }

        public Criteria andQUOTAGreaterThan(Short value) {
            addCriterion("QUOTA >", value, "QUOTA");
            return (Criteria) this;
        }

        public Criteria andQUOTAGreaterThanOrEqualTo(Short value) {
            addCriterion("QUOTA >=", value, "QUOTA");
            return (Criteria) this;
        }

        public Criteria andQUOTALessThan(Short value) {
            addCriterion("QUOTA <", value, "QUOTA");
            return (Criteria) this;
        }

        public Criteria andQUOTALessThanOrEqualTo(Short value) {
            addCriterion("QUOTA <=", value, "QUOTA");
            return (Criteria) this;
        }

        public Criteria andQUOTAIn(List<Short> values) {
            addCriterion("QUOTA in", values, "QUOTA");
            return (Criteria) this;
        }

        public Criteria andQUOTANotIn(List<Short> values) {
            addCriterion("QUOTA not in", values, "QUOTA");
            return (Criteria) this;
        }

        public Criteria andQUOTABetween(Short value1, Short value2) {
            addCriterion("QUOTA between", value1, value2, "QUOTA");
            return (Criteria) this;
        }

        public Criteria andQUOTANotBetween(Short value1, Short value2) {
            addCriterion("QUOTA not between", value1, value2, "QUOTA");
            return (Criteria) this;
        }

        public Criteria andPRODUCTSIsNull() {
            addCriterion("PRODUCTS is null");
            return (Criteria) this;
        }

        public Criteria andPRODUCTSIsNotNull() {
            addCriterion("PRODUCTS is not null");
            return (Criteria) this;
        }

        public Criteria andPRODUCTSEqualTo(String value) {
            addCriterion("PRODUCTS =", value, "PRODUCTS");
            return (Criteria) this;
        }

        public Criteria andPRODUCTSNotEqualTo(String value) {
            addCriterion("PRODUCTS <>", value, "PRODUCTS");
            return (Criteria) this;
        }

        public Criteria andPRODUCTSGreaterThan(String value) {
            addCriterion("PRODUCTS >", value, "PRODUCTS");
            return (Criteria) this;
        }

        public Criteria andPRODUCTSGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCTS >=", value, "PRODUCTS");
            return (Criteria) this;
        }

        public Criteria andPRODUCTSLessThan(String value) {
            addCriterion("PRODUCTS <", value, "PRODUCTS");
            return (Criteria) this;
        }

        public Criteria andPRODUCTSLessThanOrEqualTo(String value) {
            addCriterion("PRODUCTS <=", value, "PRODUCTS");
            return (Criteria) this;
        }

        public Criteria andPRODUCTSLike(String value) {
            addCriterion("PRODUCTS like", value, "PRODUCTS");
            return (Criteria) this;
        }

        public Criteria andPRODUCTSNotLike(String value) {
            addCriterion("PRODUCTS not like", value, "PRODUCTS");
            return (Criteria) this;
        }

        public Criteria andPRODUCTSIn(List<String> values) {
            addCriterion("PRODUCTS in", values, "PRODUCTS");
            return (Criteria) this;
        }

        public Criteria andPRODUCTSNotIn(List<String> values) {
            addCriterion("PRODUCTS not in", values, "PRODUCTS");
            return (Criteria) this;
        }

        public Criteria andPRODUCTSBetween(String value1, String value2) {
            addCriterion("PRODUCTS between", value1, value2, "PRODUCTS");
            return (Criteria) this;
        }

        public Criteria andPRODUCTSNotBetween(String value1, String value2) {
            addCriterion("PRODUCTS not between", value1, value2, "PRODUCTS");
            return (Criteria) this;
        }

        public Criteria andEXPIRES_ONIsNull() {
            addCriterion("EXPIRES_ON is null");
            return (Criteria) this;
        }

        public Criteria andEXPIRES_ONIsNotNull() {
            addCriterion("EXPIRES_ON is not null");
            return (Criteria) this;
        }

        public Criteria andEXPIRES_ONEqualTo(Date value) {
            addCriterion("EXPIRES_ON =", value, "EXPIRES_ON");
            return (Criteria) this;
        }

        public Criteria andEXPIRES_ONNotEqualTo(Date value) {
            addCriterion("EXPIRES_ON <>", value, "EXPIRES_ON");
            return (Criteria) this;
        }

        public Criteria andEXPIRES_ONGreaterThan(Date value) {
            addCriterion("EXPIRES_ON >", value, "EXPIRES_ON");
            return (Criteria) this;
        }

        public Criteria andEXPIRES_ONGreaterThanOrEqualTo(Date value) {
            addCriterion("EXPIRES_ON >=", value, "EXPIRES_ON");
            return (Criteria) this;
        }

        public Criteria andEXPIRES_ONLessThan(Date value) {
            addCriterion("EXPIRES_ON <", value, "EXPIRES_ON");
            return (Criteria) this;
        }

        public Criteria andEXPIRES_ONLessThanOrEqualTo(Date value) {
            addCriterion("EXPIRES_ON <=", value, "EXPIRES_ON");
            return (Criteria) this;
        }

        public Criteria andEXPIRES_ONIn(List<Date> values) {
            addCriterion("EXPIRES_ON in", values, "EXPIRES_ON");
            return (Criteria) this;
        }

        public Criteria andEXPIRES_ONNotIn(List<Date> values) {
            addCriterion("EXPIRES_ON not in", values, "EXPIRES_ON");
            return (Criteria) this;
        }

        public Criteria andEXPIRES_ONBetween(Date value1, Date value2) {
            addCriterion("EXPIRES_ON between", value1, value2, "EXPIRES_ON");
            return (Criteria) this;
        }

        public Criteria andEXPIRES_ONNotBetween(Date value1, Date value2) {
            addCriterion("EXPIRES_ON not between", value1, value2, "EXPIRES_ON");
            return (Criteria) this;
        }

        public Criteria andADMIN_USERIsNull() {
            addCriterion("ADMIN_USER is null");
            return (Criteria) this;
        }

        public Criteria andADMIN_USERIsNotNull() {
            addCriterion("ADMIN_USER is not null");
            return (Criteria) this;
        }

        public Criteria andADMIN_USEREqualTo(String value) {
            addCriterion("ADMIN_USER =", value, "ADMIN_USER");
            return (Criteria) this;
        }

        public Criteria andADMIN_USERNotEqualTo(String value) {
            addCriterion("ADMIN_USER <>", value, "ADMIN_USER");
            return (Criteria) this;
        }

        public Criteria andADMIN_USERGreaterThan(String value) {
            addCriterion("ADMIN_USER >", value, "ADMIN_USER");
            return (Criteria) this;
        }

        public Criteria andADMIN_USERGreaterThanOrEqualTo(String value) {
            addCriterion("ADMIN_USER >=", value, "ADMIN_USER");
            return (Criteria) this;
        }

        public Criteria andADMIN_USERLessThan(String value) {
            addCriterion("ADMIN_USER <", value, "ADMIN_USER");
            return (Criteria) this;
        }

        public Criteria andADMIN_USERLessThanOrEqualTo(String value) {
            addCriterion("ADMIN_USER <=", value, "ADMIN_USER");
            return (Criteria) this;
        }

        public Criteria andADMIN_USERLike(String value) {
            addCriterion("ADMIN_USER like", value, "ADMIN_USER");
            return (Criteria) this;
        }

        public Criteria andADMIN_USERNotLike(String value) {
            addCriterion("ADMIN_USER not like", value, "ADMIN_USER");
            return (Criteria) this;
        }

        public Criteria andADMIN_USERIn(List<String> values) {
            addCriterion("ADMIN_USER in", values, "ADMIN_USER");
            return (Criteria) this;
        }

        public Criteria andADMIN_USERNotIn(List<String> values) {
            addCriterion("ADMIN_USER not in", values, "ADMIN_USER");
            return (Criteria) this;
        }

        public Criteria andADMIN_USERBetween(String value1, String value2) {
            addCriterion("ADMIN_USER between", value1, value2, "ADMIN_USER");
            return (Criteria) this;
        }

        public Criteria andADMIN_USERNotBetween(String value1, String value2) {
            addCriterion("ADMIN_USER not between", value1, value2, "ADMIN_USER");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table DBUSER.DEMO_USERS
     *
     * @mbg.generated do_not_delete_during_merge Mon Nov 06 13:15:56 GMT 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table DBUSER.DEMO_USERS
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
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