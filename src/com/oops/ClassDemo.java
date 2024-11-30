package com.oops;
/*
 * Oops:Object Oriented Programming
 * 
 *  Adv:
 *  1. code written in organize manner 
 *  2. code re usability
 *  Concept of oops:
 *  1.Class :  
 *  class is a collection of data member and 
 *  member function
 *  2.Object
 *  Object gives permission to access functionality of
 *  class
 *  
 *  3.Inheritance
 *  4.Encapsulation
 *  5.Polymorphism
 *  6.Abstraction

 */

 class Student123{
	int id;
	String name;
	
	public void setData() {
		id=123;
		name="pratixa";
	}
	
	public void show() {
		System.out.println("id is: "+id);
		System.out.println("name is: "+name);
	}
}
public class ClassDemo {
public static void main(String[] args) {
  //class_name obj_name=new class_name();
	Student123 s1=new Student123();
	
	s1.setData();
	s1.show();
}
}
