package com.encapsulation;

public class B {
	
	public static void main(String[] args)
	{
		A a = new A();
		//System.out.println(a.name); // can't access private variable outside the class
	   a.setName("kiran");
	   System.out.println(a.getName());
	}

}
