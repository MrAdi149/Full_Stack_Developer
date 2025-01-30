import java.util.Scanner;

class Pronic {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		boolean flag = false;
		
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++){
			int prev = i;
			int curr = i + 1;
			
			if(prev * curr == n){
				flag = true;
				break;
			}
		}
		
		if(flag == true){
			System.out.println("is pronic number");
		}else{
			System.out.println("not pronic number");
		}
	}
}