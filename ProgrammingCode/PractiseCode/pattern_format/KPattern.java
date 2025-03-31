import java.util.Scanner;

class KPattern {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++){
			
			for(int j = 1; j<=n - 3; j++){
				
				if(i+j<=n-2 || i-j>=n-4){
					System.out.print("*" + " ");
				}else{
					System.out.print(" " + " ");
				}
			}
			
			System.out.println();
		}
	}
}