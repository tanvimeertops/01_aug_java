package com.oops;
/*
 * Function: does something
 * types:
 * 1.Function without parameter and without return type
 * 2.Function with parameter and without return type
 * 3.Function without parameter and with return type
 * 4.Function with parameter and with return type
 *  
 * Polymorphism: one name multiple form
 * 
 * 1.function overloading (compile time polymorphism)
 * 2.function overriding (runtime polymorphism)
 * 
 */
class Calculator{
	int num1=12,num2=2;
	//1.Function without parameter and without return type
	public void sum() {
		System.out.println("sum is :"+(num1+num2));
	}
	
	
	//2.Function with parameter and without return type
	public void sum(int a,int b) {
		System.out.println("sum is :"+(a+b));
	}
	//3.Function without parameter and with return type
	public int mul() {
		return (num1*num2);
	}
	
	// 4.Function with parameter and with return type
	public int mul(int a,int b) {
		return (a*b);
	}
	
}
public class FunctionDemo {
public static void main(String[] args) {
	Calculator calc=new Calculator();
	calc.sum();
	calc.sum(100,50);
	System.out.println("mul is :"+calc.mul());
	System.out.println("mul is :"+calc.mul(100,8));
	
	
}
}
