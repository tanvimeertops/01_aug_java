package com.basic;
/*
 * Condition operator: 
 * 
 * if :if statement is true it print true statement else
 * nothing
 * if else
 * nested if 
 * else if ladder
 * switch
 */
public class ConditionOperator {
public static void main(String[] args) {
	int a=10;
	if(a>10) {
		System.out.println("A greater than 10");
	}else {
		System.out.println("A is smaller than 10");
	}
	
	int num1=10,num2=85;
//	if(num1>num2) {
//		System.out.println("Number 1 is greater");
//	}else {
//		System.out.println("Number 2 is greater");
//	}
	
	System.out.println("max num is :"+Math.min(num1, num2));
}
}
