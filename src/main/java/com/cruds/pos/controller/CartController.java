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
//		model.addAttribute("FOOD", foodService.getAll());
//		model.addAttribute("CREDENTIALS", userService.getAllCredentials());
		return "cart";	
	}

	@RequestMapping(value="cart.html", method=RequestMethod.POST)
	public String addToCart(@ModelAttribute("CartFormBean") CartFormBean cartFormBean
							,String foodID,Long id) throws POSException
	{
		CartBean cart = new CartBean();
		cart.setCartQuantity(1);
		cart.setCartType(cart.getFood().getFoodtype());
    	cart.setCost(cart.getCost()*cart.getCartQuantity());
    	cart.setOrderDate(cart.getOrderDate());
    	cart.setCredential(userService.findUserById(id));
    	cart.setFood(foodService.getByID(foodID));
 //   	model.addAttribute("ID",id);
 //   	model.addAttribute("FOODID", foodID);

		customerService.addToCartFood(cartFormBean);
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

/*	@RequestMapping(value = "/{id}/cart", method = RequestMethod.GET)
	public String Cart(@PathVariable("id") Long id ,ModelMap model){
		
		model.addAttribute("FOOD", foodService.getAll());
		CredentialsBean user = userService.findUserById(id);
		model.addAttribute("name", user.getId());
		model.addAttribute("products",customerService.list(userService.findUserById(id).getId()));
		return "cart";
		
	}
	
	@RequestMapping(value = "/addCart", method = RequestMethod.GET)
	public String addToCartFood(@RequestParam("foodID") String foodID
							   ,@RequestParam("id")Long id
							   ,ModelMap model) throws POSException
	{
		CredentialsBean user = new CredentialsBean();
		
		FoodBean fb = foodService.getByID(foodID);
		
		List<CartBean> list = customerService.list(userService.findUserById(id).getId());
    	System.out.println(list.size());
    	for(int i=0; i<list.size(); i++)
    	{
    		if(list.get(i).getFood().getFoodID().equals(foodID))
    		{
    			int j=1; //variable created to increase the quantity of product in cart by 1
    			
    			CartBean cart = customerService.edit(list.get(i).getCartID());
    			if(cart.getCartQuantity() == fb.getFoodQuantity())
    			{
    				j=0;
    			}
    			cart.setCartQuantity(cart.getCartQuantity()+j);
    	    	cart.setCartType(fb.getFoodtype());
    	    	cart.setCost(cart.getCost()*cart.getCartQuantity());
    	    	cart.setOrderDate(cart.getOrderDate());
    	    	cart.setCredential(userService.findUserById(id));
    	    	cart.setFood(foodService.getByID(foodID));
    	    	model.addAttribute("ID",id);
    	    	model.addAttribute("FOODID", foodID);
    			customerService.Update(cart);
    			
    			return "redirect:/cart";
    		}
    	}
		
		CartBean cart = new CartBean();
		cart.setCartQuantity(1);
		cart.setCartType(fb.getFoodtype());
    	cart.setCost(cart.getCost()*cart.getCartQuantity());
    	cart.setOrderDate(cart.getOrderDate());
    	cart.setCredential(userService.findUserById(id));
    	cart.setFood(foodService.getByID(foodID));
    	model.addAttribute("ID",id);
    	model.addAttribute("FOODID", foodID);
		customerService.addToCart(cart);
		return "redirect:/user/{username}/cart";
		
	}	
*/	
}
