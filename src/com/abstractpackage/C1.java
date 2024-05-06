package com.abstractpackage;

public class C1 extends B1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C1 c = new C1();
		c.test();
		c.test2();

	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		System.out.println(200);
		
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println(100);
		
	}

}
