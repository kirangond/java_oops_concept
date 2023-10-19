package com.statements;

public class Statements {

	public static void main(String[] args) {
		
		for(int i=0;i<10;i++)
		{			
			if(i==5)
			{
				break;
			}
			System.out.println(i);
		}
		System.out.println("After brak it will not execute statement");

	}

}
