package service;

import java.util.List;

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
	
	public int deleteByPrimaryKey(Integer id){
		return dao.deleteByPrimaryKey(id);
	}

	public int insert(Address record){
    	return dao.insert(record);
    }

	public int insertSelective(Address record){
    	return dao.insertSelective(record);
    }

	public Address selectByPrimaryKey(Integer id){
    	return dao.selectByPrimaryKey(id);
    }
    
	public int updateByPrimaryKeySelective(Address record){
		return dao.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(Address record){
		return dao.updateByPrimaryKey(record);
	}
	
	public List<Address> selectAll(){
		return dao.selectAll();
	}
	
	public  List<Address> selectById(Integer id){
		return dao.selectById(id);
		
	}
}
