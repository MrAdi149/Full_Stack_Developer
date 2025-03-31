import java.util.Scanner;

class Tech{
	
	int order(int n){
		
		int mul = 10;
		for(int i = 1; i<n; i++){
			mul = mul * 10;
		}
		
		return mul;
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int count = 0;
		int temp = n;
		int sq = 0;
		int temp1 = n;
		int temp2 = n;
		
		Tech t = new Tech();
		
		while(n!=0){
			count++;
			n = n / 10;
		}
		
		//int lastDigit = temp2 % t.order(count/2);
		//int firstDigit = temp2 / t.order(count/2);
		
		int mul = 1;
		for(int i = 1; i<=count/2; i++){
			mul = mul * 10;
		}
		
		int lastDigit = temp2 % mul;
		int firstDigit = temp2 / mul;
			
		sq = firstDigit + lastDigit;
		
		
		if (sq * sq == temp1){
			System.out.println("Tech number");
		}else{
			System.out.println("not tech");
		}
	}
}
		
		