package com.keyword;
/*
 * Interface:
 * 1.same as class but we cannot create object of interface
 * 2.interface contains only data member and member function
 * 3.all data are final by default
 * 4.all functions are abstract by default
 * 5.main purpose is to resolve problem of multiple inheritance
 * 6.use "implements" keyword to inherit interface
 * 7.pure data hiding 
 */

class Result {
	String grade="A+";
}

class IDemo extends Result implements InterDemo {

	@Override
	public void show() {
		System.out.println("i no is :"+i_no);
		System.out.println("grade is :"+grade);
		System.out.println("i 1 is :"+i1);
	}
	
}
public class InterfaceDemo {
public static void main(String[] args) {
	IDemo id=new IDemo();
	id.show();
}
}
