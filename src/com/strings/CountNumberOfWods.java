package com.strings;

public class CountNumberOfWods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = " kiran is my name ";
		System.out.println(str.trim());
		System.out.println(str.length()); //including white space
		System.out.println(str.split(" ")); //based on " " this it will split the word and store in string array
		String[] split = str.split(" "); // If white spaces it will print 5 hence use trim to remove white spaces
		System.out.println(split.length);
		
		String[] split2 = str.trim().split(" ");
		System.out.println(split2.length);
		//for each loop
		for(String x:split2)
		{
			System.out.println(x);
		}
		
		String x = " kiran ";
		System.out.println(x.trim());//remove white spaces
		String y = " kiran is   name";
		System.out.println(y.trim());

	}

}
