import java.util.Scanner;

class DecPyramidPattern {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++){
			int a = n-i+1;
			for(int j = 1; j<=2*n-1; j++){
				
				if(i<=j && j+i<=2*n){
					if(j<n){
						System.out.print(a--);
					}else{
						System.out.print(a++);
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