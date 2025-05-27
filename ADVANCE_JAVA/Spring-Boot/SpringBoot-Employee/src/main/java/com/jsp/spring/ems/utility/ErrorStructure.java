package com.jsp.spring.ems.utility;

public class ErrorStructure<Adi> {
	
	private int ErrorCode;
	private String ErrorMessage;
	private Adi error;
	public int getErrorCode() {
		return ErrorCode;
	}
	public void setErrorCode(int errorCode) {
		ErrorCode = errorCode;
	}
	public String getErrorMessage() {
		return ErrorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		ErrorMessage = errorMessage;
	}
	public Adi getError() {
		return error;
	}
	public void setError(Adi error) {
		this.error = error;
	}

}
