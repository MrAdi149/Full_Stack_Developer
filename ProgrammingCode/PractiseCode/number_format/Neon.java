import java.util.Scanner;

class Neon {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int sq = n * n;
		int sum = 0;
		
		while(sq != 0){
			int digit = sq % 10;
			sum = sum + digit;
			sq = sq / 10;
		}
		
		if(sum == n){
			System.out.println("Neon Number");
		}else{
			System.out.println("not Neon number");
		}
	}
}