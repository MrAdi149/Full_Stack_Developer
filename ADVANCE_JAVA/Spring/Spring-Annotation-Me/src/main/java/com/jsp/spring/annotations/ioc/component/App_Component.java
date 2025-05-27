package com.jsp.spring.annotations.ioc.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.spring.annotations.AppConfig;

public class App_Component {
	
	public static void main(String[] args) {
		
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		
	}

}
