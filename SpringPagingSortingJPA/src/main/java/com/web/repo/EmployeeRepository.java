package com.web.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.web.entity.Employee;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer> {

	
	
	
}
