import java.util.Scanner;

/*
   1 2 3 4 5 6 7
 1 * * * * * * * 
 2 * * *   * * *
 3 * *       * *
 4 *           *
 5 * *       * *
 6 * * *   * * * 
 7 * * * * * * *   */
 
class FramePattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i<=2*n-1; i++){
			for(int j = 1; j<=2*n-1; j++){
				if(i+j <= n+1 || j-i >= n-1 || i-j >= n-1 || i+j >= 3*n-1){
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}