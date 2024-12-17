package com.keyword;
/*
 * Static : constant at memory side
 * 
 * use with variable: opposite of final
 * use with method: 
 * 1.only static members are allowed in static method
 * 2.all members inside static method are static by default
 * 3.before static method was called by class only
 * but now we can call static by object.
 */
 class SDemo{
	int no;
	static int s_no;
	
//	public static void show() {
//		s_no=123;
//		int r_no=678;
//		System.out.println("s no is :"+s_no);
//		System.out.println("r no is :"+r_no);
//		
//	}
}
public class StaticDemo {
public static void main(String[] args) {
	SDemo s1=new SDemo();
	SDemo s2=new SDemo();
	SDemo s3=new SDemo();
	
//	SDemo.show();
	
	s1.no=1;//4
	s2.no=2;//4
	s3.no=3;//4
	
	s1.s_no=10;
	s2.s_no=20;//4 bytes
	s3.s_no=30;
	
	System.out.println("s1 no is :"+s1.no);
	System.out.println("s2 no is :"+s2.no);
	System.out.println("s3 no is :"+s3.no);
	
	System.out.println("s1 s_no is :"+s1.s_no);
	System.out.println("s2 s_no is :"+s2.s_no);
	System.out.println("s3 s_no is :"+s3.s_no);
}
}
