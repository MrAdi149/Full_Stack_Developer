package com.jsp.playerdb.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.playerdb.entity.Player;

public class PlayerDao {
	 static EntityManagerFactory emf =Persistence.createEntityManagerFactory("mysql-config");

	public static void savePlayer(Player player) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		em.persist(player);
		et.commit();
		em.close();
		
	}

	public static List<Player> findAll() {
		EntityManager em = emf.createEntityManager();
		Query query =em.createQuery("FROM Player");
		List<Player> player = query.getResultList();
		em.close();
		return player;
	}

	public static Player findById(int playerId) {
		EntityManager em = emf.createEntityManager();
		Player player = em.find(Player.class, playerId);
		em.close();
		return player;
	}

	public static void updatePlayer(Player player) {

		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		em.merge(player);
		et.commit();
		em.close();
	}

	public static void deleteById(int playerId) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Player player = em.find(Player.class, playerId);
		em.remove(player);
		et.commit();
		em.close();
		
	}

	
	 
	 

}
