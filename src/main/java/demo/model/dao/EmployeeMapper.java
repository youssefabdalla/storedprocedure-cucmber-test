package demo.model.dao;

import demo.model.dao.Employee;
import demo.model.dao.EmployeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmployeeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DBUSER.EMP
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    long countByExample(EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DBUSER.EMP
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    int deleteByExample(EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DBUSER.EMP
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    int deleteByPrimaryKey(Short EMPNO);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DBUSER.EMP
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    int insert(Employee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DBUSER.EMP
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    int insertSelective(Employee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DBUSER.EMP
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    List<Employee> selectByExample(EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DBUSER.EMP
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    Employee selectByPrimaryKey(Short EMPNO);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DBUSER.EMP
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    int updateByExampleSelective(@Param("record") Employee record, @Param("example") EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DBUSER.EMP
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    int updateByExample(@Param("record") Employee record, @Param("example") EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DBUSER.EMP
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    int updateByPrimaryKeySelective(Employee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DBUSER.EMP
     *
     * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
     */
    int updateByPrimaryKey(Employee record);
}