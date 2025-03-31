import java.util.ArrayList;
import java.util.Scanner;

public class CommonElementBetweenTwoArrayList
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("size");
		int size = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>(size);
		System.out.println("Enter the elements");
		for(int i=0;i<size;i++)
		{
		    int a = sc.nextInt();
			arr.add(a);
		}
		System.out.println("size");
		int size1 = sc.nextInt();
		ArrayList<Integer> brr = new ArrayList<Integer>(size);
		System.out.println("Enter the elements");
		for(int i=0;i<size1;i++)
		{
		    int a = sc.nextInt();
			brr.add(a);
		}
		
		isCommon(arr,brr);
		
		System.out.println("-------------");
		System.out.println(arr);
	}
	
	public static ArrayList<Integer> duplicate(ArrayList<Integer> arr)
	{
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.addAll(arr);
		for(int i =0;i<ar.size();i++)
		{
			for(int j =i+1;j<ar.size();j++)
			{
				if(ar.get(i)==ar.get(j))
				{
					ar.remove(j);
				}
			}
		}
		return ar;
	}
	
	public static void isCommon(ArrayList<Integer> arr, ArrayList<Integer> brr)
	{
		ArrayList<Integer> ar = duplicate(arr);
		ArrayList<Integer> br = duplicate(brr);
		
		for(int i =0;i<ar.size();i++)
		{
			boolean flag = false;
			for(int j =0;j<br.size();j++)
			{
				if(ar.get(i)==br.get(j))
				{
					flag = true;
					break;
				}
			}
			if(flag == true)
			{
				System.out.println("The common elements between the arraylist is "+ar.get(i));
			}
		}
	}
}