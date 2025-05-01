package com.jsp.hibernate.CaseStudy2.TheaterAndSeats;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql-config");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

	Scanner sc = new Scanner(System.in);
	
	public void fetchBehaviour() {
		
		
		System.out.println("Enter the theater id to find: ");
		int theaterId = sc.nextInt();
		Theater theater = em.find(Theater.class, theaterId);
		
		print(theater);
		
		System.out.println();
//		
//		System.out.println(theater.getSeats());
//		em.close();
//		emf.close();
	}

    private static void print(Theater theater) {
		
    	System.out.println(theater.getTheaterId() + " " + theater.getTheaterName());
		
	}

	public static void main(String[] args) {
		
		App app = new App();
		app.fetchBehaviour();
        
//        Scanner sc = new Scanner(System.in);
//        
//        Theater the1 = new Theater();
//        String name = "Aditya-Theater";
//        the1.setTheaterName(name);
//        
//        List<Seat> seats1 = new ArrayList<Seat>();
//        
//        int capacity = 30;
//        for(int i = 0; i<capacity; i++) {
//        	Seat seat = new Seat();
//        	seat.setTheater(the1);
//        	seats1.add(seat);
//        }
//        
//        the1.setSeats(seats1);
//        
//        Theater the2 = new Theater();
//        String name2 = "Tharun-Theater";
//        the2.setTheaterName(name2);
//        
//        List<Seat> seats2 = new ArrayList<Seat>();
//        int capacity2 = 50;
//        for(int i = 0; i<capacity2; i++) {
//        	Seat seat = new Seat();
//        	seat.setTheater(the2);
//        	seats2.add(seat);
//        }
//        
//        the2.setSeats(seats2);
//        
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql-config");
//        EntityManager em = emf.createEntityManager();
//        EntityTransaction et = em.getTransaction();
//        et.begin();
//        
//        em.persist(the1);
//        em.persist(the2);
//        
//        et.commit();
//        em.close();
//        emf.close();
    }
}