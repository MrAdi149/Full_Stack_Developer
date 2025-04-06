package com.jsp.jdbc.mobiledb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PrepareStatement_Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_mobiledb?user=root&password=root");
			
			PreparedStatement pst = conn.prepareStatement("INSERT INTO MOBILE VALUES(?,?,?,?,?)");
			
			System.out.println("Enter mobile id: ");
			pst.setInt(1, sc.nextInt());
			
			System.out.println("Enter mobile model: ");
			pst.setString(2, sc.next());
			
			System.out.println("Enter mobile brand: ");
			pst.setString(3, sc.next());
			
			System.out.println("Enter mobile color: ");
			pst.setString(4, sc.next());
			
			System.out.println("Enter mobile price: ");
			pst.setInt(5, sc.nextInt());
			
			int result = pst.executeUpdate();
			
			if(result>0) {
				System.out.println("data inserted");
			}else {
				System.out.println("data not inserted");
			}
			
			sc.close();
			conn.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
