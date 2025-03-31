//conver string from upper to lower

import java.util.Scanner;

class UpperToLower {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		char[] ch = str.toCharArray();
		
		String res = "";
		
		for(char c : ch){
			res = res + (char)(c+32);
		}
		
		System.out.print(res);
	}
}