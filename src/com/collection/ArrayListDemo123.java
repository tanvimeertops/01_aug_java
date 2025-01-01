package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * Collection: it is a collection of primitive data type 
 * and non primitive data type(object) into a object
 * 
 * class
 * 1.ArrayList :
 * 	1.It is a dynamic array
 * 	2.Automatically shrink and grow
 * 	3.default value is []
 * 	4.default size is 0
 * 	5.add() remove()
 * 	6.the sequence in which data is stored same sequence it is 
 * displayed
 *  7.Automatically implements list interface
 *  8.duplicate value are allowed
 * 2.Hashset
 * 3.hashmap
 * 4.vector
 * 5.generic
 * 
 * interface
 * 1.List
 * 2.Set
 * 3.Map
 * 4.Iterator: when there is a need to display data into
 * list rather than [] we use iterator
 *  1.to give all value to iterator from object
 *  2. to traverse from the list of value
 *  3. to get value from the iterator
 * 
 * 5.Enumeration
 */
public class ArrayListDemo123 {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	
	System.out.println("Default value is :"+a1);
	System.out.println("Default size is :"+a1.size());
	
	a1.add(100);
	a1.add(28.5f);
	a1.add('T');
	a1.add(new Integer(19));
	a1.add("tanvi");
	

	System.out.println("Now value is :"+a1);
	System.out.println("Now size is :"+a1.size());
	a1.add("tanvi");

	System.out.println("Now value is :"+a1);
	System.out.println("Now size is :"+a1.size());
	
	a1.remove(0);
	System.out.println("Now value is :"+a1);
	System.out.println("Now size is :"+a1.size());
	
//	Iterator i1=a1.iterator();
//	
//	while (i1.hasNext()) {
//		System.out.println(i1.next());
//	}
	
	
	
}
}
