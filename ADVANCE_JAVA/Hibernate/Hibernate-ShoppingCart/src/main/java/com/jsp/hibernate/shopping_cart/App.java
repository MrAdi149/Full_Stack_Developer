package com.jsp.hibernate.shopping_cart;

import com.jsp.hibernate.shopping_cart.dao.ShoppingCartDao;

public class App {
	
	public static void main(String[] args) {
		
		ShoppingCartDao shopping = new ShoppingCartDao();
		shopping.addUserWithCart();
		
	}

}
