package com.projects.atm;

import java.util.Scanner;

public class ATM1 {

	public static void main(String[] args) {
		//Read input pin number from user if it is equal to 1234 print welcome else Invalid pin number
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a pin number");
		int pinNumber = sc.nextInt();
		System.out.println("pinNumber:"+pinNumber);
		if(pinNumber==1234)
			System.out.println("Welcome");
		else
			System.out.println("Invalid Pin Number");

	}

}
