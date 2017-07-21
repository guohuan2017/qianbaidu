package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.ShoppingCartMapper;
import pojo.ShoppingCart;

@Service
public class ShoppingCartService {

	@Autowired
	private ShoppingCartMapper dao;
	public ShoppingCartMapper getDao() {
		return dao;
	}
	public void setDao(ShoppingCartMapper dao) {
		this.dao = dao;
	}
	
	public int deleteByPrimaryKey(Integer id){
		return dao.deleteByPrimaryKey(id);
	}

	public int insert(ShoppingCart record){
		return dao.insert(record);
	}

	public int insertSelective(ShoppingCart record){
		return dao.insertSelective(record);
	}

	public ShoppingCart selectByPrimaryKey(Integer id){
		return dao.selectByPrimaryKey(id);
	}

	public int updateByPrimaryKeySelective(ShoppingCart record){
		return dao.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(ShoppingCart record){
		return dao.updateByPrimaryKey(record);
	}
}
