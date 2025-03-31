import java.util.Scanner;
class LinerSerach
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array size");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("enter the array elements");
		for(int i=0;i<size ;i++)
		{
			arr[i]= sc.nextInt();
		}
		System.out.println("Enter the elment to find");
		int target = sc.nextInt();
		lSearch(arr,target);
	}
	
	public static void lSearch(int[] arr,int target)
	{
		boolean flag = false;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==target)
			{
				System.out.println("the element "+target+" is found in index "+i);
				flag = true;
				break;
			}
			
		}
		if(flag == false)
				System.out.println("Element not found");
	}
}