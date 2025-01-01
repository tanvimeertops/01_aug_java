package com.collection;

import java.util.HashSet;

/*
 * Hashset
 * 1.It is a dynamic Array
 * 2.Default value is []
 * 3.Default size is 0
 * 4.All value has its own  hash key all hash key are 
 * converted into hash code
 * 5.The value are stored hash code wise
 * 6.add() and remove() 
 * 7.Automatically shrink and grow
 * 8.Duplicate values are not allowed
 * 9.Automatically implements Set interface
 */
public class HashSetDemo {
public static void main(String[] args) {
	
	HashSet h1=new HashSet();
	
	System.out.println("Default size is :"+h1.size());
	System.out.println("Default value is :"+h1);
	
	h1.add(67);
	h1.add(89.676);
	h1.add('T');
	h1.add(new Integer(100));
	h1.add("tanvi");
	h1.add(null);
	h1.add(null);
	
	System.out.println("Now size is :"+h1.size());
	System.out.println("Now value is :"+h1);
	h1.add("tanvi");
	
	
	System.out.println("Now size is :"+h1.size());
	System.out.println("Now value is :"+h1);

	h1.remove("tanvi");
	System.out.println("Now size is :"+h1.size());
	System.out.println("Now value is :"+h1);
	
	h1.remove(89.676);
	System.out.println("Now size is :"+h1.size());
	System.out.println("Now value is :"+h1);

}
}
