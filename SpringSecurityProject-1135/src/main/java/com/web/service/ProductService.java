package com.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.web.entity.Product;
import com.web.entity.UserInfo;
import com.web.repo.UserRepository;
//import com.web.entity.UserInfo;

//import com.web.repo.UserRepository;


@Service
public class ProductService {


	@Autowired
	private UserRepository userrepo;
	
	
	 @Autowired
	    private PasswordEncoder passwordEncoder;

	
public String	addUser(UserInfo userinfo)
	{    
	
	 userinfo.setPassword(passwordEncoder.encode(userinfo.getPassword()));
    
          userrepo.save(userinfo);
           return "user added" ;
	}
	
/*	public List<Product> getProducts() 
	{
		return prepo.findAll();
		
	}

	public Product getProduct( int id)
	{
		return prepo.findById(id).get();
	}
	

*/
	
}
