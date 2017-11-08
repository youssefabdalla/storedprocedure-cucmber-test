package demo.model.dao;

import java.math.BigDecimal;
import java.util.Date;

public class Orders {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DBUSER.DEMO_ORDERS.ORDER_ID
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    private Short ORDER_ID;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DBUSER.DEMO_ORDERS.CUSTOMER_ID
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    private Short CUSTOMER_ID;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DBUSER.DEMO_ORDERS.ORDER_TOTAL
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    private BigDecimal ORDER_TOTAL;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DBUSER.DEMO_ORDERS.ORDER_TIMESTAMP
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    private Date ORDER_TIMESTAMP;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DBUSER.DEMO_ORDERS.USER_ID
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    private Short USER_ID;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DBUSER.DEMO_ORDERS.ORDER_ID
     *
     * @return the value of DBUSER.DEMO_ORDERS.ORDER_ID
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    public Short getORDER_ID() {
        return ORDER_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DBUSER.DEMO_ORDERS.ORDER_ID
     *
     * @param ORDER_ID the value for DBUSER.DEMO_ORDERS.ORDER_ID
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    public void setORDER_ID(Short ORDER_ID) {
        this.ORDER_ID = ORDER_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DBUSER.DEMO_ORDERS.CUSTOMER_ID
     *
     * @return the value of DBUSER.DEMO_ORDERS.CUSTOMER_ID
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    public Short getCUSTOMER_ID() {
        return CUSTOMER_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DBUSER.DEMO_ORDERS.CUSTOMER_ID
     *
     * @param CUSTOMER_ID the value for DBUSER.DEMO_ORDERS.CUSTOMER_ID
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    public void setCUSTOMER_ID(Short CUSTOMER_ID) {
        this.CUSTOMER_ID = CUSTOMER_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DBUSER.DEMO_ORDERS.ORDER_TOTAL
     *
     * @return the value of DBUSER.DEMO_ORDERS.ORDER_TOTAL
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    public BigDecimal getORDER_TOTAL() {
        return ORDER_TOTAL;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DBUSER.DEMO_ORDERS.ORDER_TOTAL
     *
     * @param ORDER_TOTAL the value for DBUSER.DEMO_ORDERS.ORDER_TOTAL
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    public void setORDER_TOTAL(BigDecimal ORDER_TOTAL) {
        this.ORDER_TOTAL = ORDER_TOTAL;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DBUSER.DEMO_ORDERS.ORDER_TIMESTAMP
     *
     * @return the value of DBUSER.DEMO_ORDERS.ORDER_TIMESTAMP
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    public Date getORDER_TIMESTAMP() {
        return ORDER_TIMESTAMP;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DBUSER.DEMO_ORDERS.ORDER_TIMESTAMP
     *
     * @param ORDER_TIMESTAMP the value for DBUSER.DEMO_ORDERS.ORDER_TIMESTAMP
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    public void setORDER_TIMESTAMP(Date ORDER_TIMESTAMP) {
        this.ORDER_TIMESTAMP = ORDER_TIMESTAMP;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DBUSER.DEMO_ORDERS.USER_ID
     *
     * @return the value of DBUSER.DEMO_ORDERS.USER_ID
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    public Short getUSER_ID() {
        return USER_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DBUSER.DEMO_ORDERS.USER_ID
     *
     * @param USER_ID the value for DBUSER.DEMO_ORDERS.USER_ID
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    public void setUSER_ID(Short USER_ID) {
        this.USER_ID = USER_ID;
    }
}