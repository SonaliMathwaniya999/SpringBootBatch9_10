package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

	/*
	
	API 
	
	
	
	GET
	
	jinne.school/students
	
	POST
	PUT
	DELETE
	
	
	http://localhost:9090/
	
	*/
	
	
	
	
    @GetMapping("/message")	 
   @ResponseBody
  public String	getMessage()
	{
		 return "GEtmessage displayed";
		
		
	}
	
	
	
}
