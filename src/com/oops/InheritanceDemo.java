package com.oops;
/*
 * Inheritance: deriving the attribute of some other class
 * object will be made for last child only
 * multiple inheritance is not supported in java
 * use "extends" keyword to inherit
 *  adv:
 *  re usability
 *  extentability
 *  less object creation
 *  
 *  types:
 *  Single
 *  Multilevel
 *  hierarchical
 *  Multiple
 *  hybrid
 *  
 */

 class Student{
	 int roll_no;
	 String name;
	 
	 public void setData() {
		roll_no=1;
		name="himanshu";
	}
 }
 
 class Sport extends Student{
	 int sport_marks=34;
	 
	 public void show() {
		System.out.println("roll no is :"+roll_no);
		System.out.println("name is :"+name);
		System.out.println("sport marks is :"+sport_marks);
	}
 }
public class InheritanceDemo {
public static void main(String[] args) {
	Sport sp=new Sport();
	sp.setData();
	sp.show();
}
}
