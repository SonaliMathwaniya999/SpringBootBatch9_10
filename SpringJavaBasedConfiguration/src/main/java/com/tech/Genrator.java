package com.tech;

import org.springframework.beans.factory.annotation.Value;

import com.tech.inter.General;

public class Genrator implements General {

	 @Value("123")
	 private int gid;
	 @Value("powergrid")
	 private String name;
	
	 
	 public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Genrator [gid=" + gid + ", name=" + name + "]";
	}
	 
	 
	
}
