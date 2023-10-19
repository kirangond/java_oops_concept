package com.contructor;

public class A3 {
       int i;
       String name;
	public static void main(String[] args) {
		A3 a = new A3();
         a.test();
	}
	private void test() {
		int i = 100;
		String name = "kiran";
		this.i=i;
		this.name=name;
		System.out.println(this.i);
		System.out.println(this.name);
	
		
	}

}
