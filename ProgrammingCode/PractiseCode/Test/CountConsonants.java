//Count of consonants

import java.util.Scanner;

public class CountConsonants{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		char[] vowels = {'a','e','i','o','u',' '};
		
		char[] ch = str.toCharArray();
		
		int count = 0;
		
		for(int i = 0; i<ch.length; i++){
			for(int j = 0; j<vowels.length; j++){
				if(ch[i] == vowels[j]){
					count++;
				}
			}
		}
		
		int consonants = ch.length - count;
		
		System.out.println(consonants);
	}
}