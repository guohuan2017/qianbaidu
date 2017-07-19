package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import pojo.Catelog;
import service.CatelogService;

@Controller
public class CatelogController {

	@Autowired
	private CatelogService service;
}
