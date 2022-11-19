package com.cruds.pos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cruds.pos.entity.TestEntity;
import com.cruds.pos.service.TestService;

@Controller
public class LoginController {

	@Autowired
	TestService testService;
	
	@RequestMapping("login.html")
	public String showLoginPage()
	{
		//testService.create(new TestEntity("Hello"));
		// uncomment above line to test Hibernate 
		return "login";
	}
	
	
}
