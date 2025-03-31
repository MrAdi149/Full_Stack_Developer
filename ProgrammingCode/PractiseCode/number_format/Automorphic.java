import java.util.Scanner;
import java.lang.Math.*;

class Automorphic{
	
	int order(int n){
		
		int mul = 10;
		for(int i = 1; i<n; i++){
			mul = mul * 10;
		}
		
		return mul;
	}
			
	public static void main(String[] args){
		
		Automorphic ab = new Automorphic();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int sq = n * n;
		int count = 0;
		int temp = n;
		
		while(n!=0){
			count++;
			n = n / 10;
		}
		
		while(sq!=0){
			
			int digit = sq % ab.order(count);
			if(temp == digit){
				System.out.println("automorphic");
				break;
			}else{
				System.out.println("not automorphic");
				break;
			}
		}		
	}
}
	