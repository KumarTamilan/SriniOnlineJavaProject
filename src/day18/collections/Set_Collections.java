package day18.collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class Set_Collections {
	public static void main(String[] args) {

		Set<Integer> s = new LinkedHashSet<Integer>();
		Set<Integer> s1 = new LinkedHashSet<Integer>();

		s.add(100);
		s.add(200);
		s.add(300);
		s.add(400);
		s.add(500);
		s.add(600);
		s.add(700);
		s.add(800);
		s.add(900);
		System.out.println(s);                           
		boolean add = s.add(1000);                     // add
		System.out.println(add);
		int size = s.size();                                    // size
		System.out.println(size);
		boolean remove = s.remove(5);              // removeAll
		System.out.println(remove);
		boolean contains = s.contains(900);       // contains
		System.out.println(contains);
		
		s1.add(1100);
		s1.add(1200);
		s1.add(1300);
		s1.add(1400);
		s.addAll(s1);                                           // addAll
		System.out.println(s);
		boolean retainAll = s.retainAll(s1);        // retainAll
		System.out.println(retainAll);

		boolean removeAll = s.removeAll(s1);   // removeAll
		System.out.println(removeAll);

	}

}
