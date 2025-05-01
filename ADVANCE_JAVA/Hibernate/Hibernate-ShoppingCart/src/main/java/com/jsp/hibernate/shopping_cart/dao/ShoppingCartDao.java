package com.jsp.hibernate.shopping_cart.dao;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.hibernate.shopping_cart.entity.Cart;
import com.jsp.hibernate.shopping_cart.entity.Product;
import com.jsp.hibernate.shopping_cart.entity.User;

public class ShoppingCartDao {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql-config");
	Scanner sc = new Scanner(System.in);
	
	public void addProduct() {
		
		Product product = new Product();
		
		System.out.println("Enter the product title: ");
		String title = sc.nextLine();
		product.setTitle(title);
		
		System.out.println("Enter the product brand: ");
		String brand = sc.nextLine();
		product.setBrand(brand);
		
		System.out.println("Enter the price: ");
		int price = sc.nextInt();
		product.setPrice(price);
		
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		em.persist(product);
		
		et.commit();
		em.close();
		
	}
	
	public void addUserWithCart() {
		
		User user = new User();
		
		System.out.println("Enter the user name: ");
		String name = sc.nextLine();
		user.setUserName(name);
		
		System.out.println("Enter the user email: ");
		String email = sc.nextLine();
		user.setEmail(email);
		
		System.out.println("Enter the user city: ");
		String city = sc.nextLine();
		user.setCity(city);
		
		Cart cart = new Cart();
		
		user.setCart(cart);
		
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		em.persist(user);
		em.persist(cart);
		
		et.commit();
		em.close();
		
	}
	
	
	public void addProductsToUserCart() {
		EntityManager em = emf.createEntityManager();
		
		System.out.println("Enter the user id to add the product in his cart: ");
		int userId = sc.nextInt();
		User user = em.find(User.class,userId);
		
		if(user!=null) {
			Cart cart = user.getCart();
			List<Product> plist = cart.getProducts();
			System.out.println("All the available products: ");
			List<Product> products = em.createQuery("from Product").getResultList();
			
			for(Product product: products) {
				System.out.println(product);
			}
			
			System.out.println("Enter the product id separated with comma: ");
			String ids = sc.next();
			String[] stringIds = ids.split(",");
			
			EntityTransaction et = em.getTransaction();
			et.begin();
			
			for(String id : stringIds) {
				int productId = Integer.parseInt(id);
				Product product = em.find(Product.class, productId);
				plist.add(product);
			}
			
			em.merge(cart);
			et.commit();
			em.close();
			System.out.println("Product added successfully");
		}else {
			System.out.println("User not found!!");
		}
		
	}

}
