package com.Sprint1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Sprint1.Repositries.UserRepositry;
import com.Sprint1.entities.User;

@Controller
public class userConroller {
	@Autowired
	private UserRepositry repo;
	/*@RequestMapping("/addUser")
	public String addUser()
	{
		return "addUser";
	}*/
	 @GetMapping("/addUser")
	public String showUserRegForm(Model model)
	{
		model.addAttribute("User",new User());
		return "addUser";
	}
	@PostMapping("/addUser")
	public String userRegistration(Model model,@ModelAttribute User user)
	{
		System.out.println("name: "+user.getUsername());
		System.out.println("password: "+user.getPassword());
		repo.save(user);
		model.addAttribute("User",new User());
		return "home";
	}
	
}
