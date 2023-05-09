package com.practice.core;

public class Shirt 
{
	public void color() {
		System.out.println("black");
	}
	public void brand() 
	{
		color();
		productQuality();
		System.out.println("max");
	}
	
	public static void productQuality() {
		System.out.println("good");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		Shirt shirt=new Shirt();
		shirt.brand();
		System.out.println("main ends");
		
	}

}
