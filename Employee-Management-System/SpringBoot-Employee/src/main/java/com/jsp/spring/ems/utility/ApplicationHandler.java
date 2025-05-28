package com.jsp.spring.ems.utility;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.jsp.spring.ems.exception.AllEmployeesNotfoundException;
import com.jsp.spring.ems.exception.EmployeeNotFoundByIdException;
import com.jsp.spring.ems.exception.EmployeeNotFoundBySalaryGreaterThan;
import com.jsp.spring.ems.exception.EmployeeNotFoundByTitle;

@RestControllerAdvice
public class ApplicationHandler {
	
	@ExceptionHandler
	public ResponseEntity<ErrorStructure<String>> handleAllEmployeesNotfound(AllEmployeesNotfoundException ex)
	{
		ErrorStructure<String> es = new ErrorStructure<String>();
		es.setErrorCode(HttpStatus.NOT_FOUND.value());
		es.setErrorMessage(ex.getMessage());
		es.setError("There is no Employee object found in Dtabase");
		
		return new  ResponseEntity<ErrorStructure<String>>(es,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler
	public ResponseEntity<ErrorStructure<String>> handleEmployeeNotFoundById(EmployeeNotFoundByIdException ex)
	{
		ErrorStructure<String> es = new ErrorStructure<String>();
		es.setErrorCode(HttpStatus.NOT_FOUND.value());
		es.setErrorMessage(ex.getMessage());
		es.setError("Employee object with the requested id id not found in the database");
		
		return new ResponseEntity<ErrorStructure<String>>(es,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler
	public ResponseEntity<ErrorStructure<String>> handleEmployeeNotFoundByTitle(EmployeeNotFoundByTitle ex)
	{
		ErrorStructure<String> es = new ErrorStructure<String>();
		es.setErrorCode(HttpStatus.NOT_FOUND.value());
		es.setErrorMessage(ex.getMessage());
		es.setError("Employee object with the requested title id not found in the database");
		
		return new ResponseEntity<ErrorStructure<String>>(es,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler
	public ResponseEntity<ErrorStructure<String>> handleEmployeeNotFoundBySalaryGreaterThan(EmployeeNotFoundBySalaryGreaterThan ex)
	{
		ErrorStructure<String> es = new ErrorStructure<String>();
		es.setErrorCode(HttpStatus.NOT_FOUND.value());
		es.setErrorMessage(ex.getMessage());
		es.setError("Employee object with the requested title id not found in the database");
		
		return new ResponseEntity<ErrorStructure<String>>(es,HttpStatus.NOT_FOUND);
	}

}