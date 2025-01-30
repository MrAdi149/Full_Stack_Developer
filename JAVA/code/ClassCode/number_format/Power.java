//wajp to find m power n

import java.util.Scanner;

class Power{
	
	int power(int m, int n){
		int mul = 1;
		for(int i = 1; i<=n; i++){
			mul = mul * m; // for 1 mul = 1 * 3, mul = 3, mul = 3 * 3
		}
		return mul;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Power p = new Power();
		int m = sc.nextInt();
		int n = sc.nextInt();

		
		System.out.println(p.power(m,n));
		
	}
}
		