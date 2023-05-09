package com.practice.methodOverloaded;


class Test
{
	public void display(char c,char h){
		System.out.println("method with char,char args");
	}
	public void display(String s,boolean x){
		System.out.println("method with string,boolean args");
	}
	public void display(int i,char k){
		System.out.println("method with int,char args");
	}
}


class MainClass1 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		Test test=new Test();
		test.display('s','p');
		test.display("Sai",true);
		test.display(221,'k');
		System.out.println("Main ends");
	}
}
