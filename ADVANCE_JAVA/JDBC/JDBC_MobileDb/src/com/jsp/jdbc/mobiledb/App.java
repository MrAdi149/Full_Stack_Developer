package com.jsp.jdbc.mobiledb;

import com.jsp.jdbc.mobiledb.dao.MobileDao;

public class App {

	public static void main(String[] args) {
		
		MobileDao dao = new MobileDao();
//		dao.addMobile();
		
		
		dao.findAllMobiles();
		
		
		

	}

}
