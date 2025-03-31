// Count the num of words in givn string 

import java.util.Scanner;

public class CountWords {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		char[] ch = str.toCharArray();
		
		int count = 0;
		
		for(int i = 0; i<ch.length; i++){
			if((i==0 && ch[i] != ' ') || (ch[i] != ' ' && ch[i-1] == ' ')){
				count++;
			}
		}
		
		System.out.println(count);
	}
}