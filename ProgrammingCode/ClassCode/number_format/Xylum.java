//wajp to find the given number is xylum number of pholem or not?
//if the sum of mean number = sum of  extreme number they are called xylum

import java.util.Scanner;

class Xylum {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int temp = n;
		int temp1 = n;
		int org = n;
		int sum = 0;
		
		while(temp >= 10){
			temp = temp / 10;
		}

		int lastDigit = n % 10;
		int add = temp + lastDigit;
		System.out.println(n);
		while(n!=0){
			int digit = n % 10;
			sum = sum + digit;
			n = n / 10;
		}
		int midSum = sum - add;
		
		if(add == midSum){
			System.out.println("Xylum");
		}else{
			System.out.println("not xylum");
		}
		
		
	}
}