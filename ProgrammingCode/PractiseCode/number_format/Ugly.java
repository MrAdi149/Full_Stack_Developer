import java.util.Scanner;

class Ugly {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int count = 0;
		boolean flag = false;
		
		for(int i = 1; i<=n/2; i++){
			if(n%i==0){
				count++;
				if(i == 2 || i == 3 || i == 5){
					flag = true;
					break;
				}
			}
		}
		
		if(flag == true){
			System.out.println("Ugly number");
		}else{
			System.out.println("not Ugly number");
		}
	}
}