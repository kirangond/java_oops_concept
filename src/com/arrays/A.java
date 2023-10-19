package com.arrays;

public class A {

	public static void main(String[] args) {
		
		int x[] = {10,20,30,40};
		
		A a = new A();
		a.test(x); //passing address of x and not the array values
		System.out.println(x[0]);
	}
	// x and y pointing same object
		public void test(int[] y)
		{
			y[0]=1000;
			System.out.println(y[0]);
		}

}


