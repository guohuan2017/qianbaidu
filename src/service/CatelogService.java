package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.CatelogMapper;
import pojo.Catelog;

@Service
public class CatelogService {

	@Autowired
	private CatelogMapper dao;
	public CatelogMapper getDao() {
		return dao;
	}
	public void setDao(CatelogMapper dao) {
		this.dao = dao;
	}
	
	public int deleteByPrimaryKey(Integer id){
		return dao.deleteByPrimaryKey(id);
	}

	public int insert(Catelog record){
		return dao.insert(record);
	}

	public int insertSelective(Catelog record){
		return dao.insertSelective(record);
	}

	public Catelog selectByPrimaryKey(Integer id){
		return dao.selectByPrimaryKey(id);
	}

	public int updateByPrimaryKeySelective(Catelog record){
		return dao.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(Catelog record){
		return dao.updateByPrimaryKey(record);
	}
}
