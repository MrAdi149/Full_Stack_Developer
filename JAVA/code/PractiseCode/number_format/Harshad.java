import java.util.Scanner;

class Harshad {
	
	int reverse(int n){
		int rev = 0;
		while(n!=0){
			int digit = n % 10;
			rev = rev * 10 + digit;
			n = n / 10;
		}
		return rev;
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		Harshad h = new Harshad();
		
		int n = sc.nextInt();
		int rev = 0;
		int sum = 0;
		int org = n;
		
		
		while(n!=0){
			int digit = n % 10;
			sum = sum + digit;
			n = n / 10;
		}
		
		int temp = sum;
		
		while(sum != 0){
			int digit = sum % 10;
			rev = rev * 10 + digit;
			sum = sum / 10;
		}
		
		if(temp * rev == org){
			System.out.println("Harshad number");
		}else{
			System.out.println("not harshad number");
		}
	}
}