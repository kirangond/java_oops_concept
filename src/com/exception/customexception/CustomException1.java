package com.exception.customexception;

//we can't run the class if it does not have main method in it
public class CustomException1 extends Exception{
      
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	CustomException1() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	 CustomException1(String msg)
	 {
		 super(msg);
	 }
}



