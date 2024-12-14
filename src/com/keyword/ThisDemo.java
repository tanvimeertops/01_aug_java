package com.keyword;
/*
 * This : current class context
 * when the instant/global/class variable name is same as parameter name
 * we use this keyword with instant/global/class variable
 */

class TDemo{
	
	int num1,num2;
	
	public void setData(int num1,int num2) {
		this.num1=num1;
		this.num2=num2;
	}
	
	public void sum() {
		System.out.println("sum is :"+(num1+num2));
	}
}

public class ThisDemo {
public static void main(String[] args) {
	TDemo td=new TDemo();
	td.setData(10, 20);
	td.sum();
}
}
