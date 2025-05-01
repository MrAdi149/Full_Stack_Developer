package com.jsp.hibernate.criteriaBuilder;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.jsp.hibernate.queries.entity.Book;

public class CriteriaQuery_Fetch {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql-config");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Book> cq = cb.createQuery(Book.class);
		Root<Book>root = cq.from(Book.class);
		
//		cq.where(cb.equal(root.get("bookId"), 5));
//		cq.where(cb.like(root.get("title"), "The Alchemist"));
//		cq.where(cb.gt(root.get("bookId"), 5));
////		cq.where(cb.lt(root.get("bookId"), 5));
		cq.where(cb.between(root.get("bookId"), 1,5));
		
		Query query = em.createQuery(cq);
		
		List<Book> books = query.getResultList();
		
		for(Book book : books) {
			System.out.println(book);
		}
		
		et.commit();
		em.close();
		emf.close();
		
	}

}
