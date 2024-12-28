package com.fileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * File: 
 * it is a class
 * use to store data permanently
 * Stream: the source in which data is stored
 * 
 *     Byte Stream 1byte/char
 * 		
 * 		FileOutputStream
 * 		to write data into file
 * 
 * 		FileInputStream
 * 		to read data from the file
 * 
 * 
 *     CharacterStream 2byte/char
 *     
 *     FileWriter
 * 		to write data into file
 * 
 * 		FileReader
 * 		to read data from the file
 * 
 * must have exception:
 * 1.FileNotFound
 * 2.IOException
 */

public class ByteStreamDemo {
public static void main(String[] args) {
	
	
	try {
		//to create and open file
		FileOutputStream fos=new FileOutputStream("file1.txt",true);
		String str="\n hi there ";
		byte[] b1=str.getBytes();
		//to write data into file
		fos.write(b1);
		//to flush object
		fos.flush();
		//to close the file
		System.out.println("data written...");
		fos.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	try {
		FileInputStream fis=new FileInputStream("file1.txt");
		int x;
		while ((x=fis.read())!=-1) {
			System.out.print((char)x);
			
		}
		fis.close();
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	
	
}
	
	
}
