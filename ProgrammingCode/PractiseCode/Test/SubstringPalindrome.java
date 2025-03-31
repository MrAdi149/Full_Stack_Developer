public class SubstringPalindrome {
	
	public static void main(String[] args){
				
		String s1 = "malayalam is a language";
		String[] str = s1.split(" ");
		for (int i = 0; i < str.length; i++) {
			if (isPalindrome(str[i]))
				System.out.println(str[i]);
		}

	}
	
	public static boolean isPalindrome(String s1){
		
		char[] ch = s1.toCharArray();
		
		int start = 0;
		int end = ch.length - 1;
		while(start < end){
			if(ch[start] != ch[end]){
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
	
}
	
	