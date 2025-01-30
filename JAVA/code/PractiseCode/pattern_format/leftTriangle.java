import java.util.Scanner;

class leftTriangle {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++){
			
			for(int s = n - 1; s>=i; s--){
				System.out.print(" ");
			}
			
			for(int j = 1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}