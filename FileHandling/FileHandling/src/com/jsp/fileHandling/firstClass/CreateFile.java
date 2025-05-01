package com.jsp.fileHandling.firstClass;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	
	public static void main(String[] args) {
		
		File f1 = new File("C:\\Users\\KIIT\\Desktop\\adi\\Full_Stack_Developer\\FileHandling\\FileHandling\\Sample\\sample.txt");
		
		try {
			System.out.println(f1.createNewFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File f2 = new File("C:\\Users\\KIIT\\Desktop\\adi\\Full_Stack_Developer\\FileHandling\\FileHandling\\src\\Demo\\demo.java");
		
		try {
			System.out.println(f2.createNewFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File f3 = new File("C:\\Users\\KIIT\\Desktop\\adi\\Full_Stack_Developer\\FileHandling\\FileHandling\\src\\Demo\\demo.png");
		
		try {
			System.out.println(f3.createNewFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File f4 = new File("C:\\Users\\KIIT\\Desktop\\adi\\Full_Stack_Developer\\FileHandling\\FileHandling\\src\\com\\jsp\\fileHandling\\firstClass\\CheckFile.java");
		
		try {
			System.out.println(f4.createNewFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File f5 = new File("C:\\Users\\KIIT\\Desktop\\adi\\Full_Stack_Developer\\FileHandling\\FileHandling\\src\\com\\jsp\\fileHandling\\firstClass\\DeleteFile.java");
		try {
			System.out.println(f5.createNewFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
