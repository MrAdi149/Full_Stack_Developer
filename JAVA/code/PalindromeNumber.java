//wajp to check the given number is palindrom or not.

import java.util.Scanner;

class PalindromeNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rev = 0;
		int temp = n;
		while(n!=0){
			int lastDigit = n % 10;
			rev = rev * 10 + lastDigit;
			n = n / 10;
		}
		
		if(rev == temp){
			System.out.println("the given number is palindrome");
		}else{
			System.out.println("not a palindrome");
		}
	}
}