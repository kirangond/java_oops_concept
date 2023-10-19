package com.deserilization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileInputStream fis;
		try {
			fis = new FileInputStream("C:/Users/AC93983/OneDrive - Lumen/Documents/Java/file/file.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			A a2 = (A) ois.readObject();
			System.out.println(a2.password);
			System.out.println(a2.username);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
