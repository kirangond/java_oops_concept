package com.contructor;
//calling constructor using this keyword with arguments
public class C {

	C()
	{
		this(200);
		System.out.println(100);
	}
	public C(int i) {
		System.out.println(200);
	}
	public static void main(String[] args) {
		 C a = new C();

	}

}
