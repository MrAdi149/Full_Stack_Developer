package com.jsp.spring.layers;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.spring.layers.controller.ProductController;
import com.jsp.spring.layers.service.ProductService;

public class App {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		ProductController pc = ac.getBean(ProductController.class);
		 Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n===== Product Management System =====");
            System.out.println("saveProduct - Add Product");
            System.out.println("findAllProducts - View All Products");
            System.out.println("findProductById - Find Product by ID");
            System.out.println("updateProductPriceById - Update Product Price");
            System.out.println("deleteProductById - Delete Product");
            System.out.println("exit - Exit");
            System.out.print("Enter your choice (method name): ");
            
            String choice = scanner.next();
            
            switch (choice) {
                case "saveProduct":
                    pc.saveProduct();
                    break;
                case "findAllProducts":
                    pc.findAllProducts();
                    break;
                case "findProductById":
                    pc.findProductById();
                    break;
                case "updateProductPriceById":
                    pc.updateProductPriceById();
                    break;
                case "deleteProductById":
                    pc.deleteProductById();
                    break;
                case "exit":
                    System.out.println("Exiting... Thank you!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid method name! Please try again.");
            }
        }
	}

}
