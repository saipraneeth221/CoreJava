package com.practice.collections;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListExample_1 
{
	public static void main(String[] args) 
	{
		List<String> l=new ArrayList<String>();
		l.add("Sai");
		l.add("Manasa");
		l.add("Chenna");
		l.add("Jashwin");
		l.add("Sai");
		Iterator<String> it=l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//System.out.println(".....................");
		List<Integer> l1=new LinkedList<Integer>();
		l1.add(10);
		l1.add(21);
		l1.add(28);
		l1.add(20);
		Iterator<Integer> i=l1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println(".....................");
		
		System.out.println(l1.size());
		System.out.println(l.size());
	}
}
