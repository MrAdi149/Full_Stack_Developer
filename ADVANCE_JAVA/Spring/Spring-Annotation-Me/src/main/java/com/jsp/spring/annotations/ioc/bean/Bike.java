package com.jsp.spring.annotations.ioc.bean;

import org.springframework.stereotype.Component;

@Component
public class Bike {
	
	public Bike() {
		System.out.println("Bike object Created");
	}
	
	public void wheels() {
		System.out.println("my bike has 2 wheels");
	}

}
