package com.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.entity.Product;
import com.web.entity.UserInfo;
//import com.web.entity.UserInfo;
import com.web.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
	private ProductService service;
 	
	
	@GetMapping("/welcome")
	public String welcome() 
	{
		
		return "welcome this endpoisnt is not secured";
		
		
	}
	
	
	@PostMapping("/new")
	public String addNewUser(@RequestBody UserInfo userInfo) 
	{
		return service.addUser(userInfo);
	}
	
	
	
	@GetMapping("/all")
	@ResponseBody
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public String getAllProducts()
	{
		
		return "List of Users";
		
	}
	
	
	@GetMapping("/{id}")
	@ResponseBody
	@PreAuthorize("hasAuthority('ROLE_USER')")
	public String getProductById(@PathVariable int id)
	{
		return "get User bY Id";
	}
	
	
}
