package com.tech;

import org.springframework.beans.factory.annotation.Value;

import com.tech.inter.General;

public class Circular implements General {

	@Value("3.14")
	private float pi;
	@Value("9")
	private float r;
	
	
	public float getPi() {
		return pi;
	}
	public void setPi(float pi) {
		this.pi = pi;
	}
	public float getR() {
		return r;
	}
	public void setR(float r) {
		this.r = r;
	}
	@Override
	public String toString() {
		return "Circular [pi=" + pi + ", r=" + r + "]";
	}
 
	
}
