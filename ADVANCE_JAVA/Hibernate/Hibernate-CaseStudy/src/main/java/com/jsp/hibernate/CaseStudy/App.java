package com.jsp.hibernate.CaseStudy;

import java.util.Scanner;

import com.jsp.hibernate.CaseStudy.dao.UserDao;

public class App {

	public static void main(String[] args) {
		UserDao userDao = new UserDao();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        while (running) {
            System.out.println("\nUser Database Management System");
            System.out.println("1. Save User");
            System.out.println("2. Find user by ID");
            System.out.println("3. Update user information");
            System.out.println("4. Delete user by ID");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            String choice = scanner.next();
            
            switch (choice) {
                case "save-user":
                    userDao.insert();
                    System.out.println("User Inserted");
                    break;
                case "find-user":
                    userDao.read();
                    break;
                case "edit-user":
                    userDao.update();
                    System.out.println("User Updated");
                    break;
                case "del-user":
                    userDao.remove();
                    System.out.println("user removed");
                    break;
                case "Exit":
                    System.out.println("Exiting the system. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    	
	}
}
