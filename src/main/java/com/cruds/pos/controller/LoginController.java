package com.cruds.pos.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cruds.pos.bean.CredentialsBean;
import com.cruds.pos.service.TestService;
import com.cruds.pos.service.UserServiceImpl;

@Controller
public class LoginController {

	@Autowired
	TestService testService;

	@Autowired
	private UserServiceImpl userService;

	/*	@RequestMapping("login.html")
	public String showLoginPage()
	{
		//testService.create(new TestEntity("Hello"));
		// uncomment above line to test Hibernate 
		return "login";
	}
	 */

	@RequestMapping(value="/login")
	public String showLoginPage()
	{
		return "login";
	}

	@RequestMapping(value="/login" ,method= RequestMethod.POST)
	public String doLogin(@RequestParam("userID") String userID
			,@RequestParam("password") String password
			,HttpSession session ,RedirectAttributes ra)
	{
		CredentialsBean user = userService.authenticate(userID, password);

		if(user != null)
		{
			user.setPassword("");
			session.setAttribute("USER", user);
			return "home";
		}
		else
		{
			ra.addAttribute("ERROR", "Invalid");
			return "redirect:login";
		}
	}
	

}
