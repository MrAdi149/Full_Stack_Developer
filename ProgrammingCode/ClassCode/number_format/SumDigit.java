//wajp to find the sum of digit in the given number
import java.util.Scanner;
class SumDigit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int n = sc.nextInt();
		int sum = 0;
		while(n!=0){
			int lastDigit = n%10;
			sum = sum + lastDigit;
			n = n / 10;
		}
		System.out.println("the sum of digit is: " + sum);
	}
}