package com.jsp.jdbc.mobiledb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PrepareStatement_Update {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Connection conn = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_mobiledb?user=root&password=root");

			PreparedStatement pst = conn.prepareStatement("Update mobile set price = ? where mobileid = ?");

			System.out.println("Enter the updated price: ");
			pst.setInt(1, sc.nextInt());

			System.out.println("Enter the mobile id: ");
			pst.setInt(2, sc.nextInt());

			int result = pst.executeUpdate();

			if (result > 0) {
				System.out.println("data updated");
			} else {
				System.out.println("data not updated");
			}

			sc.close();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
