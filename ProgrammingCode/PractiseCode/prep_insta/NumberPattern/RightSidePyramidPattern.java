import java.util.Scanner;

class RightSidePyramidPattern {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i<=2*n-1; i++){
			int a = 1;
			for(int j = 1; j<=n; j++){
					if(i+j>=n+1 && i-j<=n-1){
						System.out.print(a++ +" ");
					}else{
						System.out.print("  ");
					}
			}
			System.out.println();
		}
	}
}