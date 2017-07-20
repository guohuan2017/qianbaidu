package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pojo.OrderList;
import service.OrderListService;

@Controller
public class OrderListController {

	@Autowired
	private OrderListService service;
	
	@RequestMapping("/pay.action")
	public ModelAndView zhifu(){
		return new ModelAndView("test/tmp","message","支付成功");
	}
}
