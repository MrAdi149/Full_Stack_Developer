import java.util.Scanner;
//1               1 
//1 2           2 1 
//1 2 3       3 2 1
//1 2 3 4   4 3 2 1
//1 2 3 4 5 4 3 2 1
//1 2 3 4   4 3 2 1
//1 2 3       3 2 1
//1 2           2 1
//1               1

class ButterFlyIncPattern {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i<=2*n-1; i++){
			for(int j = 1; j<=2*n-1; j++){
				
				int a = 0;
				
				if(j<=n){
					a = j;
				}else{
					a = 2*n-j;
				}
	
				if((i>=j && i+j <= 2*n)||(i+j >= 2*n && i<=j)){
					System.out.print(a + " ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}