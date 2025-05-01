package com.jsp.fileHandling.thirdClass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadClass {
	
	public static void main(String[] args) {
		
		
		File file = new File(
				"C:\\Users\\KIIT\\Desktop\\adi\\Full_Stack_Developer\\FileHandling\\FileHandling\\Sample\\run.txt");

		FileReader fr = null;
		
		try {
			fr = new FileReader(file);
			Integer x = fr.read();
			
			while(x != -1) {
				System.out.print((char)x.intValue());
				x = fr.read();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
