package com.practice.core;

import java.io.IOException;
import java.io.*;

public class FileOutputStream_1
{
	
	public static void main(String[] args) throws IOException
	{
		
		
		FileOutputStream f1=new FileOutputStream("C:\\Users\\Manasa\\Desktop\\Text_3.txt");
		
		f1.write(75);
		String s=" Sai Praneeth.";
		f1.write(s.getBytes());
		f1.close();
		f1.flush();
		System.out.println("K Sai Praneeth Reddy");
		
	
		

	}

}
