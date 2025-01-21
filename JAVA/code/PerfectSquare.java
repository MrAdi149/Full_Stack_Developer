import java.util.Scanner;

class PerfectSquare{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		boolean flag = true;
		
		for(int i = 1; i<=n/2; i++){
			if(i * i == n){
				flag = true;
				System.out.println("perfect number");
				break;
			}
		}
		if(flag = false){
			System.out.println("not perfect square");
		}
	}
}
	