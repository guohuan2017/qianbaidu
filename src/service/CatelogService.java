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
}
