package com.jsp.core_java.collection.list;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicate {
	
	public void add() throws ArithmeticException,ClassNotFoundException {
		
	}
	
	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(3);
		list1.add(5);
		list1.add(3);
		list1.add(2);
		list1.add(5);
		list1.add(2);
		
		Collection
		
		List<Integer> list2 = new ArrayList<Integer>();
		
		for(int i = 0; i<list1.size(); i++) {
			Integer current = list1.get(i);
			if(!list2.contains(current)) {
				list2.add(current);
			}
		}
		System.out.println(list2);
		
	}

}
