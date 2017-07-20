package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.DeliverMapper;
import pojo.Deliver;

@Service
public class DeliverService {

	@Autowired
	private DeliverMapper dao;
	public DeliverMapper getDao() {
		return dao;
	}
	public void setDao(DeliverMapper dao) {
		this.dao = dao;
	}
	
	public int deleteByPrimaryKey(Integer id){
		return dao.deleteByPrimaryKey(id);
	}

	public int insert(Deliver record){
		return dao.insert(record);
	}

	public int insertSelective(Deliver record){
		return dao.insertSelective(record);
	}

	public Deliver selectByPrimaryKey(Integer id){
		return dao.selectByPrimaryKey(id);
	}

	public int updateByPrimaryKeySelective(Deliver record){
		return dao.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(Deliver record){
		return dao.updateByPrimaryKey(record);
	}
}
