package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.CommercialUserMapper;
import pojo.CommericalUser;

@Service
public class CommercialUserService {

	@Autowired
	private CommercialUserMapper dao;

	public int register(CommericalUser commercialUser) {
		return dao.insertSelective(commercialUser);
	}
	
}
