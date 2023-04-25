package com.practice.core;
import java.util.Scanner;

public class FibinociiSeries_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number :");
		
		int a=sc.nextInt();
		System.out.println("Enter Second Number :");
		int b=sc.nextInt();
		
		int n1=0,n2=1,n3;
		
		while(n1<=b) {
			if(n1>=a) {
				System.out.print(n1+" ");}
				n3=n1+n2;
				n1=n2;
				n2=n3;
			
				
		}

	}

}
