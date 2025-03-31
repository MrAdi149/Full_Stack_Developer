//First letter string in upper case

import java.util.Scanner;

class FirstLetterUpperCase {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		char[] ch = str.toCharArray();
		
		String res = "";
		
		for(int i = 0; i<ch.length; i++){
			if(i == 0 || (ch[i] != ' ' && ch[i-1] == ' ')){
				if(ch[i] >= 'a' && ch[i] <= 'z'){
					res = res + (char)(ch[i] - 32);
				}
			}else{
				if(ch[i] >= 'A' && ch[i] <= 'Z'){
					res = res + (char)(ch[i] + 32);
				}
			}
		}
	
		System.out.println(res);
	}
}