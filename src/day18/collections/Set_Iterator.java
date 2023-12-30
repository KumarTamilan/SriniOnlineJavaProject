package day18.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Set_Iterator {
	
	public static void main(String[] args) {
		
		Set<Integer> s = new TreeSet<Integer>();
		
		s.add(111);
		s.add(222);
		s.add(333);
		s.add(444);
		s.add(555);
		s.add(666);
		System.out.println(s);
		Iterator<Integer> iter=s.iterator();
		
		while (iter.hasNext()) {
			Integer next = iter.next();
			System.out.println(next);
			
		}
		
	}

}
