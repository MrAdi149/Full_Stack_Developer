import java.util.Scanner;

class RightAngleTriPattern {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++){
			char a = 'A';
			for(int j = 1; j<=n; j++){
				if(i+j>=n+1){
					System.out.print(a++ + " ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
					