package com.basic;
/*
 * Arithmetic operator:
 * + - / * %
 * % modulus/modulo/mod
 */
public class CalcDemo {
public static void main(String[] args) {
	int a=20,b=0;
	
	System.out.println("sum is :"+(a+b));//31
	System.out.println("sub is :"+(a-b));//9
	System.out.println("mul is :"+a*b);//220
	float c=(float)a/b;
	System.out.println("div is :"+c);//1.81
	System.out.println("mod is :"+a%b);//9
	
	System.out.println(Math.max(a, b));
	
	double per_of_men=52;
	double litteracy=48;
	double per_literate_men=35;
	double total_population=80000;
	
	double total_men=(per_of_men/100)*total_population;
	System.out.println("total men: "+total_men);
	double total_literacy=(litteracy/100)*total_population;
	System.out.println("literacy per :"+total_literacy);
	double literate_men=(per_literate_men/100)*total_population;
	System.out.println("literate men :"+literate_men);
	
	
}
}
