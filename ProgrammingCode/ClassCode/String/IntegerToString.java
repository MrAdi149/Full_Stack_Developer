//convert a integer to string

import java.util.Scanner;

class IntegerToString {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int val = sc.nextInt();
		String s1 = val + " ";
		System.out.println(s1);
	}
}