package com.practice.core;
import java.util.Scanner;

public class FibinocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int a=sc.nextInt();
		int n1=0,n2=1,n3;
		
		for(int i=1;i<=a;i++) {
			System.out.print(n1+" ");
			
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
		

	}

}
