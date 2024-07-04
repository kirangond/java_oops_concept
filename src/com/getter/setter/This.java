package com.getter.setter;

public class This {
    int i = 10;
	public static void main(String[] args) {
		 This a = new This();
		
		 a.test();
		 System.out.println(a.i);

	}
	private  void test() {
		System.out.println(i); //by default it is this.i
		
	}
	
//	public static void test() {
//		System.out.println(i); 
//		
//	}

}
