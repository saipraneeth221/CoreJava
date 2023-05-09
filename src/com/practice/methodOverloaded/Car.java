package com.practice.methodOverloaded;




class Car 
{
	static String car_brand="BMW";
	int speed ;
	int time ;

	public static void main(String[] args) 
	{
		System.out.println("main starts");
		Car car1=new Car();
		Car car2=new Car();
		Car car3=new Car();
		car1.speed=60;
		car1.time=60;
		car2.speed=90;
		car2.time=45;
		car3.speed=100;
		car3.time=50;

		System.out.println("Car details");

		System.out.println("Car brand is:"+car_brand);

		System.out.println("car1 speed is:"+car1.speed+"km/hr");
		System.out.println("car1 time taken :"+car1.time+"hrs");
		
		System.out.println("car2 speed is:"+car2.speed+"km/hr");
		System.out.println("car2 time taken is:"+car2.time+"hrs");
	
		System.out.println("car3 speed is:"+car3.speed+"km/hr");
		System.out.println("car3 time taken is:"+car3.time+"hrs");

		System.out.println("car1 distance is:"+(car1.speed*car1.time)+"to travel");
		System.out.println("car2 distance is:"+(car2.speed*car2.time)+"to travel");
		System.out.println("car3 distance is:"+(car3.speed*car3.time)+"to travel");
	}
}
