package com.inheritance;

public class B extends A {

	public static void main(String[] args) {
		 B b1 = new B();
	        System.out.println("b1 object: " + b1.i);
	        
		B b = new B();
		System.out.println(b.i);
        b.i = 100;
        System.out.println(b.i);
        System.out.println(b1.i);
        b.test();
        
       
        
	}

}
