package com.oops;

class Parent {
	String p_name;
	long ph_no;
	
	public void setParentData() {
		p_name="salim khan";
		ph_no=8888888888l;
	}
	
}
class Child1 extends Parent{
	
	String name="salman";
	
	public void show() {
		System.out.println("For any complain of "
				+name+" "+p_name+" call "+ph_no);
	}
}

class Child2 extends Parent{
String name="suhail";
	
	public void show() {
		System.out.println("For any complain of "
				+name+" "+p_name+" call "+ph_no);
	}
}
public class HierarchicalDemo {
public static void main(String[] args) {
	Child1 c1=new Child1();
	Child2 c2=new Child2();
	
	c1.setParentData();
	c1.show();
	
	c2.setParentData();
	c2.show();
}
}
