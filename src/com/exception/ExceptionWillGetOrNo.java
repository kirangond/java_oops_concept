package com.exception;

public class ExceptionWillGetOrNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExceptionWillGetOrNo exceptionWillGetOrNo = new ExceptionWillGetOrNo();
		//print object reference
		
		System.out.println("exceptionWillGetOrNo address: " + exceptionWillGetOrNo);

		exceptionWillGetOrNo = null;
		
		System.out.println("after pointing to null : " + exceptionWillGetOrNo);
	}

}
