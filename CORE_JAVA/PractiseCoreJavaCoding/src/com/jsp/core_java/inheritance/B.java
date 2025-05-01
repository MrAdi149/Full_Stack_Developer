package com.jsp.core_java.inheritance;

public class B {
	
	static int a = 10;
	  int b = 20;
	  {
	    a = 30;
	    b = 40;
	  }
	  static { a = 50; }
	  
	  B(){
		  a = 60; b = 70;
	  }
	
	public static void main(String[] args) {
		System.out.println(new B().b);
		Integer a = Integer.valueOf(10); 
	}
}
