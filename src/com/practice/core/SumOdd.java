package com.practice.core;
import java.util.Scanner;

public class SumOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int a =sc.nextInt();
		
		int sumEven=0;
		int sumOdd=0;
		while(a>0) 
		{
			int d=a%10;
			if(d%2==0) 
				sumEven=sumEven+d;
			else 
				sumOdd=sumOdd+d;
			
			a=a/10;
		}
		   System.out.println("Sum of even :"+sumEven);
		   System.out.println("Sum of odd :"+sumOdd);
		
	}

}
