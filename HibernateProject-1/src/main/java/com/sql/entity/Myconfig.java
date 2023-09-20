package com.sql.entity;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan(basePackages = "com.sql.entity")
@PropertySource("classpath:mysql.properties")
public class Myconfig {

	
	
}
