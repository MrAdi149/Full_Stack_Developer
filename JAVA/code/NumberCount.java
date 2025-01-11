//wajp to print the number from 1 to n by taking n value from user
import java.util.Scanner;
class NumberCount{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Take the input from user: ");
		int n = sc.nextInt();
		
		//wajp to print the number from 1 to n
		System.out.println("---------For Loop---------");
		
		for(int i = 1; i<=n; i++){
			System.out.println(i);
		}
		
		//wajp to print the number from n to 1
		System.out.println("---------While Loop---------");
		int i = n;
		while(i >= 1){
			System.out.println(i);
			i--;
		}
		
		//wajp to print each digit present in the given number
		System.out.println("---------Do While Loop---------");
		do {
			int digit = n%10;
			System.out.println(digit);
			n = n / 10;
		}while(n>0);
		sc.close();
	}
}