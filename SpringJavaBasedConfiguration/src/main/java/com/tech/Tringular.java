package com.tech;

import org.springframework.beans.factory.annotation.Value;

import com.tech.inter.General;

public class Tringular implements General {
 
	@Value("10")
	private int a;
	@Value("14")
	private int b;
	@Value("50")
	private int c;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	@Override
	public String toString() {
		return "Tringular [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
	
	 
	
}
