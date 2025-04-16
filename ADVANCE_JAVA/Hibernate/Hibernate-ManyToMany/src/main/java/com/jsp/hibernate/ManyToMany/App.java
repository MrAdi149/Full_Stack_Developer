package com.jsp.hibernate.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App {

	public static void main(String[] args) {
		
		
		Student s1 = new Student();
		s1.setStudentId(101);
		s1.setStudentName("Aditya");
		
		Student s2 = new Student();
		s2.setStudentId(102);
		s2.setStudentName("Tharun");
		
		Course c1 = new Course();
		c1.setCourseId(1);
		c1.setCourseName("Java");
		
		Course c2 = new Course();
		c2.setCourseId(2);
		c2.setCourseName("sql");
		
		List<Course> clist = new ArrayList<Course>();
//		List<Student> slist = new ArrayList<Student>();
//		
//		slist.add(s1);
//		slist.add(s2);
		
		clist.add(c1);
		clist.add(c2);
//		
//		c1.setStudents(slist);
//		c2.setStudents(slist);
		
		s1.setCourse(clist);
		s2.setCourse(clist);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql-config");
    	EntityManager em = emf.createEntityManager();
    	EntityTransaction et = em.getTransaction();
    	et.begin();
    	
    	em.persist(s1);
    	em.persist(s2);
    	em.persist(c1);
    	em.persist(c2);
    	
    	et.commit();
    	emf.close();
	}
}
