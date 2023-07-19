package com.techsolutions.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.techsolutions.Student;
import com.techsolutions.config.MyConfig;
import com.techsolutions.entity.OracleCon;

public class Test {

	public static void main(String[] args) {
		
		
ApplicationContext con = new AnnotationConfigApplicationContext(MyConfig.class);
		

  Student st =   con.getBean("student",Student.class);
    
    st.setId(101);
    st.setName("harish");
    st.setCourse("MTech");
    System.out.println(st);
    
    
    OracleCon ora = con.getBean("oracleCon",OracleCon.class);
    
    ora.setId(123);
    ora.setName("mysql");
    System.out.println(ora);
   

 
		
	}
}
