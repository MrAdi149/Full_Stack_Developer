//wajp to check wheather the given number is prime palindrome or not

import java.util.Scanner;

class PrimePalindrome{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int rev = 0;
		int count = 0;
		
		for(int i = 2; i<=n/2; i++){
			if(n%i == 0){
				count++;
				break;
			}
		}
		if(count == 0){
			while(n!=0){
				int lastDigit = n % 10;
				rev = rev * 10 + lastDigit;
				n = n / 10;
			}
			if(rev == temp){
				System.out.println("its prime palindrome");
			}else{
				System.out.println("its palindrome but not prime");
			}
		}else{
			System.out.println("not prime number");
		}
	}
}
		