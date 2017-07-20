package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import pojo.Address;
import service.AddressService;

@Controller
public class AddressController {

	@Autowired
	private AddressService service;
}
