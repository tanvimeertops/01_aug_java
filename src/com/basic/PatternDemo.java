package com.basic;
/*
 * 
 * for i: 
 * initialization:
 * first number in pattern
 * 
 * condition :
 * last number of a pattern
 * 
 * min to max: <=
 * max to min: >=
 * 
 * 
 * incree/decree
 * <=, ++
 * >=, --
 * 
 * for j:
 * initialization: 
 * first col of each row
 * same number: that number only
 * diff number : upper loop name
 * 
 * condition :
 * last col of each row
 * same number: that number only
 * diff number : upper loop name
 * incree/decree:
 * <= ,++
 * >= ,--
 * 
 * 
 */
public class PatternDemo {
public static void main(String[] args) {
	/*
	 * 1
	 * 12
	 * 123
	 * 1234
	 * 12345
	 * 
	 * 5
	 * 54
	 * 543
	 * 5432
	 * 54321
	 * 
	 * 5
	 * 45
	 * 345
	 * 2345
	 * 12345
	 * 
	 * 1
	 * 21
	 * 321
	 * 4321
	 * 54321
	 * 
	 * 1
	 * 10
	 * 101
	 * 1010
	 * 10101
	 * 
	 *      1
	 *     1 2
	 *    1 2 3
	 *   1 2 3 4
	 *  1 2 3 4 5
	 * 
	 * odd/even formula
	 * for k: 
	 * completely depends on i
	 * 
	 *       *    1   2-1
	 *      ***   3   4-1
	 *     *****  5   6-1
	 *      ***
	 *       *
	 *       
	 *    a
	 *    ab
	 *    abc
	 *    abcd
	 *    abcde
	 *    
	 *    a
	 *    bc
	 *    def
	 *    ghij
	 *    klmno
	 */
	for (char i = 'a'; i <='e'; i++) {
//		for (int k = i; k <=3; k++) {
//			System.out.print(" ");
//		}
		for (char j = 'a'; j <=i; j++) {
			System.out.print(j);
		}
		System.out.println();
	}
	
//	for (int i = 2; i >=1; i--) {
//		for (int k = i; k <=3; k++) {
//			System.out.print(" ");
//		}
//		for (int j =i*2-1 ; j >=1; j--) {
//			System.out.print("*");
//		}
//		System.out.println();
//	}
	
	
}
}
