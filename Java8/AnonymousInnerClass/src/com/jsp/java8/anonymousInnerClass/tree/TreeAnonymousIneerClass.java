package com.jsp.java8.anonymousInnerClass.tree;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeAnonymousIneerClass {

	public static void main(String[] args) {
		
		
		TreeSet<Vehicle> vehicles = new TreeSet<Vehicle>(new Comparator<Vehicle>() {
            @Override
            public int compare(Vehicle v1, Vehicle v2) {
                return v1.brand.compareTo(v2.brand);
            }
        });
		
		
		vehicles.add(new Vehicle("Yamaha","red"));
		vehicles.add(new Vehicle("Tata punch","yellow"));
		vehicles.add(new Vehicle("Ferrari","red"));
		
		for(Vehicle vehicle: vehicles) {
			System.out.println(vehicle);
		}
	}
}
