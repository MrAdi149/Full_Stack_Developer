import java.util.Scanner;

public class FrequencyOfLetter {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
				
		int[] freq = new int[128];
		
		for(int i = 0; i<str.length(); i++){
			char curr = str.charAt(i);
			freq[curr]++;
		}
		
		for(int i = 0; i<freq.length; i++){
			if(freq[i] != 0){
				System.out.println((char)(i) + " ------------ " + freq[i]);
			}
		}
	}
}	