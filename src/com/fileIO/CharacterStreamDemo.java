package com.fileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * CharacterStream 2byte/char
 *     
 *     FileWriter
 * 		to write data into file
 * 
 * 		FileReader
 * 		to read data from the file
 */
public class CharacterStreamDemo {
public static void main(String[] args) {
	
		//to create and open file
		try {
			FileWriter fw=new FileWriter("file2.txt",true);
			String str="\n hi there ";
			fw.write(str);
			fw.flush();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		try {
			FileReader fr=new FileReader("file2.txt");
			int x;
			while ((x=fr.read())!=-1) {
				System.out.print((char)x);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		}
	

}

