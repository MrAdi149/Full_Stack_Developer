package com.jsp.jdbc.studentdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class JDBC_Statement_Select {

	public static void main(String[] args) {

		try {
			Driver driver = new com.mysql.cj.jdbc.Driver();

			DriverManager.registerDriver(driver);

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_studentdb", "root", "root");

			Statement st = conn.createStatement();

			ResultSet rs = st.executeQuery("Select * from student");
			
			System.out.println("StudentId\tStudentName\tStudentEmail\t    StudentMarks");
			while(rs.next()) {
				
				System.out.print(rs.getInt(1)+"\t\t");
				System.out.print(rs.getString(2)+"\t\t");
				System.out.print(rs.getString("studentEmail")+"\t\t");
				System.out.print(rs.getInt("studentMarks")+"\t\t");
				
				System.out.println();
			}
			
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
