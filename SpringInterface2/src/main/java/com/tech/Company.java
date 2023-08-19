package com.tech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tech.inter.Employee;

@Component
public class Company {

	@Autowired
	private Employee emp;

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Company [emp=" + emp + "]";
	}
	
	
	
	
	
	
	
	
}
