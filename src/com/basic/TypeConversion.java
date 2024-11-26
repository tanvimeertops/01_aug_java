package com.basic;
/*
 * type conversion: convert  one primitive datatype 
 * to another
 * 
 * types:
 * Implicit conversion: 
 * smaller datatype to bigger datatype
 * eg: 
 * 4 int i1=10;
 * 8 long l1=i1
 * 
 * Explicit conversion
 * bigger datatype to smaller datatype
 * 
 */
public class TypeConversion {
public static void main(String[] args) {
	int i1=2147483647; //4 byte
	long l1=i1;// 8 byte
	System.out.println("Implicit Conversion is :"+l1);
	/*
	 * -2147483648
	 * -2147483647
	 * -2147483646
	 * 
	 */
	int i2=(int)l1;
	System.out.println("Explicit Conversion is: "+i2);
//	
	int i3=513; //4 byte 
	byte b1=(byte)i3;//1 byte  //-128 -127 to 127
	//-128 to 127
//	
	System.out.println("Explicit Conversion is: "+b1);
//	
	char ch='a'; //2 byte
	int i5=ch; // 4
//	
	System.out.println("Char is : "+i5);
}
}
