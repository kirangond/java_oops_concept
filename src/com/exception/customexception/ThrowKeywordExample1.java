package com.exception.customexception;

//throws will only raise the exception it will not handle
//
public class ThrowKeywordExample1 {

	public static void main(String[] args) throws ArithmeticException
	{
		// TODO Auto-generated method stub
		
		System.out.println("starts the program");
		
		try {
//			System.out.println(10/0);
		} catch (ArithmeticException e) {
			// TODO: handle exception
		}
		
		
		System.out.println("ends the program");

	

	}

}
