package com.strings;

public class IsEquals1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //It will create object if do not have new keyword, if already onject is present with value it will point to that
		String s1 = "kiran";
		String s2 = "kiran";
		
		String s3 = "pavan";
		String s4 = "pavan";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
		String s5 = new String("kiran");
		System.out.println(s5==s1);
		System.out.println(s5.equals(s1));
		
	}

}
