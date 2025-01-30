import java.util.Scanner;

class GCD {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter the first number: ");
		int n1 = sc.nextInt();
		
		System.out.print("enter the second number: ");
		int n2 = sc.nextInt();
		boolean flag = false;
		
		int comp;
		
		if(n1 > n2){
			comp = n1;
		}else{
			comp = n2;
		}
		
		int gcd = 1;
		
		for(int i = comp; i > 0; i--){
			
			if(n1%i == 0 && n2%i == 0){
				gcd = i;
				flag = true;
				break;
			}
		}
		
		if(flag == true){
			System.out.println("gcd is: " + gcd);
		}else{
			System.out.println("gcd is: " + gcd);
		}
	}
}
		
		