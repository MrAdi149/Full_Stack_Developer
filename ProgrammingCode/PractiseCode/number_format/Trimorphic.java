import java.util.Scanner;

class Trimorphic {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		
		int cube = n * n * n;
		int org = n;
		int count = 0;
		
		while(n!=0){
			count++;
			n = n / 10;
		}
		
		int mul = 1;
		for(int i = 1; i<=count; i++){
			mul = mul * 10;
		}
		
		if(cube%mul == org){
			System.out.println("trimorphic number");
		}else{
			System.out.println("not trimorphic number");
		}
	}
}