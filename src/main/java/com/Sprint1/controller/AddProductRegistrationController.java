package com.Sprint1.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Sprint1.Repositries.ProductRepositry;
import com.Sprint1.entities.Product;

@Controller
public class AddProductRegistrationController {
	@Autowired
	private ProductRepositry repo;
	
	 @GetMapping("/addProduct")
	public String showUserRegForm(Model model)
	{
		model.addAttribute("Product",new Product());
		return "addProduct";
	}
	@PostMapping("/addProduct")
	public String userRegistration(Model model,@ModelAttribute Product product)
	{
		System.out.println("name: "+product.getName());
		System.out.println("password: "+product.getPrice());
		Iterable<Product> productsIterable=repo.findAll();
		List<Product> products=new ArrayList<Product>();
		for(Product myProduct : productsIterable)
		{
			products.add(myProduct);
		}
		repo.save(product);
		products.add(product);
		model.addAttribute("products",products);
		return "admin-home";
	}
	
}
