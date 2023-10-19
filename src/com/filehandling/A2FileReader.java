package com.filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class A2FileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileReader fr = new FileReader("C:/Users/AC93983/OneDrive - Lumen/Documents/Java/file/1.txt");
			char x[] = new char[5];
			fr.read(x);
			
			for(char c:x)
			{
				System.out.print(c);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
