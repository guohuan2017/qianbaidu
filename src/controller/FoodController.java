package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pojo.Food;
import service.FoodService;

@Controller
public class FoodController {

	@Autowired
	private FoodService service;
	
	@RequestMapping("/shopfood.action")
	public ModelAndView shopjsp(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("shop/index_whs");
		List<Food> foodlist = service.selectByStoreId(Integer.parseInt(request.getParameter("id")));
		mav.addObject("foodlist", foodlist);
		return mav;
	}
}
