import java.util.Scanner;

class KCharRevPattern {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i<=2*n-1; i++){
			char a = 'A';
			for(int j = 1; j<=n; j++){
					if(i<=j || i+j>=2*n){
						System.out.print(a++ +" ");
					}else{
						System.out.print("  ");
					}
			}
			System.out.println();
		}
	}
}