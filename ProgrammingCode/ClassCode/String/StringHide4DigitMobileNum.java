//9122890584
//14890584

import java.util.Scanner;

class StringHide4DigitMobileNum {
	
	public static void stringAdd(char[] ch){
		
		for(int i = 0; i<ch.length/2-1; i++){
			System.out.print("*" + " ");
		}
		System.out.print(" ");
		for(int i = ch.length/2-1; i<ch.length; i++){
			System.out.print(ch[i] + " ");
		}
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		char[] ch = str.toCharArray();
		
		String s = "****";
		
		for(int i = 4; i<str.length(); i++){
			s = s + str.charAt(i);
			break;
		}
		
		System.out.println(s);
		
		stringAdd(ch);
	}
}