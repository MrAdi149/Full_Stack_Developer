package com.jsp.fileHandling.firstClass;

import java.io.File;

public class CheckFile {
	
	
	public static void main(String[] args) {
		
		File f1 = new File("C:\\Users\\KIIT\\Desktop\\adi\\Full_Stack_Developer\\FileHandling\\FileHandling\\src\\com\\jsp\\fileHandling\\firstClass\\CreateFile.java");
		System.out.println(f1.exists());
		
	}
}