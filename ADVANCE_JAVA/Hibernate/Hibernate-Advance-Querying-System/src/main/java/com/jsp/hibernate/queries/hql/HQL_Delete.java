package com.jsp.hibernate.queries.hql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class HQL_Delete {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql-config");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		
		Query query = em.createQuery("Delete Book b where b.bookId=?1");
		
		query.setParameter(1, 8);
		
		int rowUpdated = query.executeUpdate();
		
		System.out.println(rowUpdated + " row deleted successfully!!");
		
		et.commit();
		em.close();
		emf.close();
		
		
	}

}
