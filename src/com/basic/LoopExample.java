package com.basic;
/*
 * Factorial: 
 * 5
 * 5*4*3*2*1=120
 * 
 */
public class LoopExample {
public static void main(String[] args) {
	int fact = 1;
//	for (int i = 5; i >=1; i--) {
//		fact=fact*i;
//	}
//	System.out.println(fact);
	
	int i=5;
	while (i>=1) {
		fact=fact*i;
		i--;
		
	}
	System.out.println(fact);
}
}
