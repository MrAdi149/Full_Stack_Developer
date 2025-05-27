package com.jsp.mvc.vms;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;




@Configuration
@ComponentScan("com.jsp.mvc.vms")
public class AppConfig {
	
	@Bean
	public EntityManagerFactory getFactory() {
		return Persistence.createEntityManagerFactory("mysql-config");
	}

}
