//Convert string into chararry  without charAt()

import java.util.Scanner;

public class StringToCharArray {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		char[] ch = str.toCharArray();
		
		for(char s : ch){
			System.out.print(s + " ");
		}		
	}
}