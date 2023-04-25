package com.practice.core;

public class InnerClass {
	
	
	
	public class class_1{
		public void m1() {
			
			System.out.println("getting the num");
		
		}
		
	}

	public static void main(String[] args) {
		
		InnerClass inner=new InnerClass();
		
		InnerClass.class_1 outer=inner.new class_1();
		
		outer.m1();
	}

}
