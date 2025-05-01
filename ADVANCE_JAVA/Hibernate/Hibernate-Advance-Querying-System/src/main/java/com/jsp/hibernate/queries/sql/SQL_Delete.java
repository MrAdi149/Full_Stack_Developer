package com.jsp.hibernate.queries.sql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.hibernate.queries.entity.Book;

public class SQL_Delete {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql-config");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		
		Query query = em.createNativeQuery("Delete from books b where bookId=?",Book.class);
		
		query.setParameter(1, 7);
		
		int rowUpdated = query.executeUpdate();
		
		System.out.println(rowUpdated + " row deleted successfully!!");
		
		et.commit();
		em.close();
		emf.close();
		
		
	}

}
