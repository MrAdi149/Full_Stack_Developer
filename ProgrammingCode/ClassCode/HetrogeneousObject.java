//wajp to store three hetrogeneous object in arraylist and traverse it using a for loop both forward and reverse the action

import java.util.*;

class HetrogeneousObject {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList arr = new ArrayList();
		
		arr.add(sc.nextInt());
		arr.add(sc.nextDouble());
		arr.add(sc.next());
		
		for(int i = 0; i<3; i++){
			System.out.println(arr.get(i));
		}
		
		for(int i = 3; i>=0; i--){
			System.out.println(arr.get(i));
		}
	}
}