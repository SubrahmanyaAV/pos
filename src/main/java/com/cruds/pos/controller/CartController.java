package com.cruds.pos.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cruds.pos.bean.CartBean;
import com.cruds.pos.exception.POSException;
import com.cruds.pos.form.CartFormBean;
import com.cruds.pos.service.CustomerServiceImpl;
import com.cruds.pos.service.FoodServiceImpl;
import com.cruds.pos.service.UserServiceImpl;

@Controller
public class CartController {

	@Autowired
	CustomerServiceImpl customerService;
	
	@Autowired
	UserServiceImpl userService;
	
	@Autowired
	FoodServiceImpl foodService;
	
	
	@RequestMapping(value = "cart.html", method=RequestMethod.GET)
	public String ShowForm(Model model,HttpSession session)
	{
		model.addAttribute("command", new CartFormBean());
		model.addAttribute("CART", customerService.viewCart());
		model.addAttribute("FOOD", foodService.getAll());
		model.addAttribute("CREDENTIALS", userService.getAllCredentials());
		return "cart";	
	}

	@RequestMapping(value="cart.html", method=RequestMethod.POST)
	public String addToCart(@ModelAttribute("CartFormBean") CartFormBean cartFormBean) throws POSException
	{
		customerService.addToCart(cartFormBean);
		System.out.println(cartFormBean);
		return "cart";
	}
	
	@RequestMapping(value="/cart-edit-{cartID}", method=RequestMethod.GET)
	public String edit(@PathVariable("cartID") int cartID,Model model)
	{
		model.addAttribute("command",customerService.edit(cartID));
		return "modifycart";
	}
	
	@RequestMapping(value="modifycart.html" , method=RequestMethod.POST)
	public String modifyCart(@ModelAttribute("CartBean") CartBean cb )
	{
	//	userService.update(cb);
		System.out.println(cb);
		return "redirect:cart.html";
	}

	
}
