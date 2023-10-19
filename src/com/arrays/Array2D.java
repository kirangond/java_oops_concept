package com.arrays;

public class Array2D {

	public static void main(String[] args) {
		int a[][] = new int[2][3];
		a[0][0]=10;
		a[0][1]=12;
		a[0][2]=14;
		a[1][0]=16;
		a[1][1]=18;
		a[1][2]=20;
		System.out.println(a.length); //will give row length
		System.out.println(a[0].length); //will give column length it should be less than total number of rows
        System.out.println(a.length*a[0].length);
		 for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.println(a[i][j]);
			}
		}
	}

}
