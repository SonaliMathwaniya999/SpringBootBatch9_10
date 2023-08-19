package com.tech.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tech.Company;

public class Test {

	public static void main(String[] args) {
		
		
		ApplicationContext con = new AnnotationConfigApplicationContext(Myconfig.class);
		
		Company c=   con.getBean("company", Company.class);
		
		System.out.println(c);
		
	}
	
}
