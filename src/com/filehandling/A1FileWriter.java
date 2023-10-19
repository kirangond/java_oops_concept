package com.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class A1FileWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileWriter fw = new FileWriter("C:/Users/AC93983/OneDrive - Lumen/Documents/Java/file/1.txt",true);
			//t will convert 97 into respective asci code in the file
			//fw.write(int c)
			fw.write(97);
			char[] cbuf={'a','b','c'};
			fw.write(cbuf);
			fw.flush();
			fw.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
