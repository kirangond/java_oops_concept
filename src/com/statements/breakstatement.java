package com.statements;

public class breakstatement {
 //while it hit continue control goes back to for loop and skip.
	public static void main(String[] args) {
	
		for(int i=0;i<10;i++)
		{			
			if(i==5)
			{
				continue;
			}
			System.out.println(i);
		}
		System.out.println("It will skip the i=5");

	}

	}


