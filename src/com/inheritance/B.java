package com.inheritance;

public class B extends A {

	public static void main(String[] args) {
		
		B b = new B();
		System.out.println(b.i);
        b.i = 100;
        System.out.println(b.i);
        b.test();
        
	}

}
