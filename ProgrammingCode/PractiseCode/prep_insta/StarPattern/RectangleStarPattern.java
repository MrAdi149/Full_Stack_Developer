import java.util.Scanner;

class RectangleStarPattern {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i<=n-1; i++){
			for(int j = 1; j<=n; j++){
				
				if(i+j>=n+1||i+j<=n+1){
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}