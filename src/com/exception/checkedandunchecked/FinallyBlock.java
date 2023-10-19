package com.exception.checkedandunchecked;

//whether exception occurs or not handled but finally block will get executed
public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("before try block: ");
		
		try {
			System.out.println("Inside try block: ");
			System.out.println(10/0); // ArithmeticException
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("successfully handled the exception");
			
		}finally
		{
			System.out.println("it must execute finally block");
		}

	}

}
