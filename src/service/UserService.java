package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.UserMapper;
import pojo.User;

@Service
public class UserService {

	@Autowired
	private UserMapper dao;

	public UserMapper getDao() {
		return dao;
	}

	public void setDao(UserMapper dao) {
		this.dao = dao;
	}

	public User checkLogin(String username, String password) {
		User user = dao.getUserByName(username);
		if (user != null && user.getPassword().equals(password)) {
			return user;
		}
		return null;
	}

	public 	User loginSelect(User user) {
		return dao.loginSelect(user);
	}

	public int insert(User record){
		return dao.insert(record);
	}

	public int insertSelective(User record){
		return dao.insertSelective(record);
	}
	
	public int deleteByPrimaryKey(Integer id){
		return dao.deleteByPrimaryKey(id);
	}
	
	public User selectByPrimaryKey(Integer id){
		return dao.selectByPrimaryKey(id);
	}
	
	public	User getUserByName(String username){
		return dao.getUserByName(username);
	}

	public User selectPhone(String phone){
		return dao.selectPhone(phone);
	}
}
