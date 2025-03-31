import java.util.Scanner;

class SixLinePattern {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i<=2*n-1; i++){
			for(int j = 1; j<=2*n-1; j++){
				if(i==j || i==n || i+j==2*n ||j==n){
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}