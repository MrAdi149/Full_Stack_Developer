package com.jsp.spring.ems.service;

import java.util.List;

import com.jsp.spring.ems.entity.Employee;

public interface EmployeeService {
	
	Employee addEmployee(Employee employee);

	List<Employee> findAllEmployee();

	Employee findEmployeeById(int id);

	Employee updateEmployeeById(int id, Employee updatedEmployee);

	Employee deleteEmployeeById(int id);

	List<Employee> findEmployeeByTitle(String title);

	List<Employee> findEmployeeBySalaryGreaterThan(int salary);

}
