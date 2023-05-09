package com.practice.methodOverloaded;



class Subtraction
{
	public static void sub(char i,char j){
		System.out.println(i-j);
	}
	public void sub(int i,double d){
		System.out.println(i-d);
	}

	public static void main(String[] args) 
	{
		System.out.println("main starts");
		sub('A','z');
		Subtraction subtraction=new Subtraction();
		subtraction.sub(22,5.5);
		System.out.println("main ends");
	}
}
