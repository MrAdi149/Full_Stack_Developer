package com.jsp.spring.mvc.vms.epository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.spring.mvc.vms.entity.Vehicle;

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

	public List<Vehicle> displayAllVehicle() {
		EntityManager em = emf.createEntityManager();
		Query query=em.createQuery("FROM Vehicle");
		List<Vehicle> vehicles=query.getResultList();
		em.close();
		
		return vehicles;
	}

	public void deleteVehicle(int id) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Vehicle vehicle=em.find(Vehicle.class, id);
		em.remove(vehicle);
		et.commit();
		em.close();
		
	}

	public Vehicle findVehicleById(int id) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Vehicle vehicle=em.find(Vehicle.class, id);
		et.commit();
		em.close();
		return vehicle;
	}

	public void updateVehicle(Vehicle vehicle) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.merge(vehicle);
		et.commit();
		em.close();
		
	}

}
