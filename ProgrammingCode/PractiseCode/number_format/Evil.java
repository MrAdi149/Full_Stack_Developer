import java.util.Scanner;

class Evil {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int count = 0;
		
		while(n!=0){
			int binary = n % 2;
			if(binary == 1){
				count++;
			}
			n = n / 2;
		}
		
		if(count % 2 == 0){
			System.out.println("It's an evil number");
		}else{
			System.out.println("not an evil number");
		}
	}
}
		