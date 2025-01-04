package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * HashMap:
 * 1.It is a dynamic Array
 * 2.Default value is {}
 * 3.Default size is 0
 * 4.value stored in pair <K,V>
 * 5.All pair has its own  hash key all hash key are 
 * converted into hash code
 * 6.The value are stored hash code wise
 * 7.put() and remove() 
 * 8.Automatically shrink and grow
 * 9.Duplicate keys are not allowed
 * 10.Automatically implements Map interface
 */
public class HashMapDemo {
public static void main(String[] args) {
	HashMap h1=new HashMap();
	
	System.out.println("Default size is :"+h1.size());
	System.out.println("Default value is :"+h1);
	
	h1.put(1, "prachi");
	h1.put("himanshu", "patel");
	h1.put("pratixa", 45.7f);
	h1.put(new Integer(69), 0);
	
	System.out.println("Now size is :"+h1.size());
	System.out.println("Now value is :"+h1);
	
	h1.put(1, "tanvi");
	System.out.println("Now size is :"+h1.size());
	System.out.println("Now value is :"+h1);
	
	h1.put(2, "tanvi");
	System.out.println("Now size is :"+h1.size());
	System.out.println("Now value is :"+h1);
	
	h1.remove(1);
	System.out.println("Now size is :"+h1.size());
	System.out.println("Now value is :"+h1);
	
	Set s1=h1.entrySet();
	
	Iterator i1=s1.iterator();
	
	while (i1.hasNext()) {
//		System.out.println(i1.next());
		
		Map.Entry me=(Map.Entry) i1.next();
		
		System.out.println("key is :"+me.getKey());
		System.out.println("value is :"+me.getValue());
		
	}
}
}
