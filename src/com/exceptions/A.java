package com.exceptions;

public class A {
	
	static String error_message="Execption occured halt it: ";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int x = 10;
			int y = 0;
			int z = x/y;
			System.out.println(100);
			
		}
//		catch (ArithmeticException e) {
//			// TODO: handle exception
//			System.out.println("Exception will throw: ");
//			System.out.println(e);
//			System.out.println("Exception  thrown: " + e);
//			
//		} 
		catch (Exception e) {
			// TODO: handle exception
//			System.out.println("we will get exception: " + error_message + e);
			//in depth message it will give
			e.printStackTrace();
		}

	}

}
