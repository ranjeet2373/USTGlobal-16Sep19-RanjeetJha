package com.ustglobal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ustglobal.loginservice.LoginService;

@Controller
public class LoginController {
	@Autowired
	LoginService service;

	@RequestMapping(path = "/login")
	public String showLoginPage() {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String welcomePage(@RequestParam String name, @RequestParam String password, ModelMap map) {
		if(!service.validateUser(name, password)) {
			map.put("errorMessage", "InvalidData");
			return "login";
			
		}else {
		map.put("successMessage", "Successfull Login");
		map.put("name", name);
		map.put("password", password);
		return "welcome";
	}
	}
}
