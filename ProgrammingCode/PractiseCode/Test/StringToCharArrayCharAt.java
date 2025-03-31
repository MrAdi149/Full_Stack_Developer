//Convert string into chararray without toCharArray

import java.util.Scanner;

public class StringToCharArrayCharAt {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		char[] ch = new char[str.length()];
		
		for(int i = 0; i<str.length(); i++){
			ch[i] = str.charAt(i);
		}
		
		for(char c : ch){
			System.out.print(c + " ");
		}
	}
}