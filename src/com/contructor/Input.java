package com.contructor;

import java.util.Scanner;



public class Input {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		
		String name = sc.next(); //reads input from the keyword - while hitting the keyboard and take only single word
        System.out.println(name);
        System.out.println("my name is:"+name);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("my age is:"+age);
        System.out.println("enter full name");
        String full_name=sc.nextLine();
        System.out.println("my full name is:" + full_name);
	}

}
