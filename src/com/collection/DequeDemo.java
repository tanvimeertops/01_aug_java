package com.collection;

import java.util.Deque;
import java.util.LinkedList;

class Palindrome{
	public boolean isPalindrome(String txt) {
		Deque<Character> d2=new LinkedList<Character>();
		
		for (char c : txt.toCharArray()) {
			d2.addLast(c);
		}
		
		while (d2.size()>1) {
			if(!d2.pollFirst().equals(d2.pollLast())){
				return false;
			}
		}
		
		return true;
		
		
	}
}

public class DequeDemo {
public static void main(String[] args) {
	Deque<String> d1=new LinkedList<String>();
	
	d1.add("Roshan");
	d1.add("drashti");
	d1.add("prachi");
	d1.add("hetal");
	
	for (String s : d1) {
		System.out.println(s);
	}
	
	System.out.println("========after adding==========");
	d1.addFirst("Tops");
	for (String s : d1) {
		System.out.println(s);
	}
	
	System.out.println("========after adding==========");
	d1.addLast("Surat");
	for (String s : d1) {
		System.out.println(s);
	}
	
	String str="rasr";
	Palindrome p1=new Palindrome();	
	System.out.println("the given string "+str+" is palindrome "
			+ ":"+p1.isPalindrome(str));
	
}
}
