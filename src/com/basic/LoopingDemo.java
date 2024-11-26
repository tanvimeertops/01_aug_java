package com.basic;
/*
 * Loop: repetitive, iterative
 * 
 * entry control:
 * for loop
 * syn
 * for(initialization;condition;incree/decree)
 * while
 * initialization
 * while(condition){
 * syso
 * incree/decree
 * }
 * exit control :
 * do while
 */
public class LoopingDemo {
public static void main(String[] args) {
	/*
	 * print 1 to 5 number
	 */
	
//	System.out.println("1");
//	System.out.println("2");
//	System.out.println("3");
//	System.out.println("4");
//	System.out.println("5");
	
	for (int i = 1; i <=5; i++) {//6
		System.out.println(i);//5
	}
	
	//11 times lines executed
	
//	int i=1;//1
//	while (i<=5) {//6
//		System.out.println(i);//5
//		i++;//5
//	}
	//17 times lines executed
	
	
	int i=1;//1
	do { //5
		System.out.println(i);//5
		i++;//5
	} while (i<=5);//5
	//21 times lines executed
}
}
