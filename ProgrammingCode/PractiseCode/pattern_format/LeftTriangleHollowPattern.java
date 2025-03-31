import java.util.Scanner;

class LeftTriangleHollowPattern {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++){
			for(int j = n; j<=2*n-1; j++){
				if(j-i == n-1 || i+j == n+i || i+j == n+j){
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
				