package com.exception;
//in prod env we should not use printStackTrace() method due to security issue
public class UsingePrintStackTrace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1");
		try
		{
			System.out.println(10/0);
		}catch(Exception e)
		{
			//e.printStackTrace() will show what type of exception and at which line number
			e.printStackTrace();
		}
		System.out.println("2");
		
		System.out.println("3");

	}

}
