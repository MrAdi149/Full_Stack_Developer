package com.jsp.spring.annotations.ioc.bean;

import org.springframework.stereotype.Component;

@Component
public class Bus {
	
	public Bus() {
		System.out.println("Bus Object Created");
	}

}
