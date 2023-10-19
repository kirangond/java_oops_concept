package com.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class ABufferReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			FileReader file = new FileReader("C:/Users/AC93983/OneDrive - Lumen/Documents/Java/file/1.txt");
			//BufferedReader br1 = new BufferedReader("C:/Users/AC93983/OneDrive - Lumen/Documents/Java/file/1.txt");//we can't pass the file directly because of performance improvisation
			BufferedReader br = new BufferedReader(file);
			System.out.println(br.readLine()); //read line by line
			System.out.println(br.readLine());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
	}

}
