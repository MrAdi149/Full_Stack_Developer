package com.jsp.hibernate.actor_movies;

import java.util.Scanner;

import com.jsp.hibernate.actor_movies.dao.ActorDao;
import com.jsp.hibernate.actor_movies.dao.MovieDao;

public class App {
	public static void main(String[] args) {
		ActorDao actorDao = new ActorDao();
		MovieDao movieDao = new MovieDao();

		Scanner scanner = new Scanner(System.in);

		boolean running = true;

		while (running) {
			System.out.println("\nMovie Database Management System");
			System.out.println("save-actor - to cretae new actor record");
			System.out.println("find-actor-by-name - to find the actor by name");
			System.out.println("find-actors-by-industry - to find the actors by Industry");
			System.out.println("find-actors-by-age - to find the actors by giving age limit");
			System.out.println("find-actor-by-age-greater-than - to find the actors by age greater than");
			System.out.println("update-actor-age-by-id - to update the actor age by Id");
			System.out.println("update-actor-nationality-by-industry - to update the actor nationality by Industry");
			System.out.println("delete-actor-by-id - to delete the actor by Id");
			System.out.println("save-movie - to cretae new movie record");
			System.out.println("find-movie-by-id - to find the movie by id");
			System.out.println("find-movie-by-title - to find the movie by title");
			System.out.println("find-movie-by-director - to find the movie by director");
			System.out.println("find-movie-by-genre - to find the movie by genre");
			System.out.println("find-movie-by-collection-greater-than - to find the movie by collection greater than");
			System.out.println("find-movie-by-actor-id - to find the movie by actor id");
			System.out.println("update-movie-collection-by-title - to update the movie collection  by title");
			System.out.println("delete-movie-by-id - to delete the movie by Id");
			System.out.println("exit");
			System.out.print("Enter your choice: ");

			String choice = scanner.next();

			switch (choice) {
			case "save-actor":
				actorDao.addActor();
				break;
			case "find-actor-by-name":
				actorDao.findActorByName();
				break;
			case "find-actors-by-industry":
				actorDao.findActorsByIndustry();;
				break;
			case "find-actors-by-age":
				actorDao.findActorsBetweenAge();
				break;
			case "find-actor-by-age-greater-than":
				actorDao.findActorsWithAgeGreaterThan();
				break;
			case "update-actor-age-by-id":
				actorDao.updateActorAgeById();
				break;
			case "update-actor-nationality-by-industry":
				actorDao.updateActorNationalityByIndustry();
				break;
			case "delete-actor-by-id":
				actorDao.deleteActorById();
				break;
			case "save-movie":
				movieDao.addMovie();
				break;
			case "find-movie-by-id":
				movieDao.findMovieById();
				break;
			case "find-movie-by-title":
				movieDao.findMovieByTitle();
				break;
			case "find-movie-by-director":
				movieDao.findMovieByDirector();
				break;
			case "find-movie-by-genre":
				movieDao.findMovieByGenre();
				break;
			case "find-movie-by-collection-greater-than":
				movieDao.findMovieWithCollectionGreaterThan();
				break;
			case "find-movie-by-actor-id":
				movieDao.findMovieByActorId();
				break;
			case "update-movie-collection-by-title":
				movieDao.updateMovieCollectionByTitle();
				break;
			case "delete-movie-by-id":
				movieDao.deleteMovieById();
				break;
			case "exit":
				System.out.println("Exiting the system. Goodbye!");
				running = false;
				break;
			default:
				System.out.println("Invalid choice! Please try again.");
			}
		}

		scanner.close();

	}
}