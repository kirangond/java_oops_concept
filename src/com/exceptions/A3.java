package com.exceptions;

public class A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int i = 10/0;
			String str = "kiran";
			Integer.parseInt(str);
			System.out.println(str);

		} catch (ArithmeticException a) {
			// TODO: handle exception
			System.out.println(a);
		} catch (NumberFormatException n) {
			// TODO: handle exception
			System.out.println(n);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		} catch (Throwable t) {
			// TODO: handle exception
			System.out.println(t);
		}
      System.out.println(100);
	}

}
