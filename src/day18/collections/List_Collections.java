package day18.collections;

import java.util.ArrayList;
import java.util.List;

public class List_Collections {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<Integer>();
		List<Integer> l1 = new ArrayList<Integer>();

		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);

		
		  boolean add = l.add(70);
		  System.out.println(add);
		 
		System.out.println(l);

		
		/*
		 * int size = l.size(); System.out.println(size);
		 */
		
		
		/*
		 * Integer integer = l.get(5); System.out.println(integer);
		 */
		 
		
		/*
		 * int set = l.set(3, 0); System.out.println(set);
		 */
		
		/* int remove = l.remove(0); System.out.println(remove); */
		 
		
		/* int indexof = l.indexOf(60); System.out.println(indexof); */
		 
		/*
		 * boolean contains = l.contains(20); System.out.println(contains);
		 */
		
		
		  System.out.println(l1); l1.addAll(l); System.out.println(l1);
		  
		  l1.add(80); l1.add(90); l1.add(100); System.out.println(l1);
		 
		 
		l1.retainAll(l);
		System.out.println(l1);

		
		  l1.removeAll(l); System.out.println(l1);
		  
		 // l.clear();
		 
	}

}
