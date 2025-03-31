import java.util.Scanner;

public class PalindromStringtoCharArray {
    
    public static boolean palindrome(char[] ch){
        char[] reverse = new char[ch.length];
		
        for(int i = 0; i < ch.length; i++){
            reverse[i] = ch[ch.length - 1 - i];
        }

        for(int i = 0; i < ch.length; i++){
            if(ch[i] != reverse[i]){
                return false;
            }
        }
        return true;
    }
	
	public static void reverseString(char[] s) {
		
		char[] result = new char[s.length];
		
        for(int i = 0; i<s.length; i++){
            result[i] = s[s.length - i - 1];
        }
		
		for(int i = 0; i<s.length; i++){
			System.out.println(result[i]);
		}
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();
        char[] ch = input.toCharArray();
        
        boolean result = palindrome(ch);
        System.out.println(result);
		
		reverseString(ch);
    }
}
