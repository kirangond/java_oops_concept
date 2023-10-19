package com.filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class A1FileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         try {
			FileReader fr = new FileReader("C:/Users/AC93983/OneDrive - Lumen/Documents/Java/file/1.txt");
			for(int i=0;i<5;i++)
			{
				System.out.print((char)fr.read());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
