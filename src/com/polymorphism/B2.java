package com.polymorphism;

public class B2 extends A2{

	public void x()
	{
		System.out.println(1);
	}

	public void z()
	{
		System.out.println(100);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B2  b = new B2();
		b.x();
		b.y();
		b.z();

	}

}
