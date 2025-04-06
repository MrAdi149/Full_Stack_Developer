package com.project.jdbc.student.dao;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class StudentDao {
	
	Scanner sc = new Scanner(System.in);
	
	public static Connection buildConnection() {
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			FileReader fr = new FileReader("config.properties");
			
			Properties p = new Properties();
			
			p.load(fr);
			
			String url = p.getProperty("url");
			
			conn = DriverManager.getConnection(url,p);
			
		} catch (ClassNotFoundException | IOException | SQLException e) {
			
			e.printStackTrace();
		}
		
		return conn;
	}
	
	public void addStudentToDB() {
		
		Connection conn = null;
		
		try {
			conn = buildConnection();
			PreparedStatement pst = conn.prepareStatement("INSERT INTO student values(?,?,?,?)");
			
			System.out.println("Enter the ID to add for the student: ");
			pst.setInt(1, sc.nextInt());
			
			System.out.println("Enter the name of the student: ");
			pst.setString(2, sc.next());
			
			System.out.println("Enter the email ID of the student: ");
			pst.setString(3, sc.next());
			
			System.out.println("Enter the marks of the student: ");
			pst.setInt(4, sc.nextInt());
			
			int result = pst.executeUpdate();
			
			if(result > 0) {
				System.out.println("Student ID, name, email, and marks were added to the database");
			}else {
				System.out.println("Error adding student to the database!");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void deleteStudentFromDB() {
		Connection conn = null;
		
		try {
			conn = buildConnection();
			PreparedStatement pst = conn.prepareStatement("DELETE FROM student WHERE studentId = ?");
			
			System.out.println("Enter the ID of the student you want to remove from the database: ");
			pst.setInt(1, sc.nextInt());
			
			int result = pst.executeUpdate();
			
			if(result > 0) {
				System.out.println("Student successfully deleted from the database!");
			}else {
				System.out.println("Operation failed. Student was not deleted from the database!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void updateStudentInDB() {
		
		Connection conn = null;
		
		conn = buildConnection();
		
		try {
			PreparedStatement pst = conn.prepareStatement(
		            "UPDATE student SET studentName = ?, studentEmail = ?, studentMarks = ? WHERE studentId = ?");
	        
	        System.out.println("Enter student ID to update:");
	        int id = sc.nextInt();
	        sc.nextLine(); 
	        
	        System.out.println("Enter new student name:");
	        String name = sc.nextLine();
	        
	        System.out.println("Enter new student email:");
	        String email = sc.nextLine();
	        
	        System.out.println("Enter new student marks:");
	        int marks = sc.nextInt();
	        
	        pst.setString(1, name);
	        pst.setString(2, email);
	        pst.setInt(3, marks);
	        pst.setInt(4, id);
	        
	        int result = pst.executeUpdate();
	        
	        if(result > 0) {
	        	System.out.println("Student information was updated successfully");
	        }else {
	        	System.out.println("Update failed!");
	        }
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void getStudentById() {
	    Connection conn = null;
	    try {
	        conn = buildConnection();
	        PreparedStatement pst = conn.prepareStatement("SELECT * FROM student WHERE studentId = ?");
	        System.out.print("Enter the student ID to view: ");
	        int id = sc.nextInt();
	        sc.nextLine();

	        pst.setInt(1, id);
	        ResultSet rs = pst.executeQuery();

	        if (rs.next()) {
	            System.out.println("\n--- Student Details ---");
	            System.out.println("ID     : " + rs.getInt("studentId"));
	            System.out.println("Name   : " + rs.getString("studentName"));
	            System.out.println("Email  : " + rs.getString("studentEmail"));
	            System.out.println("Marks  : " + rs.getInt("studentMarks"));
	        } else {
	            System.out.println("⚠️  No student found with ID: " + id);
	        }

	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            if (conn != null) conn.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}

	
	public void showAllStudentFromDB() {
	    Connection conn = null;
	    try {
	        conn = buildConnection();
	        PreparedStatement pst = conn.prepareStatement("SELECT * FROM student");
	        ResultSet rs = pst.executeQuery();

	        System.out.println("\n====== STUDENT LIST ======");
	        boolean found = false;

	        while (rs.next()) {
	            found = true;
	            System.out.println("----------------------------");
	            System.out.println("ID     : " + rs.getInt("studentId"));
	            System.out.println("Name   : " + rs.getString("studentName"));
	            System.out.println("Email  : " + rs.getString("studentEmail"));
	            System.out.println("Marks  : " + rs.getInt("studentMarks"));
	        }

	        if (!found) {
	            System.out.println("No students found in the database.");
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            if (conn != null) conn.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}
}