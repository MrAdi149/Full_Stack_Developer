import java.util.Scanner;

class CountVowelString {
	
	public static boolean isVowel(char c){
		return c == 'a' || c=='e' || c=='i' || c=='o' ||c=='u';
	}
		
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int countVow = 0;
		int countCos = 0;
		int countSpe = 0;
		char[] ch = str.toCharArray();
		
		for(int i = 0; i<ch.length; i++){
			if(isVowel(ch[i])){
				countVow++;
			}else if((ch[i] >= 32 && ch[i] <= 47)||(ch[i] >= 58 && ch[i] <= 64)||(ch[i] >= 91 && ch[i] <= 96) || (ch[i] >= 123 && ch[i] <= 126)){
				countSpe++;
			}
			else{
				countCos++;
			}
		}
		
		System.out.println(countVow);
		System.out.println(countCos);
		
	}
}