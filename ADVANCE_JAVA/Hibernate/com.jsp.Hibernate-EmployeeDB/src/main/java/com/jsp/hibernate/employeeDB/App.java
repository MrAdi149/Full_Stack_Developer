package com.jsp.hibernate.employeeDB;

import com.jsp.hibernate.employeeDB.dao.EmployeeDao;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        EmployeeDao employeeDao = new EmployeeDao();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        while (running) {
            System.out.println("\nEmployee Database Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Find Employee by ID");
            System.out.println("3. Update Employee Description and Salary");
            System.out.println("4. Delete Employee by ID");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    employeeDao.addEmployee();
                    break;
                case 2:
                    employeeDao.findEmployeeById();
                    break;
                case 3:
                    employeeDao.updateEmployeeDescAndSalaryById();
                    break;
                case 4:
                    employeeDao.deleteEmployeeById();
                    break;
                case 5:
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