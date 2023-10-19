package com.polymorphism;

public class Diamond extends SilverAccount{
	@Override
	public void rateOfInterest()
	{
		System.out.println("7%");
	}
	@Override
	public void checkBooks()
	{
		System.out.println("unlimited/year");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SilverAccount s = new SilverAccount();
		s.checkBooks();
		s.rateOfInterest();
		s.netBanking();
		Diamond d = new Diamond();
		d.checkBooks();
		d.rateOfInterest();
		d.netBanking();

	}

}
