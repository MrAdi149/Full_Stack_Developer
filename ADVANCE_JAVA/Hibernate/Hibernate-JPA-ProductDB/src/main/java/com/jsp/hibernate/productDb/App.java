package com.jsp.hibernate.productDb;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App {
	public static void main(String[] args) {

		Product product = new Product();
		product.setProductId(101);
		product.setProductName("Laptop");
		product.setProductBrand("Lenovo");
		product.setPrice(1000);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql-config");

		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();

		em.persist(product);

		et.commit();
		em.close();
		emf.close();
	}
}
