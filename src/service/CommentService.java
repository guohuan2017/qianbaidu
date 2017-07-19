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
}
