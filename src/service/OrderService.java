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
	
	
}
