package com.strings;

public class IsEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("kiran");
		System.out.println(s1);
		String s2 = new String("kiran");
		System.out.println(s1);
		//s1 and s2 are object address not the actual values
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));

	}

}
