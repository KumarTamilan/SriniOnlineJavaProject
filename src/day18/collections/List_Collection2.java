package day18.collections;

import java.util.ArrayList;
import java.util.List;

public class List_Collection2 {
	public static void main(String[] args) {
		
		//ArrayList l = new ArrayList();
		List<Integer>l = new ArrayList<Integer>();
		List<Integer>l1 = new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		//1.ADD:
		System.out.println(l);
		System.out.println(l.add(60));
		System.out.println(l);
		//2.SIZE:
		//System.out.println(l.size());
		//3.GET:
		//System.out.println(l.get(0));
		//System.out.println(l.get(3));
		//4.SET:
		//System.out.println(l.set(0, 10));
		//System.out.println(l.set(2, 30));
		//5.REMOVE:
		//System.out.println(l.remove(0));
		//System.out.println(l);
		//6.INDEXOF:
		//System.out.println(l.indexOf(40));
		//System.out.println(l.indexOf(10));
		//7.CONTAINS:
		//System.out.println(l.contains(50));
		//System.out.println(l.contains(2));
		//8.ADDALL:
		l1.addAll(l);
		l1.add(70);
		l1.add(80);
		l1.add(90);
		System.out.println(l1);
		//9.RETAINALL:
		System.out.println(l1.retainAll(l));
		System.out.println(l1);
		//10.REMOVEALL:
		System.out.println(l.removeAll(l1));
		System.out.println(l1);
		//11.CLEAR:
		l1.clear();
	
		
	   
	}

}
