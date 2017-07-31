package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.CommercialUserMapper;
import pojo.CommercialUser;

@Service
public class CommercialUserService {

	@Autowired
	private CommercialUserMapper dao;

	public int register(CommercialUser commercialUser) {
		return dao.insertSelective(commercialUser);
	}

	public CommercialUser login(CommercialUser commercialUser) {
		return dao.selectBytelPassword(commercialUser);
	}

	public int updateStoreId(CommercialUser commercialUser) {
		return dao.updateStoreId(commercialUser);
		
	}
	
}
