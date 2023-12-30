package day18.collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Map_Iterator {
	
	public static void main(String[] args) {
		
		Map<Integer,String>m = new TreeMap<Integer,String>();
		m.put(11,"List");
		m.put(22,"Set");
		m.put(33,"Map");
		m.put(44,"Iterator");
		m.put(55,"ListIterator");
		System.out.println(m);
		
		Set<Entry<Integer,String>>entryset=m.entrySet();
		System.out.println(entryset);
		
		Iterator<Entry<Integer,String>>iter=entryset.iterator();
		while (iter.hasNext()) {
			Entry<Integer,String>next = iter.next();
			System.out.println(next);
			
		}
		
	}

}
