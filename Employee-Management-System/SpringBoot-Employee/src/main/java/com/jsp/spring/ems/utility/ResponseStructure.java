package com.jsp.spring.ems.utility;

public class ResponseStructure<Adi> {
	
	private int statusCode;
	private String message;
	private Adi data;
	
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Adi getData() {
		return data;
	}
	public void setData(Adi data) {
		this.data = data;
	}
}
