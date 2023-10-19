package com.projects.atm;

import java.util.Scanner;

public class ATM2 {

	public static void main(String[] args) {
		//Read input pin number from user if it is equal to 1234 print welcome else Invalid pin number
		//read input 3 times use for loop and after first pin valid stop and after 3 time print card is blocked
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter a pin number");
		int pinNumber = sc.nextInt();
		System.out.println("pinNumber:"+pinNumber);
		if(pinNumber==1234)
		{
			System.out.println("Welcome");
		    break;
		}
		else
		{
			System.out.println("Invalid Pin Number");
		if(i==2)
			System.out.println("card is blocked");
		}
		}
	}

	}


