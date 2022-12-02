package com.cruds.pos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cruds.pos.form.CartFormBean;
import com.cruds.pos.service.CustomerServiceImpl;

@Controller
public class CartController {

	@Autowired
	CustomerServiceImpl customerService;
	
	@RequestMapping(value = "cart.html", method=RequestMethod.GET)
	public String ShowProfileForm(Model model , Long id)
	{
		model.addAttribute("command", new CartFormBean());
		model.addAttribute("CART", customerService.viewCart(id));
		return "cart";	
	}

	@RequestMapping(value="cart.html", method=RequestMethod.POST)
	public String addToCart(@ModelAttribute ("CartFormBean") CartFormBean cartFormBean)
	{
		customerService.addToCart(cartFormBean);
		System.out.println(cartFormBean);
		return "cart";
	}
	
}
