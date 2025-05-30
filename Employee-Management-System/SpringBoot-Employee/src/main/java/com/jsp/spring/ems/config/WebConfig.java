package com.jsp.spring.ems.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
	
	@Override
	public void addCorsMappings(CorsRegistry registry) {
	    registry.addMapping("/**")  // Use /** to match all paths
	            .allowedOrigins("http://127.0.0.1:5500") // Match your exact frontend URL
	            .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
	            .allowedHeaders("*")
	            .allowCredentials(true)
	            .maxAge(3600); // <-- This semicolon is correct
	}
}
