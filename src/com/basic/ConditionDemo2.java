package com.basic;
/*
 * Nested if: 
 * a=34
 * b=45
 * c=12
 * else if ladder
 * logical operator: 
 * && || !
 * && all condition must be true
 * || any one condition can be true
 * ! opposite
 */
public class ConditionDemo2 {
public static void main(String[] args) {
	int a=340,b=450,c=1200;
//	if(a>b) {
//		if(a>c) {
//			System.out.println("A is greater");
//		}else {
//			System.out.println("C is greater");
//		}
//	}else {
//		if(b>c) {
//			System.out.println("B is greater");
//		}else {
//			System.out.println("c is greater");
//		}
//	}
	
	if(a>b && a>c) {
		System.out.println("A is greater");
	}else if (b>a && b>c) {
		System.out.println("B is greater");
	}else if (c>a && c>b) {
		System.out.println("C is greater");
	}
	/*
	 * grade
	 */
	double percentage=32;
	if(percentage>=70) {
		System.out.println("Distinction");
	}else if (percentage>=60) {
		System.out.println("First Class");
	}else if(percentage>=50) {
		System.out.println("Second Class");
	}else if(percentage>=35) {
		System.out.println("Third Class");
	}else {
		System.out.println("Fail");
	}
	
	
}
}
