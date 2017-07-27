package controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pojo.Food;
import pojo.Order;
import pojo.OrderList;
import pojo.Store;
import pojo.User;
import service.AddressService;
import service.FoodService;
import service.OrderListService;
import service.OrderService;
import service.StoreService;
import util.createUUID;

@Controller
public class OrderController {

	@Autowired
	private OrderService service;

	@Autowired
	private FoodService foodService;

	@Autowired
	private StoreService storeService;

	@Autowired
	private OrderListService orderListService;

	@Autowired
	private AddressService addressService; 
	
	
	@RequestMapping("/order.action")
	public ModelAndView shopjsp(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("zhifu/cashdesk");
		String buy = request.getParameter("order");

		System.out.println(buy);
		
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		Integer user_id = user.getId();

		String[] price = buy.split(",");
		// System.out.println(price[0]);
		// 总价
		String total_price = price[0];

		int num = 0;

		Integer store_id = Integer.parseInt(price[1]);
		
		Integer address_id = Integer.parseInt(price[2]);

		List<Food> foodlist = new ArrayList<>();

		Food food = null;

		String UUId = createUUID.getUUID();

		String[] orders = price[3].split(";");
		for (String order : orders) {
			String[] foodAndNum = order.split("_", 2);
			Integer food_id = Integer.parseInt(foodAndNum[0]);
			Integer food_number = Integer.parseInt(foodAndNum[1]);

			Order buyorder = new Order(user_id, food_id, food_number, store_id, UUId);

			System.out.println(buyorder);
			service.insertNoId(buyorder);

			food = foodService.selectByPrimaryKey(food_id);
			food.setNumber(food_number);
			foodlist.add(food);
			num += food_number;
			// System.out.println("food_id:"+food_id+",food_number:"+food_number);
		}

		// OrderList构造方法 user_id, address_id, store_id, deliver_id, order_id,total_price, status, time
		OrderList orderList = new OrderList(user_id, address_id, store_id, 1,
				UUId, Double.parseDouble(total_price), 0, new java.sql.Timestamp(new java.util.Date().getTime()));
		
		if (orderListService.insertSelective(orderList) > 0) {
			
//			System.out.println("主键"+orderList);
			// Store store = storeService.selectByPrimaryKey(store_id);
			// session.setAttribute("store", store);
			
			mav.addObject("orderid", UUId);
			mav.addObject("orderList", orderList);
			mav.addObject("address", addressService.selectByPrimaryKey(address_id));
			mav.addObject("foodlist", foodlist);
			mav.addObject("total", total_price);
			mav.addObject("num", num);
			return mav;
		}else{
			mav.addObject("message", "下单失败");
			mav.addObject("foodlist", foodlist);
			mav.addObject("total_price", total_price);
			mav.addObject("num", num);
			return mav;
		}

		
		
	}
}
