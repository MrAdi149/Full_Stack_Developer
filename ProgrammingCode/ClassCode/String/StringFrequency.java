import java.util.Scanner;

class StringFrequency {
	
	public static void frequency(char[] ch){
		
		
		for(int i = 0; i<ch.length; i++){
			int count = 1;
			if(ch[i] == '\0'){
				continue;
			}
			
			for(int j = i+1; j<ch.length; j++){
				if(ch[i] == ch[j]){
					count++;
					ch[j] = '\0';
				}
			}
			System.out.println(ch[i] + " " + count);
		}
	}
	
	public static void UpperCaseFrequency(char[] ch) {
        int index = 0;

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'A' && ch[i] <= 'Z') {
                index++;
            }
        }

        char[] result = new char[index];
        index = 0;

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'A' && ch[i] <= 'Z') {
                result[index++] = ch[i];
            }
        }

        for(int i = 0; i<result.length; i++){
			System.out.println(result[i]);
		}
    }
	
	public static void isFrequency(String str){
		int[] freq = new int[128];
		for(int i = 0; i<str.length(); i++){
			char ch = str.charAt(i);
			freq[ch]++;
		}
		
		for(int i = 0; i<freq.length; i++){
			if(freq[i] != 0){
				System.out.println((char)i+ " ------ " + freq[i]);
			}
		}
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		isFrequency(str);
		
		char[] ch = str.toCharArray();
		System.out.println("-------------------------------");
		frequency(ch);
		System.out.println("-------------------------------");
		UpperCaseFrequency(ch);
	}
}