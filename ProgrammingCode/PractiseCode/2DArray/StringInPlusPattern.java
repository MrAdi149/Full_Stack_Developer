import java.util.Scanner;

public class StringInPlusPattern {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		int n = str.length();
		
		char[][] s = new char[n][n];
		
		int midRow = s.length / 2;
		int midCol = s[0].length / 2;
		
		for(int i = 0; i<s.length; i++){
			for(int j = 0; j<s[i].length; j++){
				if(i == midRow || j == midCol){
					 if(i == midRow) {
                        s[i][j] = str.charAt(j);
                    } else {
                        s[i][j] = str.charAt(i);
                    }
				}else{
					s[i][j] = 'X';
				}
			}
		}
		
		for(int i = 0; i<s.length; i++){
			for(int j = 0; j<s[i].length; j++){
				System.out.print(s[i][j] + " ");
			}
			System.out.println();
		}
	}
}