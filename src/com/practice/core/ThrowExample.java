package com.practice.core;

public class ThrowExample
{

	
		
		public void chekNum(int num)
		{
			
			if(num<1)
			{
				throw new ArithmeticException("num is negative"); 
			}
			else
			{
				System.out.println(num*num);
			}
			
		}
		
		public static void main(String[] args)
		{
			ThrowExample th=new ThrowExample();
			th.chekNum(-8);
			System.out.println("Continue");
			
		}
	}


