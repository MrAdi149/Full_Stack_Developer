package com.jsp.jdbc.studentdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class JDBC_Statement_Update {

	public static void main(String[] args) {

		try {
			Driver driver = new com.mysql.cj.jdbc.Driver();

			DriverManager.registerDriver(driver);

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");

			Statement st = conn.createStatement();

			int rowsInserted = st.executeUpdate("UPDATE jdbc_studentdb.student "
					+ "SET studentName = 'KUMAR SINGH', studentEmail = 'kumar.singh@gmail.com', studentMarks = 85 "
					+ "WHERE studentId = 2");

			if (rowsInserted > 0) {
				System.out.println(rowsInserted + " data updated");
			} else {
				System.out.println("data not updated");
			}
			
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
