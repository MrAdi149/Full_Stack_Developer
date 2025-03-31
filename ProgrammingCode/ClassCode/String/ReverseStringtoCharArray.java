import java.util.Scanner;

class ReverseStringtoCharArray {
	
	public static void reverse(char[] c, int values){
		
		for(int i = values-1; i>=0; i--){
			System.out.println(c[i]);
		}
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String reverse = sc.next();
		int values = reverse.length();
		
		char[] ch = reverse.toCharArray();
		
		reverse(ch,values);
	}
}