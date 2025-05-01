package com.jsp.java8.anonymousInnerClass.tree;

public class Vehicle {

	
	String brand;
	String color;
	
	Vehicle(String brand, String color){
		this.brand = brand;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Vehicle [brand=" + brand + ", color=" + color + "]";
	}
	
	
}
