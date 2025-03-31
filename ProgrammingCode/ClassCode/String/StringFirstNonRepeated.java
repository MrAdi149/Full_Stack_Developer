/*Find the First Non-Repeated Character*
   - *Problem:* Write a Java program to find the first non-repeated character in a string using the toCharArray() method.
   - *Example Input:* "swiss"
   - *Example Output:* 'w'*/

import java.util.Scanner;

class StringFirstNonRepeated {
	
	public static void firstNonRepeated(char[] c){
		
		int index = 0;
		char[] result = new char[c.length];
		for(int i = 0; i<c.length; i++){
			int count = 0;
			for(int j = 0; j<c.length; j++){
				if(i!=j &&c[i] == c[j]){
					count = 1;
					break;
				}
			}
			if(count == 0){
				result[index++] = c[i];
			}
		}
		
		System.out.println(result[0]);
	}
	
				
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		char[] c = str.toCharArray();
		
		firstNonRepeated(c);
		
	}
}