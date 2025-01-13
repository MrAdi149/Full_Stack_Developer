//wajp to find the largest digit in the number
import java.util.Scanner;
class LargestDigit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int largest = n % 10;
		
		while(n!=0){
			int digit = n % 10;
			if(digit > largest){
				largest = digit;
			}
			n = n / 10;
		}
		
		for(int i = n; n != 0; n = n /10){
			int digit = n % 10;
			if(digit > largest){
				largest = digit;
			}
		}
		System.out.println("the largest number is: " + largest);
	}
}