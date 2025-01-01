package com.collection;

import java.util.HashSet;

/*
 * 2.HashSet :
 * 	1.It is a dynamic array
 * 	2.Automatically shrink and grow
 * 	3.default value is []
 * 	4.default size is 0
 * 	5.add() remove()
 * 	6. All values has its own hash key
 * 	7. All hash key are converted into hash code and values
 * are stored hash code wise
 *  8.Automatically implements Set interface
 *  9.duplicate value are not allowed
 */
public class HashSetDemo123 {
public static void main(String[] args) {
	HashSet h1=new HashSet();
	

	System.out.println("Default value is :"+h1);
	System.out.println("Default size is :"+h1.size());
	
	h1.add(100);
	h1.add(28.5f);
	h1.add('T');
	h1.add(new Integer(19));
	h1.add("tanvi");
	System.out.println("Now value is :"+h1);
	System.out.println("Now size is :"+h1.size());
	
	h1.add("tanvi");
	System.out.println("Now value is :"+h1);
	System.out.println("Now size is :"+h1.size());
	
	h1.remove('T');
	System.out.println("Now value is :"+h1);
	System.out.println("Now size is :"+h1.size());
}
}
