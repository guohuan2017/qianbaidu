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
	
}
