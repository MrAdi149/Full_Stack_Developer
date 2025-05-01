package com.jsp.hibernate.caching;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App {
	
	public static void main(String[] args) {
//		
//		
//		Mobile mobile1 = new Mobile();
//		mobile1.setModelName("Iphone 16");
//		mobile1.setBrand("Apple");
//		mobile1.setPrice(10);
//		
//		Mobile mobile2 = new Mobile();
//		mobile2.setModelName("S25");
//		mobile2.setBrand("Samsung");
//		mobile2.setPrice(10);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql-config");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		Mobile mobile1 = em.find(Mobile.class, 1);
		System.out.println(mobile1);
		
		Mobile mobile2 = em.find(Mobile.class,1);
		System.out.println(mobile2);

		et.commit();
		em.close();
		
		System.out.println();
		
		EntityManager em2 = emf.createEntityManager();
		EntityTransaction et2 = em2.getTransaction();
		et2.begin();
		
		Mobile mobile3 = em2.find(Mobile.class, 1);
		System.out.println(mobile3);
		
		Mobile mobile4 = em2.find(Mobile.class,1);
		System.out.println(mobile4);

		et2.commit();
		em2.close();
		
		
	}

}
