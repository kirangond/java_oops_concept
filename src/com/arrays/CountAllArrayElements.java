package com.arrays;

public class CountAllArrayElements {

	public static void main(String[] args) {
		
		int arr[]={2,2,1,4};
		
		for (int i = 0; i < arr.length; i++) {
          int count = 1;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j])
				{
					count++;
				}
				
			}
		
			System.out.println("count is: " +arr[i]+" "+count );
		}
		

	}

}
