package com.exception;
//only one exception at a time occurs
public class OnlyOneAtTimeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1");
		
		try {
			int i = Integer.parseInt("kiran");
			System.out.println(10/0);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}
