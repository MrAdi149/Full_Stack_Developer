import java.util.Scanner;

// 6
// 6 5
// 6 5 4
// 6 5 4 3
// 6 5 4 3 2
// 6 5 4 3 2 1

class DecreasingRightTriangle {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++){
			
			int a = n;
			
			for(int j=1; j<=n; j++){
				if(i>=j){
					System.out.print(a-- + " ");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}