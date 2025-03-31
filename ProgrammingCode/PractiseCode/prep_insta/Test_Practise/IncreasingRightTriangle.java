import java.util.Scanner;

/*
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1
6 5 4 3 2 1 */

class IncreasingRightTriangle {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++){
			int a = i;
			for(int j = 1; j<=n; j++){
				if(i>=j){
					System.out.print(a-- + " ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}