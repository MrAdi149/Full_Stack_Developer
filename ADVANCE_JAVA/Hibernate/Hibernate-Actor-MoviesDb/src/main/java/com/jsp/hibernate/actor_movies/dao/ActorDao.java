package com.jsp.hibernate.actor_movies.dao;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;

import com.jsp.hibernate.actor_movies.entity.Actor;

public class ActorDao {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql-config");
	Scanner sc = new Scanner(System.in);

	public void addActor() { // in-built method

		Actor actor = new Actor();

		System.out.println("Enter Actor name: ");
		String actorName = sc.nextLine();
		actor.setActorName(actorName);

		System.out.println("Enter the actor age: ");
		int age = sc.nextInt();
		actor.setAge(age);

		System.out.println("Enter the actor industry: ");
		String industry = sc.next();
		actor.setIndustry(industry);

		System.out.println("Enter the actor nationality: ");
		String nationality = sc.next();
		actor.setNationality(nationality);

		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		et.begin();
		em.persist(actor);
		System.out.println("Actor added successfully!!");
		et.commit();
		em.close();

	}

	public void findActorById() {

		System.out.println("Enter the actor id to find: ");
		int actorId = sc.nextInt();

		EntityManager em = emf.createEntityManager();
		try {
			Actor actor = em.find(Actor.class, actorId);
			if (actor != null) {
				System.out.println("Actor found: " + actor);
			} else {
				System.out.println("No actor found with ID: " + actorId);
			}
		} finally {
			em.close();
		}
	}

	public void findActorByName() { // hql


		Actor actor = new Actor();

		EntityManager em = emf.createEntityManager();

		Query query = em.createQuery("from Actor a where a.actorName=?1");
		System.out.println("Enter the actor Name to find: ");
		String actorName = sc.next();
		query.setParameter(1, actorName);

		List<Actor> actors = query.getResultList();

		for (Actor actor1 : actors) {
			System.out.println(actor1);
		}
		
		em.close();

	}

	public void findActorsByIndustry() { // sql


		Actor actor = new Actor();

		EntityManager em = emf.createEntityManager();

		Query query = em.createNativeQuery("select * from actor a where a.industry=?", Actor.class);
		System.out.println("Enter the industry name to find the actors: ");
		String industry = sc.next();
		query.setParameter(1, industry);

		List<Actor> actors = query.getResultList();

		for (Actor actor1 : actors) {
			System.out.println(actor1);
		}

		em.close();
		emf.close();

	}

	public void findActorsBetweenAge() { // criteriaBuilder

		Actor actor = new Actor();

		System.out.println("Enter the first range: ");
		int range1 = sc.nextInt();
		System.out.println("Enter the second range: ");
		int range2 = sc.nextInt();

		EntityManager em = emf.createEntityManager();

		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Actor> cq = cb.createQuery(Actor.class);
		Root<Actor> root = cq.from(Actor.class);

		cq.where(cb.between(root.get("age"), range1, range2));

		Query query = em.createQuery(cq);

		List<Actor> actors = query.getResultList();

		for (Actor actor1 : actors) {
			System.out.println(actor1);
		}

		em.close();

	}

	public void findActorsWithAgeGreaterThan() { // hql

		Actor actor = new Actor();

		EntityManager em = emf.createEntityManager();

		Query query = em.createQuery("from Actor a where a.age>?1");
		System.out.println("Enter the actor age to find: ");
		int actorAge = sc.nextInt();
		query.setParameter(1, actorAge);

		List<Actor> actors = query.getResultList();

		for (Actor actor1 : actors) {
			System.out.println(actor1);
		}

	}

	public void updateActorAgeById() { // criteriaBuilder

		System.out.println("Enter the actor id to update: ");
		int actorId = sc.nextInt();

		System.out.println("Enter the actor age to update: ");
		int age = sc.nextInt();

		EntityManager em = emf.createEntityManager();

		EntityTransaction et = em.getTransaction();
		et.begin();
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaUpdate<Actor> cu = cb.createCriteriaUpdate(Actor.class);
		Root<Actor> root = cu.from(Actor.class);
		cu.set(root.get("age"), age);
		cu.where(cb.equal(root.get("actorId"), actorId));

		Query query = em.createQuery(cu);
		int result = query.executeUpdate();
		System.out.println(result + " row updated!!");

		et.commit();
		em.close();
	}

	public void updateActorNationalityByIndustry() { // hql

		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		et.begin();

		Query query = em.createQuery("Update Actor a set a.nationality = ?1 where a.actorId = ?2");

		System.out.println("Enter the actor id to update his nationality: ");
		int actorId = sc.nextInt();
		query.setParameter(2, actorId);

		System.out.println("Enter the updated nationality: ");
		String nationality = sc.next();
		query.setParameter(1, nationality);

		int rowUpdated = query.executeUpdate();

		System.out.println(rowUpdated + " row updated successfully!!");

		et.commit();
		em.close();

	}

	public void deleteActorById() { // criteriaBuilder
		
		System.out.println("Enter the actor id to delete: ");
		int actorId = sc.nextInt();

		EntityManager em = emf.createEntityManager();

		EntityTransaction et = em.getTransaction();
		et.begin();

		CriteriaBuilder cb = em.getCriteriaBuilder();
		
		CriteriaDelete<Actor> cd = cb.createCriteriaDelete(Actor.class);
		Root<Actor> root = cd.from(Actor.class);
		cd.where(cb.equal(root.get("actorId"), actorId));

		Query query = em.createQuery(cd);
		int result = query.executeUpdate();
		System.out.println(result + " row deleted!!");
		
		et.commit();
		em.close();
	}

	public void findActorByMovieTitle() { // sql

	}

}
