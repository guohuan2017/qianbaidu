package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pojo.Admin;
import service.AdminService;

@Controller
public class AdminController {

	@Autowired
	private AdminService service;
	
	@RequestMapping("/adminlogin.action")
	public ModelAndView login(Admin admin,HttpServletRequest request, HttpServletResponse response){
		Admin admin2 = service.loginSelect(admin);
		if(admin2==null){
			System.out.println("登陆失败");
			ModelAndView mav = new ModelAndView("test/login");
			mav.addObject("message","登陆失败");
			return mav;
		}else{
			System.out.println("登陆成功");
			ModelAndView mav = new ModelAndView("test/welcome2");
			mav.addObject("message","登陆成功");
			mav.addObject("user",admin2);
//			mav.addObject("admin",admin2);
			System.out.println(admin2);
			request.getSession().setAttribute("user", admin2);
//			request.getSession().setAttribute("admin", admin2);
			return mav;
		}
	}
		
	@RequestMapping("/adminregist.action")
	public ModelAndView regist(Admin admin,HttpServletRequest request, HttpServletResponse response){
		int i = service.insert(admin);
		Admin admin2 = service.loginSelect(admin);
		if(admin2==null){
			System.out.println("注册失败");
			ModelAndView mav = new ModelAndView("test/login");
			mav.addObject("message","注册失败");
			return mav;
		}else{
			System.out.println("注册成功");
			ModelAndView mav = new ModelAndView("test/welcome2");
			mav.addObject("message","注册成功");
			mav.addObject("user",admin2);
//			mav.addObject("admin",admin2);
			System.out.println(admin2);
			request.getSession().setAttribute("user", admin2);
//			request.getSession().setAttribute("admin", admin2);
			return mav;
		}
	}	
}
