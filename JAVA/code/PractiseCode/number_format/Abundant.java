import java.util.Scanner;

public class Abundant {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        System.out.println("Abundant numbers between 1 and " + n + " are:");

        for(int i = 1; i <= n; i++){
			int sum = 0;
			for(int j = 1; j <= i/2; j++){
				if(i % j == 0){
					sum = sum + j;
				}
			}
			if(sum > i){
				System.out.println(i);
			}
		}
    }
}
