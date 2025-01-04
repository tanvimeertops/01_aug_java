package com.collection;

import java.util.LinkedList;

public class LinkedListDemo {
public static void main(String[] args) {
	LinkedList l1=new LinkedList();
	
	l1.add(100);
	l1.add(28.9f);
	l1.add("tanvi");
	l1.add('T');
	
	System.out.println("Now value is: "+l1);
	System.out.println("Now size is: "+l1.size());
	
	l1.add("tanvi");
	System.out.println("Now value is: "+l1);
	System.out.println("Now size is: "+l1.size());
	
	l1.remove(2);
	System.out.println("Now value is: "+l1);
	System.out.println("Now size is: "+l1.size());
	
	l1.addFirst("19");
	System.out.println("Now value is: "+l1);
	System.out.println("Now size is: "+l1.size());
	
	l1.addLast("Tops");
	System.out.println("Now value is: "+l1);
	System.out.println("Now size is: "+l1.size());
	
	if(l1.contains("tanvi")) {
		System.out.println("list contains tanvi");
	}else {
		System.out.println("list not contains tanvi");
	}
	
}
}
