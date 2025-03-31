import java.util.Scanner;

class ButterFlyIncPattern {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= 2 * n - 1; i++){
			int a = 0;
			
			for(int j = 1; j <= 2 * n - 1; j++){
				if(j <= n){
					a = j; 
				} else {
					a = 2 * n - j; 
				}
				
				if((i >= j && i + j <= 2 * n) || (i <= j && i + j >= 2 * n)){
					System.out.print(a + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}