//Count of owels in string

import java.util.Scanner;

public class CountVowels{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		char[] vowels = {'a','e','i','o','u'};
		
		char[] ch = str.toCharArray();
		
		int count = 0;
		
		for(int i = 0; i<ch.length; i++){
			for(int j = 0; j<vowels.length; j++){
				if(ch[i] == vowels[j]){
					count++;
				}
			}
		}
		
		System.out.println(count);
	}
}