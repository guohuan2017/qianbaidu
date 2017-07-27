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

public class Test3 {
	private SqlSession sqlSession;
//	private UserMapper dao;
	
//	@Before
//	public void getSqlSession() {
//		sqlSession = SqlSessionFactory.getSqlSession();
//		dao=sqlSession.getMapper(UserMapper.class);
//	}
	
	
	@org.junit.Test
	public void test() {

		String path = this.getClass().getResource("").getPath();
		System.out.println(path);
//		String[] string =path.split("MyBatis");
//		System.out.println(string[0]+"MyBatis");
		
//		String buy = "24745.14,1_3;2_1;3_2;";
//		
//		String[] price = buy.split(",");
//		System.out.println(price[0]);
//		String[] orders = price[1].split(";");
//		for (String order : orders) {
//			System.out.println(order);
//		}
//		System.out.println("finish!");
//		System.out.println();
//		System.out.println("start!");
//		for (String order : orders) {
//			String[] foodAndNum = order.split("_",2);
//			String food = foodAndNum[0];
//			String num = foodAndNum[1];
//			System.out.println("food:"+food+"number:"+num);
//		}
		
	}
}
