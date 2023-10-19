package com.throwkeyword.throwskeyword;

import java.io.FileWriter;
import java.io.IOException;

//passing exception from test to main method JVM will call the test() method
public class A1 {

	public static void main(String[] args) throws Exception {
		
		A1 a = new A1();
		a.test();

	}

	private void test() throws Exception {
		FileWriter fw = new FileWriter("c://a.txt");
		
		
	}

}
