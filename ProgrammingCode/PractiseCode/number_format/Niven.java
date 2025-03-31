import java.util.Scanner;

class Niven {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int sum = 0;
		int temp = n;
		while(n!=0){
			int digit = n % 10;
			sum = sum + digit;
			n = n / 10;
		}
		
		if(sum % 9 == 0 && temp % 9 == 0){
			System.out.println("Niven number");
		}else{
			System.out.println("not Niven number");
		}
	}
}
		