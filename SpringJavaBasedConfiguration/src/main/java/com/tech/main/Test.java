package com.tech.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tech.Circular;
import com.tech.Genrator;
import com.tech.config.Myconfig;
import com.tech.inter.General;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext con = new AnnotationConfigApplicationContext(Myconfig.class);

	General c=	 con.getBean(Genrator.class);
     
        
      
        
	
	
	     System.out.println(c);
	   
	
		
		
	}
	
}
