import java.util.Scanner;

public class LongestSubstring {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.nextLine();
		
		String[] str = s1.split(" ");
		
		String max = str[0];
		
		for(int i = 0; i<str.length; i++){
			if(str[i].length() > max.length()){
				max = str[i];
			}
		}
		
		System.out.println(max);
	}
}