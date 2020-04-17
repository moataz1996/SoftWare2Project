package com.Sprint1.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

//import com.Sprint1.Repositries.ProductRepositry;
import com.Sprint1.Repositries.UserRepositry;
//import com.Sprint1.entities.Product;
import com.Sprint1.entities.User;

@Controller
public class loginConroller {
	@Autowired
	private UserRepositry repo;
	//private ProductRepositry repo1;
	 @GetMapping("/login")
	public String showUserRegForm(Model model)
	{
		model.addAttribute("User",new User());
		return "login";
	}
	@PostMapping("/login")
	public String userRegistration(Model model,@ModelAttribute User user)
	{
		System.out.println("name: "+user.getUsername());
		System.out.println("password: "+user.getPassword());
		Iterable<User> usersIterable=repo.findAll();
		List<User> users=new ArrayList<User>();
		for(User myuser : usersIterable)
		{
			users.add(myuser);
		}
		for(int i=0;i<users.size();i++)
		{
			if(users.get(i).getUsername().equals(user.getUsername()) && users.get(i).getPassword().equals(user.getPassword()))
			{
				if(users.get(i).getType().equals("admin"))
				{
				  return "admin-home";
				}
				else
				{
		//			model.addAttribute("products",products);
					return "home";
				}
			}
			
		}
		
		
		model.addAttribute("User",new User());
		return "/addUser";
	}
	
}
