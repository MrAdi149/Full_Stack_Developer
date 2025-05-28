package com.jsp.spring.ems.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.spring.ems.entity.Employee;
import com.jsp.spring.ems.exception.EmployeeNotFoundBySalaryGreaterThan;
import com.jsp.spring.ems.exception.EmployeeNotFoundByTitle;
import com.jsp.spring.ems.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {


	@Autowired
	public EmployeeRepository employeeRepository;
	
	@Override
	public Employee addEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> findAllEmployee() {
		List<Employee> emp = employeeRepository.findAll();
		if(emp.isEmpty()) {
			return null;
		}else {
			return emp;
		}
	}

	@Override
	public Employee findEmployeeById(int id) {
		Optional<Employee> optional = employeeRepository.findById(id);
		
		if(optional.isEmpty()) {
			return null;
		}else {
			Employee employee = optional.get();
			return employee;
		}
	}

	@Override
	public Employee updateEmployeeById(int id, Employee updatedEmployee) {
		Optional<Employee> optional = employeeRepository.findById(id);
		
		if(optional.isEmpty()) {
			return null;
		}else {
			Employee existingEmployee = optional.get();
			updatedEmployee.setId(existingEmployee.getId());
			return employeeRepository.save(updatedEmployee);
		}
	}

	@Override
	public Employee deleteEmployeeById(int id) {
	Optional<Employee> optional = employeeRepository.findById(id);
		
		if(optional.isEmpty()) {
			return null;
		}else {
			Employee employee = optional.get();
			employeeRepository.delete(employee);
			return employee;
		}
	}

	@Override
	public List<Employee> findEmployeeByTitle(String title) {
		
		
		List<Employee> employee = employeeRepository.findByTitle(title);
		
		if(employee.isEmpty()) {
			throw new EmployeeNotFoundByTitle("Employee object is not found");
		}else {
			return employee;
		}
	}

	@Override
	public List<Employee> findEmployeeBySalaryGreaterThan(int salary) {
		
		
		List<Employee> employees = employeeRepository.findBySalaryGreaterThan(salary);
		
		if(employees.isEmpty()) {
			throw new EmployeeNotFoundBySalaryGreaterThan("Employee object is not found");
		}else {
			return employees;
		}
	}

	@Override
	public List<Employee> searchEmployees(String query, String department, String status) {
	    return employeeRepository.searchEmployeesCustom(
	        query, 
	        department, 
	        status
	    );
	}
}
