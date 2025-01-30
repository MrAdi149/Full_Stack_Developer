import java.util.Scanner;

class StrongNum{
	
	int factorial(int n){
		int fact = 1;
		for(int i = 1; i<=n; i++){
			fact = i * fact;
		}
		return fact;
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StrongNum sn = new StrongNum();
		
		int sum = 0;
		int temp = n;
		while(n!=0){
			int lastDigit = n % 10;
			
			int fact = 1;
			for(int i = 1; i<=lastDigit; i++){
				fact = i * fact;
			}
			sum = sum + fact;
			n = n / 10;
		}
		System.out.println(sum);
		if(temp == sum){
			System.out.println("strong num");
		}else{
			System.out.println("not strong");
		}			
	}
}
