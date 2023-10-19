package com.deserilization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;


public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//To write the content into the .ser file
			FileOutputStream fos = new FileOutputStream("C:/Users/AC93983/OneDrive - Lumen/Documents/Java/file/file.ser");
			//in the form of streams 0's and 1's
			ObjectOutputStream ous = new ObjectOutputStream(fos);
			A a = new A();
			//passing(writing) object reference to the .ser file
		    ous.writeObject(a);
		    ous.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
