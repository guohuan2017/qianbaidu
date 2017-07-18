package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pojo.Store;
import service.StoreService;


//添加Controller注解，之后自动添加到Spring容器中
@Controller

//在这里加注解的话 可以为类中所有方法添加上级地址
public class StoreController {

	@Autowired
	private StoreService service;
	
	
	@RequestMapping("/storelogin.action")
//	public ModelAndView sqllogin(Store store){
	public ModelAndView sqllogin(Store store){
		Store store2 = service.loginSelect(store);
		if(store2==null){
			System.out.println("登陆失败");
			ModelAndView mav = new ModelAndView("login");
			mav.addObject("message","登陆失败");
			return mav;
		}else{
			System.out.println("登陆成功");
			ModelAndView mav = new ModelAndView("welcome");
			mav.addObject("message","登陆成功");
			mav.addObject("store", store2);
			System.out.println(store2);
			return mav;
		}
	}
	
	@RequestMapping("/storeregist.action")
	public ModelAndView regist(Store store){
	
		int i = service.insertSelective(store);
		System.out.println(i);
		Store store2 = service.loginSelect(store);
		if(store2==null){
			System.out.println("注册失败");
			ModelAndView mav = new ModelAndView("login");
			mav.addObject("message","注册失败");
			return mav;
		}else{
			System.out.println("注册成功");
			ModelAndView mav = new ModelAndView("welcome");
			mav.addObject("message","注册成功");
			mav.addObject("store", store2);
			System.out.println(store2);
			return mav;
		}
	}

//	@RequestMapping("welcome.action")
//	public String login(User user, Model model) {
//		System.out.println(user.getUsername() + " " + user.getPassword());
//		user = service.checkLogin(user.getUsername(), user.getPassword());
//		System.out.println(user.getUsername() + " " + user.getPassword());
//		if (null != user) {
//			model.addAttribute("user", user);
//			System.out.println("---- login --> welcome ----");
//			return "welcome";
//		}
//		System.out.println("---- login --> login ----");
//		return "login";
//	}
}