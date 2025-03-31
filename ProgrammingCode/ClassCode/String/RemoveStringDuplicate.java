/*Remove Duplicate Characters from a String
Problem: Write a Java program to remove duplicate characters from a string using the toCharArray() method.

Example Input: "aabbcc"

Example Output: "abc" */

import java.util.Scanner;

class RemoveStringDuplicate {
	
	public static void removeDuplicate(char[] ch){
		
		char[] result = new char[ch.length];
		int index = 0;
		
		for(int i = 0; i<ch.length; i++){
			for(int j = 0; j<i; j++){
				if(ch[i] == ch[j]){
					ch[i] = '0';
				}
			}
			if(ch[i] != '0'){
				result[index++] = ch[i];
			}
		}
		
		for(int i = 0; i<index; i++){
			System.out.println(result[i]);
		}
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
				
		char[] ch = name.toCharArray();
		
		removeDuplicate(ch);
	}
}