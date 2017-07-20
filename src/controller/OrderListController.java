package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import pojo.OrderList;
import service.OrderListService;

@Controller
public class OrderListController {

	@Autowired
	private OrderListService service;
}
