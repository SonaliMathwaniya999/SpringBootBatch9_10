package com.tech.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.tech.inter.Department;


@Component("deptimp")
public class DepartmentImpl implements Department {

	
	@Value("121")
	private int did;
	@Value("IIPS")
	private String deptName;
	@Value("BHOPAL")
	private String location;
	
	
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "DepartmentImpl [did=" + did + ", deptName=" + deptName + ", location=" + location + "]";
	}
	
	 
}
