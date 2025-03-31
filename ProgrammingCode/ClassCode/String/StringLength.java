import java.util.Scanner;

class StringLength {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        String name = sc.next();
        int count = 0;
        
        char[] ch = name.toCharArray();
        
        for(char c1 : ch){
			count++;
		}
        
        System.out.println(count);
    }
}
