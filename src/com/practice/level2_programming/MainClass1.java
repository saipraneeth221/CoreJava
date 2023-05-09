package com.practice.level2_programming;



class Test
{
	public static void test_Result_1()
	{
		System.out.println("Test Result 1");
	}
	public void test_Result_2()
	{
		System.out.println("Test result 2");
	}
}
class Display
{
	public static void display_Result_1()
	{
		Test.test_Result_1();
		System.out.println("Display Result 1");
	}
	public void display_Result_2()
	{
		Test test=new Test();
		test.test_Result_2();
		System.out.println("Display result 2");
	}	
}
class View_Result
{
	public void match()
	{
		System.out.println("csk vs lsg");
	}
}


class MainClass1 
{
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		

		
		Display display=new Display();
		display.display_Result_2();
		
		View_Result view_result=new View_Result();
		view_result.match();
		System.out.println("main ends");
	}
}
