package com.mysql.main;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mysql.entity.Student;
import com.mysql.repo.MyRepository;

@Component
public class DatabaseInsert implements CommandLineRunner {

	@Autowired
	private MyRepository repo;
	
	//Private User user;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	
        // inserting data or updatating data 
		// Student s = new Student();
		   //   s.setSid(101);
		// s.setSname("Ram");
	    //  repo.save(s);	  
       
		
 // Optional<Student>   li= 	repo.findById(101)	     ;
		 
           //  Student s1=  li.get();
 
		  repo.deleteById(104);
		
 
		System.out.println("data deleted");
	}

}
