package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pojo.Food;
import pojo.Store;
import service.FoodService;
import service.StoreService;

@Controller
public class FoodController {

	@Autowired
	private FoodService service;
	
	@Autowired
	private StoreService storeService;
	
	@RequestMapping("/shopfood.action")
	public ModelAndView shopjsp(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("shop/index_whs");
		Integer store_id = Integer.parseInt(request.getParameter("id"));
		Store store = storeService.selectByPrimaryKey(store_id);
		mav.addObject("store",store );
//		request.getSession().setAttribute("store", store);
		List<Food> foodlist = service.selectByStoreId(store_id);
		mav.addObject("foodlist", foodlist);
		return mav;
	}
}
