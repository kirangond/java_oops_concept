package com.exceptions;

public class A4 {
	int i = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			A4 a = null;
			System.out.println(a.i);
		} catch (NullPointerException | ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e);
		}
      System.out.println(100);
	}

}
