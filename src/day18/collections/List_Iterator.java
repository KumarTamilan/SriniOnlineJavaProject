package day18.collections;

import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class List_Iterator {
	
	public static void main(String[] args) {
		
		List<Integer> l = new Vector<Integer>();
		
		l.add(11);
		l.add(22);
		l.add(33);
		l.add(44);
		l.add(55);
		l.add(66);
		System.out.println(l);
		
		ListIterator<Integer>Listiter=l.listIterator();
		
		while (Listiter.hasNext()) {
			Integer next = Listiter.next();
			System.out.println(next);
			}
		System.out.println();
		
		while (Listiter.hasPrevious()) {
			Integer Previous = Listiter.previous();
			System.out.println(Previous);
			
		}
	}


}
