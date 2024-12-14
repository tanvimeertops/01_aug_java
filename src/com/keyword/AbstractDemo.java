package com.keyword;

import java.lang.invoke.StringConcatFactory;

/*
 * Keyword: 
 * super
 * abstract:Hiding details and showing only essential information
 * use with class:
 * 1.we cannot make object of abstract class
 * 2.must inherit into some other class
 * use with function:
 * 1. abstract method cannot have body
 * 2.must override into child class
 * 3.class must be abstract for abstract method
 * final
 * this
 * static
 * interface
 * 
 */

 abstract class ADemo{
	int roll_no;
	String name;
	
	public abstract void setData();
	public void show() {
		System.out.println("roll no :"+roll_no);
		System.out.println("name :"+name);
	}
}
 class Demo extends ADemo{

	@Override
	public void setData() {
		roll_no=133;
		name="roshan";
		
	}
	  
 }
 
public class AbstractDemo {
public static void main(String[] args) {
	Demo ad=new Demo();
	
	ad.setData();
	ad.show();
}
}
