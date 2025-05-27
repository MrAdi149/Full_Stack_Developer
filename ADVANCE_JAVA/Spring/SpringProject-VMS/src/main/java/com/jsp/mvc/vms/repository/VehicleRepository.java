package com.jsp.mvc.vms.repository;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.mvc.vms.entity.Vehicle;

@Repository
public class VehicleRepository {
	
	@Autowired
	private EntityManagerFactory emf;

	public void addVehicle(Vehicle vehicle) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(vehicle);
		et.commit();
		em.close();
	}
	

}
