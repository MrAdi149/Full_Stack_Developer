//wajp to find the largest word in a given string

import java.util.Scanner;

class LargestWord{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		String[] s = str.split("");
		
		String largest = " ";
		for(int i = 0; i<s.length; i++){
			if(s[i].length() > largest.length()){
				largest =  s[i];
			}
		}
		
		System.out.println(largest);
	}
}