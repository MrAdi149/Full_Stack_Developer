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
			int character;
            while ((character = fr.read()) != -1) {
                System.out.print((char) character);
            }
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
