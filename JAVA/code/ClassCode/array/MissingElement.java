import java.util.Scanner;

public class MissingElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
		missing(arr);
	}
	
	public static void missing(int[] ar)
	{
		int value = ar[0];
		for(int i = 0;i<ar.length;i++)
		{
			if(ar[i]!=(value+i))
			{
				System.out.println("the missing element is :"+(value+i));
				value=value+1;
			}
		}
	}


}