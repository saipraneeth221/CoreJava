package com.practice.core;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test_1 extends Thread
{
	static String data="";
	public static void m1() throws Exception  {
		FileReader sai=new FileReader("C:\\Users\\Manasa\\Desktop\\Text_1.txt");
		BufferedReader buffer_1=new BufferedReader(sai);
		while((data=buffer_1.readLine())!=null) {
			System.out.println(data);
		}}
	public static void m2() throws Exception {	
		FileReader manasa=new FileReader("C:\\Users\\Manasa\\Desktop\\Text_2.txt");
		BufferedReader buffer_2=new BufferedReader(manasa);
		while((data=buffer_2.readLine()) != null) {
			System.out.println(data);
		}
	}
	

	public static void main(String[] args) {
		
		Thread t1=new Thread(() -> {
			try {
				m1();
			} catch (Exception e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		});
		Thread t2=new Thread(() -> {
			try {
				m2();
			} catch (Exception e3) {
				// TODO Auto-generated catch block
				e3.printStackTrace();
			}
		});

		try {
			t1.start();
		}
		catch(Exception e) {
			System.out.println(e); 
		}
		try {
			t2.start();
		}
		catch(Exception e1) {
			System.out.println(e1);
		}

	}

}
