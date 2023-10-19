package com.exception;
//multiple exception in try block but only 1 exception will be caught and further exception will not raise.
//the line which tends to give exception it will search for the catch block and will not return back to try block
public class MultipleExceptionInTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("1");
		System.out.println("Before try block: ");
		try {
			System.out.println(10/0); //ArithmeticException
			int i = Integer.parseInt("kiran"); //NumberFormatException
			int a[]={1,2,3};
			System.out.println(a[4]); //ArrayIndexOutOfBoundException
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("NumberFormatException:"+e);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("ArrayIndexOutOfBoundsException:"+e);
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("ArithmeticException:   "+e);
		}
		System.out.println("catching exception");

	}

}
