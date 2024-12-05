package com.oops;

import java.util.Scanner;

/*
 * Jagged Array: no of row is fixed but no of col is not
 * same as 2D array
 * eg:
 * 1 2 3
 * 1
 * 1 2 3 4 5
 * 1 2
 * 
 */
public class JaggedArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int nrow;
	System.out.println("enter no of row :");
	nrow=sc.nextInt();
	
	int[][] a=new int[nrow][];
	
	for (int i = 0; i < a.length; i++) {
		System.out.println( "enter no of col for row "+i+"=");
		a[i]=new int[sc.nextInt()];
	}
	
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
			a[i][j]=j+1;
			System.out.print(" "+a[i][j]);
		}
		System.out.println();
	}
	
}
}
