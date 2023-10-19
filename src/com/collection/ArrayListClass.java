package com.collection;

import java.util.ArrayList;

public class ArrayListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList x = new ArrayList();
		x.add(10); //It will call the add method of List class do the processing logic
		x.add(20); //Internally stored in object 
		x.add(new Integer(30)); //Boxing
		//store heterogenous data
		x.add(10.3);
		x.add(true); //getting warnings to use generics 
		System.out.println(x);
		
		ArrayList<Integer> y = new ArrayList<>(); //<> Generics to store similar data type
		y.add(100);
		y.add(200);
		
		System.out.println("add method():"+y);
		ArrayList<Integer> z = new ArrayList<>();
		z.add(5);
		z.add(10);
		
		z.add(1, 20); //For insertion at index 1 with value 20
		System.out.println("add(index,value) method():"+z);
		
		z.addAll(y); //inserting collection of y elements to z
		System.out.println("addAll(collection) method():"+z);
		
		z.addAll(2,y); //inserting collection of y elements to z at index 2
		System.out.println("addAll(index,collection) method():"+z);
		
		if(z.contains(5)) //search operation 
		{
			System.out.println("element found in list");
		}
		else
		{
			System.out.println("element did not found in list");
		}
		
       System.out.println(z);
       
      z.remove(1); //remove element from list at position 1
      System.out.println("remove(index) method:" + z);
      
     
	}

}
