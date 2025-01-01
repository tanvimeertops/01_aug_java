package com.collection;

import java.util.HashMap;
import java.util.HashSet;

/*
 * Hashmap
 * 1.It is a dynamic Array
 * 2.Default value is {}
 * 3.Default size is 0
 * 4.It has pair <k,v>
 * 4.All pair has its own  hash key all hash key are 
 * converted into hash code
 * 5.The value are stored hash code wise
 * 6.put() and remove() 
 * 7.Automatically shrink and grow
 * 8.Duplicate values are not allowed
 * 9.Automatically implements Map interface
 */
public class HashMapDemo {
public static void main(String[] args) {
	HashMap h1 = new HashMap();

	System.out.println("Default size is :" + h1.size());
	System.out.println("Default value is :" + h1);
	
	h1.put(122, "rohit");
	h1.put("Java", "rohit");
	h1.put("tops", 111.19f);
	System.out.println("Now size is :"+h1.size());
	System.out.println("Now value is :"+h1);
	
	h1.put("Java", "Surat");
	System.out.println("Now size is :"+h1.size());
	System.out.println("Now value is :"+h1);
	
	h1.put(28, "rohit");
	System.out.println("Now size is :"+h1.size());
	System.out.println("Now value is :"+h1);
	
	h1.remove(28);
	System.out.println("Now size is :"+h1.size());
	System.out.println("Now value is :"+h1);
	
	h1.remove("Surat");
	System.out.println("Now size is :"+h1.size());
	System.out.println("Now value is :"+h1);
	
}
}
