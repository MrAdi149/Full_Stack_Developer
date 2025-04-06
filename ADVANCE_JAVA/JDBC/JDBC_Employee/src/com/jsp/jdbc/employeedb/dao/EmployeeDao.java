package com.jsp.jdbc.employeedb.dao;

import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class EmployeeDao {
    Scanner sc = new Scanner(System.in);
    

    public static Connection buildConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            FileReader fr = new FileReader("DBconfig.properties");
            Properties p = new Properties();
            p.load(fr);
            String url = p.getProperty("url");
            conn = DriverManager.getConnection(url, p);
        } catch (ClassNotFoundException | IOException | SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public void addEmployee() {
        Connection conn = null;
        
        try {
            conn = buildConnection();
            PreparedStatement pst = conn.prepareStatement("INSERT INTO employee VALUES(?, ?, ?, ?, ?)");

            System.out.print("Enter Employee ID: ");
            pst.setInt(1, sc.nextInt());

            System.out.print("Enter Employee Name: ");
            pst.setString(2, sc.next());

            System.out.print("Enter Employee Email: ");
            pst.setString(3, sc.next());

            System.out.print("Enter Employee Salary: ");
            pst.setDouble(4, sc.nextDouble());

            System.out.print("Enter Employee Experience: ");
            pst.setInt(5, sc.nextInt());

            int result = pst.executeUpdate();
            if (result > 0) {
                System.out.println("Employee added successfully");
            } else {
                System.out.println("Failed to add employee");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void findEmployeeByEmail() {
        Connection conn = null;
        
        try {
            conn = buildConnection();
            System.out.print("Enter Employee Email: ");
            String email = sc.next();

            PreparedStatement pst = conn.prepareStatement("SELECT * FROM employee WHERE email = ?");
            pst.setString(1, email);

            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt(1) + ", Name: " + rs.getString(2) + ", Email: " + rs.getString(3)
                        + ", Salary: " + rs.getDouble(4) + ", Experience: " + rs.getInt(5));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void findAllEmployeeWithExperienceGreaterThan() {
        Connection conn = null;
        
        try {
            conn = buildConnection();
            System.out.print("Enter minimum experience: ");
            int experience = sc.nextInt();

            PreparedStatement pst = conn.prepareStatement("SELECT * FROM employee WHERE experience > ?");
            pst.setInt(1, experience);

            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt(1) + ", Name: " + rs.getString(2) + ", Email: " + rs.getString(3)
                        + ", Salary: " + rs.getDouble(4) + ", Experience: " + rs.getInt(5));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void updateEmployeeSalaryBetweenExperience() {
        Connection conn = null;
        
        try {
            conn = buildConnection();
            System.out.print("Enter minimum experience: ");
            int minExp = sc.nextInt();

            System.out.print("Enter maximum experience: ");
            int maxExp = sc.nextInt();

            PreparedStatement pst = conn
                    .prepareStatement("UPDATE employee SET salary = salary + 500000 WHERE experience BETWEEN ? AND ?");
            pst.setInt(1, minExp);
            pst.setInt(2, maxExp);

            int result = pst.executeUpdate();
            if (result > 0) {
                System.out.println("Salary updated for employees");
            } else {
                System.out.println("No employees found with this experience range");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void updateEmployeeExperienceByEmail() {
        Connection conn = null;
        
        try {
            conn = buildConnection();
            System.out.print("Enter Employee Email: ");
            String email = sc.next();

            System.out.print("Enter years to add to experience: ");
            int addedExperience = sc.nextInt();

            PreparedStatement pst = conn
                    .prepareStatement("UPDATE employee SET experience = experience + ? WHERE email = ?");
            pst.setInt(1, addedExperience);
            pst.setString(2, email);

            int result = pst.executeUpdate();
            if (result > 0) {
                System.out.println("Experience updated");
            } else {
                System.out.println("Employee not found");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void deleteEmployeeById() {
        Connection conn = null;
        
        try {
            conn = buildConnection();
            System.out.print("Enter Employee ID to delete: ");
            int id = sc.nextInt();

            PreparedStatement pst = conn.prepareStatement("DELETE FROM employee WHERE employeeId = ?");
            pst.setInt(1, id);

            int result = pst.executeUpdate();
            if (result > 0) {
                System.out.println("Employee deleted");
            } else {
                System.out.println("Employee not found");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    public void deleteEmployeeBySalaryLessThan() {
    	Connection connection = null;
        
        try {
            connection = buildConnection();
            System.out.print("Enter minimum salary: ");
            double minSalary = sc.nextDouble();

            PreparedStatement statement = connection.prepareStatement("DELETE FROM employee WHERE salary < ?");
            statement.setDouble(1, minSalary);

            int count = statement.executeUpdate();
            if (count > 0) {
                System.out.println(count + " employees with salary below " + minSalary + " deleted");
            } else {
                System.out.println("No employees found with salary below " + minSalary);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}