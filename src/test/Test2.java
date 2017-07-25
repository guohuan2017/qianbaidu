package test;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Before;

//import com.chinasofti.dao.UserMapper;
//import com.chinasofti.service.Service;
//import com.chinasofti.service.UserServiceImpl;
//import com.chinasofti.util.SqlSessionFactory;
//import com.chinasofti.vo.User;

public class Test2 {
	private SqlSession sqlSession;
//	private UserMapper dao;
	
//	@Before
//	public void getSqlSession() {
//		sqlSession = SqlSessionFactory.getSqlSession();
//		dao=sqlSession.getMapper(UserMapper.class);
//	}
	
	
	@org.junit.Test
	public void test() {
//		Service service = new UserServiceImpl();
//		System.out.println(service.insertUser(new User("ccl", "123")));
//		System.out.println(service.deleteUser(7));
//		System.out.println(service.insertString("ccl", "123"));
//		System.out.println(service.selectById(33));
		
//		for (User user : dao.selectAll()) {
//			System.out.println(user);
//		}
		
//		System.out.println(service.selectAll());
		
//		System.out.println(dao.dynamicUpdateUser(new User(33, "ccl", "1234")));
//		sqlSession.commit();
		
//		System.out.println(dao.dynamicSelect(new User(null,null)));
		
//		for (User user : dao.dynamicSelectWhere(new User("ccl",null))){
//			System.out.println(user);
//		}
		
//		System.out.println(dao.updateUser(new User(36,"ccl", "111")));
//		sqlSession.commit();
		
		List<Integer> list = new ArrayList<>();
		list.add(33);
		list.add(36);
		list.add(37);
		list.add(38);
		
//		for (User user : dao.selectByIds(list)){
//			System.out.println(user);
//		}
	}
}
