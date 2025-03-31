import java.util.Scanner;

public class LongestSubstring1 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.nextLine();
		
		String[] str = s1.split(" ");
		
		int max = str[0].length();
		
		for(int i = 0; i<str.length; i++){
			if(str[i].length() > max){
				max = str[i].length();
			}
		}
		
		for(int i = 0; i<str.length; i++){
			if(max==str[i].length()){
				System.out.println(str[i]);
			}
		}
		
	}
}