package com.statements;

public class breaklabel1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		{			
			label:if(i==5)
			{
				break label;
			}
			System.out.println(i);
		}
		System.out.println("It will skip the i=5 and run remaining" );
	}

}
