package com.jsp.jdbc.mobiledb.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MobileDao {
	
	public void addMobile() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_mobiledb?user=root&password=root");
			
			Statement st = conn.createStatement();
			
			boolean result = st.execute("INSERT INTO mobile values(103,'REDMI 12','XIAOMI','Black',90)");
			
			if(!result) {
				System.out.println("data inserted");
			}else {
				System.out.println("data not inserted");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void updateMobileById() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_mobiledb?user=root&password=root");
			
			Statement st = conn.createStatement();
			
			boolean result = st.execute("UPDATE mobile SET model = 'IPHONE 18' WHERE mobileId = 101");
			
			if(!result) {
				System.out.println("data updated");
			}else {
				System.out.println("data not updated");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void deleteMobileById() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_mobiledb?user=root&password=root");
			
			Statement st = conn.createStatement();
			
			boolean result = st.execute("DELETE FROM MOBILE WHERE mobileId = 3");
			
			if(!result) {
				System.out.println("data removed");
			}else {
				System.out.println("data not removed");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void findMobileById() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_mobiledb?user=root&password=root");
			
			Statement st = conn.createStatement();
			
			boolean result = st.execute("SELECT * FROM MOBILE where mobileId=101");
			
			if(result) {
				System.out.println("yes it is there");
			}else {
				System.out.println("error occured");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void findAllMobiles() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_mobiledb?user=root&password=root");
			
			Statement st = conn.createStatement();
			
			ResultSet rs = st.executeQuery("SELECT * FROM MOBILE");
			
			System.out.println("mobileId\tModelName\tBrand\tColor\tPrice");
			while(rs.next()) {
				
				System.out.print(rs.getInt(1)+"\t\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getString(4)+"\t");
				System.out.println(rs.getInt(5)+"\t\t");
				
				System.out.println();
				
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
