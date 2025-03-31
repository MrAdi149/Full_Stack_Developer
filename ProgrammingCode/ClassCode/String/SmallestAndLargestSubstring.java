import java.util.Scanner;

public class SmallestAndLargestSubstring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int k = sc.nextInt();

        String smallest = "";
        String largest = "";

        for (int i = 0; i <= str.length() - k; i++) {
            String substring = str.substring(i, i + k);

            if (smallest.isEmpty() || substring.compareTo(smallest) < 0) {
                smallest = substring;
            }
            if (largest.isEmpty() || substring.compareTo(largest) > 0) {
                largest = substring;
            }
        }

        System.out.println(smallest);
        System.out.println(largest);

        sc.close();
    }
}