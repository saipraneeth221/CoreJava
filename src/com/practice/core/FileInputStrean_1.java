package com.practice.core;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStrean_1 
{

	public static void main(String[] args) throws IOException
	{
		try 
		{
			
			FileInputStream f=new FileInputStream("C:\\Users\\Manasa\\Desktop\\Text_3.txt");
			
			int i=0;
					while((i=f.read())!=-1) 
					{
						System.out.print((char)i);
					}
			
			System.out.print((char)i);
			}
		catch (FileNotFoundException e)
		{
			System.out.println(e);
		}
		System.out.println("Hii.....");

	}

}
