//Lower case to upper case

import java.util.Scanner;

class LowerToUpper {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		char[] ch = str.toCharArray();
		
		String res = "";
		
		for(int i = 0; i<ch.length; i++){
			if(ch[i]>='A' && ch[i] <= 'Z'){
				res = res + ch[i];
			}else{
				res = res + (char)(ch[i] - 32);
			}	
		}
		
		System.out.print(res);
		
	}
	
}