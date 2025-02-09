import java.util.Scanner;

class TwoOppTriPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        sc.close();

        // Print the right-aligned triangle
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            // Print stars
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Print the left-aligned triangle
        for (int i = 2; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j < n; j++) {
                System.out.print("  ");
            }
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}