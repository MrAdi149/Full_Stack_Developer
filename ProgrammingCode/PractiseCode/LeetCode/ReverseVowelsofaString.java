import java.util.Scanner;

public class ReverseVowelsofaString {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		String result = reverse(str);
		
		System.out.println("String with reversed vowels:");
		System.out.println(result);
	}
	
	public static boolean vowel(char ch){
		return (ch=='A' || ch =='E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e'
				|| ch == 'i' || ch == 'o' || ch =='u');
	}
	
	public static String reverse(String str){
		
		char[] ch = str.toCharArray();
		
		int start = 0;
		int end = ch.length - 1;
		
		while(start < end){
			
			while(start < end && !vowel(ch[start])){
				start++;
			}
			
			while(start < end && !vowel(ch[end])){
				end--;
			}
			
			if(start < end){
				char temp = ch[start];
				ch[start] = ch[end];
				ch[end] = temp;
				
				start++;
				end--;
			}
		}
		
		return new String(ch);
	}
}