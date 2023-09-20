package com.sql.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;



//@Entity
public class Student {

	private int sid;
	private String name;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + "]";
	}
	
	
}
