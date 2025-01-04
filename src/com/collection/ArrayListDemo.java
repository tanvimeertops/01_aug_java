package com.collection;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * Collection : to collect different primitive and non primitive 
 * data into a single object
 * 
 * class: 
 * ArrayList:
 * 1.It is a dynamic Array
 * 2.Default value is []
 * 3.Default size is 0
 * 4.The sequence in data is stored same sequence data 
 * is displayed
 * 5.add() and remove() 
 * 6.Automatically shrink and grow
 * 7.Duplicate values are allowed
 * 8.Automatically implements list interface
 * 
 * HashSet
 * HashMap
 * vector
 * generic
 * 
 * interface
 * List
 * Set
 * Map
 * Iterator: when there is a need to display data into
 * list instead of []
 * step 1: to create reference of iterator with the help
 * of collection
 * step 2: to traverse through the loop
 * step 3: to get value from the iterator
 * 
 * 
 * Enumeration
 */
public class ArrayListDemo {
public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
	try {
		ArrayList a1=new ArrayList(10);
		
		
		System.out.println("Default size is :"+a1.size());
		System.out.println("Default value is :"+a1);
		
		
		a1.add(12);
		a1.add(100.2626f);
		a1.add('T');
		a1.add(new Integer(200));
		a1.add("tanvi");
		a1.add("tanvi");
		a1.add(null);
		a1.add(null);
		a1.add(null);
		
		System.out.println("Now size is :"+a1.size());
		System.out.println("Now value is :"+a1);
		
		a1.remove(0);
		System.out.println("Now size is :"+a1.size());
		System.out.println("Now value is :"+a1);
		
		a1.remove(new Character('T'));
		System.out.println("Now size is :"+a1.size());
		System.out.println("Now value is :"+a1);
		
		a1.remove("tanvi");
		System.out.println("Now size is :"+a1.size());
		System.out.println("Now value is :"+a1);
		
		Iterator i1=a1.iterator();
		
		while (i1.hasNext()) {
			System.out.println(i1.next());
			
		}
		
		Field field=ArrayList.class.getDeclaredField("elementData");
		field.setAccessible(true);
		Object[] elementData=(Object[])  field.get(a1);
		
		
		System.out.println("capacity :"+elementData.length);
	} catch (Exception e) {
		// TODO: handle exception
	}

	
}
}
