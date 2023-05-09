package com.practice.level2_programming;




class Toss
{
	public static void head(){
		System.out.println("heads");
		tail();
	}
	public static void tail(){
		System.out.println("tails");
	}
	public void choose(){
		System.out.println("bat/bowl");
		head();
	}
}
class Team
{
	public static void fav_Team(){
		System.out.println("CSK");
		Toss toss=new Toss();
		toss.choose();
	}
}

class MainClass2 
{
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		Team.fav_Team();
		System.out.println("main ends");

	}
}
