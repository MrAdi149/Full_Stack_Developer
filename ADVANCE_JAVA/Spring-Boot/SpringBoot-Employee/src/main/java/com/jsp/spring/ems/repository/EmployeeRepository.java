package com.jsp.spring.ems.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jsp.spring.ems.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	List<Employee> findByTitle(String title);

	List<Employee> findBySalaryGreaterThan(int salary);

	List<Employee> findByTitleContainingIgnoreCaseOrEmailContainingIgnoreCase(String title, String email);

	List<Employee> findByDepartment(String department);

	List<Employee> findByStatus(String status);
	
	@Query("SELECT e FROM Employee e WHERE " +
		       "(:query IS NULL OR LOWER(e.title) LIKE LOWER(CONCAT('%', :query, '%')) OR LOWER(e.email) LIKE LOWER(CONCAT('%', :query, '%'))) AND " +
		       "(:department IS NULL OR e.department = :department) AND " +
		       "(:status IS NULL OR e.status = :status)")
		List<Employee> searchEmployeesCustom(
		    @Param("query") String query,
		    @Param("department") String department,
		    @Param("status") String status);

}
