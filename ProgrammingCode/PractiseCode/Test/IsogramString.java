import java.util.Scanner;

public class IsogramString {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		checkFrequency(str);
		if(isogram(str)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
	
	public static int[] checkFrequency(String str){
		
		int[] freq = new int[26];
		
		for(int i = 0; i<str.length(); i++){
			char ch = str.charAt(i);
			
			if(ch>='A' && ch<='Z'){
				freq[ch-'A']++;
			}
			
			if(ch>='a' && ch<='z'){
				freq[ch-'a']++;
			}
			
		}
		
		return freq;
	}
	
	public static boolean isogram(String str){
		
		int[] freq = checkFrequency(str);
		
		for(int i = 0; i<freq.length; i++){
			if(freq[i]>1){
				return false;
			}
		}
		
		return true;
	}
}