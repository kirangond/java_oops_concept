package com.typecasting;

public class DownCasting {

	public static void main(String[] args) {
		//will give error
		
//		long i = 101l;
//		int j = i;
		
		long i = 101l;
		int j = (int) i;
		System.out.println(i);
        System.out.println(j);
        
//        float f = 10.3f;
//        long l = (long) f;
	}

}
