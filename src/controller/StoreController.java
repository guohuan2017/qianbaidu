package controller;

import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.oreilly.servlet.MultipartRequest;

import pojo.Store;
import service.StoreService;
import util.TimeFileRenamePolicy;

//添加Controller注解，之后自动添加到Spring容器中
@Controller

// 在这里加注解的话 可以为类中所有方法添加上级地址
public class StoreController {

	@Autowired
	private StoreService service;

	@RequestMapping("/storelogin.action")
	// public ModelAndView sqllogin(Store store){
	public ModelAndView sqllogin(Store store, HttpServletRequest request, HttpServletResponse response) {
		Store store2 = service.loginSelect(store);
		if (store2 == null) {
			System.out.println("登陆失败");
			ModelAndView mav = new ModelAndView("test/login");
			mav.addObject("message", "登陆失败");
			return mav;
		} else {
			System.out.println("登陆成功");
			ModelAndView mav = new ModelAndView("test/welcome2");
			mav.addObject("message", "登陆成功");
			mav.addObject("user", store2);
			// mav.addObject("store", store2);
			System.out.println(store2);
			request.getSession().setAttribute("user", store2);
			// request.getSession().setAttribute("store", store2);
			return mav;
		}
	}

	@RequestMapping("/storeregist.action")
	public ModelAndView regist(Store store, HttpServletRequest request, HttpServletResponse response) {

		if (service.selectTel(store.getTel()) != null) {
			ModelAndView mav = new ModelAndView("test/login");
			mav.addObject("message", "注册失败，此号码已被注册");
			return mav;
		} else {
			int i = service.insert(store);
			Store store2 = service.loginSelect(store);
			if (store2 == null) {
				System.out.println("注册失败");
				ModelAndView mav = new ModelAndView("test/login");
				mav.addObject("message", "注册失败");
				return mav;
			} else {
				System.out.println("注册成功");
				ModelAndView mav = new ModelAndView("test/welcome2");
				mav.addObject("message", "注册成功");
				mav.addObject("user", store2);
				// mav.addObject("store", store2);
				System.out.println(store2);
				request.getSession().setAttribute("user", store2);
				// request.getSession().setAttribute("store", store2);
				return mav;
			}
		}
	}

	@RequestMapping("/uploadstore.action")
	public ModelAndView uploadstore(HttpServletRequest request, HttpServletResponse response) throws IOException {
		HttpSession session = request.getSession();
		Store store = (Store) session.getAttribute("user");
		ModelAndView mav = new ModelAndView("test/welcome2");

		String path = request.getServletContext().getRealPath("uploadstore/");
		System.out.println(path);

		File file = new File(path + "\\" + store.getId() + "_" + store.getStorename());
		if (!file.exists() && !file.isDirectory()) {
			file.mkdir();
		}

		path = file.getPath();

		// 创建第三方插件的对象
		MultipartRequest mr = new MultipartRequest(request, path, 50 * 1024 * 1024, "UTF-8",
				new TimeFileRenamePolicy());
		// 返回的是一个枚举对象
		Enumeration enumeration = mr.getFileNames();
		String name = null;
		String filename = null;
		// 循环取上传的文件的名字
		while (enumeration.hasMoreElements()) {
			// 获取图片文本框的name属性值
			name = (String) enumeration.nextElement();
			System.out.println("name " + name);
			// 获取上传的元素名字
			filename = mr.getFilesystemName(name);
			System.out.println("filename " + filename);
		}

		// request.setAttribute("filename", ("image/" + filename));

		store.setPhoto("uploadstore/" + store.getId() + "_" + store.getStorename() + "/" + filename);
		if (service.updatePhotoById(store) > 0) {
			session.setAttribute("user", store);
			mav.addObject("user", store);
			// session.setAttribute("store", store);
			// mav.addObject("store", store);
			mav.addObject("message", "上传成功");
		} else {
			mav.addObject("message", "上传失败");
		}
		return mav;
	}
	
	@RequestMapping("/allshopjsp.action")
	public ModelAndView shopjsp(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("home/shop");
		List<Store> storelist = service.selectAll();
		mav.addObject("storelist", storelist);
		mav.addObject("fl", request.getParameter("fl"));
		return mav;
	}
	
	@RequestMapping("/loginallshopjsp.action")
	public ModelAndView shoploginwinjsp(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("home/shoploginwin");
		List<Store> storelist = service.selectAll();
		System.out.println(storelist);
		mav.addObject("storelist", storelist);
		mav.addObject("fl", request.getParameter("fl"));
		return mav;
	}
	
	@RequestMapping("/subtype.action")
	public ModelAndView searchBySubtype(HttpServletRequest request, HttpServletResponse response){
		String subtype = request.getParameter("type");
		ModelAndView mav = new ModelAndView("home/shop");
		List<Store> storelist = service.SearchBySubtype(subtype);
		mav.addObject("storelist", storelist);
		mav.addObject("fl", request.getParameter("fl"));
		return mav;
	}
	
	@RequestMapping("/searchshop.action")
	public ModelAndView search(HttpServletRequest request, HttpServletResponse response){
		String type = "%" + request.getParameter("info") + "%";
		ModelAndView mav = new ModelAndView("home/shop");
		List<Store> storelist = service.SearchStore(type);
		mav.addObject("storelist", storelist);
		return mav;
	}
}
