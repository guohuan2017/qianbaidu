package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pojo.User;
import service.UserService;


//添加Controller注解，之后自动添加到Spring容器中
@Controller

//在这里加注解的话 可以为类中所有方法添加上级地址
public class UserController_gjw {

	@Autowired
	private UserService service;
	
	
	
	@RequestMapping("/userlogin.action")
	public ModelAndView sqllogin(User user,HttpServletRequest request, HttpServletResponse response){
		User user2 = service.loginSelect(user);
		if(user2==null){
			System.out.println("登陆失败");
			ModelAndView mav = new ModelAndView("user/login");
			mav.addObject("message","登陆失败");
			return mav;
		}else{
			System.out.println("登陆成功");
			ModelAndView mav = new ModelAndView("home/shoploginwin");
			mav.addObject("message","登陆成功");
			mav.addObject("user", user2);
			System.out.println(user2);
			request.getSession().setAttribute("user", user2);
			return mav;
		}
	}
	

}
