package com.oops;
/*
 * Constructor: it is a special member function
 * which is initialized by its own
 * 
 * 1.same name as class name
 * 2.no return type
 * 3.it is called automatically whenever object is created
 * 
 *  types:
 *  1.Default constructor (without parameter)
 *  2.Parameterized constructor(with parameter)
 *  3.Copy constructor(object as parameter)clone the object
 *  
 */
class Box{
	double length,width,depth;
	//1.Default constructor (without parameter)
	public Box() {
		System.out.println("In Default Constructor");
		length=1;
		width=2;
		depth=3;
	}

	//2.Parameterized constructor(with parameter)
	public Box(double l,double w,double d) {
		System.out.println("In Parametarized Constructor");
		length=l;
		width=w;
		depth=d;
	}
	//3.Copy constructor(object as parameter)
	public Box(Box b) {
		System.out.println("In Copy Constructor");
		length=b.length;
		width=b.width;
		depth=b.depth;
	}
	public void volOfBox() {
		System.out.println("vol of vox is :"+(length*width*depth));
	}

}
public class ConstructorDemo {
public static void main(String[] args) {
	Box dc=new Box();
	dc.volOfBox();
	Box pc=new Box(10, 20, 30);
	pc.volOfBox();
	Box cc=new Box(dc);
	cc.volOfBox();
}
}
