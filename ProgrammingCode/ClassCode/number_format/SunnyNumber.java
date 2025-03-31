import java.util.Scanner;

class SunnyNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean flag = false;
		
		int sunny = n + 1;
		for(int i = 1; i<=sunny/2; i++){
			if(i*i == sunny){
				flag = true;23
				System.out.println("It is a sunny number");
				break;
			}
		}
		if(flag == false){
			System.out.println("not a sunny number");
		}
	}
}