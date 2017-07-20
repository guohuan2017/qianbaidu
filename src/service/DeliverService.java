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
	
}
