import java.util.Scanner;

class SubstrString {
	
	public static void subStrng(String str, int s1, int s2){
		
		for(int i = s1; i<s2; i++){
			System.out.println(CreateCharAtMethod.myCharAt(str,i));
		}
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		
		subStrng(str,s1,s2);
	}
}