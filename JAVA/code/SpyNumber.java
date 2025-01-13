//wajp to find the number is spy or not
//spy number is if the sum of digit and product of digit is equal in the given number then such number are called spy number
// 22 = 2 * 2 = 2 + 2
// 123 = 1*2*3=1+2+3
import java.util.Scanner;
class SpyNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		int sum = 0;
		int multiply = 1;
		while(n!=0){
			int lastDigit = n % 10;
			sum = sum + lastDigit;
			multiply = multiply * lastDigit;
			n = n / 10;
		}
		if(sum == multiply){
				System.out.println("Spy number");
		}else{
				System.out.println("Not spy number");
		}
	}
}