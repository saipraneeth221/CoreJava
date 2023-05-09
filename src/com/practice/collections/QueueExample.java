package com.practice.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample 
{

	public static void main(String[] args) 
	{
		Queue<String> p=new PriorityQueue<String>();
		p.add("Sai");
		p.add("Manasa");
		p.add("chenna");
		p.add("Jashwin");
		p.offer("Ashok");
		p.add("Nanda");
		
		
		System.out.println(p);
		
		
		System.out.println(p.element());
		System.out.println(p.peek());
		p.remove();
		p.remove();
		System.out.println("After removing");
		for(String s:p) {
			System.out.println(s);
		}
		
		Deque<String> q=new ArrayDeque<String>();
		q.add("Sai");
		q.add("manasa");
		q.add("Ashok");
		q.offerFirst("Jashwin");
		System.out.println(q);
		
		for(String s1:q) {
			System.out.println(s1);
		}
		System.out.println(q.element());
		q.remove();
		System.out.println(q);

	}

}
