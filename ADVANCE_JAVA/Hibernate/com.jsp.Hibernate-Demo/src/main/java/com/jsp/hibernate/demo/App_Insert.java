package com.jsp.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App_Insert{
	public static void main(String[] args) {

		Car car = new Car();
		car.setCarId(103);
		car.setModel("Aventador");
		car.setBrand("Lamborgini");
		car.setPrice(200000000);

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Car.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		session.save(car);
		trans.commit();
		session.close();
		sf.close();
	}
}
