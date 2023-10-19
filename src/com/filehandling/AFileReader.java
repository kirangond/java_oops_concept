package com.filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class AFileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader fr = new FileReader("C:/Users/AC93983/OneDrive - Lumen/Documents/Java/file/1.txt");
			int val = fr.read();
			System.out.println(val); // it will read only 1 character print the ascii code
			System.out.println((char)val);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
