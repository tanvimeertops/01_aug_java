package com.oops;

import java.util.Scanner;

/*
 * 2D : multiple dimension array
 * combination of row and col
 * 
 * 
 */
public class Array2D {
public static void main(String[] args) {
	int[][] a=new int[4][3];
	int[][] b=new int[4][3];
	int[][] c=new int[4][3];
	Scanner sc=new Scanner(System.in);
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
			
			System.out.println("enter a["+i+"]["+j+"]=");
			a[i][j]=sc.nextInt();
		}
	}
	
	
	for (int i = 0; i < b.length; i++) {
		for (int j = 0; j < b[i].length; j++) {
			
			System.out.println("enter b["+i+"]["+j+"]=");
			b[i][j]=sc.nextInt();
		}
	}
	
	for (int i = 0; i < b.length; i++) {
		for (int j = 0; j < b[i].length; j++) {
			c[i][j]= a[i][j]+b[i][j];
		}
	}
	
	System.out.println("sum of 2 D array");
	
	for (int i = 0; i < c.length; i++) {
		for (int j = 0; j < c[i].length; j++) {
			System.out.print(" "+c[i][j]);
		}
		System.out.println();
	}
}
}
