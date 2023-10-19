package com.contructor;

public class POJO {

	 String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
		POJO a = new POJO();
		a.setName("kiran");
		System.out.println(a.getName());

	}

}
