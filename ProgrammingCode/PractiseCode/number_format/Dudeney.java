import java.util.Scanner;

class Dudeney {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int temp = n;
		int sum = 0;
		
		while(n!=0){
			int digit = n % 10; 
			sum = sum + digit;
			n = n / 10;
		}
		
		int cube = sum * sum * sum;
		
		if(temp == cube){
			System.out.println("Dudeney number");
		}else{
			System.out.println("not Dudeney number");
		}
		
		System.out.println(Math.floor(temp));
	}
}