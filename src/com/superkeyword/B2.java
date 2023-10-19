package com.superkeyword;

public class B2 extends A1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B2 b = new B2();
	//	System.out.println(super.i); // cannot use super in static method
		b.test();
		

	}

	private void test() {
		// TODO Auto-generated method stub
		System.out.println(super.i);
		System.out.println(super.j);
		super.test1();
		super.test2();
	}

}
