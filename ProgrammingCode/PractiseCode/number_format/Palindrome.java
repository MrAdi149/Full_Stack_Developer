import java.util.Scanner;

class Palindrome{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		
		int rev = 0;
		int temp = n;
		
		while(n!=0){
			int lastDigit = n % 10;
			rev = rev * 10 + lastDigit;
			n = n / 10;
		}
		
		if(rev == temp){
			System.out.println("its palindrome");
		}else{
			System.out.println("not palindrome");
		}
	}
}