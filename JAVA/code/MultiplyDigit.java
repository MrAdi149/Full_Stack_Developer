import java.util.Scanner;
class MultiplyDigit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		int multiply = 1;
		while(n!=0){
			int lastDigit = n % 10;
			multiply = multiply * lastDigit;
			n = n / 10;
		}
		System.out.println("Multiplication of digit is: " + multiply);
	}
}