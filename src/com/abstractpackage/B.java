package com.abstractpackage;

public class B extends A{

	@Override
	public void test()
	{
		System.out.println(500);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b = new B();
		System.out.println(System.getProperty("java.version"));
		b.test();
        b.test2();
		

	}

}
