import java.util.Scanner;

class Disserium {

	int power(int m,int n){
		int mul = 1;
		for(int i = 1; i<=n; i++){
			mul = mul * m;
		}

		return mul;
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		Power p = new Power();
		
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		
		int num = n;
		int org = n;
		int count = 0;
		int sum = 0;
		
		while(num!=0){
			count++;
			num = num / 10;
		}
		
		
		while(n!=0){
			
			int lastDigit = n % 10;
			System.out.println(lastDigit + " -> " + count);
			sum = sum +  p.power(lastDigit,count);
			count--;
			n = n / 10;
		}
		
		if(sum == org){
			System.out.println("disserium number");
		}else{
			System.out.println("not disserium");
		}
		
	}
}