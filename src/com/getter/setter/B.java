package com.getter.setter;

public class B {

	public static void main(String[] args) {
	   B a = new B();
	   a.test();
       System.out.println(a);
	}

	private void test() {
		System.out.println(this);
		
	}

}
