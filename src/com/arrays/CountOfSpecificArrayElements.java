package com.arrays;

public class CountOfSpecificArrayElements {

	public static void main(String[] args) {
		int a[] = {2,3,1,4,2},key=5;
		int count = 0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
				count++;
		}
		System.out.println("number of count's key present: "+ count);
		

	}

}
