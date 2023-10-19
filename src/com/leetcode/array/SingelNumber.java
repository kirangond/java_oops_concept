package com.leetcode.array;

public class SingelNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {2,2,1};
		
		for(int i=0;i<arr.length;i++)
		{
			int count = 1,ans=0;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					count++;
		    arr[i]=0;
			}
			if(count==1)
//				ans=arr[i+1]; 
				System.out.println(arr[i]);
		}
//		System.out.println();
		
		 

	}

}
