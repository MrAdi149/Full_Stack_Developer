//wajp to swap first and last character from the word
//ex: tom and jerry
//ans: mot dna yerrj

import java.util.Scanner;

class SwapCharacterFirstAndLast {
	
	public static void swapCharacter(char[] ch) {
        int start = 0;
		
		System.out.println(ch.length);

        for(int i = 0; i<=ch.length; i++){
			if(i == ch.length || ch[i] == ' '){
				if(start != i-1){
					char temp = ch[start];
					ch[start] = ch[i-1];
					ch[i-1] = temp;
				}
				start = i+1;
			}
		}
		
		for(int i = 0; i<ch.length; i++){
			System.out.print(ch[i]);
		}
    }
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		char[] ch = str.toCharArray();
		
		swapCharacter(ch);
	}
}