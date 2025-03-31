import java.util.Scanner;

public class FrequencyOfUpperChar {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the string");
			String a = sc.nextLine();
			frequency(a);
			sc.close();
		}
		
		public static void frequency(String str)
		{
			int[] count = new int[26];
			for(int i=0;i<str.length();i++)
			{
				char ch = str.charAt(i);
				if(ch>='A' && ch<='Z')
				{
				    count[ch-65]++;
				}
			}
			
			for(int j=0;j<count.length;j++)
			{
				if(count[j] !=0)
				{
					System.out.println((char)(j+65)+" --> "+count[j]);
				}
			}
		}
}