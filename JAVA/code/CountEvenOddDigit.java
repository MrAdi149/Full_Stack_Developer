import java.util.Scanner;

class CountEvenOddDigit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		int evenCount = 0;
		int oddCount = 0;
		
		for(int i = n;n!=0;n=n/10){
			int digit = n % 10;
			if(digit%2==0){
				System.out.println(digit + " :even digit");
				evenCount++;
			}else{
				System.out.println(digit + " :odd digit");
				oddCount++;
			}
		}
		
		while(n!=0){
			int digit = n % 10;
			if(digit%2==0){
				System.out.println(digit + " :even digit");
				evenCount++;
			}else{
				System.out.println(digit + " :odd digit");
				oddCount++;
			}
			n = n / 10;
		}
		
		System.err.println("Even Count: " + evenCount);
		System.err.println("Odd Count: "+oddCount);

		sc.close();
	}
}