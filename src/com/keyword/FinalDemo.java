package com.keyword;
/*
 * Final: constant at value side 
 * use with variable:
 * 1.must initialize at the time of declaration
 * 2.cannot change the value at run time as well as at
 * compile time
 * 
 * use with method: 
 * opposite of abstract
 * use with class
 * opposite of abstract
 */
 class FDemo{
	final int roll_no = 123;
	String name;
	
	public final void setData() {
		name="roshan";
	}
	public void show() {
		System.out.println("roll no :"+roll_no);
		System.out.println("name :"+name);
	}
}
//class Demo extends FDemo {
//	
//}
public class FinalDemo {
public static void main(String[] args) {
	FDemo fd=new FDemo();
	fd.setData();
	fd.show();
}
}
