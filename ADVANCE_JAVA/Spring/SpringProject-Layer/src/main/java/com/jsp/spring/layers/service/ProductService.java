package com.jsp.spring.layers.service;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.spring.layers.entity.Product;
import com.jsp.spring.layers.repository.ProductRepository;

@Component
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	Scanner scan = new Scanner(System.in);

	public void saveProduct() {
		Product product = new Product();
		System.out.println("enter title");
		product.setTitle(scan.next());
		System.out.println("enter brand");
		product.setBrand(scan.next());
		System.out.println("enter price");
		product.setPrice(scan.nextInt());

		productRepository.saveProduct(product);

		System.out.println("Product Object created succesfully");

	}

	public void findAllProducts() {
		List<Product> products = productRepository.findAllProducts();

		if (products == null) {
			System.out.println("No Product found");
		} else {
			for (Product product : products) {
				System.out.println(product);
			}
		}

	}

	public void findProductById() {
		System.out.println("enter the product id");
		int id = scan.nextInt();

		Product product = productRepository.findProductById(id);

		if (product != null) {
			System.out.println(product);
		} else {
			System.out.println("product not found");
		}
	}

	public void updateProductPriceById() {
		System.out.println("enter the product id");
		int id = scan.nextInt();
		Product product = productRepository.findProductById(id);

		if (product != null) {
			System.out.println(product);
			System.out.println("enetr the price");
			int price = scan.nextInt();

			Product product1 = productRepository.updateProductPriceById(id, price);

			if (product1 != null) {
				System.out.println(product1);
			}
		} else {
			System.out.println("product not found");
		}

		
	}

	public void deleteProductById() {
		System.out.println("enter the product id");
		int id = scan.nextInt();

		Product product = productRepository.findProductById(id);

		if (product != null) {
			productRepository.deleteProductById(id);
			System.out.println("product deleted succesfully");
		} else {
			System.out.println("product not found");
		}
		
	}

}
