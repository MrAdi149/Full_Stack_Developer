package arrayList;

//wajp to store three hetrogeneous object in arraylist and traverse it using a for loop both forward and reverse the action

import java.util.*;

class HetrogeneousObject {

	public static void main(String[] args){
		
		
		LinkedList l = new LinkedList();
		
		ArrayList arr = new ArrayList();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add("adi");
		arr.add("singh");
		
		System.out.println(arr);
		arr.remove(4);
		System.out.println(arr.contains("adi"));
		System.out.println(arr.isEmpty());
//		
//		for(int i = 0; i<arr.size(); i++){
//			System.out.println(arr.get(i));
//		}
//		
//		System.out.println("-----------------");
//		
//		for(int i = arr.size()-1; i>=0; i--){
//			System.out.println(arr.get(i));
//		}
		
//		
//		char c1 = 'a';
//		Character c2 = new Character('a');
//		
//		System.out.println(c1+c2);
	}
}