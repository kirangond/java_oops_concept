package com.contructor;

public class A2 {

	A2(int i)
	{
		System.out.println(i);
	}
	A2(char i)
	{
		System.out.println(i);
	}
	public static void main(String[] args) {
     A2 a = new A2(100);
     A2 a1 = new A2('a');
     

	}

}
