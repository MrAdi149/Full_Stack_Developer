import java.util.Scanner;

class PerfectNum {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number: ");
		int n = sc.nextInt();
		int sum = 0;
		int fact = 1;
		for(int i = 1; i<=n/2; i++){
			if(n%i == 0){
				fact = fact * i;
				sum = sum + fact;
			}
		}

				
		if(n == sum){
			System.out.println("it is a perfect number");
		}else{
			System.out.println("it is not a perfect number");
		}
	}
}