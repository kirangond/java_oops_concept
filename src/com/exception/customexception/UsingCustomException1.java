package com.exception.customexception;

public class UsingCustomException1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 100;
		int j = 0;
		
		if(j==0)
		{
			try {
				System.out.println("Comes under try block");
				//throw new CustomException1(); //default constructor calling of CustomException1 class
				throw new CustomException1("custom exception");
			} catch (CustomException1 e) {
				// TODO: handle exception
				System.out.println("CustomException1");
				
			}
		}
		else
		{
			int result = 0;
			result = i/j;
			System.out.println("result: "+result);
		}

	}

}
