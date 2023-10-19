package com.recursion;
//The factorial of a number N is the product of all the numbers between 1 and N
public class Factorial {
    
	public static void main(String[] args) {
		
		int n=5;
		int result = fact(n);
		System.out.println("result: "+result);
	}

	private static int fact(int n) {
		// TODO Auto-generated method stub
		if(n==1)
			return 1;
		return n * fact(n-1);
			
		
	}
}
