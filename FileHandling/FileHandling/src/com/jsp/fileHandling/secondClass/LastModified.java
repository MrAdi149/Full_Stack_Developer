package com.jsp.fileHandling.secondClass;

import java.io.File;
import java.util.Date;

public class LastModified {
	
	public static void main(String[] args) {
		
		
		
		File f1 = new File("C:\\Users\\KIIT\\Desktop\\adi\\Full_Stack_Developer\\FileHandling\\FileHandling\\Sample\\demo.java");
		
		long date = f1.lastModified();
		
		System.out.println(date);
		
		Date d = new Date(date);
		
		System.out.println(d);
		
		String str = "A B C";
		
		System.out.println(str.hashCode());
	}

}
