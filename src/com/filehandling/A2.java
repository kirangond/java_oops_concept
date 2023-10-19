package com.filehandling;

import java.io.File;

public class A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:/Users/AC93983/OneDrive - Lumen/Documents/Java/be10.txt");
		//if file present and able to delete then it return true 
		boolean delete = f.delete();
		System.out.println(delete);

	}

}
