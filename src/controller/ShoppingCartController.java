package controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pojo.Address;
import pojo.Food;
import pojo.ShoppingCart;
import pojo.Store;
import pojo.User;
import service.AddressService;
import service.FoodService;
import service.ShoppingCartService;
import service.StoreService;

@Controller
public class ShoppingCartController {

	@Autowired
	private ShoppingCartService service;
	
	@Autowired
	private StoreService storeService;
	
	@Autowired
	private FoodService foodService;
	
	@Autowired
	private AddressService addressService;
	
	@RequestMapping("/buy.action")
	public ModelAndView shopjsp(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("zhifu/confirm");
		String buy = request.getParameter("shoppingcart");
		
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		Integer user_id = user.getId();
		String[] price = buy.split(",");
//		System.out.println(price[0]);
		//总价
		String total_price = price[0];
		
		int num = 0;
		
		Integer store_id = Integer.parseInt(price[1]);
		
		List<Food> foodlist = new ArrayList<>();
		
		Food food = null;
		
		String[] orders = price[2].split(";");
		for (String order : orders) {
			String[] foodAndNum = order.split("_",2);
			Integer food_id = Integer.parseInt(foodAndNum[0]);
			Integer food_number = Integer.parseInt(foodAndNum[1]);

			ShoppingCart shoppingCart = new ShoppingCart(user_id, store_id, food_id, food_number, 0);
			
			service.insert(shoppingCart);
			
			food = foodService.selectByPrimaryKey(food_id);
			food.setNumber(food_number);
			foodlist.add(food);
			num += food_number;
//			System.out.println("food_id:"+food_id+",food_number:"+food_number);
		}
		
		Store store = storeService.selectByPrimaryKey(store_id);
		session.setAttribute("store", store);
		mav.addObject("foodlist",foodlist);
		mav.addObject("total", total_price);
		mav.addObject("num", num);
		
		List<Address> addresslist = addressService.selectById(user_id);
		mav.addObject("addresslist", addresslist);
		
		return mav;
	}
}
