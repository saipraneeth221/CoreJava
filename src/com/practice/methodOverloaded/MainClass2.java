package com.practice.methodOverloaded;

class Addition
{
	public static void add(int i,int j){
		System.out.println("adding the integer values:"+" " + i+j);
		System.out.println(i+j);
	}
	public static void add(double d1,double d2){
		System.out.println("adding the double values:"+" " + d1+d2);
	}
	public static void add(int i,int j,double d){
		System.out.println("adding the integer,integer and double values:"+" " + i+j+d);
	}
	public static void add(double d,int j){
		System.out.println("adding the double and integer values:"+" " + d+j);
	}
}



class MainClass2 
{
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		Addition.add(21,28);
		Addition.add(21.1,28.5);
		Addition.add(54,45,5.5);
		Addition.add(5.8,64);
		System.out.println("main ends");
	}
}
