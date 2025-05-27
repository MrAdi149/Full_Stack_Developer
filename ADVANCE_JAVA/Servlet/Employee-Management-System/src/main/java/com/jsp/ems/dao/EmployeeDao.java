package com.jsp.ems.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.ems.entity.Employee;

public class EmployeeDao {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql-config");

	public static void saveEmployee(Employee employee) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		em.persist(employee);
		et.commit();
		em.close();
	}

}
