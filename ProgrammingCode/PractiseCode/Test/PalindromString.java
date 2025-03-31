// String is palindrome r not

import java.util.Scanner;

public class PalindromString {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		char[] ch = str.toCharArray();
		
		char[] reverse = new char[ch.length];
		
		for(int i = 0; i<ch.length; i++){
			reverse[i] = ch[ch.length - 1 - i];
		}
		
		boolean flag = true;
		
		for(int i = 0; i<ch.length; i++){
			if(ch[i] != reverse[i]){
				flag = false;
				break;
			}
		}
		
		if(flag == true){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
	}
}