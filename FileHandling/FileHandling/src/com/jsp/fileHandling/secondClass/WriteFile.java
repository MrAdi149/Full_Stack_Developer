package com.jsp.fileHandling.secondClass;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	
	public static void main(String[] args) {
	
		
		File f1 = new File("C:\\Users\\KIIT\\Desktop\\adi\\Full_Stack_Developer\\FileHandling\\FileHandling\\Sample\\run.txt");
		
		String data = "Aditya Kumar Singh";
		
		FileWriter fw1 = null;
		
		try {
			fw1 = new FileWriter(f1);
			
			fw1.write(data);
			fw1.flush();
			
			System.out.println("Successfully copied!!");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(fw1!=null) {
				try {
					fw1.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
