import java.util.Scanner;

class SmallestLargestSubstring {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
				
		int sub = sc.nextInt();
		
		smallestLargestSubstring(str,sub);
	}
	
	public static void smallestLargestSubstring(String str, int sub){

		char[] ch = new char[str.length()];
		for(int i = 0; i<str.length(); i++){
			ch[i] = str.charAt(i);
		}
		
		for(int i = 0; i<ch.length-sub; i++){
			
			char[] subString = new char[sub];
			
			for(int j = 0; j<sub; j++){
				subString[j] = ch[i+j];
			}
			
			for(int j = 0; j<subString.length; j++){
				System.out.print(subString[j] + " ");
			}
			System.out.println();
		}
		
		
	}
	
}