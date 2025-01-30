import java.util.Scanner;

//wajp to find how many digit present in a given number
class CountNum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		int count = 0;
		
		for(int i = n; n != 0; n = n/10){
			int digit = n%10;
			count++;
		}
		
		System.out.println(count + " :is the count");
	}
}