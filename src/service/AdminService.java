package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.AdminMapper;
import pojo.Admin;

@Service
public class AdminService {

	@Autowired
	private AdminMapper dao;
	public AdminMapper getDao() {
		return dao;
	}
	public void setDao(AdminMapper dao) {
		this.dao = dao;
	}
	
	public Admin loginSelect(Admin admin){
		return dao.loginSelect(admin);
	}
	
	public int insert(Admin admin){
		return dao.insert(admin);
	}
	
	public int insertSelective(Admin admin){
		return dao.insertSelective(admin);
	}
}
