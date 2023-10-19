package com.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class AFileWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileWriter wr = new FileWriter("C:/Users/AC93983/OneDrive - Lumen/Documents/Java/file/1.txt",true);
			//fw.write(String str)
			wr.write("kiran"); //to write content into the file  //everytime we run the file previous data will get lost hence use boolean true value in calling FileWriter construct with true 
			wr.flush(); //from ram to .txt all data need to be pushed from pipeline
			wr.close(); //to save the file
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
