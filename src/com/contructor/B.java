package com.contructor;

public class B {
 //It's a method you need to call explicitly
	 void B()
	{
		System.out.println("It's a method now");
	}
	public static void main(String[] args) {
		
		
		B a = new B();
		a.B();//explicitly calling

	}

}
