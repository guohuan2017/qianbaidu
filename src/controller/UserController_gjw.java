package controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.constraints.Null;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pojo.User;
import service.UserService;

//添加Controller注解，之后自动添加到Spring容器中
@Controller

// 在这里加注解的话 可以为类中所有方法添加上级地址
public class UserController_gjw {

	@Autowired
	private UserService service;

	@RequestMapping("/changepassword.action")
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) {
		/**
		 * 123不分先后 1.创建ModelAndView对象mav 结束方法时 return mav 2.从session中获取User对象
		 * 以获得原密码 3.从页面拿值 request.getParameter("")
		 * 
		 * 4.判断用户密码 和输入的原密码 是否一致 5.一致→修改为新密码 6.在ModelAndView中 加入要传的值 如message
		 * 7.return ModelAndView
		 */

		// 创建ModelAndView对象
		ModelAndView mav = new ModelAndView("user/profile/changepassword");

		// 从session中获取User对象
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		// 从user对象里获取id 根据id从数据库查找password
		Integer id = user.getId();
		String oldpassword = service.selectPassword(id);
		// 简写
		// String oldpassword = service.selectPassword(user.getId());

		// 从页面拿值
		String password = request.getParameter("password");
		String newpasswordMeiJiaMi = request.getParameter("newpassword");

		// System.out.println("未加密的原密码"+password);
		// System.out.println("未加密的新密码"+newpasswordMeiJiaMi);

		// 给拿到的值加密 创建临时user对象tmp 用set方法加密 再用get拿出
		String newpassword = null;

		// tmp 为temporary 临时 程序猿很常用
		User tmp = new User();
		// 用set方法加密
		tmp.setPassword(password);
		// 用get拿出
		password = tmp.getPassword();

		// 重复上述过程，传入的值（newpasswordMeiJiaMi）不同
		tmp.setPassword(newpasswordMeiJiaMi);
		newpassword = tmp.getPassword();
		// newpassword已加密

		// System.out.println("数据库中的原密码"+oldpassword);
		// System.out.println("加密后的原密码"+password);
		// System.out.println("加密后的新密码"+newpassword);

		// 将页面拿到的值与原密码（oldpassword）进行比较
		// 如果不同
		if (!oldpassword.equals(password)) {
			// 如果密码不同则返回原页面，并且提示密码不同
			mav.addObject("message", "密码不同,请重新输入");
			return mav;
		}
		// 如果相同
		else {
			// set方法密码是MD5加密的
			user.setPassword(newpasswordMeiJiaMi);
			// 返回i代表修改了几行 i==1 则只修改了一个用户的密码
			int i = service.updatePasswordById(user);
			if (i == 1) {
				mav.addObject("message", "修改成功");
			} else {
				mav.addObject("message", "修改失败");
			}
			return mav;
		}

	}

	@RequestMapping("/userlogin.action")
	public ModelAndView login(User user, HttpServletRequest request, HttpServletResponse response) {
		User user2 = service.loginSelect(user);
		if (user2 == null) {
			System.out.println("登陆失败");
			ModelAndView mav = new ModelAndView("user/login");
			mav.addObject("message", "登陆失败");
			return mav;
		} else {
			System.out.println("登陆成功");
			ModelAndView mav = new ModelAndView("forward:loginallshopjsp.action");
			mav.addObject("message", "登陆成功");
			mav.addObject("user", user2);
			System.out.println(user2);
			request.getSession().setAttribute("user", user2);
			return mav;
		}
	}

	@RequestMapping("/userregister.action")
	public ModelAndView regist(User user, HttpServletRequest request, HttpServletResponse response) {
		int i = service.insert(user);
		if (i > 0) {
			System.out.println("注册成功");
			ModelAndView modelAndView = new ModelAndView("user/login");
			modelAndView.addObject("message", "注册成功");
			return modelAndView;
		} else {
			System.out.println("注册失败");
			ModelAndView modelAndView = new ModelAndView("user/register");
			modelAndView.addObject("message", "注册失败,手机号已被注册");
			return modelAndView;
		}
	}

}
