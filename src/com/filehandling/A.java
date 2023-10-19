package com.filehandling;

import java.io.File;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f = new File("C:\\Users");
		System.out.println(f); //It will print the path not object reference
		boolean exists = f.exists(); //to check return type of method ctrl+1 assign to local variable.
		System.out.println(exists);

	}

}
