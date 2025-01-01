package com.collection;

import java.util.HashMap;

/*
 * HashMap :
 *  1.It is a dynamic array
 * 	2.Automatically shrink and grow
 * 	3.default value is {}
 * 	4.default size is 0
 * 	5.put() remove()
 *  6.it has pair <k,v>
 * 	7. All pair has its own hash key
 * 	8. All hash key are converted into hash code and values
 * are stored hash code wise
 *  9.Automatically implements Map interface
 *  10.duplicate keys are not allowed
 */
public class HashMapDemo123 {
public static void main(String[] args) {
	HashMap h1=new HashMap();
	
	System.out.println("Default value is :"+h1);
	System.out.println("Default size is :"+h1.size());
	
	h1.put(100, "roshan");
	h1.put("drashti", "patel");
	h1.put("pratixa", 28);
	System.out.println("Now value is :"+h1);
	System.out.println("Now size is :"+h1.size());
	
	h1.put(100, "himanshu");
	System.out.println("Now value is :"+h1);
	System.out.println("Now size is :"+h1.size());
	h1.put(19,28);
	System.out.println("Now value is :"+h1);
	System.out.println("Now size is :"+h1.size());
	
	h1.remove("drashti");
	System.out.println("Now value is :"+h1);
	System.out.println("Now size is :"+h1.size());
}
}
