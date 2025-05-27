package com.jsp.spring.annotations.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.spring.annotations.AppConfig;

public class App_Di {
	
	public static void main(String[] args) {
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Car car = ac.getBean(Car.class);
		Engine engine = ac.getBean(Engine.class);
		
	}

}
