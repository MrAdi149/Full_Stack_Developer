/* Convert a String to Title Case*
   - *Problem:* Write a Java program to convert a string to title case (capitalize the first letter of each word) using the toCharArray() method.
   - *Example Input:* "hello world"
   - *Example Output:* "Hello World"
*/

import java.util.Scanner;

public class StringToTitleCase {
	
	public static void stringToTitleCase(char[] ch) {
        if (ch.length > 0 && ch[0] >= 'A' && ch[0] <= 'Z') {
            ch[0] = (char) (ch[0] + 32); 
        }

        for (int i = 1; i < ch.length; i++) {
            if (ch[i - 1] == ' ' && ch[i] >= 'A' && ch[i] <= 'Z') {
                ch[i] = (char) (ch[i] + 32); 
            }
        }

        System.out.println(ch);
    }
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int space;
		
		char[] ch = str.toCharArray();	
		stringToTitleCase(ch);
	}
}