package com.exceptions;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int x = 10;
			int y = 20;
			int z = x/y;
			System.out.println(100);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			e.printStackTrace();
		}

	}

}
