package com.strings;

//printing a right angled triangle
public class PrintingDesiredShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(i==0&&j==1 || i==0&&j==2
				 ||  i==1&&j==2){
				System.out.print("");
				}else {
				System.out.print("*");
				}
			}
			System.out.print("\n");
		}

	}
}
