package com.jsp.spring.annotations.di;

import org.springframework.stereotype.Component;

@Component
public class Car {
	
	public Car() {
		System.out.println("Car object created...");
	}

}
