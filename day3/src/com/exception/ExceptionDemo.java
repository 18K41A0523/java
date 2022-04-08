package com.exception;

public class ExceptionDemo {
	public static void main(String args[]) {
		try {
			int a[]=new int[5];
			a[5]=20/2;
		}catch(ArithmeticException e) {
			System.out.println("divide by zero called");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Check length of array");
		}
		 catch(Exception e) {
			 System.out.println("handles everything");
		 }
		finally {
			System.out.println("called always");
		}
		
	}

}
