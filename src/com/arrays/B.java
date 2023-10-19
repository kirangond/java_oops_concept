package com.arrays;

public class B {

	//returning array of values
	public static void main(String[] args) {
		
		int arr[] = allArrayElements();

		for(int i=0;i<arr.length;i++)
		{
			System.out.println(i);
		}
	}

	private static int[] allArrayElements() {
		
		int sample[]={1,2,3};
		return sample;
	}

}
