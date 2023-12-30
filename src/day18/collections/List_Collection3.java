package day18.collections;

import java.util.ArrayList;
import java.util.List;

public class List_Collection3 {
	
	public static void main(String[] args) {
		
		List<Integer>l = new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		System.out.println(l);
		System.out.println(l.add(70));
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.get(0));
		System.out.println(l.get(5));
		//set:
		System.out.println(l.set(7,30));
		
		
		
	}

}
