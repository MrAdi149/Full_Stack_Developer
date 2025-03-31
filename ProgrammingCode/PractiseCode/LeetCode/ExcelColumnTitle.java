import java.util.Scanner;

public class ExcelColumnTitle {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int columnNumber = sc.nextInt();
		
		columnTitle(columnNumber);
	}
	
	public static void columnTitle(int columnNumber){
		
		String result = "";
		
		while(columnNumber>0){
			columnNumber--;
			int rem = columnNumber % 26;
			char ch = (char)('A'+rem);
			result = ch + result;
			columnNumber = columnNumber / 26;
		}
		
		System.out.println(result);
	}
	
}