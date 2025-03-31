//String into int

import java.util.Scanner;

public class StringToInt {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		char[] ch = str.toCharArray();
		
		int result = 0;
		
		for(char c : ch){
			result = result * 10 + (c - 48);
		}
		
		System.out.println(result);
	}
}