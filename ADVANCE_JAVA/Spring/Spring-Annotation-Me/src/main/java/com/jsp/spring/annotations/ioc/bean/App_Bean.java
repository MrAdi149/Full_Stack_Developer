package com.jsp.spring.annotations.ioc.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.spring.annotations.AppConfig;

public class App_Bean {
	
	public static void main(String[] args) {
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Bike bike = ac.getBean(Bike.class);
		
		bike.wheels();
		
	}

}
