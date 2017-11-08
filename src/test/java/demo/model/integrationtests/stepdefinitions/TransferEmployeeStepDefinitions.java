/**
 * 
 */
package demo.model.integrationtests.stepdefinitions;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demo.model.dao.Department;
import demo.model.dao.DepartmentExample;
import demo.model.dao.DepartmentMapper;
import demo.model.dao.Employee;
import demo.model.dao.EmployeeExample;
import demo.model.dao.EmployeeMapper;

/**
 * Step definitions for transfer employees
 * 
 * @author Youssef Abdalla
 */
public class TransferEmployeeStepDefinitions {
	private static final Logger LOGGER = LogManager.getLogger(TransferEmployeeStepDefinitions.class);
	private SqlSessionFactory sqlSessionFactory;
	private static boolean dunalready;
	private static Employee employeeToTransfer;
	private static short operationsDepartmentNumber;

	/**
	 * You might want to separate the startup and the end test methods in a
	 * separate class. This will however just do for now.
	 * 
	 * @throws IOException
	 */
	@Before
	public void prepareConnection() throws IOException {
		if (!dunalready) {
			try (InputStream is = Resources.getResourceAsStream("mybatis-config.xml")) {
				LOGGER.debug("getting the Session Factory");
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(is, "local");
				dunalready = true;
			}
		}
	}

	@Given("^There is an Employee in Department Sales$")
	public void thereIsAnEmployeeInDepartmentSales() {
		// get the department number
		DepartmentExample departmentExample = new DepartmentExample();
		EmployeeExample employeeExample = new EmployeeExample();
		List<Employee> employeesInSales;
		departmentExample.createCriteria().andDNAMEEqualTo("SALES");
		try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
			DepartmentMapper departmentMapper = sqlSession.getMapper(DepartmentMapper.class);
			EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
			List<Department> listWithSalesDeptOnly = departmentMapper.selectByExample(departmentExample);
			Short salesDeptNo = listWithSalesDeptOnly.get(0).getDEPTNO();
			LOGGER.debug("department SALES has the number: " + salesDeptNo);
			employeeExample.createCriteria().andDEPTNOEqualTo(salesDeptNo);
			employeesInSales = employeeMapper.selectByExample(employeeExample);
		}
		LOGGER.debug("departments SALES has " + employeesInSales.size());
		// shuffle the List so a random employee is chosen with every run. this
		// is important to make the test independent from the test data
		Collections.shuffle(employeesInSales);
		employeeToTransfer = employeesInSales.get(0);
		LOGGER.debug("Employee: " + employeeToTransfer.getENAME() + " with number: " + employeeToTransfer.getEMPNO()
				+ " is chosen");
	}

	@When("^I reassign the employee to Department Operations$")
	public void reassignedToDepartmentOperations() {
		DepartmentExample departmentExample = new DepartmentExample();
		departmentExample.createCriteria().andDNAMEEqualTo("OPERATIONS");
		HashMap<String, Object> params = new HashMap<>();
		params.put("emp_id", employeeToTransfer.getEMPNO().shortValue());

		try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
			DepartmentMapper departmentMapper = sqlSession.getMapper(DepartmentMapper.class);
			List<Department> listWithOperationsDeptOnly = departmentMapper.selectByExample(departmentExample);
			operationsDepartmentNumber = listWithOperationsDeptOnly.get(0).getDEPTNO().shortValue();
			LOGGER.debug("department Operations has the number: " + operationsDepartmentNumber);
			params.put("new_DEPT_id", operationsDepartmentNumber);
			departmentMapper.ReassignEmployee(params);
		}
		LOGGER.debug("Now the parameters Map contain:");
		params.forEach((key, value) -> LOGGER.debug(key + ".." + value));
	}

	@Then("^The Employee is assigned to Department Operations$")
	public void theEmployeeIsAssignedToDepartmentOperations() {
		LOGGER.debug("Checking if the employee is now assigned to operations in the database..");
		short employeeDeptNo;
		try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
			EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
			employeeDeptNo = employeeMapper.selectByPrimaryKey(employeeToTransfer.getEMPNO()).getDEPTNO();
		}
		LOGGER.debug("The employee is assigned to the department number: " + employeeDeptNo);
		Assert.assertTrue(employeeDeptNo == operationsDepartmentNumber,
				"The employee department number is not equal the Operations department number.");
	}
}
