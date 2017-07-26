package controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import pojo.CommercialUser;
import service.CommercialUserService;
import util.MD5;
import util.createUUID;

@Controller
@RequestMapping("/commercialuser")
public class CommercialUserController {
	
	@Autowired
	private CommercialUserService commercialUserService;
	
	@RequestMapping("/register.index")
	public ModelAndView index(HttpServletRequest request ,HttpServletResponse response){
		return new ModelAndView("shop/register");
	}
	
	@RequestMapping("/register.action")
	public ModelAndView register(CommercialUser commercialUser ,HttpServletRequest request ,HttpServletResponse response){
		ModelAndView modelAndView = new ModelAndView();
		String repassword = request.getParameter("repassword");
		if(null != repassword && !"".equals(repassword)){
			if(repassword.equals(commercialUser.getPassword())){
				commercialUser.setId(createUUID.getUUID());
				try {
					commercialUser.setPassword(MD5.jiami(commercialUser.getPassword()));
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				int i = commercialUserService.register(commercialUser);
				if(1 == i){
					modelAndView.setViewName("shop/login");
//					modelAndView.setViewName("shop/login");
					commercialUser.setPassword("");
					modelAndView.addObject("commercialUser", commercialUser);
				}
			}
		}else{
			modelAndView.setViewName("shop/register");
			modelAndView.addObject("commercialUser", commercialUser);
			return modelAndView;
		}
		
		return modelAndView;
	}
	
	
	@RequestMapping("/login.action")
	public ModelAndView login(CommercialUser commercialUser ,HttpServletRequest request ,HttpServletResponse response){
		ModelAndView modelAndView = new ModelAndView();
		
		CommercialUser commericalUser2 = commercialUserService.login(commercialUser); 
		
		
		
		
		
		return modelAndView;
	}
	
	
	
}
