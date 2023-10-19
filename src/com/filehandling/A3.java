package com.filehandling;

import java.io.File;

public class A3 {
	public static void main(String[] args) {
		File f = new File("C:/Users/AC93983/OneDrive - Lumen/Documents/Java/file");
		//it will create the folder if does not exists and return true 
		boolean mkdir = f.mkdir();
		
		System.out.println(mkdir);
		
	}

}
