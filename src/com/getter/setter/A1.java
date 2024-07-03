package com.getter.setter;

public class A1 {
	String company;
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A1 a = new A1();
		a.setCompany("lumen");
		System.out.println(a.getCompany());
	}

}
