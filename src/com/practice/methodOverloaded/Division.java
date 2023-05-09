package com.practice.methodOverloaded;


class Perform
{
	public void div(double d1,double d2){
		System.out.println(d1/d2);
	}
	public static void div(int i,int j){
		System.out.println(i%j);
	}
}



class Division 
{
	public static void main(String[] args) 
	{
		Perform.div(20,5);
		Perform perform=new Perform();
		perform.div(5.5,8.5);
		
	}
}
