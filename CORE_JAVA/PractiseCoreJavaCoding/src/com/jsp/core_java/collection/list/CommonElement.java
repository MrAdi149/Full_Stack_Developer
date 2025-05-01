package com.jsp.core_java.collection.list;

import java.util.ArrayList;
import java.util.List;

public class CommonElement {
	
	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(30);
		list2.add(40);
		list2.add(50);
		list2.add(60);
		
		List<Integer> list3 = new ArrayList<Integer>();
		
		for(int i = 0; i<list1.size(); i++) {
			if(list2.contains(list1.get(i))) {
				list3.add(list1.get(i));
			}
		}
		
		System.out.println(list3);
		
	}

}
