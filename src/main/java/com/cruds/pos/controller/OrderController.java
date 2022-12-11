package com.cruds.pos.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cruds.pos.bean.CartBean;
import com.cruds.pos.form.OrderFormBean;
import com.cruds.pos.service.CustomerServiceImpl;

@Controller
public class OrderController {
	
	@Autowired
	CustomerServiceImpl customerService;
	
	@RequestMapping(value = "order.html", method= RequestMethod.GET)
	public String ShowOrder(Model model)
	{
		model.addAttribute("command", new OrderFormBean());
		model.addAttribute("ORDERS", customerService.viewOrder());
		return "order";	
	}
	
	@RequestMapping(value="order.html", method=RequestMethod.POST)
	public String order(@ModelAttribute ("OrderFormBean") OrderFormBean orderFormBean
			,ArrayList<CartBean> cb,RedirectAttributes redirectAttributes)
	{
		if(customerService.confirmOrder(orderFormBean,cb) != null)
		{
			redirectAttributes.addFlashAttribute("MESSAGE", "Thank You,Order Placed Successfully");
			redirectAttributes.addFlashAttribute("neworder", orderFormBean);
		}
		else
		{
			redirectAttributes.addFlashAttribute("error", "Unknown error while creating ordering!");
		}
		return "order";
	}

	@RequestMapping(value="/order-del-{orderID}", method=RequestMethod.GET)
	public String Cancel(@PathVariable("orderID") String orderID)
	{
		customerService.cancelOrder(orderID);
		System.out.println("cancel order " + orderID);
		return "cancelorder";
	}


}
