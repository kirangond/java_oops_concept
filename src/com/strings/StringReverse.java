package com.strings;

//String clas there is no in built reverse method in it
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "kiran is my name"; 
		System.out.println(str.length()); //It will print the length of string 
		System.out.println(str.charAt(2)); //It will print the character at that index
		
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}

	}

}
