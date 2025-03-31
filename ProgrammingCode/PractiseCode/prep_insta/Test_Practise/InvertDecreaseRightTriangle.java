import java.util.Scanner;

/*
1 2 3 4 5 
1 2 3 4   
1 2 3
1 2
1   
*/

class InvertDecreaseRightTriangle {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++){
			for(int j = 1; j<=n; j++){
				int a = j;
				if(i+j<=n+1){
					System.out.print(a + " ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}