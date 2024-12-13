package com.oops;
/*
 * Polymorphism : one name multiple form
 * 1.compile time polymorpshism
 *    function overloading
 * 1.runtime time polymorpshism
 * 		Function overriding : same function with same prototype
 * but diff definition
 * 
 * super keyword: calls the function of immediate parent
 */
class A{
	public A() {
		System.out.println("IN constrcutor A");
	}
	public void show() {
		System.out.println("In A show");
	}
}
class B extends A{
	public B() {
		System.out.println("IN constrcutor B");
	}
	public void show() {
		super.show();
		System.out.println("In B show");
	}
}

class C extends B{
	public C() {
		System.out.println("IN constrcutor C");
	}
	public void show() {
		super.show();
		System.out.println("In C show");
	}
}
public class ConstructorChaining {
public static void main(String[] args) {
	C c=new C();
	c.show();
}
}
