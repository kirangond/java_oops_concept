package com.strings;

public class ConvertToLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "my Name IS KIRAN";
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		System.out.println(str.startsWith("m"));
		System.out.println(str.endsWith("m"));
		
		//convert character array into string
		char c[] = {'a','b','c'};
		String str1 = String.valueOf(c);
		System.out.println(str1);

	}

}
