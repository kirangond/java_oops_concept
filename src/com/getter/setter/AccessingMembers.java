package com.getter.setter;

//with reference variable we can't access outside the main method
public class AccessingMembers {
       int i = 10;
	public static void main(String[] args) {
		AccessingMembers a = new AccessingMembers();
		System.out.println(a.i);
		a.test();
	

	}
	private void test() {
		System.out.println(this.i);
		
	}

}
