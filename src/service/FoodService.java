package service;

import java.util.List;

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
	
	public int deleteByPrimaryKey(Integer id){
		return dao.deleteByPrimaryKey(id);
	}

	public int insert(Food record){
		return dao.insert(record);
	}

	public int insertSelective(Food record){
		return dao.insertSelective(record);
	}

	public Food selectByPrimaryKey(Integer id){
		return dao.selectByPrimaryKey(id);
	}

	public int updateByPrimaryKeySelective(Food record){
		return dao.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(Food record){
		return dao.updateByPrimaryKey(record);
	}
	
	public List<Food> selectByStoreId(Integer id){
		return dao.selectByStoreId(id);
	}
}
