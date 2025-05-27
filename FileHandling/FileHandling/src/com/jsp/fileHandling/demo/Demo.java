package com.jsp.fileHandling.demo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo {
	
	public static void main(char[] args) {
		
	}
	
	public static void main(String[] args) {
//		System.out.println(char[] null);
//		int a;
//		System.out.println(a = 4);
//		String str;
//		System.out.println(str = null);
//		char[] ch;
//		System.out.println(ch = null);
		
		
		File f1 = new File("adi.txt");
		String data = "adi";
		
		try {
			FileWriter fw1 = new FileWriter(f1);
			fw1.write(data);
			fw1.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}
