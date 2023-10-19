package com.projects.atm;

import java.util.Scanner;

public class ATM4 {

	public static void main(String[] args) {
		//Take user input to withdraw money, if wanted no stop it else withdraw continuously if yes
				//It will print infinite loop
		//if yes then only withdraw else stop it and prints stop 
				Scanner sc = new Scanner(System.in);
				String condition = "yes"; 
				while(condition.equals("yes"))
				{
					System.out.println("Enter money to withdraw:");
					sc.nextInt();
					System.out.println("You want to withdraw money:(yes/no)");
					condition = sc.next();
					if(condition.equals("no"))
						System.out.println("Thank you!");	
				}
				


	}

}
