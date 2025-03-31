import java.util.Scanner;

class TwistedPrime {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int cnt = 0;
		int rev = 0;
		int count = 0;
		
		for(int i = 2; i<=n/2; i++){
			if(n%i == 0){
				count++;
			}
		}
		
		while(n!=0){
			int digit = n % 10;
			rev = rev*10+digit;
			n = n / 10;
		}
		
		for(int i = 2; i<=rev/2; i++){
			if(rev%i==0){
				cnt++;
			}
		}
		
		if(count == 0 && cnt == 0){
			System.out.println("prime number");
		}else{
			System.out.println("not prime");
		}
	}
}