// Mobile num in string format n display last digits only remaining any padded char

import java.util.Scanner;

class MobileString {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		char[] ch = str.toCharArray();
		
		for(int i = 0; i<str.length()-4; i++){
			ch[i] = '*' ;
		}
		
		for(int i = 0; i<ch.length; i++){
			System.out.print(ch[i]);
		}
	}
}