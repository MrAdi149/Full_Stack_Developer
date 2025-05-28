package com.jsp.spring.ems.exception;

public class EmployeeNotFoundByTitle extends RuntimeException {
	
	private String message;

	public String getMessage() {
		return message;
	}

	public EmployeeNotFoundByTitle(String message) {
		super();
		this.message = message;
	}

}
