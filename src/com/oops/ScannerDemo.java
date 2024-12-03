package com.oops;

import java.util.Scanner;

/*
 * Scanner: it is a class
 * 1.main purpose is to take input from the user
 * 2.it has argument as System.in
 * 3.derive from java util package
 * 
 * Data 			Func
 * int				nextInt()
 * double			nextDouble()
 * char 			next().charAt(0)
 * 
 * String
 * next()       read upto space
 * nextLine()   read upto enter
 * 
 * 
 */
public class ScannerDemo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Scanner sc1=new Scanner(System.in);
	
	int a,b;
	System.out.println("enter value in a:");
	a=sc.nextInt();
	System.out.println("enter value in b:");
	b=sc.nextInt();
	
	System.err.println("sum is :"+(a+b));
	
	char ch;
	System.out.println("enter char value:");
	ch=sc.next().charAt(0);
	
	System.out.println("char value is :"+ch);
	
	String name;
//	sc.nextLine();//buffer clean
	System.out.println("Enter your name ?");
	name=sc1.nextLine();
	
	System.out.println("name is :"+name);
}
}
