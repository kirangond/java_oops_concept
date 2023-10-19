package com.projects.atm;

import java.util.Scanner;

public class ATM3 {

	public static void main(String[] args) {
		//Take user input to withdraw money, if wanted no stop it else withdraw continuously if yes
		//It will print infinite loop
		Scanner sc = new Scanner(System.in);
		String condition = "yes"; 
		while(condition.equals("yes"))
		{
			System.out.println("Enter money to withdraw:");
			sc.nextInt();
			System.out.println("You want to withdraw money:");
		}

	}

}
