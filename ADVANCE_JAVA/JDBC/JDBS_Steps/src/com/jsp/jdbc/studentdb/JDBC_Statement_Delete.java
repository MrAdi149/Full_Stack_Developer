package com.jsp.jdbc.studentdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class JDBC_Statement_Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Driver driver = new com.mysql.cj.jdbc.Driver();

			DriverManager.registerDriver(driver);

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");

			Statement st = conn.createStatement();

			int rowsInserted = st.executeUpdate("DELETE FROM jdbc_studentdb.student WHERE studentId = 3");

			if (rowsInserted > 0) {
				System.out.println(rowsInserted + " data removed");
			} else {
				System.out.println("data not removed");
			}
			
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
