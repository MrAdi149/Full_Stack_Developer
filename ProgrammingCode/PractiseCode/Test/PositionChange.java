import java.util.Scanner;

class PositionChange {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        String inputString = sc.nextLine();
        String reversedString = reverseOfWords(inputString);
        System.out.println(reversedString);
    }

    public static String reverseOfWords(String str){
		
		char[] ch = str.toCharArray();
		String reversedString = "";
		
		for(int i = ch.length-1; i>=0; i--){
			int endWord = i;
			
			while(i >= 0 && ch[i] != ' '){
				i--;
			}
			
			int startWord = i+1;
			
			while(startWord <= endWord){
				reversedString = reversedString + ch[startWord];
				startWord++;
			}
			
			if(i>=0){
				reversedString = reversedString + " ";
			}
		}
		
		return reversedString;
	}
}