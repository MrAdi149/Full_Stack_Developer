package com.jsp.core_java.inheritance;

import java.util.Scanner;

public class A {
	
	void f() {
		System.out.println("hello a");
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		int i = Integer.parseInt(str);
		System.out.println(i);
		
		Integer a = Integer.valueOf(10);       // int parameter
		Integer b = Integer.valueOf("100");
		
		System.out.println(a+" "+b);
		
		
		
	}

}
