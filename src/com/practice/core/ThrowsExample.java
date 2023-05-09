package com.practice.core;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsExample {

	
		
		public static void m1() throws FileNotFoundException  {
			
			FileReader file=new FileReader("C:\\Users\\Manasa\\Desktop\\Web Development\\HTML- Personal Site\\image\\test.txt");
			BufferedReader buffer=new BufferedReader(file);
			System.out.println(buffer);
			
			
		}
		public static void main(String[] args) {
			
			try {
				m1();
			}
			catch(FileNotFoundException e) {
				System.out.println(e);
			}
		 System.out.println("Welcome");
		}
	}


