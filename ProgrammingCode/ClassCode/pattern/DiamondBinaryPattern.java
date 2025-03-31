import java.util.Scanner;

class DiamondBinaryPattern {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i<=2*n-1; i++){
	
			for(int j = 1; j<=2*n-1; j++){
				
				if(i+j>=n+1 && j-i<=n-1 && i-j <=n-1 && i+j<=3*n-1 ){
					if(i%2==0){
						System.out.print(0+" ");
					}else{
						System.out.print(1+" ");
					}
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}