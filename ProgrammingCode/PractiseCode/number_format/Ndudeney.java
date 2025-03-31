import java.util.Scanner;

class Ndudeney {
	
	    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an upper limit (n): ");
        int n = sc.nextInt();
        sc.close();
        
        System.out.println("Dudeney numbers up to " + n + " are:");
        boolean found = false;
        
        for (int i = 1; i <= n; i++) {
            if (isDudeney(i)) {
                System.out.print(i + " ");
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("No Dudeney numbers found.");
        }
    }
    
    public static boolean isDudeney(int num) {
        int sum = 0, temp = num;
        
        // Sum of digits calculation
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        
        // Checking if sum^3 equals the original number
        return (sum * sum * sum == num);
    }
}