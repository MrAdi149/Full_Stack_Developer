package com.jsp.java8.lambda.example2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Demo demo1 = (int a, int b) -> System.out.println(a+b);
		
		demo1.add(300, 400);;
		
		Demo demo2 = new Demo() {
			@Override
			public void add(int a, int b) {
				System.out.println(a+b);
			}
		};
		
		demo2.add(200, 100);
		
		Demo demo3 = new DemoMain();
		demo3.add(600, 40);
	}

}
