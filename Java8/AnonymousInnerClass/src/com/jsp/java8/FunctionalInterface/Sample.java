package com.jsp.java8.FunctionalInterface;

@FunctionalInterface
public interface Sample {

	
	void run();
	
	static void execute() {
		System.out.println("Executed");
	}
	
	default void display() {
		System.out.println("display");
	}
}
