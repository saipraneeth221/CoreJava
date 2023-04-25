package com.practice.core;

public class Exception_1 {

	public static void main(String[] args) {
		
		try {
			int a[]=new int[10];
			a[12]=20;
			System.out.println(a[12]);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
