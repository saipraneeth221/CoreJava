package com.practice.level2_programming;



class School 
{
	public static void mathematics() 
	{
		System.out.println("maths");
	}
}
class Tution
{
	public void physics()
	{
		School.mathematics();
		System.out.println("physics");
	}
}
class Subjects
{
	public static void main(String []args)
	{
		System.out.println("main starts");
		Tution tution=new Tution();
		tution.physics();
		System.out.println("main ends");
	}

}
