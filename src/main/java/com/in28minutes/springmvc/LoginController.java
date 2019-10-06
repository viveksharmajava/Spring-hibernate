package com.in28minutes.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.in28minutes.LoginService;

import org.springframework.ui.ModelMap;

@Controller
public class LoginController {

	@Autowired
	LoginService service;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String handleRequest(@RequestParam String name , ModelMap model) {
		System.out.println("Name received ="+name);
		if(service.validateUser(name, "vivek"))
		 {
			model.put("name",  "Welcome "+name);
			return "welcome";
		 }
		else {
			model.put("errorMessage",  "Invalid Credential");
			return "login";
		}
		
	}
	
	@RequestMapping(value ="/dologin")
	public String sowLoginPage() {
		return "login";
	}
}
