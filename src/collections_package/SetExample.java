package collections_pakage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetExample 
{
	public static void main(String[] args) 
	{
		Set<String> s=new HashSet<String>();
		s.add("Sai");
		s.add("Praneeth");
		s.add("Manasa");
		s.add("Chenna");
		s.add("Jashwin");
		s.add("Sai");
		System.out.println(s);
		Iterator<String> i=s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		Set<Integer> s1=new TreeSet<Integer>();
		
		s1.add(10);
		s1.add(21);
		s1.add(25);
		s1.add(11);
		s1.add(45);
		s1.add(10);
		
		System.out.println(s1);
	}
}
