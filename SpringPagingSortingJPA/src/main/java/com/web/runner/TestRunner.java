package com.web.runner;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import com.web.entity.Employee;
import com.web.repo.EmployeeRepository;


@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepository erepo;
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Employee e1= new Employee("aakash" , "indore" , 34000.3);
		
		Employee e2= new Employee("jaya" , "indore" , 45000.3);
		Employee e3= new Employee("ram" , "delhi" , 24000.3);
		Employee e4= new Employee("sita" , "UTTER PRADESH" , 3000.3);
		Employee e5= new Employee("hari" , "bhopal" , 23000.3);
		Employee e6= new Employee("lakhan" , "banglore" , 13000.3);
		Employee e7= new Employee("komal" , "indore" , 34000.3);
		Employee e8= new Employee("hunny" , "mumbai" , 34000.3);
		Employee e9= new Employee("lalit" , "mansore" , 12000.3);
		Employee e10= new Employee("naina" , "indore" , 65000.3);
			
		
	/*	erepo.save(e1);
		erepo.save(e2);
		erepo.save(e3);
		erepo.save(e4);
		erepo.save(e5);
		erepo.save(e6);
		erepo.save(e7);
		erepo.save(e8);
		erepo.save(e9);
		erepo.save(e10);
*/
		
		Pageable p = PageRequest.of(3, 2);
		
		Page<Employee> list = erepo.findAll(p);
        // i = 0; i<list.getSize() ; i++;
		for(Employee i:  list)
		{
			System.out.println(i);
			
		}
		
		
		
//	System.out.println(p);
		//erepo.findAll();
		
		
		
		

		System.out.println("data saved");
		
		
		
	}

}
