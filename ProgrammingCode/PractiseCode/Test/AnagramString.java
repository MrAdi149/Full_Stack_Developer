import java.util.Scanner;

public class AnagramString {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String firstString = scanner.nextLine();

        System.out.println("Enter the second string:");
        String secondString = scanner.nextLine();

        if (areAnagrams(firstString, secondString)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
	}
	
	public static int[] calculateFreq(String str){
		
		int[] freq = new int[26];
		
		for(int i = 0; i<str.length(); i++){
			char curr = str.charAt(i);
			
			if(curr >= 'A' && curr<='Z'){
				freq[curr-'A']++;
			}
			
			if(curr >='a' && curr<='z'){
				freq[curr-'a']++;
			}
		}
		
		return freq;
	}
	
	public static boolean areAnagrams(String s1, String s2){
			
		if(s1.length() != s2.length()){
			return false;
		}
		
		int[] freq1 = calculateFreq(s1);
		int[] freq2 = calculateFreq(s2);
		
		for(int i = 0; i<freq1.length; i++){
			if(freq1[i] != freq2[i]){
				return false;
			}
		}
		
		return true;
	}
}