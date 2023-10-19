package com.interfaces;

public class B2 implements A2 {

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("From test1");

	}

	@Override
	public void test(int i) {
		// TODO Auto-generated method stub
		System.out.println("From test1"+i);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B2 b = new B2();
		b.test();
		b.test(100);

	}

}
