package com.jsp.spring.layers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.spring.layers.service.ProductService;

@Component
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	public void saveProduct() {
		productService.saveProduct();
	}
	
	public void findAllProducts() {
		productService.findAllProducts();
	}

	public void findProductById() {
		productService.findProductById();
	}

	public void updateProductPriceById() {
		productService.updateProductPriceById();
	}

	public void deleteProductById() {
		productService.deleteProductById();
	}

}
