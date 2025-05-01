package com.jsp.hibernate.actor_movies.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.jsp.hibernate.actor_movies.entity.Actor;
import com.jsp.hibernate.actor_movies.entity.Movie;

public class MovieDao {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql-config");
	Scanner sc = new Scanner(System.in);
	
	public void addMovie() {
		
		Movie movie = new Movie();
		
		System.out.println("Enter the movie title: ");
		String title = sc.nextLine();
		movie.setTitle(title);
		
		System.out.println("Enter the director name: ");
		String directorName = sc.nextLine();
		movie.setDirector(directorName);
		
		System.out.println("Enter the genre of the movie: ");
		String genre = sc.next();
		movie.setGenre(genre);
		
		System.out.println("Enter the movie collection: ");
		long collection = sc.nextLong();
		movie.setCollection(collection);
		
		
		EntityManager em = emf.createEntityManager();
		
		
		List<Actor> actorTobeAdded = new ArrayList<Actor>();
		
		System.out.println("Available Actors: ");
		List<Actor> allActors = em.createQuery("from Actor").getResultList();
		
		for (Actor actor : allActors) {
	        System.out.println(actor.getActorId() + ": " + actor.getActorName());
	    }

		String ids = sc.next();
		String[] stringIds = ids.split(",");

		EntityTransaction et = em.getTransaction();
		et.begin();
		
		for(String id : stringIds) {
			int actorId = Integer.parseInt(id);
			Actor actor = em.find(Actor.class, actorId);
			actorTobeAdded.add(actor);
		}
		
		movie.setActors(actorTobeAdded);
		em.persist(movie);
		System.out.println("Movie added successfully!!");
		et.commit();
		em.close();
		
		
	}// In-built method

	public void findMovieById() {
		
		System.out.println("Enter the movie id to find: ");
		int movieId = sc.nextInt();

		EntityManager em = emf.createEntityManager();
		try {
			Movie movie = em.find(Movie.class, movieId);
			if (movie != null) {
				System.out.println("movie found: " + movie);
			} else {
				System.out.println("No movie found with ID: " + movieId);
			}
		} finally {
			em.close();
		}
		
	}// In-built method

	public void findMovieByTitle() {
		
		Movie movie = new Movie();

		System.out.println("Enter the movie title to find: ");
        String title = sc.nextLine();
        
		EntityManager em = emf.createEntityManager();

		Query query = em.createQuery("FROM Movie m WHERE m.title = :title");
        query.setParameter("title", title);
        
        List<Movie> movies = query.getResultList();

		for (Movie movie1 : movies) {
			System.out.println(movie1);
		}
		
		em.close();
	}// HQL

	public void findMovieByDirector() {
		
		Movie movie = new Movie();

		EntityManager em = emf.createEntityManager();

		Query query = em.createNativeQuery("select * from movie m where m.director=?", Movie.class);
		System.out.println("Enter the director name to find movie: ");
		String director = sc.nextLine();
		query.setParameter(1, director);

		List<Movie> movies = query.getResultList();

		for (Movie movie1 : movies) {
			System.out.println(movie1);
		}

		em.close();
		
	}// SQL

	public void findMovieByGenre() {
        System.out.println("Enter the genre to find movies: ");
        String genre = sc.next();
        EntityManager em = emf.createEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Movie> cq = cb.createQuery(Movie.class);
        Root<Movie> root = cq.from(Movie.class);
        cq.where(cb.equal(root.get("genre"), genre));
        List<Movie> movies = em.createQuery(cq).getResultList();
        for (Movie movie : movies) {
            System.out.println(movie);
        }
        em.close();
    }

    public void findMovieWithCollectionGreaterThan() {
        System.out.println("Enter minimum collection amount: ");
        long collection = sc.nextLong();
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("FROM Movie m WHERE m.collection > :collection");
        query.setParameter("collection", collection);
        List<Movie> movies = query.getResultList();
        for (Movie movie : movies) {
            System.out.println(movie);
        }
        em.close();
    }


	public void findMovieByActorId() {
	    EntityManager em = emf.createEntityManager();
	    
	    System.out.println("Enter the actor ID to find movies: ");
	    int actorId = sc.nextInt();

	    Query query = em.createNativeQuery(
	            "SELECT m.* FROM Movie m INNER JOIN Movie_Actor ma ON m.movieId = ma.movies_movieId WHERE ma.actors_actorId = ?", 
	            Movie.class
	        );
	    query.setParameter(1, actorId);

	    List<Movie> movies = query.getResultList();
	    
	    System.out.println("Movies found for actor ID " + actorId + ":");
	    for (Movie movie : movies) {
	        System.out.println("ID: " + movie.getMovieId() + 
	                         ", Title: " + movie.getTitle());
	    }

	    em.close();
	}


	public void updateMovieCollectionByTitle() {
        System.out.println("Enter movie title to update: ");
        String title = sc.nextLine();
        System.out.println("Enter new collection amount: ");
        long newCollection = sc.nextLong();
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Movie> cq = cb.createQuery(Movie.class);
        Root<Movie> root = cq.from(Movie.class);
        cq.where(cb.equal(root.get("title"), title));
        Movie movie = em.createQuery(cq).getSingleResult();
        movie.setCollection(newCollection);
        em.merge(movie);
        System.out.println("Collection updated successfully!");
        et.commit();
        em.close();
    }// CriteriaBuilder

	public void deleteMovieById() {
	    System.out.println("Enter movie ID to delete: ");
	    int movieId = sc.nextInt();
	    
	    EntityManager em = emf.createEntityManager();
	    EntityTransaction et = em.getTransaction();
	    
	    et.begin();
	    Query query = em.createQuery("DELETE FROM Movie m WHERE m.movieId = :id");
	    query.setParameter("id", movieId);
	    int deletedCount = query.executeUpdate();
	    System.out.println(deletedCount + " movie(s) deleted successfully!");
	    et.commit();
	    em.close();
	}// HQL

}
