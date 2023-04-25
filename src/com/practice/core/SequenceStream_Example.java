package com.practice.core;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceStream_Example 
{

	public static void main(String[] args) throws FileNotFoundException 
	
	{
		
		FileInputStream f1=new FileInputStream("C:\\Users\\Manasa\\Desktop\\Text_3.txt");
		FileInputStream f2=new FileInputStream("C:\\Users\\Manasa\\Desktop\\Text_4.txt");
		SequenceInputStream s=new SequenceInputStream(f1, f2);
		int j;    
		   try 
		   {
			while((j=s.read())!=-1){    
			    System.out.print((char)j);  
			   }
		   } catch (IOException e) 
		   {
			// TODO Auto-generated catch block
			e.printStackTrace();
	       } 
		
	}

}
