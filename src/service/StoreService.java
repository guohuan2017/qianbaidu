package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.StoreMapper;
import pojo.Store;

@Service
public class StoreService {

	@Autowired
	private StoreMapper dao;

	public StoreMapper getDao() {
		return dao;
	}

	public void setDao(StoreMapper dao) {
		this.dao = dao;
	}

	public Store loginSelect(Store store) {
		return dao.loginSelect(store);
	}

	public int insert(Store store) {
		return dao.insert(store);
	}

	public int insertSelective(Store store) {
		return dao.insertSelective(store);
	}

	public int updatePhotoById(Store store) {
		return dao.updatePhotoById(store);
	}

	public int deleteByPrimaryKey(Integer id) {
		return dao.deleteByPrimaryKey(id);
	}

	public Store selectByPrimaryKey(Integer id){
		return dao.selectByPrimaryKey(id);
	}
	
	public int updateByPrimaryKeySelective(Store record){
		return dao.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(Store record){
		return dao.updateByPrimaryKey(record);
	}

	public Store selectTel(String tel){
		return dao.selectTel(tel);
	}
	
	public List<Store> selectAll(){
		return dao.selectAll();
	}
	
	public List<Store> SearchBySubtype(String subtype){
		return dao.SearchBySubtype(subtype);
	}
	
	public List<Store> SearchStore(String type){
		return dao.SearchStore(type);
	}

}
