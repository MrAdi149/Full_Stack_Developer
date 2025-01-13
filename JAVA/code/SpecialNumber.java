//wajp to find the given number is special or not

import java.util.Scanner;
class SpecialNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int product = 1;
		int temp=n;
		
		while(n!=0){
			int lastDigit = n%10;
			sum = sum + lastDigit;
			product = product * lastDigit;
			n = n / 10;
		}
		
		int special_number = sum+product;
		
		if(special_number>9 && special_number<100 || special_number<-9 && special_number>-100 || special_number == temp){
				System.out.println("special two number");
		} else {
			System.out.println("not special number");
		}
	}
}