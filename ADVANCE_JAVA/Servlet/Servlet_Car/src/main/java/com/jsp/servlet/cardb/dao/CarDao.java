package com.jsp.servlet.cardb.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.servlet.cardb.entity.Car;
import javax.persistence.Query;

public class CarDao {
	
 static EntityManagerFactory emf =Persistence.createEntityManagerFactory("mysql-config");


	public static void saveCar(Car car) {
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		
		em.persist(car);
		
		et.commit();
		em.close();
	}


	public static void updateCar(Car car) {
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		
		em.merge(car);
		
		et.commit();
		em.close();
		
	}


	public static void Delete(int carId) {
		
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		Car car=em.find(Car.class,carId);
		em.remove(car);
		
		et.commit();
		em.close();
	}


	public static Car fetchCarbyId(int carId) {
		Car car;
		EntityManager em=emf.createEntityManager();
		car=em.find(Car.class, carId);
		em.close();
		return car;
	}
	
	public static List<Car> fetchallCar() {
		List<Car> car;
		EntityManager em=emf.createEntityManager();
		Query query=em.createQuery("From Car");
		car=query.getResultList();
		em.close();
		return car;
	}
	
	
	

}
