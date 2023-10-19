package com.polymorphism;

public class B extends A{
        public void test()
        {
        	System.out.println(1000);
        }
	public static void main(String[] args) {
		B b = new B();
		b.test();
		
		A a  = new A();
		a.test();

	}

}
