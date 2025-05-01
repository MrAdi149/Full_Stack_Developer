package com.jsp.java8.anonymousInnerClass;

import com.jsp.java8.anonymousInterface.Calculator;

public class CalcultorMain {
	
	public static void main(String[] args) {
		
		Calculator calculator = new Calculator() {

			@Override
			public void add(int a, int b) {
				System.out.println(a+b);
				
			}

			@Override
			public void subtract(int a, int b) {
				System.out.println(a-b);
				
			}

			@Override
			public void multiply(int a, int b) {
				System.out.println(a*b);
				
			}

			@Override
			public void divide(int a, int b) {
				System.out.println(a/b);
				
			}
			
		};
		
		
		calculator.add(40,30);
		calculator.subtract(50, 10);
		calculator.multiply(4, 9);
		calculator.divide(50, 10);
	}

}
