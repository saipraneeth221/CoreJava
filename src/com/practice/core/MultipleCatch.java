package com.practice.core;

public class MultipleCatch {

	public static void main(String[] args) {
		
		try {
			int a[] = new int[10];
			a[5]=30/0;
			System.out.println(a[5]);
		}
		catch(ArithmeticException e){
			System.out.println("HII");
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("hello");
		}
		
		catch(Exception e) {
			System.out.println("WELCOME");
		}
		finally {
		System.out.println("code ends");
		}
		
		System.out.println("Continue");
		
	}

}
