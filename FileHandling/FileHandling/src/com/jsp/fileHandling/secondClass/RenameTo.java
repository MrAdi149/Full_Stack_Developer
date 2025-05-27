package com.jsp.fileHandling.secondClass;

import java.io.File;

public class RenameTo {
	
	public static void main(String[] args) {
		
		File f1 = new File("C:\\Users\\KIIT\\Desktop\\adi\\Full_Stack_Developer\\FileHandling\\FileHandling\\0");
		
		File f2 = new File("Demo");
		
		System.out.println(f1.renameTo(f2));
		
	}

}
