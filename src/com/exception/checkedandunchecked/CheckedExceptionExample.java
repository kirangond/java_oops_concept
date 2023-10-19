package com.exception.checkedandunchecked;
import java.io.FileNotFoundException;
import java.io.FileReader;

//checked exception must be caught, it will throw error at compile time itself to handle 
public class CheckedExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//FileReader fr = new FileReader("Demo.txt"); //will throw error need to use in try{} catch(Exception e) {} block

		try {
			System.out.println("Before tends to give exception");
			FileReader fr = new FileReader("Demo.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("successfully caught the exception will execute further lines");
	}

}
