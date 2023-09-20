package com.sql.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyDemoDAO {

	@Value("${driver.class}")
	private String driver_class;
	@Value("${driver.url}")
    private String driver_url;	
	@Value("${username}")
	private String username;
	@Value("${passward}")
	private String passward;
	public String getDriver_class() {
		return driver_class;
	}
	public void setDriver_class(String driver_class) {
		this.driver_class = driver_class;
	}
	public String getDriver_url() {
		return driver_url;
	}
	public void setDriver_url(String driver_url) {
		this.driver_url = driver_url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassward() {
		return passward;
	}
	public void setPassward(String passward) {
		this.passward = passward;
	}
	@Override
	public String toString() {
		return "MyDemoDAO [driver_class=" + driver_class + ", driver_url=" + driver_url + ", username=" + username
				+ ", passward=" + passward + "]";
	}
	
	
	
	
	
	
	
}
