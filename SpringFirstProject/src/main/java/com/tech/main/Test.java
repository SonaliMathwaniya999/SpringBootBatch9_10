package com.tech.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tech.Student;

public class Test {

	
	
	public static void main(String[] args) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("config.xml");

                 Student st = (Student) con.getBean("stu1");
		
		
		    System.out.println(st);
		
		
		
	}
}
