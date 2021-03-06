package demo.model.dao;

import demo.model.dao.Orders;
import demo.model.dao.OrdersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrdersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DBUSER.DEMO_ORDERS
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    long countByExample(OrdersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DBUSER.DEMO_ORDERS
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    int deleteByExample(OrdersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DBUSER.DEMO_ORDERS
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    int deleteByPrimaryKey(Short ORDER_ID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DBUSER.DEMO_ORDERS
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    int insert(Orders record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DBUSER.DEMO_ORDERS
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    int insertSelective(Orders record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DBUSER.DEMO_ORDERS
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    List<Orders> selectByExample(OrdersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DBUSER.DEMO_ORDERS
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    Orders selectByPrimaryKey(Short ORDER_ID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DBUSER.DEMO_ORDERS
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    int updateByExampleSelective(@Param("record") Orders record, @Param("example") OrdersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DBUSER.DEMO_ORDERS
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    int updateByExample(@Param("record") Orders record, @Param("example") OrdersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DBUSER.DEMO_ORDERS
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    int updateByPrimaryKeySelective(Orders record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DBUSER.DEMO_ORDERS
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    int updateByPrimaryKey(Orders record);
}