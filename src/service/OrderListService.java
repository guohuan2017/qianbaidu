package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.OrderListMapper;
import pojo.OrderList;

@Service
public class OrderListService {

	@Autowired
	private OrderListMapper dao;
	public OrderListMapper getDao() {
		return dao;
	}
	public void setDao(OrderListMapper dao) {
		this.dao = dao;
	}
	
	public int deleteByPrimaryKey(Integer id){
		return dao.deleteByPrimaryKey(id);
	}

	public int insert(OrderList record){
		return dao.insert(record);
	}

	public int insertSelective(OrderList record){
		return dao.insertSelective(record);
	}

	public OrderList selectByPrimaryKey(Integer id){
		return dao.selectByPrimaryKey(id);
	}

	public int updateByPrimaryKeySelective(OrderList record){
		return dao.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(OrderList record){
		return dao.updateByPrimaryKey(record);
	}
}
