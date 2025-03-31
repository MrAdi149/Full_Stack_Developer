//1
//1 0       
//1 0 1     
//1 0 1 0
//1 0 1 0 1

import java.util.Scanner;

class BinaryRightTriangle {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++){
			for(int j = 1; j<=n; j++){
				int a = j;
				if(i>=j){
					if(a%2!=0){
						System.out.print("1 ");
					}else{
						System.out.print("0 ");
					}
				}
			}
			System.out.println();
		}
	}
}