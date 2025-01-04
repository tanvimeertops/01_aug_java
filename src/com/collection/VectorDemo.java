package com.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/*
 * Vector : 
 * 1.It is a dynamic Array
 * 2.Default value is []
 * 3.Default size is 0
 * 4.Default capacity is 10
 * 5.The sequence in data is stored same sequence data 
 * is displayed
 * 6.add() and remove() 
 * 7.Automatically shrink and grow
 * 8.Duplicate values are allowed
 * 9.Automatically implements list interface
 * 
 * Enumeration:when there is a need to display data into
 * list instead of []
 * only use with vector
 * step 1: to create reference of Enumeration with the help
 * of collection
 * step 2: to traverse through the loop
 * step 3: to get value from the Enumeration
 * 
 */
public class VectorDemo {
public static void main(String[] args) {
	Vector v1=new Vector(3,1);
	
	System.out.println("Default size is :"+v1.size());
	System.out.println("Default value is :"+v1);
	System.out.println("Default capacity is :"+v1.capacity());
	
	v1.add(12);
	v1.add(100.2626f);
	v1.add('T');
	v1.add('T');
	v1.add(100.2626f);
	v1.add('T');
	v1.add('T');
	v1.add(12);
	v1.add(100.2626f);
	v1.add('T');
	v1.add('T');
	v1.add(100.2626f);
	v1.add('T');
	
	System.out.println("Now size is :"+v1.size());
	System.out.println("Now value is :"+v1);
	System.out.println("Now capacity is :"+v1.capacity());
	
//	Iterator i1=v1.iterator();
//	
//	while (i1.hasNext()) {
//		System.out.println(i1.next());
//	}
	
	Enumeration e1=v1.elements();
	
	while (e1.hasMoreElements()) {
		System.out.println(e1.nextElement());
	}
}
}
