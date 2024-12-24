package com.exception;
/*
 * Exception: Any abnormal condition
 * Exception class is root class of all exception class
 * Error: 
 * 1.compile time error: , } ; missing syntax error
 * 2.run time error : 
 * Arithmetic exception
 * ArrayIndexOutofBound 
 * 3.error : developer mistake
 * 
 * 1.try 
 * 		1. if we have a doubt that any might have error
 * we keep that code inside try block
 * 		2.try skips the error code and execute remaining code
 * 		3.try throws the error to catch
 * 		4.try followed by catch or finally or both
 * 2.catch : 
 * 		1.handles the error thrown by try
 * 		2.there can be multiple catch
 * 3.finally : 
 *    whether error is there or not finally 
 *    block will be executed
 * 4.throw
 * 5.throws
 * 
 * 
 */
public class ExceptionDemo {
public static void main(String[] args) {
	int a=20,b=2;
	
	try {
		System.out.println("div is :"+a/b);
	} catch (ArithmeticException e) {
		e.printStackTrace();
	}finally {
		System.out.println("For any query contact tops");
	}
	
	
	System.out.println("This code is written by tanvi");
	
	
	
	
}
}
