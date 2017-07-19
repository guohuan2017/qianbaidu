package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import pojo.Order;
import service.OrderService;

@Controller
public class OrderController {

	@Autowired
	private OrderService service;
}
