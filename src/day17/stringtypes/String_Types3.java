package day17.stringtypes;

public class String_Types3 {
	
	public static void main(String[] args) {
		
		String a="Amudha";
		String b="Amudha";
		
		System.out.println(a);
		System.out.println(System.identityHashCode(a));
		System.out.println(b);
		System.out.println(System.identityHashCode(b));
		
		String concat=a.concat(b);
		System.out.println(concat);
		System.out.println(System.identityHashCode(concat));
		
		StringBuffer sb = new StringBuffer("Amutha");
		StringBuffer sb1 = new StringBuffer("Amutha");
		
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		System.out.println(sb1);
		System.out.println(System.identityHashCode(sb1));
		
		StringBuffer append=sb1.append(sb);
		System.out.println(append);
		System.out.println(System.identityHashCode(append));
	}

}
