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
	
}
