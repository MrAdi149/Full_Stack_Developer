import java.util.Scanner;

//find the smallest number in the digit
class SmallDigit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int small = n % 10;
		while(n!=0){
			int digit = n % 10;
			if(digit<small){
				small = digit;
			}
			n = n / 10;
		}
		System.out.println("smallest number in the digit is: " + small);
	}
}
		