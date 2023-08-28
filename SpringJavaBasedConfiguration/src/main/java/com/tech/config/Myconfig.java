package com.tech.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tech.Circular;
import com.tech.Genrator;
import com.tech.Tringular;
import com.tech.inter.General;

@Configuration
public class Myconfig {

	 
	
	
	 @Bean
	 public General  getBeanp() 
	 {

		 General c = new Circular();
		 
		    return c;

	 } 
	

	 
	 @Bean
	 public General  getBeanq() 
	 {

		 General c = new Genrator();
		 
		    return c;

	 } 



	 @Bean
	 public General  getBeanr() 
	 {

		 General c = new Tringular();
		 
		    return c;

	 } 

	 
	 /*
	 @Bean
	 public Tringular  getBean2() 
	 {

		 Tringular t = new Tringular();
		 
		    return t;

	 } 
	*/
	
	
	
	
}
