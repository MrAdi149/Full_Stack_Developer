/* Count the Number of Words in a String*
   - *Problem:* Write a Java program to count the number of words in a string using the toCharArray() method.
   - *Example Input:* "Hello World"
   - *Example Output:* 2
*/

import java.util.Scanner;

class CountWordInString {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		int count = 0;
		
		char[] ch = str.toCharArray();
		
		for(int i = 0; i<ch.length; i++){
			
				if((i == 0 && ch[i] != ' ' ) || (ch[i] != ' ' && ch[i-1] == ' ')){
					count++;
				}
			
		}
		
		System.out.println(count);
	}
}