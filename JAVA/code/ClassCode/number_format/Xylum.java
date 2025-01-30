//wajp to find the given number is xylum number of pholem or not?
//if the sum of mean number = sum of  extreme number they are called xylum

import java.util.Scanner;

class Xylum {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int firstDigit = n;
		int lastDigit = n%10;
		int sum = 0;
		
		while(firstDigit > 9){
			firstDigit = firstDigit / 10;
		}
		
		while(n!=0){
			int digit = n % 10;
			sum = sum + digit;
			n = n / 10;
		}
		int midSum = sum - firstDigit - lastDigit;
		int add = firstDigit + lastDigit;
		
		if(add == midSum){
			System.out.println("Xylum");
		}else{
			System.out.println("not xylum");
		}
		
		
	}
}