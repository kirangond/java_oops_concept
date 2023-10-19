package com.contructor;

public class This {
	public This() {
		System.out.println(100);
	}
	
	public This(int i) {
		this();  //It will call the constructor
	}



	public static void main(String[] args) {
		
		This a = new This(100);

	}

}
