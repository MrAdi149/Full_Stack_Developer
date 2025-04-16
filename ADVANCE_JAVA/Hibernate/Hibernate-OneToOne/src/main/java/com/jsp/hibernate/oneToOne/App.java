package com.jsp.hibernate.oneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
    	
    	Person p = new Person();
    	p.setPersonId(101);
    	p.setPersonName("Aditya");
    	
    	Aadhar a = new Aadhar();
    	a.setAadharId(1);
    	a.setAadharNumber(123);
    	
    	//Mapping
    	p.setAadhar(a);
    	a.setPerson(p);
       
    	
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql-config");
    	EntityManager em = emf.createEntityManager();
    	EntityTransaction et = em.getTransaction();
    	et.begin();
    	
    	em.persist(p);
    	em.persist(a);
    	
    	et.commit();
    	emf.close();
    }
}
