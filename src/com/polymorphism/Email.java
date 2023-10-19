package com.polymorphism;

public class Email {
	public void sendMail(int transactionId, String email)
	{
		System.out.println("transctional email");
	}
	
	public void sendMail(String email)
	{
		System.out.println("promotional email");
	}

	public static void main(String[] args) {
		Email e = new Email();
		e.sendMail("kirangond05@gmail.com");
		e.sendMail(10, "pavan@gmail.com");

	}

}
