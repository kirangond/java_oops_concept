package com.getter.setter;

public class This1 {
    
	public static void main(String[] args) {
		This1 a = new This1();
		a.test();
		This1 a1 = new This1();
		a1.test();

	}

	public void test() {
	 System.out.println(this);
		
	}
	
//	public void test() {
//		int j = 10;
//		// System.out.println(this.j); //gives error 
//			
//		}

}
