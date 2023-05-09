package com.practice.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class MapExample_1 {

	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer, String>();  
		  
		hm.put(23, "Yash");  
		hm.put(17, "Sai");  
		hm.put(15, "manasa");  
		hm.put(9, "chenna");  
		
		System.out.println(hm);
		
		TreeMap<Integer,String> t=new TreeMap<Integer,String>();
		
		t.putAll(hm);
		
		System.out.println(t);

	}

}
