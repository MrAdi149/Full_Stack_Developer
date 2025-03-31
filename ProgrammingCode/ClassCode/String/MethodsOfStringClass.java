//methods in string class

//equals methods- equals method in string class is overriden for data and content comparison

//trim method - this method is used to remove the spaces in the beginning and the end of the string not in 
//between from the string

//concat method- it is used to join the string at the end

//split method- 

import java.util.Scanner;

class MethodsOfStringClass {
	
	public static void main(String[] args){
		
		//equals method
		String s1 = "hemlo";
		String s2 = new String("hemlo");
		
		System.out.println(s1.equals(s2));
		
		//equalsIgnoreCase method
		String s3 = "hemlo";
		String s4 = new String("Hemlo");
		
		System.out.println(s3.equalsIgnoreCase(s4));
		
		//trim method
		String str = "        tom and jerry             ";
		System.out.println(str);
		
		String s5 = str.trim();
		System.out.println(s5);
		
		//concat method
		String s6 = "hello";
		String s7 = "world";
		s6 = s6.concat(s7);
		
		System.out.println(s6);
		
		//split method
		
		String s9 = "its a lunch time";
		
		String[] s8 = s9.split("");
		
		for(int i = 0; i<s8.length;i++){
			System.out.println(s8[i]);
		}
	}
}