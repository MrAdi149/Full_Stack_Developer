/* Check if Two Strings are Anagrams*
   - *Problem:* Write a Java program to check if two strings are anagrams (contain the same characters in a different order) using the toCharArray() method.
   - *Example Input:* "listen", "silent"
   - *Example Output:* true
*/


import java.util.Scanner;

class AnagramString {
	
	public static void sortChar(char[] ch){
		
		char[] result = new char[ch.length];
		
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
			result[i] = ch[i];
		}
	}
	
	public static void anagramString(char[] c1,char[] c2){
		
		
		for(int i = 0; i<c1.length; i++){
			boolean flag = false;
			for(int j = 0; j<c2.length; j++){
				if(c1[i] == c2[j]){
					flag = true;
					break;
				}
			}
			if(flag == true){
				System.out.println("true");
				break;
			}else{
				System.out.println("false");
				break;
			}
		}
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.next();
		
		String str2 = sc.next();
		
		char[] c1 = str1.toCharArray();
		char[] c2 = str2.toCharArray();
		sortChar(c1);
		sortChar(c2);
		System.out.println("-----------------");
		anagramString(c1,c2);
	}
}