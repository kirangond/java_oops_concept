package com.throwkeyword.throwskeyword;

import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		
		int balance = 500;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount: ");
		int amount = sc.nextInt();
		if(balance>amount)
		{
			System.out.println("Please collect the cash: ");
		}
		else
		{
			try {
				throw new InSufficientFunds();
			} catch (InSufficientFunds e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println(e);
				System.out.println("Low Balance!");
			}
		}

	}

}
