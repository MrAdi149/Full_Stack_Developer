//wajp to find the given number is amstrong or not
import java.util.Scanner;

class Amstrong{
	
	int cube(int n){
		int mul = n * n * n;
		
		return mul;
	}
	
	public static void main(String[] args){
		
		Amstrong a = new Amstrong();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number: ");
		int n = sc.nextInt();
		int sum = 0;
		int temp = n;
		
		while(n!=0){
			int lastDigit = n % 10;
			sum = sum + a.cube(lastDigit);
			n = n / 10;
		}
		
		if(sum == temp){
			System.out.println("it is a amstrong number");
		}else{
			System.out.println("not a  amstrong number");
		}
	}
}
			