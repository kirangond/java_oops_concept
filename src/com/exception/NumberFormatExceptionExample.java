package com.exception;
//if we write multiple print statement in catch block it will get executed if exception occures
//In the try block if the line giving exception further next line will not get executed hence use other lines before the it tends to give exception
public class NumberFormatExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("1");
		System.out.println("2");
		try {
			System.out.println("will  get executed before exception");
			int i = Integer.parseInt("kiran");
			System.out.println("will not get executed further after exception");
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("NumberFormatException:"+e);
			System.out.println("hey");
		}
		
		System.out.println("3");

	}

}
