package com.jsp.hibernate.criteriaBuilder;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.Root;

import com.jsp.hibernate.queries.entity.Book;

public class CriteriaQuery_Delete {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql-config");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaDelete<Book> cu = cb.createCriteriaDelete(Book.class);
		Root<Book>root = cu.from(Book.class);
		cu.where(cb.equal(root.get("bookId"), 5));

		
		Query query = em.createQuery(cu);
		int result = query.executeUpdate();
		System.out.println(result + " row deleted!!");
		
		et.commit();
		em.close();
		emf.close();
		
	}

}
