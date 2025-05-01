package com.jsp.hibernate.practise.oneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App {
	
	public static void main( String[] args )
    {
		
		Person p1 = new Person();
		p1.setPersonName("Aditya");
		
		Passport q1 = new Passport();
		q1.setPassportName("India");
		p1.setPassport(q1);
		q1.setPerson(p1);
		
		System.out.println();		
		Passport q2 = new Passport();
		q2.setPassportName("USA");
		
		
		Person p2 = new Person();
		p2.setPersonName("Kumar");
		p2.setPassport(q2);
		q2.setPerson(p2);
    	
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql-config");
    	EntityManager em = emf.createEntityManager();
    	EntityTransaction et = em.getTransaction();
    	et.begin();
    	
    	em.persist(p1);
    	em.persist(p2);
    	
    	et.commit();
    	emf.close();
    }

}
