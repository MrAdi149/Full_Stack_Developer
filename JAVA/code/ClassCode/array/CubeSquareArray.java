import java.util.Scanner;

class CubeSquareArray {
	
	public static int[] CubeArray(int[] cubeArray) {
		int[] result = new int[cubeArray.length];
		
		for(int i=0; i<cubeArray.length; i++){
			result[i] = cubeArray[i] * cubeArray[i] * cubeArray[i];
		}
		
		return result;
	}
	
	public static int[] SquareArray(int[] squareArray){
		int[] result = new int[squareArray.length];
		
		for(int i = 0; i<squareArray.length; i++){
			result[i] = squareArray[i] * squareArray[i];
		}
		
		return result;
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size of array: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("enter the elements: ");
		for(int i = 0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
		
		int[] cubeArray = CubeArray(arr);
		int[] squareArray = SquareArray(arr);
		
		System.out.println();
		System.out.print("cube of elements are: ");
		
		for(int i =0; i<n;i++){
			System.out.print(cubeArray[i] + " ");
		}
		
		System.out.println();
		System.out.print("square of elements are: ");
		
		for(int i = 0; i<n;i++){
			System.out.print(squareArray[i] + " ");
		}
	}
}
		