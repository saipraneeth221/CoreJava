package com.practice.core;

public class MultiThreading extends Thread {
	
	
		public void run() {
			
			for(int i=1;i<=5;i++) {
				try {
					Thread.sleep(500);
				}
				catch(Exception e) {
					System.out.println(e);
				}
				System.out.println(i);
			}
		}
	public static void main(String[] args) {
		MultiThreading m1=new MultiThreading();
		MultiThreading m2=new MultiThreading();
		m1.start();
		try {
		m1.join();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		m2.start();
		m1.setName("Praneeth");
		System.out.println(m1.getName());
		System.out.println(m1.getPriority());
		System.out.println(m2.getPriority());
		

	}

}
