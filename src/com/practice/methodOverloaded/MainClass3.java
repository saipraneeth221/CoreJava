package com.practice.methodOverloaded;



class Student
{
	public static int standard=10;
	public String student_name;
	public int science;
	public int social;
	public int maths;


	public void studentDetails(String s,int a,int b,int c)
		{
			student_name=s;
			science=a;
			social=b;
			maths=c;

		}

	public void printDetails()
		{
		System.out.println("************************************");
		System.out.println(standard);
		System.out.println("studentName is:"+student_name);
		System.out.println("marks in science is:"+science);
		System.out.println("marks in social is:"+social);
		System.out.println("marks in maths is:"+maths);
		System.out.println("************************************");
	    }
	public void avgMarks()
		{
			int avg_Marks=((science+social+maths)/3);
			System.out.println("Average Marks of "+student_name+" is"+avg_Marks);
		}
}


class MainClass3 
{
	public static void main(String[] args) 
	{
		Student student1=new Student();
		Student student2=new Student();
		Student student3=new Student();
		student1.studentDetails("praneeth",90,89,85);
		student2.studentDetails("manasa",98,85,78);
		student3.studentDetails("jashwin",97,95,96);

		student1.printDetails();
		student2.printDetails();
		student3.printDetails();
		
		student1.avgMarks();
		student2.avgMarks();
		student3.avgMarks();
	}
}
