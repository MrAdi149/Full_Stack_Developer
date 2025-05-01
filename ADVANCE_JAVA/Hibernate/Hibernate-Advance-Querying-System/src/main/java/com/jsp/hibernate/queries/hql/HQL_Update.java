package com.jsp.hibernate.queries.hql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class HQL_Update {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql-config");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		
		Query query = em.createQuery("Update Book b set b.price = ?1 where b.bookId=?2");
		
		query.setParameter(1, 80.0);
		query.setParameter(2, 1);
		
		int rowUpdated = query.executeUpdate();
		
		System.out.println(rowUpdated + " row updated successfully!!");
		
		et.commit();
		em.close();
		emf.close();
		
		
	}

}
