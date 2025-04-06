package com.jsp.jdbc.properties;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class JDBC_Properties {
	
	public static void main(String[] args) {
		
		
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			FileReader fr = new FileReader("DBConfig.properties");
			Properties p = new Properties();
			p.load(fr);
			
			String url = p.getProperty("url");
			
			conn = DriverManager.getConnection(url,p);
			
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM mobile");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
				System.out.println(rs.getInt(5));
			}
			
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
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
