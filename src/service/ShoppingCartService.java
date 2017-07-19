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
}
