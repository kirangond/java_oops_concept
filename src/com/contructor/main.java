package com.contructor;

public class main {
	main()
	{
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		String main = "main";
		main m = new main();
		m.main(); //main() //both are same

	}
	
	public static void main()
	{
		System.out.println("TWO");
	}

}
