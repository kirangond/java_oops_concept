package com.projects.atm;

import java.util.Scanner;

public class NumberOfTrials {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter a number: ");
			int num = sc.nextInt();
			int pin = 1234;

			if (num == pin) {
				System.out.println("Valid pin entered");
				break;
			} else {
				System.out.println("Invalid pin entered");
				if(i==2)
				{
					System.out.println("card blocked");
				}
			}

		}

	}

}
