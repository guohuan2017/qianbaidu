package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import pojo.Deliver;
import service.DeliverService;


@Controller
public class DeliverController {

	@Autowired
	private DeliverService service;
}
