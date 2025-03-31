/*Sort Characters in a String*
   - *Problem:* Write a Java program to sort the characters in a string in ascending order using the toCharArray() method.
   - *Example Input:* "java"
   - *Example Output:* "aajv"
   */
   
import java.util.Scanner;

class SortStringCharacter {
	
	public static void sortChar(char[] ch){
		
		for(int i =0; i<ch.length; i++){
			for(int j = 0; j<ch.length; j++){
				
				if(ch[i] > ch[j]){
					char c = ch[j];
					ch[j] = ch[i];
					ch[i] = c;
				}
			}
		}
		
		for(int i = ch.length-1; i>=0; i--){
			System.out.println(ch[i]);
		}
	}
	 
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		char[] ch = str.toCharArray();
		
		sortChar(ch);
	}
}
