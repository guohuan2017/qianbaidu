package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import pojo.CommericalUser;
import service.CommercialUserService;
import util.createUUID;

@Controller
public class CommercialUserController {
	
	@Autowired
	private CommercialUserService commercialUserService;
	
	@RequestMapping("/register.index")
	public ModelAndView index(HttpServletRequest request ,HttpServletResponse response){
		return new ModelAndView("shop/register");
	}
	
	@RequestMapping("/register.action")
	public ModelAndView register(CommericalUser commercialUser ,HttpServletRequest request ,HttpServletResponse response){
		ModelAndView modelAndView = new ModelAndView();
		String repassword = request.getParameter("repassword");
		if(null != repassword && !"".equals(repassword)){
			if(repassword == commercialUser.getPassword()){
				commercialUser.setId(createUUID.getUUID());
				int i = commercialUserService.register(commercialUser);
				if(1 == i){
					modelAndView.setViewName("shop/login");
					commercialUser.setPassword("");
					modelAndView.addObject("commercialUser", commercialUser);
				}
			}
		}else{
			modelAndView.setViewName("shop/register");
			modelAndView.addObject("commercialUser", commercialUser);
		}
		
		return modelAndView;
	}
	
}
