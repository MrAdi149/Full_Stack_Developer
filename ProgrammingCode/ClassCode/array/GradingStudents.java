import java.util.Scanner;

class GradingStudents {
	
	public static void gradingStudents(int[] arr){
		
		for(int i = 0; i<arr.length; i++){
			if(arr[i] < 38){
				System.out.println(arr[i]);
			}else{
				int rem = arr[i] % 5;
				if(rem >= 3){
					System.out.println(arr[i] + (5-rem));
				}else{
					System.out.println(arr[i]);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
		gradingStudents(arr);
	}
}