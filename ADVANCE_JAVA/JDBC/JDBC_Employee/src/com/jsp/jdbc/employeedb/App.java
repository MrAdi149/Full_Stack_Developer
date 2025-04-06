package com.jsp.jdbc.employeedb;

import com.jsp.jdbc.employeedb.dao.EmployeeDao;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        EmployeeDao dao = new EmployeeDao();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add Employee\n2. Find Employee by Email\n3. Find Employees with Experience Greater Than");
            System.out.println("4. Update Employee Salary\n5. Update Employee Experience\n6. Delete Employee\n7. Delete Employees with Salary Less Than\n8. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: dao.addEmployee(); break;
                case 2: dao.findEmployeeByEmail(); break;
                case 3: dao.findAllEmployeeWithExperienceGreaterThan(); break;
                case 4: dao.updateEmployeeSalaryBetweenExperience(); break;
                case 5: dao.updateEmployeeExperienceByEmail(); break;
                case 6: dao.deleteEmployeeById(); break;
                case 7: dao.deleteEmployeeBySalaryLessThan(); break;
                case 8: System.out.println("Exiting..."); sc.close(); return;
                default: System.out.println("Invalid choice!");
            }
        }
    }
}
