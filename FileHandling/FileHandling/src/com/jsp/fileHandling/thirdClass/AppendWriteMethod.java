package com.jsp.fileHandling.thirdClass;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppendWriteMethod {

	public static void main(String[] args) {

		File file = new File(
				"C:\\Users\\KIIT\\Desktop\\adi\\Full_Stack_Developer\\FileHandling\\FileHandling\\Sample\\run.txt");

		float data = 12.5f;

		FileWriter fw = null;

		try {
			fw = new FileWriter(file, true);
			fw.write(String.valueOf(data));
			fw.flush();
			System.out.println("Data Stored!!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
