import java.util.Scanner;

class octToDec  {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		octToDec o = new octToDec();
		
		int sum = 0;
		int count = 0;
		
		while(n!=0){
			int digit = n % 10;
			
			digit = digit * o.power(8,count);
			count++;
			sum = sum + digit;
			n = n / 10;
		}
		
		System.out.println(sum);
	}
	
	int power(int m,int n){
		int mul = 1;
		
		for(int i = 1; i<=n; i++){
			mul = mul * m;
		}
		return mul;
	}
}