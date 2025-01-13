//wajp to find the given number is prime number or not
import java.util.Scanner;
class PrimeNumber{
	public static void main(String[] args){
		int count = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 2; i<=n/2; i++){
			if(n%i == 0){
				count++;
				break;
			}
		}
		if(count == 0){
			System.out.println("Prime Number");
		}else{
			System.out.println("not Prime Number");
		}
	}
}