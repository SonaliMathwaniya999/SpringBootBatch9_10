package com.mysql.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mysql.entity.Student;

//@Repository
public interface MyRepository extends JpaRepository<Student, Integer> {

/*	curd  
	
	c:  create save
	u : update 
	r : read get
	d : delete
	
	
	
	 student 
	 save
	
	 update
	 delete
	 
	 get
	*/ 
}
