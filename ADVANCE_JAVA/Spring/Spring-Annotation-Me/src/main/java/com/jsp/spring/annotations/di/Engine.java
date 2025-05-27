package com.jsp.spring.annotations.di;

import org.springframework.stereotype.Component;

@Component
public class Engine {

	
	public Engine() {
		System.out.println("Engine object created...");
	}
}
