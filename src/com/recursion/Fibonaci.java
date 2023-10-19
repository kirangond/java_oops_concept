package com.recursion;
// sum of previous two numbers upto 0/1
public class Fibonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 3;
		int result = fib(n);
		System.out.println("result: "+result);

	}

	private static int fib(int n) {
		// TODO Auto-generated method stub
		if(n==0 || n==1)
//		if(n==100)  // stack over flow error if it did not reaches base codition
			return 1;
	    return fib(n-1)+fib(n-2);
	    		}

}
