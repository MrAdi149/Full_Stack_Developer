package com.jsp.spring.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jsp.spring.di.User;

public class App_Scope {
	
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-scope.xml");
		
		Car car1 = ac.getBean(Car.class);
		System.out.println(car1);
		
		Car car2 = ac.getBean(Car.class);
		System.out.println(car2);
	}
	
}
