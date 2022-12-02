package com.cruds.pos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cruds.pos.form.StoreFormBean;
import com.cruds.pos.service.CustomerServiceImpl;

@Controller
public class OrderController {
	
	@Autowired
	CustomerServiceImpl customerService;
	
	@RequestMapping(value = "order.html", method= RequestMethod.GET)
	public String ShowOrder(Model model , String city)
	{
		model.addAttribute("command", new StoreFormBean());
//		model.addAttribute("STORE", customerService.viewStore(city));
		model.addAttribute("ORDERS", customerService.viewOrder());
		return "order";	
	}

	@RequestMapping(value="/order-del-{orderID}", method=RequestMethod.GET)
	public String Cancel(@PathVariable("orderID") String orderID)
	{
		customerService.cancelOrder(orderID);
		System.out.println("cancel orderID " + orderID);
		return "redirect:order.html";
	}


}
