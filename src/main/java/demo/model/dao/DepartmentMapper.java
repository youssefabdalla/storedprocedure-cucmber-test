package demo.model.dao;

import demo.model.dao.Department;
import demo.model.dao.DepartmentExample;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DepartmentMapper {
	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table DBUSER.DEPT
	 *
	 * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
	 */
	long countByExample(DepartmentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table DBUSER.DEPT
	 *
	 * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
	 */
	int deleteByExample(DepartmentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table DBUSER.DEPT
	 *
	 * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
	 */
	int deleteByPrimaryKey(Short DEPTNO);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table DBUSER.DEPT
	 *
	 * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
	 */
	int insert(Department record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table DBUSER.DEPT
	 *
	 * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
	 */
	int insertSelective(Department record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table DBUSER.DEPT
	 *
	 * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
	 */
	List<Department> selectByExample(DepartmentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table DBUSER.DEPT
	 *
	 * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
	 */
	Department selectByPrimaryKey(Short DEPTNO);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table DBUSER.DEPT
	 *
	 * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
	 */
	int updateByExampleSelective(@Param("record") Department record, @Param("example") DepartmentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table DBUSER.DEPT
	 *
	 * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
	 */
	int updateByExample(@Param("record") Department record, @Param("example") DepartmentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table DBUSER.DEPT
	 *
	 * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
	 */
	int updateByPrimaryKeySelective(Department record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table DBUSER.DEPT
	 *
	 * @mbg.generated Mon Nov 06 13:15:56 GMT 2017
	 */
	int updateByPrimaryKey(Department record);

	void ReassignEmployee(HashMap<String, Object> params);
}