package com.jsp.hibernate.criteriaBuilder;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;

import com.jsp.hibernate.queries.entity.Book;

public class CriteriaQuery_Update {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql-config");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaUpdate<Book> cu = cb.createCriteriaUpdate(Book.class);
		Root<Book>root = cu.from(Book.class);
		cu.set(root.get("price"), 3000.0);
		cu.where(cb.equal(root.get("bookId"), 5));

		
		Query query = em.createQuery(cu);
		int result = query.executeUpdate();
		System.out.println(result + " row updated!!");
		
		et.commit();
		em.close();
		emf.close();
		
	}

}
