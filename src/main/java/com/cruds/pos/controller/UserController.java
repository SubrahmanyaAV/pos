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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cruds.pos.bean.CredentialsBean;
import com.cruds.pos.bean.ProfileBean;
import com.cruds.pos.exception.POSException;
import com.cruds.pos.form.CustomerFormBean;
import com.cruds.pos.service.UserServiceImpl;

@Controller
public class UserController {

	@Autowired
	private UserServiceImpl userService;
	
	@RequestMapping(value = "user.html", method= RequestMethod.GET)
	public String ShowProfileForm(Model model)
	{
		model.addAttribute("command", new CustomerFormBean());
		model.addAttribute("PROFILE", userService.getAll());
		model.addAttribute("CREDENTIALS", userService.getAllCredentials());
		return "user";	
	}
	
	@RequestMapping(value="user.html", method=RequestMethod.POST)
	public String createUser(@ModelAttribute ("CustomerFormBean") CustomerFormBean customerFormBean
							 ,RedirectAttributes redirectAttributes)
	{
		System.out.println(customerFormBean);
		try 
		{
			if(userService.create(customerFormBean))
			{
				redirectAttributes.addFlashAttribute("message", "User Created Successfully");
				redirectAttributes.addFlashAttribute("newuser", customerFormBean);
			}
			else
			{
				redirectAttributes.addFlashAttribute("error", "Unknown error while creating User!");
			}
		} catch (POSException e) {
			redirectAttributes.addFlashAttribute("error", e.getExceptionInfo());
		}
		return "login";
	}
	
	@RequestMapping(value="/userlist.html")
	public String showUserPage()
	{
		return "userlist";
	}
	
/*	@RequestMapping(value="/user-del-{id}", method=RequestMethod.GET)
	public String delete(@PathVariable("id") Long id)
	{
		userService.delete(id);
		System.out.println("deleting id " + id);
		return "redirect:user.html";
	}
*/
 	
	@RequestMapping(value="/user-edit-{id}", method=RequestMethod.GET)
	public String edit(@PathVariable("id") Long id,Model model)
	{
		model.addAttribute("command",userService.edit(id));
		return "edituser";
	}
	
	@RequestMapping(value="editUser.html" , method=RequestMethod.POST)
	public String update(@ModelAttribute("ProfileBean") ProfileBean user )
	{
		userService.update(user);
		System.out.println(user);
		return "redirect:user.html";
	}
	
	
    @RequestMapping(value = { "/searchuser.html"}, method = RequestMethod.GET)
    public String showSearchPage(ModelMap model) {
		model.addAttribute("user", new CredentialsBean());
        return "user";
    }
	
	@RequestMapping(value = { "/searchuser.html"}, method = RequestMethod.POST)
    public String search(@ModelAttribute CredentialsBean user, Model model) {
		Set<CredentialsBean> userList = userService.searchUser(user.getId(), user.getUserID());
		model.addAttribute("USERLIST", userList);
        return "user";
    }
/* 
  	@RequestMapping(value = { "/userinactive-{id}" }, method = RequestMethod.GET)
    public String inActivate(@PathVariable Long id, Model model) {
		if(userService.inActivate(id))
		{
			model.addAttribute("message", "User Inactivated Successfully");
			model.addAttribute("user", new CredentialsBean());
		}
		else
		{
			model.addAttribute("error", "Error while Inactivating User!");
		}
		return "user";
    }
*/
	@RequestMapping(value="/userinactive-{id}", method=RequestMethod.GET)
	public String editCred(@PathVariable("id") Long id,Model model)
	{
		model.addAttribute("command",userService.findUserById(id));
		return "search";
	}
  	
	@RequestMapping(value="inActivate.html" , method=RequestMethod.POST)
	public String inActivatUser(@ModelAttribute("CredentialsBean") CredentialsBean user )
	{
		userService.inActivateUser(user);
		System.out.println(user);
		return "redirect:user.html";
	}


 }
