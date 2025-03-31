import java.util.Scanner;

class ThreePointerApproach {
    
    public static void interleaveStrings(char[] ch1, char[] ch2) {
		
        int totalLen = ch1.length + ch2.length;
        char[] result = new char[totalLen];
        
        int i = 0; 
        int j = ch2.length - 1; 
        int k = 0; 
        
        while (i < ch1.length && j >= 0) {
            result[k++] = ch1[i++]; 
            result[k++] = ch2[j--]; 
        }
		
		while(i < ch1.length){
			result[k++] = ch1[i++];
		}
		
		while(j >= 0){
			result[k++] = ch2[j--];
		}
		
		String res = new String(result);
		
		System.out.println("Resulted String: "+res + " ,and the length of the resulted string is: " + res.length());
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first string:");
        String str1 = sc.next();
        
        System.out.println("Enter the second string:");
        String str2 = sc.next();
        
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        
        interleaveStrings(ch1, ch2);
    }
}