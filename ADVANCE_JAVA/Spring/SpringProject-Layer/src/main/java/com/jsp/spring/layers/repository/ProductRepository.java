package com.jsp.spring.layers.repository;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.spring.layers.entity.Product;
@Component
public class ProductRepository {
	
	@Autowired
	private EntityManagerFactory emf;

	public void saveProduct(Product product) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(product);
		
		et.commit();
		em.close();
		
	}

	public List<Product> findAllProducts() {
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("From Product");
		List<Product> products = query.getResultList();
		em.close();
		return products;
	}

	public Product findProductById(int id) {
		EntityManager em = emf.createEntityManager();
		Product product=em.find(Product.class, id);
		em.close();
		return product;
		
		
	}

	public Product updateProductPriceById(int id, int price) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Product product=em.find(Product.class, id);
		product.setPrice(price);
		em.merge(product);
		et.commit();
		em.close();
		return product;
	}

	public void deleteProductById(int id) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Product product=em.find(Product.class, id);
		em.remove(product);
		et.commit();
		em.close();
		
	}

}
