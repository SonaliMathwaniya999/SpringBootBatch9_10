package com.tech.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.tech.inter.Department;
import com.tech.inter.Employee;


 // Employee e = new EmployeeImp();

@Component
public class EmployeeImp implements Employee{

	@Value("101")
	private int id;
	
	@Value("harish kumar")
	private String ename;
	@Value("23000.34")
	private double salary;
	
//	Department d = new DepartmentImpl();
	
	@Autowired
	@Qualifier("collageimp")
	private Department dept;
	
	


	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeImp [id=" + id + ", ename=" + ename + ", salary=" + salary + ", dept=" + dept + "]";
	}
	

	
	 
}
