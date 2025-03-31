//wajp to convert a string to integer

import java.util.Scanner;

class StringToInteger {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		char[] ch = str.toCharArray();
		
		int rev = 0;
		
		for(char c1: ch){
			rev = rev * 10 + (c1 - 48);
		}
		
		System.out.println(rev);
	}
}