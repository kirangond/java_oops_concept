package com.leetcode.array;

import java.util.Scanner;

public class TwoSum2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array:");
		int length = sc.nextInt();
		System.out.println("Enter the array Elements: ");
		int nums[]=new int[length];
		for(int i=0;i<length;i++)
		{
			nums[i] = sc.nextInt();
		}
		System.out.println("Enter a target element: ");
		int target=sc.nextInt();
		
		int[] ans = twoSum(nums,target);
		for(int i=0;i<ans.length;i++)
		{
		System.out.println(ans[i]);
		}
	}

	public static int[] twoSum(int[] nums, int target) {
		// TODO Auto-generated method stub
		int newArray[]=new int[2];
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
				{
					if(nums[i]+nums[j]==target){
//						System.out.println(i);
//						System.out.println(j);
						newArray[0]=i;
						newArray[1]=j;
						break;
					}
				}
			}
		return newArray;
	}

	
}
