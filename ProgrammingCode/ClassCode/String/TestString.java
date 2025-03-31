import java.util.Scanner;

class TestString {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.next();
		
		char[] c1 = s1.toCharArray();
		
		String s2 = sc.next();
		
		char[] c2 = s2.toCharArray();
		
		anagram(c1,c2);
		
	}
	
	public static void bubbleSort(char[] ch){
		
		for(int i = 0; i<ch.length-1; i++){
			for(int j = 0; j<ch.length-1-i; j++){
				if(ch[j] > ch[j+1]){
					char temp = ch[j];
					ch[j] = ch[j+1];
					ch[j+1] = temp;
				}
			}
		}
	}
	
	public static void anagram(char[] c1, char[] c2){
		bubbleSort(c1);
		bubbleSort(c2);
		
		boolean flag = true;
		
		for(int i = 0; i<c1.length; i++){
			if(c1[i] != c2[i]){
				flag = false;
				break;
			}
		}
		
		if(flag){
			System.out.println("anagram");
		}else{
			System.out.println("not");
		}
	}
	
	
	public static void reverseArray(char[] ch){
		
		char[] result = new char[ch.length];
		
		boolean flag = true;
		for(int i = 0; i<ch.length; i++){
			result[i] = ch[ch.length - 1 - i];
		}
		
		for(int i = 0; i<ch.length; i++){
			if(ch[i] != result[i]){
				flag = false;
				break;
			}
		}
		
		if(flag == true){
			System.out.println("pali");
		}else{
			System.out.println("not pali");
		}
	}
}