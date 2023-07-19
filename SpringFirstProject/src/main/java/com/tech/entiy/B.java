package com.tech.entiy;



import org.springframework.stereotype.Service;

@Service
public class B {

	//has a relationship
	private C obj;

	public C getObj() {
		return obj;
	}

	public void setObj(C obj) {
		this.obj = obj;
	}

	@Override
	public String toString() {
		return "B [obj=" + obj + "]";
	}
	
	
}
