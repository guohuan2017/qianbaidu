package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pojo.Address;
import pojo.User;
import service.AddressService;

@Controller
public class AddressController {

	@Autowired
	private AddressService service;
	
	@RequestMapping("/useraddress.action")
	public ModelAndView selectAddress(HttpServletRequest request, HttpServletResponse response){
		ModelAndView mav = new ModelAndView("user/profile/address");
		//一口气拿 分步如下
		/**HttpSession session = request.getSession();
		 * User user =(User)session.getAttribute("user");
		 * int id = user.getId();
		 * List<Address> addresslist = service.selectById(id);
		 */ 
		 List<Address> addresslist = service.selectById(((User)request.getSession().getAttribute("user")).getId());
		mav.addObject("addresslist", addresslist);
		return mav;
	}
	
	@RequestMapping("/updateaddress.action")
	public ModelAndView updateAddress(HttpServletRequest request, HttpServletResponse response){
		ModelAndView mav = new ModelAndView("user/profile/address");
		Address address = new Address(Integer.parseInt(request.getParameter("id")), ((User)request.getSession().getAttribute("user")).getId(), request.getParameter("address"));
		if(service.updateByPrimaryKey(address) >0){
			List<Address> addresslist = service.selectById(((User)request.getSession().getAttribute("user")).getId());
			mav.addObject("addresslist", addresslist);
			return mav;
		}else{
			List<Address> addresslist = service.selectById(((User)request.getSession().getAttribute("user")).getId());
			mav.addObject("addresslist", addresslist);
			mav.addObject("message", "修改失败");
			return mav;
		}
	}
	
	@RequestMapping("/deleteaddress.action")
	public ModelAndView deleteAddress(HttpServletRequest request, HttpServletResponse response){
		ModelAndView mav = new ModelAndView("user/profile/address");
		if(service.deleteByPrimaryKey(Integer.parseInt(request.getParameter("id")))>0){
			List<Address> addresslist = service.selectById(((User)request.getSession().getAttribute("user")).getId());
			mav.addObject("addresslist", addresslist);
			return mav;
		}else{
			List<Address> addresslist = service.selectById(((User)request.getSession().getAttribute("user")).getId());
			mav.addObject("addresslist", addresslist);
			mav.addObject("message", "删除失败");
			return mav;
		}
	}
}
