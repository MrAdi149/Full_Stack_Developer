package com.jsp.hibernate.oneToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
       
    	
    	Company c = new Company();
    	c.setCompanyId(1);
    	c.setCompanyName("META");
    	
    	Employee e1 = new Employee();
    	e1.setEmplyeeId(101);
    	e1.setEmployeeName("Aditya");
    	e1.setSalary(100000);
    	
    	Employee e2 = new Employee();
    	e2.setEmplyeeId(102);
    	e2.setEmployeeName("Tharun");
    	e2.setSalary(90000);
    	
    	//mapping employee into company
//    	List<Employee> elist = new ArrayList<Employee>();
//    	elist.add(e2);
//    	elist.add(e1);
//    	c.setEmployee(elist);
    	
    	//mapping company into employee
    	e1.setCompany(c);
    	e2.setCompany(c);
    	
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql-config");
    	EntityManager em = emf.createEntityManager();
    	EntityTransaction et = em.getTransaction();
    	et.begin();
    	
    	em.persist(c);
    	em.persist(e1);
    	em.persist(e2);
    	
    	et.commit();
    	emf.close();
    	
    }
}
