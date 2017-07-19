package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import pojo.Food;
import service.FoodService;

@Controller
public class FoodController {

	@Autowired
	private FoodService service;
}
