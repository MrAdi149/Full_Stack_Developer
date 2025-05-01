package com.jsp.fileHandling.firstClass;

import java.io.File;

public class DeleteFile {
	
	
	public static void main(String[] args) {
		
		
		File f1 = new File("C:\\Users\\KIIT\\Desktop\\adi\\Full_Stack_Developer\\FileHandling\\FileHandling\\Sample\\sample.txt");
		
		
		System.out.println(f1.delete());
	}
}