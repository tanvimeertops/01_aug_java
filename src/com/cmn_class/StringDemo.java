package com.cmn_class;
/*
 * Common class: 
 * String: 
 * It is immutable 
 * StringBuffer
 * Wrapper class
 * Object
 * 
 * 
 */
public class StringDemo {
public static void main(String[] args) {
	String s1="This is Tops Technologies...";
	
	System.out.println("original string is :"+s1);
	System.out.println("length of string is :"+s1.length());
	
	System.out.println("String to lower case :"+s1.toLowerCase());
	System.out.println("String to upper case :"+s1.toUpperCase());
	System.out.println("Substring  :"+s1.substring(2));
	System.out.println("Substring  :"+s1.substring(2,7));
	
	if(s1.equalsIgnoreCase("this is Tops Technologies...")) {
		System.out.println("same string ");
	}else {
		System.out.println("Different string");
	}
	System.out.println("original string is :"+s1);
	System.out.println("length of string is :"+s1.length());
}
}
