package com.jsp.hibernate.queries.sql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.hibernate.queries.entity.Book;

public class SQL_Update {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql-config");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		
		Query query = em.createNativeQuery("Update books b set b.price = ? where b.bookId=?",Book.class);
		
		query.setParameter(1, 80.0);
		query.setParameter(2, 1);
		
		int rowUpdated = query.executeUpdate();
		
		System.out.println(rowUpdated + " row updated successfully!!");
		
		et.commit();
		em.close();
		emf.close();
		
		
	}

}
