package com.strings;

public class CountOfOpenCloseBracket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "((()))";
		System.out.println(str.length());
		int count1=0;
		int count2=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='(')
			{
				
				count1++;
			}else if(str.charAt(i)==')')
			{
				count2++;
			}
		}
        if(count1==count2)
        {
        	System.out.println("No Error");
        }
        else
        {
        	System.out.println("Error");
        }
	}

}
