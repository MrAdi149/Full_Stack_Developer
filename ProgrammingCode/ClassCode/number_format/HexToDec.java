import java.util.Scanner;

class HexToDec {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		while(s!=0){
			int word = s % 10;
			System.out.println(word);
			word = word / 10;
		}
	}
}