import java.util.Scanner;

class Multiplication {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i<= 10; i++){
			for(int j = 1; j <= n; j++){
				sum =i*j;
				System.out.print(j + " * " + i + " = " + sum + "\t");
			}
			System.out.println();
		}
	}
}