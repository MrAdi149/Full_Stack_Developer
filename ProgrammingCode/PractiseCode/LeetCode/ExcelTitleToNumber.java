import java.util.Scanner;

public class ExcelTitleToNumber {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		titleToNumber(str);
	}
	
	public static void titleToNumber(String str){
		
		int result = 0;
		
		for(int i = 0; i < str.length(); i++){
			
			int charValue = str.charAt(i) - 'A' + 1;
			
			result = result * 26 + charValue;
			
		}
		
		System.out.println(result);
	}
	
}