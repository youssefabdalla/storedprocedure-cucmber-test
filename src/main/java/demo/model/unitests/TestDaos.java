package demo.model.unitests;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import demo.model.dao.DepartmentMapper;

public class TestDaos {
	private static final Logger LOGGER = LogManager.getLogger(TestDaos.class);
	private SqlSessionFactory sqlSessionFactory;

	//@Test
	public void test() throws IOException {

		try (InputStream is = Resources.getResourceAsStream("mybatis-config.xml")) {
			LOGGER.debug("getting the Session Factory");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(is, "local");
		}
		HashMap<String, Object> params = new HashMap<>();
		params.put("emp_id", (short) 7839);
		params.put("new_DEPT_id", (short) 10);
		try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
			DepartmentMapper departmentMapper = sqlSession.getMapper(DepartmentMapper.class);
			departmentMapper.ReassignEmployee(params);
		}
		params.forEach((key, value) -> LOGGER.debug(key + ".." + value));
		
	}

}
