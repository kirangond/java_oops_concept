package com.exceptions;

import java.io.FileWriter;
import java.io.IOException;

public class Finally1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fw =  null;
		try {
			 fw = new FileWriter("C:/Users/AC93983/OneDrive - Lumen/Documents/Java/file/1.txt");
			int i = 10/0;
			fw.write("exception");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				fw.close();
				System.out.println("closed the file");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
