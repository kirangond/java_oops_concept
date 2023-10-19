package com.polymorphism;

public class A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A3 a  = new A3();
		a.test();
		a.test(100);
		a.test("kiran");

	}

	private void test(String string) {
		// TODO Auto-generated method stub
		System.out.println("single argument with different data type");
		
	}

	private void test(int i) {
		// TODO Auto-generated method stub
		System.out.println("single argument");
		
	}
	

	private void test() {
		// TODO Auto-generated method stub
		System.out.println("zero parameter");
		
	}

}
