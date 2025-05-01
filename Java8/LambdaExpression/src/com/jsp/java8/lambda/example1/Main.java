package com.jsp.java8.lambda.example1;

public class Main {
	
	public static void main(String[] args) {
		Demo demo1 = () -> System.out.println("Hello:2");
		demo1.printHello();
		
		
		Demo demo2 = new Demo() {
			@Override
			public void printHello() {
				System.out.println("Hello: 3");
			}
		};
		
		demo2.printHello();
		
		Demo demo3 = new DemoMain();
		demo3.printHello();
	}

}
