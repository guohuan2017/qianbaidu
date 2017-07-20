package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.NoticeMapper;
import pojo.Notice;

@Service
public class NoticeService {

	@Autowired
	private NoticeMapper dao;
	public NoticeMapper getDao() {
		return dao;
	}
	public void setDao(NoticeMapper dao) {
		this.dao = dao;
	}
	
	public int deleteByPrimaryKey(Integer id){
		return dao.deleteByPrimaryKey(id);
	}

	public int insert(Notice record){
		return dao.insert(record);
	}

	public int insertSelective(Notice record){
		return dao.insertSelective(record);
	}

	public Notice selectByPrimaryKey(Integer id){
		return dao.selectByPrimaryKey(id);
	}

	public int updateByPrimaryKeySelective(Notice record){
		return dao.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(Notice record){
		return dao.updateByPrimaryKey(record);
	}
}
