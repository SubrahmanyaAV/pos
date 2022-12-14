package com.cruds.pos.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cruds.pos.bean.StoreBean;
import com.cruds.pos.exception.POSException;
import com.cruds.pos.service.CustomerService;
import com.cruds.pos.service.StoreService;

@Controller
public class StoreController {

	@Autowired
	CustomerService customerService;
	
	@Autowired
	StoreService storeService;

	/*	@RequestMapping(value = "store.html", method= RequestMethod.GET)
	public String showStore(Model model , String city)
	{
		model.addAttribute("command", new StoreBean());
		model.addAttribute("Store", customerService.viewStore(city));
		return "store";	
	}
	 */

	@RequestMapping(value = {"/store.html"}, method = RequestMethod.GET)
	public String showSearchPage(ModelMap model) {
		model.addAttribute("store", new StoreBean());
		return "store";
	}

	@RequestMapping(value = {"/store.html"}, method = RequestMethod.POST)
	public String search(@ModelAttribute StoreBean sb, Model model) {
		Set<StoreBean> store = customerService.searchStore(sb.getCity());
		model.addAttribute("STORE", store);
		return "store";
	}

	@RequestMapping(value="adminstore.html", method= RequestMethod.GET)
	public String showStorePage(Model model){
		
	//storeBeanService.addStore(new StoreBean( 2, "Hassan", "9481684710", "shanthinath", "573201", "Karnataka", "BH Road"));
	model.addAttribute("command", new StoreBean());
	model.addAttribute("STORELIST", storeService.viewAllStore());
	return "adminstore";		
	}	
	
	@RequestMapping(value="adminstore.html", method=RequestMethod.POST)
	public String dostore(@ModelAttribute("StoreBean") StoreBean s)
	{
		storeService.addStore(s);
		//System.out.println(s);
		return "redirect:adminstore.html";
	}
	
		
	@RequestMapping(value = "/store-del-{id}", method= RequestMethod.GET)
	public String DeleteStore(@PathVariable("id") Long id)
	{
		storeService.removeStore(id);
		return "redirect:adminstore.html";
	}
	
	@RequestMapping(value = "/store-edit-{storeID}", method= RequestMethod.GET)
	public String EditStore(@PathVariable("storeID") String storeID, Model model)
	{
		model.addAttribute("command", storeService.edit(storeID));
		return "modifystore";
	}
	
	@RequestMapping(value="modifyStore.html", method=RequestMethod.POST)
	public String updateStore(@ModelAttribute("storeBean") StoreBean s) throws POSException 
	{	
		storeService.modifyStore(s);
		return "redirect:adminstore.html";
	}
	
	@RequestMapping(value= "/store-view-{storeID}", method= RequestMethod.GET)
	public String Search(@PathVariable("storeID") String storeID, Model model)
	{
		System.out.println(storeID);
		model.addAttribute("command", storeService.searchStore(storeID));
		return "searchStore";
	}
	
	@RequestMapping(value="searchStore.html", method=RequestMethod.POST)
	public String getStore(@ModelAttribute("storeBean") StoreBean storeBean) 
	{	
		storeService.viewStore(storeBean);
		return "adminstore";
	}
	
}
