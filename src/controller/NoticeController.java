package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import pojo.Notice;
import service.NoticeService;

@Controller
public class NoticeController {

	@Autowired
	private NoticeService service;
}
