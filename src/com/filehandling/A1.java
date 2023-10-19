package com.filehandling;

import java.io.File;
import java.io.IOException;

public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f = new File("C:/Users/AC93983/OneDrive - Lumen/Documents/Java/be10.txt");
	 //to check file is present in the provided path
		boolean exists = f.exists();
		System.out.println(exists);
		
		try {
			//it will create a file if does not exists, if exists it will throw error
			//over writing of file will not happen
			boolean createNewFile = f.createNewFile();
			System.out.println(createNewFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
