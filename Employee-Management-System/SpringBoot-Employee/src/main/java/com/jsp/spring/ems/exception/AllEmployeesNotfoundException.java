package com.jsp.spring.ems.exception;

public class AllEmployeesNotfoundException extends RuntimeException {
	
	private String message;

	public String getMessage() {
		return message;
	}

	public AllEmployeesNotfoundException(String message) {
		super();
		this.message = message;
	}

}
