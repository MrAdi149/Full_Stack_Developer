import java.util.Scanner;

class LeftSidePyramidPattern {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i<=2*n-1; i++){
			for(int j = 1; j<=n; j++){
					if(i>=j && i+j<=2*n){
						System.out.print(j +" ");
					}else{
						System.out.print("  ");
					}
			}
			System.out.println();
		}
	}
}