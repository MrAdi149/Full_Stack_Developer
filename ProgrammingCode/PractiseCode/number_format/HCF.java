import java.util.Scanner;

class HCF {
	
	int findHcf(int a, int b){
		while(b!=0){
			int temp = b;
			b = a % b;
			a = temp;
		}
		
		return a;
	}	
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		HCF h = new HCF();
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int hcf = h.findHcf(a,b);
		System.out.println(hcf);
		
	}
}
