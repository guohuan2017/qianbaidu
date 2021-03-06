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

// 在这里加注解的话 可以为类中所有方法添加上级地址
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService service;

	@RequestMapping("/login.index")
	public ModelAndView index(HttpServletRequest request, HttpServletResponse response) throws Exception {
		return new ModelAndView("user/login.jsp");
	}

	@RequestMapping("/login.action")
	public ModelAndView login(User user, HttpServletRequest request, HttpServletResponse response) {
		User user2 = service.loginSelect(user);
		if (user2 == null) {
			System.out.println("登陆失败");
			ModelAndView mav = new ModelAndView("test/login");
			mav.addObject("message", "登陆失败");
			return mav;
		} else {
			System.out.println("登陆成功");
			ModelAndView mav = new ModelAndView("test/welcome");
			mav.addObject("message", "登陆成功");
			mav.addObject("user", user2);
			System.out.println(user2);
			request.getSession().setAttribute("user", user2);
			return mav;
		}
	}

	@RequestMapping("/sqlregist.action")
	public ModelAndView regist(User user, HttpServletRequest request, HttpServletResponse response) {
		if (service.selectPhone(user.getPhone()) != null) {
			ModelAndView mav = new ModelAndView("test/login");
			mav.addObject("message", "注册失败，此号码已被注册");
			return mav;
		} else {
			int i = service.insert(user);
			User user2 = service.loginSelect(user);
			if (user2 == null) {
				System.out.println("注册失败");
				ModelAndView mav = new ModelAndView("test/login");
				mav.addObject("message", "注册失败");
				return mav;
			} else {
				System.out.println("注册成功");
				ModelAndView mav = new ModelAndView("test/welcome");
				mav.addObject("message", "注册成功");
				mav.addObject("user", user2);
				System.out.println(user2);
				request.getSession().setAttribute("user", user2);
				return mav;
			}
		}
	}

	// @RequestMapping("welcome.action")
	// public String login(User user, Model model) {
	// System.out.println(user.getUsername() + " " + user.getPassword());
	// user = service.checkLogin(user.getUsername(), user.getPassword());
	// System.out.println(user.getUsername() + " " + user.getPassword());
	// if (null != user) {
	// model.addAttribute("user", user);
	// System.out.println("---- login --> welcome ----");
	// return "welcome";
	// }
	// System.out.println("---- login --> login ----");
	// return "login";
	// }
}
