package com.cmn_class;
/*
 * Wrapper class: convert primitive data type to non primitive 
 * data type and vice a versa
 * 
 * datatype     Wrapper class
 * int			Integer
 * float		Float
 * char			Character
 * 
 * 1.Autoboxing :direct value given to non primitive member
 * 2.Boxing: value first given to variable to object
 * 3.UnBoxing :object to variable
 * 
 * Object : root class for all java class
 * 
 * 
 */

class Calc{
	public void sum() {
		System.out.println(10+85);
	}
}
public class WrapperClassDemo {
public static void main(String[] args) {
	String s1="150";
	String s2="786";
	
	System.out.println("auto boxing is :"+s1);
	int i2=100;
	Integer i1=new Integer(i2);
	System.out.println("Boxing is :"+i1);
	
	int i3=i1;
	System.out.println("Unboxing is :"+i3);
	
	float i4=Float.parseFloat(s1);
	int i5=Integer.parseInt(s2);
	System.out.println(i4+i5);
	
	String s4=i1.toString();
	System.out.println("s4 :"+s4);
	
	Calc c1=new Calc();
	c1.sum();
}
}
