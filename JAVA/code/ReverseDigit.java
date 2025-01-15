import java.util.Scanner;

//wajp to reverse the digit
class ReverseDigit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the digit: ");
		int n = sc.nextInt();
		int rev= 0;
		while(n!=0){
			int lastDigit = n % 10;
			rev = rev * 10 + lastDigit;
			n = n / 10;
		}
		System.out.println("reverse of the digit is: " + rev);
	}
}