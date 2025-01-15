//wajp to check the given number is buzz number or not
//buzz= if a number is ending with 7 or the number is multiple of 7 such number are called buzz number.

import java.util.Scanner;

class BuzzNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number: ");
		int n = sc.nextInt();
		
		if(n % 10 == 7 || n % 7 == 0){
			System.out.println("buzz number");
		}else{
			System.out.println("not buzz number");
		}
	}
}