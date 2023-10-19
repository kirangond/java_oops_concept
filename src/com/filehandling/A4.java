package com.filehandling;

import java.io.File;

public class A4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:/Users/AC93983/OneDrive - Lumen/Documents/Java/file");
		//count all files in it(both files and folder)
		f.list();
		System.out.println(f.list()); //it will return the address
		//retrieve the files from that address
		String[] list = f.list();
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println(list.length);
		
	}

}
