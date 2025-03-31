// Last letter in upper case

import java.util.Scanner;

class LastLetterToUpperCase {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		char[] ch = str.toCharArray();
		
		for(int i = 0; i<ch.length; i++){
			
			if(i == ch.length-1 || (ch[i] != ' ' && ch[i+1] == ' ')){
				if(ch[i] >= 'a' && ch[i] <= 'z'){
					ch[i] = (char)(ch[i] - 32);
				}
			}else{
				if(ch[i] >= 'A' && ch[i] <= 'Z'){
					ch[i] = (char)(ch[i] + 32);
				}
			}
		}
		
		String res = new String(ch);
		
		System.out.println(res);
	}
}