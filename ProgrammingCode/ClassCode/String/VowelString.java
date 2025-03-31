import java.util.Scanner;

public class VowelString {
	
	public static boolean isVowel(char c){
	return c == 'a' || c == 'e' || c=='i' || c == 'o' || c == 'u' || c == 'A' || c=='E' || c=='I'||c=='O'||c=='U';
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		String vowel = sc.next();
		
		char[] ch = vowel.toCharArray();
		
		for(char c: ch){
			if(isVowel(c)){
				count++;
			}
		}
		
		System.out.println(count);
	}
}