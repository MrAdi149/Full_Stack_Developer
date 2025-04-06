package com.project.jdbc.student;

import java.util.Scanner;
import com.project.jdbc.student.dao.StudentDao;

public class App {

    public static void main(String[] args) {
        StudentDao dao = new StudentDao();
        Scanner sc = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("     STUDENT MANAGEMENT SYSTEM      ");
        System.out.println("====================================");

        while (true) {
            System.out.println("\nMain Menu:");
            System.out.println("1. Add New Student");
            System.out.println("2. View Student by ID");
            System.out.println("3. View All Students");
            System.out.println("4. Update Student Information");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.print("Enter your choice (1-6): ");

            try {
                int choice = Integer.parseInt(sc.nextLine());

                switch (choice) {
                    case 1 -> dao.addStudentToDB();
                    case 2 -> dao.getStudentById();
                    case 3 -> dao.showAllStudentFromDB();
                    case 4 -> dao.updateStudentInDB();
                    case 5 -> dao.deleteStudentFromDB();
                    case 6 -> {
                        System.out.println("\nThank you for using Student Management System. Goodbye!");
                        return;
                    }
                    default -> System.out.println("⚠️  Invalid choice. Please enter a number between 1-6.");
                }

            } catch (NumberFormatException e) {
                System.out.println("⚠️  Invalid input. Please enter a numeric value.");
            }
            sc.close();
        }
    }
}
