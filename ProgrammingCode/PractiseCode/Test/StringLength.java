//Find the length of string without using inbuilt method length

import java.util.Scanner;

public class StringLength {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		char[] ch = str.toCharArray();
		
		int count = 0;
		
		for(char s : ch){
			count++;
		}
		
		System.out.println(count);
	}
}