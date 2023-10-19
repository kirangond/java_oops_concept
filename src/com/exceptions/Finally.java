package com.exceptions;

public class Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int i = 10;
			int j = 0;
			int k = i/j;
			System.out.println(100);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		finally
		{
			System.out.println(500);
		}

	}

}
