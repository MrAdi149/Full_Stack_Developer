//wajp to find the given number is amstrong or not
import java.util.Scanner;

class Amstrong{
	
	int power(int m, int n){
		int mul = 1;
		for(int i = 1; i<=n; i++){
			mul = mul * m;
		}
		
		return mul;
	}
	
	public static void main(String[] args){
		
		Amstrong a = new Amstrong();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number: ");
		int n = sc.nextInt();
		
		int sum = 0;
		int temp = n;
		int org = n;
		int count = 0;
		
		while(n!=0){
			count++;
			n = n / 10;
		}
				
		
		while(temp!=0){
			int lastDigit = temp % 10;
			sum = sum + a.power(lastDigit,count);
			temp = temp / 10;
		}
				
		if(sum == org){
			System.out.println("it is a amstrong number");
		}else{
			System.out.println("not a  amstrong number");
		}
	}
}
			