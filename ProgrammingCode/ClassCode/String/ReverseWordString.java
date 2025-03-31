//wajp to reverse the word in strings

import java.util.Scanner;

public class ReverseWordString {
	
	public static void reverseWordString(String str){
		String result = "";
		
		char[] ch = str.toCharArray();
				
		for(int i = ch.length - 1; i>= 0; i--){
			int n = i;
			while(i >= 0 && ch[i] != ' '){
				i--;
			}
			int f = i+1;
			while(f<n){
				result = result+ch[f];
				f++;
			}
			result = result + " ";
		}
		
		System.out.println(result);
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		reverseWordString(str);
		
	}
	
}