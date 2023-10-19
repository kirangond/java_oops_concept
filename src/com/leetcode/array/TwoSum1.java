package com.leetcode.array;

import java.util.Scanner;

public class TwoSum1 {

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
		
		twoSum(nums,target);
	}

	private static void twoSum(int[] nums, int target) {
		// TODO Auto-generated method stub
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
				{
					if(nums[i]+nums[j]==target){
						System.out.println(i);
						System.out.println(j);
					}
				}
			}
	}

	
}
