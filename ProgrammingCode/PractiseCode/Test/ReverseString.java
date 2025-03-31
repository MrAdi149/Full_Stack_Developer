//To reverse string

import java.util.Scanner;

class ReverseString {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		char[] ch = str.toCharArray();
		
		char[] result = new char[ch.length];
		
		for(int i = 0; i<ch.length; i++){
			result[i] = ch[ch.length - 1 - i];
		}
		
		for(int i = 0; i<ch.length; i++){
			System.out.println(result[i]);
		}
	}
}