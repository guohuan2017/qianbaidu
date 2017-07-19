package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.FoodMapper;
import pojo.Food;

@Service
public class FoodService {

	@Autowired
	private FoodMapper dao;
	public FoodMapper getDao() {
		return dao;
	}
	public void setDao(FoodMapper dao) {
		this.dao = dao;
	}
}
