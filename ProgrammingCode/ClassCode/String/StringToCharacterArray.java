//convert given string to character array

import java.util.Scanner;

public class StringToCharacterArray {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the String: ");
		String str = sc.next();
		
		char[] ch = new char[str.length()];
		
		System.out.print("String converted to character: ");
		for(int i = 0; i < str.length(); i++){
			ch[i] = CreateCharAtMethod.myCharAt(str,i);
		}
		
		for(int i = 0; i<ch.length; i++){
			System.out.print(ch[i] + " ");
		}
	}
}


