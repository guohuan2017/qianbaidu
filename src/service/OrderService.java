package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.OrderMapper;
import pojo.Order;

@Service
public class OrderService {

	@Autowired
	private OrderMapper dao;
	public OrderMapper getDao() {
		return dao;
	}
	public void setDao(OrderMapper dao) {
		this.dao = dao;
	}
	
	public int deleteByPrimaryKey(Integer id){
		return dao.deleteByPrimaryKey(id);
	}

	public int insert(Order record){
		return dao.insert(record);
	}

	public int insertSelective(Order record){
		return dao.insertSelective(record);
	}

	public Order selectByPrimaryKey(Integer id){
		return dao.selectByPrimaryKey(id);
	}

	public int updateByPrimaryKeySelective(Order record){
		return dao.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(Order record){
		return dao.updateByPrimaryKey(record);
	}
	
	public int insertNoId(Order order){
		return dao.insertNoId(order);
	}
}
