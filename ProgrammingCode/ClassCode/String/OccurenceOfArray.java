/* Count the Occurrence of a Specific Character
Problem: Write a Java program to count how many times a specific character appears in a string using the 
toCharArray() method.

Example Input: "programming", 'g'

Example Output: 2 */

import java.util.Scanner;

public class OccurenceOfArray {
	
	public static void occurenceOfArray(char[] ch, char s){
		int count = 0;
		
		for(int i = 0; i<ch.length; i++){
			if(ch[i] == s){
				count++;
			}
		}
		
		System.out.println(count);
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String arr = sc.next();
		char s = sc.next().charAt(0);;
        char[] ch = arr.toCharArray();
		
		occurenceOfArray(ch,s);
	}
}
		
		