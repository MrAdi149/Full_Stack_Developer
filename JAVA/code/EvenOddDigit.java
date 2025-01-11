import java.util.Scanner;

//wajp to extract the even and odd from the digit
class EvenOddDigit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		
		for(; n != 0; n = n / 10){
			int digit = n % 10;
			if(digit%2 ==0){
					System.out.println(digit + " :is even");
			}else{
				System.out.println(digit + " :is odd");
			}
		}
		
		while(n != 0){
			int digit = n % 10;
			if(digit % 2 == 0){
				System.out.println(digit + " :is even");
			}else{
				System.out.println(digit + " :is odd");
			}
			n = n / 10;
		}
		
		sc.close();
	}
}