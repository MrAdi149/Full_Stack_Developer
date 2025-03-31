//wajp to create your own charAt method

import java.util.Scanner;

public class CreateCharAtMethod {
	
	public static char myCharAt(String str,int value){
				
		char[] ch1 = str.toCharArray();
		
		for(int i = 0; i<ch1.length; i++){
			
			if(value>=0 && value<ch1.length){
				return ch1[value];
			}
		}
		return '0';
	}	
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		System.out.println(myCharAt(str,3));
		
	}
}