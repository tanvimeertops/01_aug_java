package com.collection;

import java.util.ArrayList;

/*
 * Generic: to generalize the collection 
 * ArrayList<Integer> 
 * 
 */
public class GenericDemo {
public static void main(String[] args) {
	ArrayList<Integer> a1=new ArrayList<Integer>();
	
	a1.add(10);
	a1.add(new Integer(19));
	a1.add(28);
	a1.add(1000);
	
	System.out.println(a1);
	
	for (Integer i1 : a1) {
		System.out.println(i1);
	}
	
}
}
