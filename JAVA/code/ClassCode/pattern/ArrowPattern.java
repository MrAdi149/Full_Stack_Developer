import java.util.Scanner;

class ArrowPattern {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++){
			
			for(int j = 1; j<=2*n-1; j++){
				
			if(i+j == n+1 || j-i == n-1){ // to print star
				System.out.print("*");
			}
			
			if(i+j>=n+2 || j-i<=n-1){ // to print space
				System.out.print(" ");
			}
			
			}
			
			System.out.println();
		}
	}
}