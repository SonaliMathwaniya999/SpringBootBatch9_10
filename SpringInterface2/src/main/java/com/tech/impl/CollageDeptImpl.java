package com.tech.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.tech.inter.Department;


@Component("collageimp")
public class CollageDeptImpl implements Department {

	@Value("1")
	 private int cid;
	@Value("sgsits")
	private String collageName;
	@Value("indore") 
	private String location;
	@Value("10")
	private int rooms;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCollageName() {
		return collageName;
	}
	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getRooms() {
		return rooms;
	}
	public void setRooms(int rooms) {
		this.rooms = rooms;
	}
	@Override
	public String toString() {
		return "CollageDeptImpl [cid=" + cid + ", collageName=" + collageName + ", location=" + location + ", rooms="
				+ rooms + "]";
	}
	 
	 
	 
	
}
