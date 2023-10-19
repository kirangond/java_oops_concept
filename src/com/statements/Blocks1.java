package com.statements;

public class Blocks1 {

	public static void main(String[] args) {
		int x = 20;
		int y = 20;
		if(x<y)
		{
			System.out.println("x is smaller");
		}
		else if (x>y) {
			System.out.println("x is greater");
		}
		else if (x==y) {
			System.out.println("x is equal to y");
		}
		else {
			System.out.println("none of the condition satisfy and execute else block");
		}

	}

}
