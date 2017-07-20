package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.CommentMapper;
import pojo.Comment;

@Service
public class CommentService {

	@Autowired
	private CommentMapper dao;
	public CommentMapper getDao() {
		return dao;
	}
	public void setDao(CommentMapper dao) {
		this.dao = dao;
	}
	
	public int deleteByPrimaryKey(Integer id){
		return dao.deleteByPrimaryKey(id);
	}

	public int insert(Comment record){
		return dao.insert(record);
	}

	public int insertSelective(Comment record){
		return dao.insertSelective(record);
	}

	public Comment selectByPrimaryKey(Integer id){
		return dao.selectByPrimaryKey(id);
	}

	public int updateByPrimaryKeySelective(Comment record){
		return dao.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(Comment record){
		return dao.updateByPrimaryKey(record);
	}
}
