package com.contructor;

public class A1 {

	A1()
	{
		System.out.println("default constructor");
	}
	A1(int i)
	{
		System.out.println("single args:"+i);
	}
	
	A1(int i, int j)
	{
		System.out.println(i);
		System.out.println(j);
	}
	public static void main(String[] args) {
		// Constructor overloading
		
		A1 a = new A1();
		A1 a1 = new A1(100);
		A1 a2 = new A1(200,300);

	}

}
