import java.util.Scanner;

public class StringToken {
	
	public static String removespecialCharacter(String str) {
        int count = 0;
        String result = "";
        
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 33 && str.charAt(i) <= 47) || (str.charAt(i) >= 58 && str.charAt(i) <= 64) || 
                (str.charAt(i) >= 91 && str.charAt(i) <= 96) || (str.charAt(i) >= 123 && str.charAt(i) <= 126)) {
                continue;
            }
            result = result +str.charAt(i);
        }
        
		return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String result = removespecialCharacter(str);
		
		System.out.println(result + " ");		
        sc.close();
    }
}

