package com.cruds.pos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cruds.pos.bean.FoodBean;
import com.cruds.pos.exception.POSException;
import com.cruds.pos.service.FoodServiceImpl;

@Controller
public class FoodController {

	@Autowired
	private FoodServiceImpl foodService;

	@RequestMapping(value="food.html", method= RequestMethod.GET)
	public String showFoodPage(Model model, String storeId){

		//foodBeanService.addfood(new foodBean( 2, "Hassan", "9481684710", "shanthinath", "573201", "Karnataka", "BH Road"));
		model.addAttribute("command", new FoodBean());
//		model.addAttribute("FOOD", foodService.getAll());
		model.addAttribute("FOODLIST", foodService.viewAllFood(storeId));
		return "food";		
	}

	@RequestMapping(value="food.html", method=RequestMethod.POST)
	public String doFood(@ModelAttribute("FoodBean") FoodBean f)
	{
		foodService.addFood(f);
		//System.out.println(s);
		return "redirect:food.html";
	}

	/*@RequestMapping(value = "/food-del-{foodID}", method= RequestMethod.GET)
	public String DeleteFood(@PathVariable("foodID") String foodID)
	{
		foodBeanService.removeFood(foodID);
		return "redirect:food.html";
	}*/

	@RequestMapping(value = "/food-edit-{foodID}", method= RequestMethod.GET)
	public String EditFood(@PathVariable("foodID") String foodID, Model model)
	{
		model.addAttribute("command", foodService.edit(foodID));
		return "modifyfood";
	}

	@RequestMapping(value="modifyFood.html", method=RequestMethod.POST)
	public String updateStore(@ModelAttribute("FoodBean") FoodBean fb) throws POSException 
	{	
		foodService.modifyFood(fb);
		return "redirect:food.html";
	}

	@RequestMapping(value = {"/food-add"}, method = RequestMethod.GET)
	public String showFoodPage(ModelMap model) {
		model.addAttribute("food", new FoodBean());
		return "home";
	}

	@RequestMapping(value = {"/food-add"}, method = RequestMethod.POST)
	public String getAllFood(@ModelAttribute FoodBean fb, Model model) {
		List<FoodBean> food = foodService.getAll();
		model.addAttribute("FOOD", food);
		return "home";
	}


}
