package com.jsp.hibernate.queries.hql;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.hibernate.queries.entity.Book;

public class HQL_Fetch {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql-config");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		Query query = em.createQuery("from Book b where b.bookId = 1");
		
		List<Book> books = query.getResultList();
		
		for(Book book : books) {
			System.out.println(book);
		}
		
		et.commit();
		em.close();
		emf.close();
		
	}

}
