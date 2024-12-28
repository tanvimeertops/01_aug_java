package com.fileIO;
/*
 * File: 
 * it is a class
 * 
 */

import java.io.File;
import java.io.IOException;

class FDemo{
	File f1;
	public FDemo() {
		f1=new File("file3.txt");
		try {
			f1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		display();
	}
	
	public void display() {
		System.out.println("is file or not "+f1.isFile());
		System.out.println("is directory or not "+f1.isDirectory());
		System.out.println("can read or not "+f1.canRead());
		System.out.println("can write or not "+f1.canWrite());
		System.out.println("can execute or not "+f1.canExecute());
		System.out.println("file name: "+f1.getName());
		System.out.println("file path: "+f1.getPath());
		System.out.println("absolute file path: "+f1.getAbsolutePath());
	}
}
public class FileDemo {
public static void main(String[] args) {
	new FDemo();
}
}
