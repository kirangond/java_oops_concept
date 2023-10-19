package com.arrays;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array:");
		int length = sc.nextInt();
		System.out.println("Enter the array Elements: ");
		int arr[]=new int[length];
		for(int i=0;i<length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Print array Elements:");
		for(int i=0;i<length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
