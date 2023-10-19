package com.getter.setter;

//POJO - plain old java objects
public class A {
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
		A a = new A();
		a.setName("kiran");
		System.out.println(a.getName());
		

	}

}
