package com.sql.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext con = new AnnotationConfigApplicationContext(Myconfig.class);

	   MyDemoDAO d = con.getBean(MyDemoDAO.class);
	   
	   System.out.println(d);
	
		
		
	
	}
}
