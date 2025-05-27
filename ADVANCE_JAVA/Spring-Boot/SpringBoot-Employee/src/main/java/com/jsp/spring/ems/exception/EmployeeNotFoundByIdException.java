package com.jsp.spring.ems.exception;

public class EmployeeNotFoundByIdException extends RuntimeException {
	
	private String message;

	public String getMessage() {
		return message;
	}

	public EmployeeNotFoundByIdException(String message) {
		super();
		this.message = message;
	}
	
	

}
