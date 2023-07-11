package com.tech.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tech.Student;
import com.tech.entiy.A;
import com.tech.entiy.B;

public class Test {

	
	
	public static void main(String[] args) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("config.xml");

            //     Student st = (Student) con.getBean("stu1");
		
		//  B b = (B) con.getBean("b1");
		A a= (A) con.getBean("a1");
		
		    System.out.println(a);
		
		
		
	}
}
