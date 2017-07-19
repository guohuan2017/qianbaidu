package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.AddressMapper;
import pojo.Address;

@Service
public class AddressService {

	@Autowired
	private AddressMapper dao;
	public AddressMapper getDao() {
		return dao;
	}
	public void setDao(AddressMapper dao) {
		this.dao = dao;
	}
	
}
