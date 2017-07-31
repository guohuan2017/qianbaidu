package controller;

import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.oreilly.servlet.MultipartRequest;

import pojo.CommercialUser;
import pojo.Food;
import pojo.Store;
import service.FoodService;
import service.StoreService;
import util.TimeFileRenamePolicy;

@Controller
public class FoodController {

	@Autowired
	private FoodService service;

	@Autowired
	private StoreService storeService;

	@RequestMapping("/shopfood.action")
	public ModelAndView shopjsp(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("shop/index_whs");
		Integer store_id = Integer.parseInt(request.getParameter("id"));
		Store store = storeService.selectByPrimaryKey(store_id);
		mav.addObject("store", store);
		// request.getSession().setAttribute("store", store);
		List<Food> foodlist = service.selectByStoreId(store_id);
		mav.addObject("foodlist", foodlist);
		return mav;
	}

	@RequestMapping("/addfood.action")
	public ModelAndView registstore(HttpServletRequest request, HttpServletResponse response) throws IOException {
		HttpSession session = request.getSession();
		ModelAndView mav = new ModelAndView();
		CommercialUser commercialUser = (CommercialUser) session.getAttribute("user");
		if (null == commercialUser) {
			mav.setViewName("shop/login");
			return mav;
		}

		Food food = new Food();
		Store store = storeService.selectByPrimaryKey(commercialUser.getStoreid());

		if (store != null) {
			store = storeService.selectTel(store.getTel());
			if (null != store) {
				String path = request.getServletContext().getRealPath("uploadfood/");
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

				HashMap<String, String> map = new HashMap<String, String>();

				// 循环取上传的文件的名字
				while (enumeration.hasMoreElements()) {
					// 获取图片文本框的name属性值
					name = (String) enumeration.nextElement();
					System.out.println("name " + name);
					// 获取上传的元素名字
					filename = mr.getFilesystemName(name);
					System.out.println("filename " + filename);
					map.put(name, filename);
				}

				food.setPhoto("uploadfood/" + store.getId() + "_" + store.getStorename() + "/" + map.get("foodphoto"));

				food.setFoodname(mr.getParameter("foodname"));
				food.setPrice(Double.parseDouble(mr.getParameter("foodprice")));
				food.setType(mr.getParameter("foodtype"));
				food.setFoodinfo(mr.getParameter("foodinfo"));

				return mav;
			}
		}
		return mav;
	}

}
