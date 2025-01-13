import java.util.Scanner;
class TwoDigit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n > 9 && n < 100 || n< -9 && n > -100){
			System.out.println("Two digit number");
		}else{
			System.out.println("one or three digit number");
		}
	}
}