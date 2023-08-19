package com.tech.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.tech.inter.Department;

@Component("canteenimp")
public class CanteenDeptImpl implements Department {

	@Value("100")
	private int canid;
	@Value("40")
	private String items;
	public int getCanid() {
		return canid;
	}
	public void setCanid(int canid) {
		this.canid = canid;
	}
	public String getItems() {
		return items;
	}
	public void setItems(String items) {
		this.items = items;
	}
	@Override
	public String toString() {
		return "CanteenDeptImpl [canid=" + canid + ", items=" + items + "]";
	}
	
	
	 
}
