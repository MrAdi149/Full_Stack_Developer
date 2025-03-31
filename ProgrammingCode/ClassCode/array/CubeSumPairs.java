import java.util.Scanner;

public class CubeSumPairs {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int result = countCubeSumPairs(n);
		System.out.println(result);
	}
	
	public static int countCubeSumPairs(int n) {

		int count = 0;

		for(int i = 1; i<=Math.cbrt(n); i++){
			int a = i * i * i;

			for(int j = 0; j<=Math.cbrt(n-a); j++){
				int b = j * j * j;

				if(a + b == n){
					if(i != j){
						count = count + 1;
					}else{
						count = count + 1;
					}
				}
			}
		}

		return count;

	}
}