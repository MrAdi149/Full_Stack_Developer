package com.jsp.hibernate.ManyToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
    	Company company = new Company();
    	company.setCompanyId(1);
    	company.setCommpanyName("Meta");
    	
    	Employee e1 = new Employee();
    	e1.setEmployeeId(101);
    	e1.setEmployeeName("Aditya");
    	e1.setSalary(100000);
    	
    	Employee e2 = new Employee();
    	e2.setEmployeeId(102);
    	e2.setEmployeeName("Tharun");
    	e2.setSalary(90000);
    	
    	//mapping company into employee
    	e1.setCompany(company);
    	e2.setCompany(company);
    	
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql-config");
    	EntityManager em = emf.createEntityManager();
    	EntityTransaction et = em.getTransaction();
    	et.begin();
    	
    	em.persist(company);
    	em.persist(e1);
    	em.persist(e2);
    	
    	et.commit();
    	emf.close();
    }
}
