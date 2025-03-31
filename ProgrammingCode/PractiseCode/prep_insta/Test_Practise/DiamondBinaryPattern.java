import java.util.Scanner;

// 		          1
// 	           	0 0 0       
// 	          1 1 1 1 1
//      	0 0 0 0 0 0 0   
//        1 1 1 1 1 1 1 1 1
//      	0 0 0 0 0 0 0
// 	          1 1 1 1 1
// 	        	0 0 0
// 		          1

class DiamondBinaryPattern {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i<=2*n-1; i++){
			int a = i;
			for(int j = 1; j<=2*n-1; j++){
				
				if(i+j >= n+1 && j-i <= n-1 && i-j <= n-1 && i+j <= 3*n-1){
					if(a%2!=0){
						System.out.print("1 ");
					}else{
						System.out.print("0 ");
					}
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
				