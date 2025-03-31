//wajp to convert binary to decimal.

import java.util.Scanner;

class BinToDec {
	
	int power(int m, int n){
		int mul = 1;
		for(int i = 1; i<=n; i++){
			mul = mul * m;
		}
		return mul;
	}
	
	public static void main(String[] args){
		BinToDec b = new BinToDec();
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		
		int count = 0;
		int sum = 0;
		
		
		while(n != 0){
			int digit = n % 10;
			
			digit = digit * b.power(2,count);
			count++;
			sum = sum + digit;
			n = n / 10;
		}
		
		System.out.println(sum);
	}
}