package com.exception;

//During compile time you won't gate error for unchecked exception
//run time you will get ArithmeticException
//Exception it is generic exception
//mis match catch block will throw exception and will not execute further lines of code
//we can write multiple catch block with single try block.
//If the try block code tends to give exception it will search the catch block with related exception to catch
//try to give superior at last ex: ArithmeticException -- Exception -- Throwable
//we can't write any instructions b/w try and catch
//checked exception must be caught
//unchecked exception will be present in jre(ArithmeticException, NumberFormatException) -- Exception, Throwable also present in jar
public class ArithmeticExceptionExample {
	
	public static void main(String[] args)
	{
		//1 and 2 will get printed after that  exception further line of code will not executed
		//to get further line execute we need to catch the exception and execute further code in a class/method
		System.out.println("1");
		System.out.println("2");
		try {
			System.out.println(10/0); // java.lang.ArithmeticException
			//above line giving exception hence further line will not get execute in the try block
			System.out.println("handle exception successfully");
		}
		
		catch (NumberFormatException ex) {
			// TODO: handle exception
			System.out.println("miss match exception : "+ex);
			System.out.println(ex);
		}
		
		catch (ArithmeticException ex) {
			// TODO: handle exception
			System.out.println("cannot divide by zero : "+ex);
			System.out.println(ex);
		}
		catch (Exception ex) {
			// TODO: handle exception
			System.out.println("Generic Exception : "+ex);
			System.out.println(ex);
		}
	
		System.out.println("3");
		System.out.println("4");
	}

}
