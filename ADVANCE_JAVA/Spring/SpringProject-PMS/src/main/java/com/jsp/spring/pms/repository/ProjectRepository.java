package com.jsp.spring.pms.repository;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


import com.jsp.spring.pms.entity.Project;


@Repository
public class ProjectRepository {
	
	@Autowired
	private EntityManagerFactory emf;

	public void addProjrct(Project project) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		em.persist(project);
		
		et.commit();
		em.close();
		
	}

	public List<Project> findProjectByTitle(String title) {
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("FROM Project p WHERE p.title = ?1");
		query.setParameter(1, title);
		List<Project> project=query.getResultList();
		em.close();
		return project;
	}

	public List<Project> findAllProjectsByTechStack(String tech) {
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("FROM Project p WHERE p.techStack = ?1");
		query.setParameter(1, tech);
		List<Project> project=query.getResultList();
		em.close();
		return project;
	}

	public List<Project> findAllProjectsByBudgetLessThan(double budget) {
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("FROM Project p WHERE p.budget <= ?1");
		query.setParameter(1, budget);
		List<Project> project=query.getResultList();
		em.close();
		return project;
	}

	public List<Project> findAllProjectsByTeamStrengthLessThan(int team) {
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("FROM Project p WHERE p.teamStrength <= ?1");
		query.setParameter(1, team);
		List<Project> project=query.getResultList();
		em.close();
		return project;
	}
	
	

	public Project updateProjectDesById(int id, String desc) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Project project=em.find(Project.class, id);
		project.setDes(desc);
		em.merge(project);
		et.commit();
		em.close();
		return project;
	}

	public Project findProductById(int id) {
		EntityManager em = emf.createEntityManager();
		Project product=em.find(Project.class, id);
		em.close();
		return product;
		
	}

	public List<Project> updateProjectBudgetByTechStack(String tech, double budget) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Query query = em.createQuery("FROM Project p WHERE p.techStack = ?1");
		query.setParameter(1, tech);
		List<Project> project=query.getResultList();
		for (Project project2 : project) {
			project2.setBudget(budget);
			em.merge(project2);
		}
		et.commit();
		em.close();
		return project;
		
	}

	public void deleteProjectByTitle(String title) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Query query = em.createQuery("DELETE FROM Project p WHERE p.title = ?1");
		query.setParameter(1, title);
		query.executeUpdate();
		et.commit();
		em.close();
		
	}
	
	public List<Project> findAllProjects()
	{
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("FROM Project ");
		List<Project> project=query.getResultList();
		em.close();
		return project;
	}

	public void deleteAllProjects(int id) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Project project =em.find(Project.class, id);
		em.remove(project);
		et.commit();
		em.close();
		
	}

	

}
