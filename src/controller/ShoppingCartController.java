package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pojo.ShoppingCart;
import pojo.User;
import service.ShoppingCartService;

@Controller
public class ShoppingCartController {

	@Autowired
	private ShoppingCartService service;
	
	@RequestMapping("/buy.action")
	public ModelAndView shopjsp(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("shop/index_whs");
		String buy = request.getParameter("shoppingcart");
		
		User user = (User) request.getSession().getAttribute("user");
		String[] price = buy.split(",");
//		System.out.println(price[0]);
		//总价
		String total_price = price[0];
		
		Integer store_id = Integer.parseInt(price[1]);
		
		String[] orders = price[2].split(";");
		for (String order : orders) {
			String[] foodAndNum = order.split("_",2);
			Integer food_id = Integer.parseInt(foodAndNum[0]);
			Integer food_number = Integer.parseInt(foodAndNum[1]);

			ShoppingCart shoppingCart = new ShoppingCart(user.getId(), store_id, food_id, food_number, 0);
			
			service.insert(shoppingCart);
			System.out.println("food_id:"+food_id+",food_number:"+food_number);
		}
		
		System.out.println(total_price);
		
		return mav;
	}
}
