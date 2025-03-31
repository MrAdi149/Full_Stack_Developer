import java.util.Scanner;

class SandGlassIncPattern {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i<=2*n-1; i++){
			int a = 1;
			
			for(int j = 1; j<=2*n-1; j++){
				
				if((i<=j && i+j<=n*2) || (i>=j && i+j>=n*2)){
					if(j<n){
						System.out.print(a++);
					}else{
						System.out.print(a--);
					}
					System.out.print(" ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}