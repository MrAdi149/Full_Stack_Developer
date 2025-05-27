package com.jsp.spring.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.spring.ems.entity.Employee;
import com.jsp.spring.ems.service.EmployeeService;
import com.jsp.spring.ems.utility.ResponseStructure;

//@Controller
//@ResponseBody
@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	
//	@RequestMapping(value="/add-employee",method=RequestMethod.POST)
	@PostMapping
	public ResponseEntity<ResponseStructure<Employee>> addEmployee(@RequestBody Employee employee) {
		Employee employee2 = employeeService.addEmployee(employee);
		
		ResponseStructure<Employee> rs = new ResponseStructure<Employee>();
		rs.setStatusCode(HttpStatus.CREATED.value());
		rs.setMessage("Employee added successfully");
		rs.setData(employee2);
		
		return new ResponseEntity<ResponseStructure<Employee>>(rs,HttpStatus.CREATED);
	}
	
//	@RequestMapping(value="/find-all-employee",method=RequestMethod.GET)
	@GetMapping
	public ResponseEntity<ResponseStructure<List<Employee>>> findAllEmployee(){
		List<Employee> employee = employeeService.findAllEmployee();
		
		ResponseStructure<List<Employee>> rs = new ResponseStructure<List<Employee>>();
		rs.setStatusCode(HttpStatus.FOUND.value());
		rs.setMessage("Employee found successfully!!");
		rs.setData(employee);
		
		return new ResponseEntity<ResponseStructure<List<Employee>>>(rs,HttpStatus.FOUND);
	}
	
//	@RequestMapping(value="/find-emp-by-id",method=RequestMethod.GET)
	@GetMapping("/id")
	public ResponseEntity<ResponseStructure<Employee>> findEmployeeById(int id) {
		Employee employee = employeeService.findEmployeeById(id);
		
		ResponseStructure<Employee> rs = new ResponseStructure<Employee>();
		rs.setStatusCode(HttpStatus.FOUND.value());
		rs.setMessage("Employee Found Successfully!!");
		rs.setData(employee);
		
		return new ResponseEntity<ResponseStructure<Employee>>(rs,HttpStatus.FOUND);
	}
	
//	@RequestMapping(value="/update-by-id",method=RequestMethod.PUT)
	@PutMapping("/id")
	public ResponseEntity<ResponseStructure<Employee>> updateEmployeeById(int id, @RequestBody Employee updatedEmployee) {
		Employee employee = employeeService.updateEmployeeById(id,updatedEmployee);
		
		ResponseStructure<Employee> rs = new ResponseStructure<Employee>();
		rs.setStatusCode(HttpStatus.OK.value());
		rs.setMessage("Employee updated successfully!!");
		rs.setData(employee);
		
		return new ResponseEntity<ResponseStructure<Employee>>(rs,HttpStatus.OK);
	}

//	@RequestMapping(value="/delete-by-id",method=RequestMethod.DELETE)
	@DeleteMapping("/id")
	public ResponseEntity<ResponseStructure<Employee>> deleteEmployeeById(int id) {
		Employee employee =  employeeService.deleteEmployeeById(id);
		
		ResponseStructure<Employee> rs = new ResponseStructure<Employee>();
		rs.setStatusCode(HttpStatus.OK.value());
		rs.setMessage("Employee deleted successfully!!");
		rs.setData(employee);
		
		return new ResponseEntity<ResponseStructure<Employee>>(rs,HttpStatus.OK);
	}
	
	@GetMapping("/title")
	public ResponseEntity<ResponseStructure<List<Employee>>> findEmployeeByTitle(String title){
		List<Employee> employees = employeeService.findEmployeeByTitle(title);
		
		ResponseStructure<List<Employee>> rs = new ResponseStructure<List<Employee>>();
		rs.setStatusCode(HttpStatus.FOUND.value());
		rs.setMessage("Employee object found by title");
		rs.setData(employees);
		
		return new ResponseEntity<ResponseStructure<List<Employee>>>(rs,HttpStatus.FOUND);
	}
	
	public ResponseEntity<ResponseStructure<List<Employee>>> findEmployeeBySalaryGreaterThan(int salary){
		List<Employee> employees = employeeService.findEmployeeBySalaryGreaterThan(salary);
		
		ResponseStructure<List<Employee>> rs = new ResponseStructure<List<Employee>>();
		rs.setStatusCode(HttpStatus.FOUND.value());
		rs.setMessage("Employee object found who salary is greater than " + salary);
		rs.setData(employees);
		
		return new ResponseEntity<ResponseStructure<List<Employee>>>(rs,HttpStatus.FOUND);
	}
	
}
