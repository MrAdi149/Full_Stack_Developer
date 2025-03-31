//wajp to compare two string are equal or not without using equal method

import java.util.Scanner;

class CompareTwoStringWithoutEqual {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.next();
		String str2 = sc.next();
		
		char[] c1 = str1.toCharArray();
		char[] c2 = str2.toCharArray();
		
		for(int i = 0; i<c1.length; i++){
			for(int j = 0; j<c2.length; j++){
				if(c1[i] == c2[j]){
					System.out.print("true");
				}
			}
		}
	}
}