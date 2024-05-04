package com.typecasting;

public class B1 implements A1 {

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println(100);

	}
	public static void main(String args[])
	{
		A1 a=new B1(); //auto upcasting
		a.test();
	}

}
