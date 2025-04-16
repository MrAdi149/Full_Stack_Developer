package com.jsp.hibernate.CaseStudy.dao;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.hibernate.CaseStudy.User;

public class UserDao {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql-config");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

	Scanner sc = new Scanner(System.in);

	public void insert() {

		User user1 = new User();

		System.out.println("Enter the user name: ");
		user1.setUsername(sc.next());
		System.out.println("Enter the user password: ");
		user1.setPassword(sc.next());
		System.out.println("Enter the user email: ");
		user1.setEmail(sc.next());

		et.begin();

		em.persist(user1);

		et.commit();
		emf.close();

	}

	public void update() {

		et.begin();
		System.out.println("Enter the user id to update: ");
		int userId = sc.nextInt();
		User user = em.find(User.class, userId);
		
		System.out.println("Enter the new user name to change or leave blank: ");
		String userName = sc.next(); 

		if (userName != null && !userName.isEmpty() && !userName.equals("-")) {
		    user.setUsername(userName);
		}
		
		System.out.println("Enter the new email to change or leave blank: ");
		String email = sc.next();

		if (email != null && !email.isEmpty() && !email.equals("-")) {
		    user.setEmail(email);
		}
		
		System.out.println("Enter the new password to change: ");
		String password = sc.next();

		if (password != null && !password.isEmpty()) {
		    user.setPassword(password);
		}
		

	    em.merge(user);

		et.commit();
		emf.close();

	}

	public void read() {

		et.begin();


		System.out.println("Enter the user id to find: ");
		int userId = sc.nextInt();
		User user = em.find(User.class, userId);
		
		print(user);

		et.commit();
		emf.close();

	}

	private void print(User user) {
		
		System.out.println(user.getUserId() + " " + user.getUsername() + " " + user.getEmail() + " " + user.getPassword());
		
	}

	public void remove() {

		et.begin();

		System.out.println("Enter the user id to remove: ");
		int userId = sc.nextInt();
		User user = em.find(User.class, userId);

		em.remove(user);

		et.commit();
		emf.close();
	}

}
