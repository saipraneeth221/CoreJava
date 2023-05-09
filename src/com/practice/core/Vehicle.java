package com.practice.core;

public class Vehicle 
{ 
	public void car() {
		color();
		System.out.println("car");
	}
	public void bike() {
		car();
		System.out.println("bike");
	}
	public static void color() {
		combustionEngine();
		System.out.println("black");
	}
	public static void combustionEngine() {
		System.out.println("petrol/diesel");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main starts");
		Vehicle vehicle=new Vehicle();
		vehicle.bike();
		System.out.println("main ends");

	}

}
