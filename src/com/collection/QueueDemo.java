package com.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
public static void main(String[] args) {
	Queue<String> q1=new LinkedList<String>();
	
	q1.add("Roshan");
	q1.add("drashti");
	q1.add("prachi");
	q1.add("hetal");
	
	for (String s : q1) {
		System.out.println(s);
	}
	
	System.out.println("peek first element :"+q1.peek());
	
	for (String s : q1) {
		System.out.println(s);
	}
	
	System.out.println("remove first element :"+q1.poll());
	for (String s : q1) {
		System.out.println(s);
	}
	
}
}
