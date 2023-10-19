package com.strings;
//making the class as final
public final class ImMutable {
	//creating a final variable so value should not re initilzied
          private final int age;
          private final String name;
          //setting the value through constructor
          public ImMutable(int age, String name) {
			this.age = age;
			this.name = name;
		}
          //there will no setter will be alloweded only getter
          public int getAge() {
      		return age;
      	}

      	public String getName() {
      		return name;
      	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ImMutable a = new ImMutable(10,"kiran");
	
		
		
		
	}

	

}
