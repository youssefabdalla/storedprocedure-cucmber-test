package demo.model.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrdersItemsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table DBUSER.DEMO_ORDER_ITEMS
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table DBUSER.DEMO_ORDER_ITEMS
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table DBUSER.DEMO_ORDER_ITEMS
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DBUSER.DEMO_ORDER_ITEMS
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    public OrdersItemsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DBUSER.DEMO_ORDER_ITEMS
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DBUSER.DEMO_ORDER_ITEMS
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DBUSER.DEMO_ORDER_ITEMS
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DBUSER.DEMO_ORDER_ITEMS
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DBUSER.DEMO_ORDER_ITEMS
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DBUSER.DEMO_ORDER_ITEMS
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DBUSER.DEMO_ORDER_ITEMS
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
     * This method corresponds to the database table DBUSER.DEMO_ORDER_ITEMS
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
     * This method corresponds to the database table DBUSER.DEMO_ORDER_ITEMS
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DBUSER.DEMO_ORDER_ITEMS
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
     * This class corresponds to the database table DBUSER.DEMO_ORDER_ITEMS
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

        public Criteria andORDER_ITEM_IDIsNull() {
            addCriterion("ORDER_ITEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andORDER_ITEM_IDIsNotNull() {
            addCriterion("ORDER_ITEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andORDER_ITEM_IDEqualTo(Short value) {
            addCriterion("ORDER_ITEM_ID =", value, "ORDER_ITEM_ID");
            return (Criteria) this;
        }

        public Criteria andORDER_ITEM_IDNotEqualTo(Short value) {
            addCriterion("ORDER_ITEM_ID <>", value, "ORDER_ITEM_ID");
            return (Criteria) this;
        }

        public Criteria andORDER_ITEM_IDGreaterThan(Short value) {
            addCriterion("ORDER_ITEM_ID >", value, "ORDER_ITEM_ID");
            return (Criteria) this;
        }

        public Criteria andORDER_ITEM_IDGreaterThanOrEqualTo(Short value) {
            addCriterion("ORDER_ITEM_ID >=", value, "ORDER_ITEM_ID");
            return (Criteria) this;
        }

        public Criteria andORDER_ITEM_IDLessThan(Short value) {
            addCriterion("ORDER_ITEM_ID <", value, "ORDER_ITEM_ID");
            return (Criteria) this;
        }

        public Criteria andORDER_ITEM_IDLessThanOrEqualTo(Short value) {
            addCriterion("ORDER_ITEM_ID <=", value, "ORDER_ITEM_ID");
            return (Criteria) this;
        }

        public Criteria andORDER_ITEM_IDIn(List<Short> values) {
            addCriterion("ORDER_ITEM_ID in", values, "ORDER_ITEM_ID");
            return (Criteria) this;
        }

        public Criteria andORDER_ITEM_IDNotIn(List<Short> values) {
            addCriterion("ORDER_ITEM_ID not in", values, "ORDER_ITEM_ID");
            return (Criteria) this;
        }

        public Criteria andORDER_ITEM_IDBetween(Short value1, Short value2) {
            addCriterion("ORDER_ITEM_ID between", value1, value2, "ORDER_ITEM_ID");
            return (Criteria) this;
        }

        public Criteria andORDER_ITEM_IDNotBetween(Short value1, Short value2) {
            addCriterion("ORDER_ITEM_ID not between", value1, value2, "ORDER_ITEM_ID");
            return (Criteria) this;
        }

        public Criteria andORDER_IDIsNull() {
            addCriterion("ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andORDER_IDIsNotNull() {
            addCriterion("ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andORDER_IDEqualTo(Short value) {
            addCriterion("ORDER_ID =", value, "ORDER_ID");
            return (Criteria) this;
        }

        public Criteria andORDER_IDNotEqualTo(Short value) {
            addCriterion("ORDER_ID <>", value, "ORDER_ID");
            return (Criteria) this;
        }

        public Criteria andORDER_IDGreaterThan(Short value) {
            addCriterion("ORDER_ID >", value, "ORDER_ID");
            return (Criteria) this;
        }

        public Criteria andORDER_IDGreaterThanOrEqualTo(Short value) {
            addCriterion("ORDER_ID >=", value, "ORDER_ID");
            return (Criteria) this;
        }

        public Criteria andORDER_IDLessThan(Short value) {
            addCriterion("ORDER_ID <", value, "ORDER_ID");
            return (Criteria) this;
        }

        public Criteria andORDER_IDLessThanOrEqualTo(Short value) {
            addCriterion("ORDER_ID <=", value, "ORDER_ID");
            return (Criteria) this;
        }

        public Criteria andORDER_IDIn(List<Short> values) {
            addCriterion("ORDER_ID in", values, "ORDER_ID");
            return (Criteria) this;
        }

        public Criteria andORDER_IDNotIn(List<Short> values) {
            addCriterion("ORDER_ID not in", values, "ORDER_ID");
            return (Criteria) this;
        }

        public Criteria andORDER_IDBetween(Short value1, Short value2) {
            addCriterion("ORDER_ID between", value1, value2, "ORDER_ID");
            return (Criteria) this;
        }

        public Criteria andORDER_IDNotBetween(Short value1, Short value2) {
            addCriterion("ORDER_ID not between", value1, value2, "ORDER_ID");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_IDIsNull() {
            addCriterion("PRODUCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_IDIsNotNull() {
            addCriterion("PRODUCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_IDEqualTo(Short value) {
            addCriterion("PRODUCT_ID =", value, "PRODUCT_ID");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_IDNotEqualTo(Short value) {
            addCriterion("PRODUCT_ID <>", value, "PRODUCT_ID");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_IDGreaterThan(Short value) {
            addCriterion("PRODUCT_ID >", value, "PRODUCT_ID");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_IDGreaterThanOrEqualTo(Short value) {
            addCriterion("PRODUCT_ID >=", value, "PRODUCT_ID");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_IDLessThan(Short value) {
            addCriterion("PRODUCT_ID <", value, "PRODUCT_ID");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_IDLessThanOrEqualTo(Short value) {
            addCriterion("PRODUCT_ID <=", value, "PRODUCT_ID");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_IDIn(List<Short> values) {
            addCriterion("PRODUCT_ID in", values, "PRODUCT_ID");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_IDNotIn(List<Short> values) {
            addCriterion("PRODUCT_ID not in", values, "PRODUCT_ID");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_IDBetween(Short value1, Short value2) {
            addCriterion("PRODUCT_ID between", value1, value2, "PRODUCT_ID");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_IDNotBetween(Short value1, Short value2) {
            addCriterion("PRODUCT_ID not between", value1, value2, "PRODUCT_ID");
            return (Criteria) this;
        }

        public Criteria andUNIT_PRICEIsNull() {
            addCriterion("UNIT_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andUNIT_PRICEIsNotNull() {
            addCriterion("UNIT_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andUNIT_PRICEEqualTo(BigDecimal value) {
            addCriterion("UNIT_PRICE =", value, "UNIT_PRICE");
            return (Criteria) this;
        }

        public Criteria andUNIT_PRICENotEqualTo(BigDecimal value) {
            addCriterion("UNIT_PRICE <>", value, "UNIT_PRICE");
            return (Criteria) this;
        }

        public Criteria andUNIT_PRICEGreaterThan(BigDecimal value) {
            addCriterion("UNIT_PRICE >", value, "UNIT_PRICE");
            return (Criteria) this;
        }

        public Criteria andUNIT_PRICEGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UNIT_PRICE >=", value, "UNIT_PRICE");
            return (Criteria) this;
        }

        public Criteria andUNIT_PRICELessThan(BigDecimal value) {
            addCriterion("UNIT_PRICE <", value, "UNIT_PRICE");
            return (Criteria) this;
        }

        public Criteria andUNIT_PRICELessThanOrEqualTo(BigDecimal value) {
            addCriterion("UNIT_PRICE <=", value, "UNIT_PRICE");
            return (Criteria) this;
        }

        public Criteria andUNIT_PRICEIn(List<BigDecimal> values) {
            addCriterion("UNIT_PRICE in", values, "UNIT_PRICE");
            return (Criteria) this;
        }

        public Criteria andUNIT_PRICENotIn(List<BigDecimal> values) {
            addCriterion("UNIT_PRICE not in", values, "UNIT_PRICE");
            return (Criteria) this;
        }

        public Criteria andUNIT_PRICEBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UNIT_PRICE between", value1, value2, "UNIT_PRICE");
            return (Criteria) this;
        }

        public Criteria andUNIT_PRICENotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UNIT_PRICE not between", value1, value2, "UNIT_PRICE");
            return (Criteria) this;
        }

        public Criteria andQUANTITYIsNull() {
            addCriterion("QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andQUANTITYIsNotNull() {
            addCriterion("QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andQUANTITYEqualTo(Integer value) {
            addCriterion("QUANTITY =", value, "QUANTITY");
            return (Criteria) this;
        }

        public Criteria andQUANTITYNotEqualTo(Integer value) {
            addCriterion("QUANTITY <>", value, "QUANTITY");
            return (Criteria) this;
        }

        public Criteria andQUANTITYGreaterThan(Integer value) {
            addCriterion("QUANTITY >", value, "QUANTITY");
            return (Criteria) this;
        }

        public Criteria andQUANTITYGreaterThanOrEqualTo(Integer value) {
            addCriterion("QUANTITY >=", value, "QUANTITY");
            return (Criteria) this;
        }

        public Criteria andQUANTITYLessThan(Integer value) {
            addCriterion("QUANTITY <", value, "QUANTITY");
            return (Criteria) this;
        }

        public Criteria andQUANTITYLessThanOrEqualTo(Integer value) {
            addCriterion("QUANTITY <=", value, "QUANTITY");
            return (Criteria) this;
        }

        public Criteria andQUANTITYIn(List<Integer> values) {
            addCriterion("QUANTITY in", values, "QUANTITY");
            return (Criteria) this;
        }

        public Criteria andQUANTITYNotIn(List<Integer> values) {
            addCriterion("QUANTITY not in", values, "QUANTITY");
            return (Criteria) this;
        }

        public Criteria andQUANTITYBetween(Integer value1, Integer value2) {
            addCriterion("QUANTITY between", value1, value2, "QUANTITY");
            return (Criteria) this;
        }

        public Criteria andQUANTITYNotBetween(Integer value1, Integer value2) {
            addCriterion("QUANTITY not between", value1, value2, "QUANTITY");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table DBUSER.DEMO_ORDER_ITEMS
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
     * This class corresponds to the database table DBUSER.DEMO_ORDER_ITEMS
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