import java.util.Scanner;

/*
1
0 1       
1 0 1
0 1 0 1
1 0 1 0 1
*/

class OddEvenBinaryRightTriangle {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++){
			int a = i;
			for(int j = 1; j<=n; j++){
				if(i>=j){
					System.out.print(a--%2 + " ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}