package com.throwkeyword.throwskeyword;

import java.io.FileWriter;
import java.io.IOException;

public class A {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//the calling method statement should be surrounded withing try and catch block
		A a = new A();
		try {
			a.test();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   //a.test(); //un handled exception
		
	}
	
	public void test() throws IOException
	{
		//we can handle expection using try and catch block other way using throws keyword
		FileWriter fw = new FileWriter("C://1.txt");
	}

}
