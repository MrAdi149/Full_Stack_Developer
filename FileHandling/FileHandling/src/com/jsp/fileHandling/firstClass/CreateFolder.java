package com.jsp.fileHandling.firstClass;

import java.io.File;

public class CreateFolder {
	
	
	public static void main(String[] args) {
		
		File f1 = new File("Sample");
		System.out.println(f1.mkdir());
		
		File f2 = new File("C:\\Users\\KIIT\\Desktop\\adi\\Full_Stack_Developer\\MultiThreading\\FileHandling\\src\\Demo");
		System.out.println(f2.mkdir());
				
		
	}
	

}
