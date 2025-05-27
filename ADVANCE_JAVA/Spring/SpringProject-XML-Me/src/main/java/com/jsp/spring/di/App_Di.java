package com.jsp.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App_Di {
	
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-di.xml");
		User user = (User)ac.getBean("user-bean");
		System.out.println(user);
		System.out.println(user.getPassport());
		
	}

}
