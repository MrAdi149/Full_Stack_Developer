package com.jsp.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App_Update {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Car.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();

		// fetching the values
		Car car = session.get(Car.class, 102);
		
		//updating the values
		car.setBrand("yolo");
		
		System.out.println(car);

		trans.commit();
		session.close();
		sf.close();
	}
}
