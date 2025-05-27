package com.jsp.spring.ems.exception;

public class EmployeeNotFoundBySalaryGreaterThan extends RuntimeException {
	
	private String message;

	public String getMessage() {
		return message;
	}

	public EmployeeNotFoundBySalaryGreaterThan(String message) {
		super();
		this.message = message;
	}
	
	
}
