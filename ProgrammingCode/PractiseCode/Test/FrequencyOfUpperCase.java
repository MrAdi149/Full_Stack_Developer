import java.util.Scanner;

public class FrequencyOfUpperCase {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		int[] freq = new int[26];
		
		for(int i = 0; i<str.length(); i++){
			char curr = str.charAt(i);
			if(curr >= 'A' && curr<= 'Z'){
				freq[curr - 'A']++;
			}
		}
		
		for(int i = 0; i<freq.length; i++){
			if(freq[i] != 0){
				System.out.println((char)(i + 'A') + "-------" + freq[i]);
			}
		}
	}
}